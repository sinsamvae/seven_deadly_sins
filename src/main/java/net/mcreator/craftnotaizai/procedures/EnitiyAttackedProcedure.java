package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
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
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

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
		double damage = 0;
		double stage = 0;
		ItemStack weapon = ItemStack.EMPTY;
		ItemStack weapon2 = ItemStack.EMPTY;
		if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).attack_cd == 0) {
			{
				double _setval = 7;
				sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.attack_cd = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (damagesource.is(DamageTypes.PLAYER_ATTACK)) {
				damage = Math.ceil((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength
						* (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).strength_boost * 0.1);
				damage = damage * ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).power_percentage / 100);
				if (entity instanceof Player && !((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild).equals("")
						&& ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild)
								.equals((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild)) {
					damage = 0;
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).PurgatoryFire) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.PURGATORY_FLAME.get(), 60, 1, false, false));
					for (int index0 = 0; index0 < 2; index0++) {
						stage = stage + 1;
						if (stage == 1) {
							weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						}
						if (stage == 2) {
							weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						}
						if (weapon.getItem() instanceof SwordItem || weapon.getItem() instanceof AxeItem || weapon.getItem() instanceof TridentItem) {
							damage = damage * (1.2 + (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).weapon_boost);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						}
					}
					weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					if (weapon.getItem() instanceof SwordItem || weapon.getItem() instanceof AxeItem || weapon.getItem() instanceof TridentItem) {
						damage = damage * (1.1 + (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).weapon_boost);
						if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
							if (sourceentity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
						}
					}
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(CraftNoTaizaiModMobEffects.PHYSICAL_HUNT_POSITIVE.get())) {
					damage = damage * 1.5;
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(CraftNoTaizaiModMobEffects.PHYSICAL_HUNT_NEGITIVE.get())) {
					damage = damage / 1.5;
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).combostar) {
					damage = damage * (sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).combostarhit;
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).PurgeAttack
						&& (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:demon")))
								|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).reddemonboost
								|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Demon")
								|| (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).graydemonblood)) {
					world.addParticle((SimpleParticleType) (CraftNoTaizaiModParticleTypes.PARTICLE_ARK.get()), x, (y + entity.getEyeHeight()), z, 0, 1, 0);
					damage = damage * 1.3;
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).revengecounter) {
					damage = Math.ceil((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).storeddmg + damage);
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
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
					if (!((sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CraftNoTaizaiModItems.ESCANOR_TAVERN_HELMET.get())) {
						if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 <= 23460) {
							damage = Math.ceil(damage * 1);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 23460 && world.dayTime() % 24000 <= 23992) {
							damage = Math.ceil(damage * 2.5);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 23992 && world.dayTime() % 24000 <= 0) {
							damage = Math.ceil(damage * 5);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 0 && world.dayTime() % 24000 <= 1000) {
							damage = Math.ceil(damage * 6.75);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 1000 && world.dayTime() % 24000 <= 6000) {
							damage = Math.ceil(damage * 7.5);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 6000 && world.dayTime() % 24000 <= 9000) {
							damage = Math.ceil(damage * 10);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 9000 && world.dayTime() % 24000 <= 12542) {
							damage = Math.ceil(damage * 1);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 12542 && world.dayTime() % 24000 <= 12786) {
							damage = Math.ceil(damage / 5);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 12786 && world.dayTime() % 24000 <= 13000) {
							damage = Math.ceil(damage / 6.75);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 13000 && world.dayTime() % 24000 <= 13670) {
							damage = Math.ceil(damage / 7.5);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						} else if (world.dayTime() % 24000 >= 18000 && world.dayTime() % 24000 <= 22300) {
							damage = Math.ceil(damage / 20);
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						}
					} else {
						damage = damage;
						if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
							if (sourceentity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
						}
					}
				}
				if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Piety")) {
					damage = damage * 0.65;
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).freeze_saber) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftNoTaizaiModMobEffects.FREZZE.get(), 60, 1, false, false));
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (((entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).commandment).equals("Love")) {
							damage = damage * 0.65;
							if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
								if (sourceentity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
							}
						}
					}
				}
				weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
				if (weapon.getItem() instanceof SwordItem || weapon.getItem() instanceof AxeItem || weapon.getItem() instanceof TridentItem) {
					damage = damage * 1.1;
					if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
						if (sourceentity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
					}
				}
				for (int index1 = 0; index1 < 2; index1++) {
					stage = stage + 1;
					if (stage == 1) {
						weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					}
					if (stage == 2) {
						weapon = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					}
					if (weapon.getItem() instanceof SwordItem || weapon.getItem() instanceof AxeItem || weapon.getItem() instanceof TridentItem) {
						damage = damage * 1.2;
						if ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
							if (sourceentity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
						}
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
		if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:tamed_skills")))) {
			if (damagesource.is(DamageTypes.MOB_ATTACK)) {
				damage = Math.ceil(sourceentity.getPersistentData().getDouble("strength") * 0.1);
				if (((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CraftNoTaizaiModVariables.PlayerVariables())).damage_indicator == true) {
					if ((sourceentity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("DMG: ##").format(damage))), true);
				}
				entity.getPersistentData().putBoolean("hit", true);
				entity.getPersistentData().putDouble("deal", damage);
			}
		}
		if (entity instanceof Player && (damagesource.is(DamageTypes.ARROW) || damagesource.is(TagKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_no_taizai:magic_dmg"))))) {
			if (!((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild).equals("")
					&& ((sourceentity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild)
							.equals((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).guild)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
			}
		}
	}
}
