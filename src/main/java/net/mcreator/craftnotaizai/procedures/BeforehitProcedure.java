package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class BeforehitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, double amount) {
		execute(null, world, x, y, z, damagesource, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, double amount) {
		if (damagesource == null || entity == null)
			return;
		ItemStack weapon = ItemStack.EMPTY;
		double dmg = 0;
		double armor = 0;
		double current_health = 0;
		double health_reduction = 0;
		double armour = 0;
		double n = 0;
		double damage = 0;
		double stage = 0;
		double night2 = 0;
		double day2 = 0;
		double day1 = 0;
		dmg = amount;
		if (event != null && event.isCancelable()) {
			event.setCanceled(true);
		} else if (event != null && event.hasResult()) {
			event.setResult(Event.Result.DENY);
		}
		if (entity.getPersistentData().getBoolean("hit")) {
			entity.getPersistentData().putBoolean("hit", false);
			dmg = dmg + entity.getPersistentData().getDouble("deal");
		}
		armor = entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0;
		dmg = dmg * (200 / (200 + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Spirit));
		dmg = dmg * (200 / (200 + entity.getPersistentData().getDouble("Spirit")));
		dmg = dmg * (25 / (25 + armor));
		if (entity instanceof Player) {
			current_health = (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 20;
			current_health = current_health * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth;
			current_health = current_health - dmg;
			current_health = current_health / (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).maxhealth;
			current_health = current_health * 20;
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).demon == true && Math.floor(current_health) <= 10) {
				n = Mth.nextInt(RandomSource.create(), 1, 100);
				if (n <= 10) {
					if (!(entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Purgatory) {
						current_health = 0.1;
						if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_no_taizai:purgatory"));
							if (_player.level().dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance _effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.GIDEON.get()
					&& damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:mana_dmg")))) {
				dmg = dmg * 0.4;
			}
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ALDAN.get()
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ALDAN.get())
					&& !(entity instanceof Player _plrCldCheck16 && _plrCldCheck16.getCooldowns().isOnCooldown(CraftNoTaizaiModItems.ALDAN.get())) && Math.floor(current_health) <= 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 3, false, false));
				current_health = 0.1;
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(CraftNoTaizaiModItems.ALDAN.get(), 24000);
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).immortality == true && Math.floor(current_health) <= 0
					&& !(entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get()))) {
				current_health = 0.1;
			}
			if (entity.getPersistentData().getBoolean("infinity") == true && Math.floor(current_health) <= 0) {
				current_health = 0.1;
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).infinity_use == true && Math.floor(current_health) <= 0) {
				current_health = 0.1;
			}
			if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(CraftNoTaizaiModMobEffects.KING_TRUMPET.get())) {
				dmg = dmg * 1.1;
			}
			if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(CraftNoTaizaiModMobEffects.NIGHTMARETELLER.get())) {
				dmg = dmg * 1.3;
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.PEACE_AMULET_CHESTPLATE.get()) {
				dmg = dmg * 0.9;
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).revengecounter == true) {
				{
					double _setval = amount + (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).storeddmg;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.storeddmg = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (((entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Patience")) {
						dmg = dmg * 1.5;
					}
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) current_health);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - dmg));
		}
	}
}
