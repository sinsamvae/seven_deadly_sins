package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnitiyAttackedProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return;
		ItemStack weapon = ItemStack.EMPTY;
		double damage = 0;
		double stage = 0;
		if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).attack_cd == 0) {
			{
				double _setval = 7;
				sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.attack_cd = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				damage = Math.ceil((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength * 0.1);
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftNoTaizaiModMobEffects.PHYSICAL_HUNT_POSITIVE.get())) {
					damage = damage * 1.5;
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(CraftNoTaizaiModMobEffects.PHYSICAL_HUNT_NEGITIVE.get())) {
					damage = damage / 1.5;
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).combostar == true) {
					damage = damage * (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).combostarhit;
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).PurgeAttack == true
						&& (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:demon")))
								|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).reddemonboost == true
								|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).demon == true
								|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonblood == true)) {
					world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PARTICLE_ARK.get()), x, (y + entity.getEyeHeight()), z, 0, 1, 0);
					damage = damage * 1.3;
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).revengecounter == true) {
					damage = Math.ceil((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).storeddmg
							+ (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength);
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					{
						boolean _setval = false;
						sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.revengecounter = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
					{
						double _setval = 0;
						sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.storeddmg = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
				if (((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("SunShine")) {
					if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 <= 23460) {
						damage = damage * 1;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 23460 && world.dayTime() % 24000 <= 23992) {
						damage = damage * 3;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 23992 && world.dayTime() % 24000 <= 0) {
						damage = damage * 10;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 1000) {
						damage = damage * 13.5;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 <= 5723) {
						damage = damage * 15;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 5723 && world.dayTime() % 24000 <= 11834) {
						damage = damage * 20;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 11834 && world.dayTime() % 24000 <= 12040) {
						damage = damage / 3;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 12040 && world.dayTime() % 24000 <= 12786) {
						damage = damage / 10;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 12786 && world.dayTime() % 24000 <= 13188) {
						damage = damage / 13.5;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 13188 && world.dayTime() % 24000 <= 17843) {
						damage = damage / 15;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 <= 23000) {
						damage = damage / 20;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				for (int index0 = 0; index0 < 2; index0++) {
					stage = stage + 1;
					if (stage == 1) {
						weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					}
					if (stage == 2) {
						weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					}
					if (weapon.getItem() instanceof SwordItem || weapon.getItem() instanceof AxeItem || weapon.getItem() instanceof TridentItem) {
						damage = damage * 1.1;
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				entity.getPersistentData().putBoolean("hit", true);
				entity.getPersistentData().putDouble("deal", damage);
			}
		} else {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			} else if (event != null && event.hasResult()) {
				event.setResult(Event.Result.DENY);
			}
		}
	}
}
