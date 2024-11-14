package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetHumanMagicProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double RandomMagic = 0;
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Human_Clan == 2) {
			{
				double _setval = 3;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Human_Clan = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			RandomMagic = Mth.nextInt(RandomSource.create(), 1, 1040);
			if (RandomMagic <= 70) {
				{
					String _setval = "Wind Shooter";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 70 && RandomMagic <= 140) {
				{
					String _setval = "Aura Burst";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 140 && RandomMagic <= 210) {
				{
					String _setval = "Bullet Squall";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 210 && RandomMagic <= 280) {
				{
					String _setval = "Goen no Jujin";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 280 && RandomMagic <= 340) {
				{
					String _setval = "Blaze";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 340 && RandomMagic <= 400) {
				{
					String _setval = "Boost";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 400 && RandomMagic <= 460) {
				{
					String _setval = "Transparency";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 460 && RandomMagic <= 520) {
				{
					String _setval = "Tempest";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 520 && RandomMagic <= 580) {
				{
					String _setval = "Acid";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 580 && RandomMagic <= 640) {
				{
					String _setval = "GreatThunder";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 640 && RandomMagic <= 680) {
				{
					String _setval = "Thunderbolt";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 680 && RandomMagic <= 720) {
				{
					String _setval = "IceFang";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 720 && RandomMagic <= 760) {
				{
					String _setval = "GodSpeed";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 760 && RandomMagic <= 800) {
				{
					String _setval = "Break";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 800 && RandomMagic <= 840) {
				{
					String _setval = "Purge";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 840 && RandomMagic <= 880) {
				{
					String _setval = "Wall";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 880 && RandomMagic <= 910) {
				{
					String _setval = "Explosion";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 910 && RandomMagic <= 940) {
				{
					String _setval = "Gravity Manipulation";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 950 && RandomMagic <= 960) {
				{
					String _setval = "Snatch";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 970 && RandomMagic <= 980) {
				{
					String _setval = "Infinity";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 980 && RandomMagic <= 1010) {
				{
					String _setval = "Ark";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.elizbethArk = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (RandomMagic >= 1010 && RandomMagic <= 1040) {
				{
					String _setval = "SunShine";
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.magic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).sunshine = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			}
			SetHumanMagicSunshineProcedure.execute(world, entity);
		}
	}
}
