package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class TowerOfTrailsSetUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TPY = 0;
		double TPX = 0;
		double TPZ = 0;
		TPX = 100 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).training_id;
		TPY = 100;
		TPZ = 100 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).training_id;
		entity.getPersistentData().putDouble("TPX", TPX);
		entity.getPersistentData().putDouble("TPY", TPY);
		entity.getPersistentData().putDouble("TPZ", TPZ);
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")), _ent.getYRot(), _ent.getXRot());
		}
		if (!(entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).tower_of_trails) {
			CraftNoTaizaiMod.queueServerWork(2, () -> {
				{
					boolean _setval = true;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tower_of_trails = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
			if (world instanceof ServerLevel _level)
				_level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(FeatureUtils.createKey("craft_no_taizai:tower_of_trails_feature")).value().place(_level, _level.getChunkSource().getGenerator(),
						_level.getRandom(), BlockPos.containing(TPX - 29, TPY - 3, TPZ - 32));
		}
	}
}
