package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;

public class CaveofTrainingSpawnProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		double entityspawn = 0;
		double TPY = 0;
		double TPX = 0;
		double TPZ = 0;
		amount = Mth.nextInt(RandomSource.create(), 4, 8);
		for (int index0 = 0; index0 < (int) (amount * 1); index0++) {
			entityspawn = Mth.nextInt(RandomSource.create(), 1, 3);
			if (entityspawn == 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.CLAY_DRAGON.get().spawn(_level, BlockPos.containing(entity.getPersistentData().getDouble("TPX"), y, entity.getPersistentData().getDouble("TPZ")), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if (entityspawn == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.TYRANT_DRAGON_CAVE.get().spawn(_level, BlockPos.containing(entity.getPersistentData().getDouble("TPX"), y, entity.getPersistentData().getDouble("TPZ")), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
			if (entityspawn == 3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CraftNoTaizaiModEntities.ANAON.get().spawn(_level, BlockPos.containing(entity.getPersistentData().getDouble("TPX"), y, entity.getPersistentData().getDouble("TPZ")), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			}
		}
	}
}
