package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CaveOfTrainingSetUpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TPX = 0;
		double Scenario = 0;
		double TPZ = 0;
		double TPY = 0;
		double amount = 0;
		double entityspawn = 0;
		double area = 0;
		area = Mth.nextInt(RandomSource.create(), 1, 1);
		if (area == 1) {
			TPX = 95;
			TPY = 100;
			TPZ = 222;
			if (!CraftNoTaizaiModVariables.MapVariables.get(world).cavetraining0) {
				CraftNoTaizaiMod.queueServerWork(2, () -> {
					CraftNoTaizaiModVariables.MapVariables.get(world).cavetraining0 = true;
					CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
				});
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "cave_training1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(TPX - 20, TPY - 10, TPZ - 15), BlockPos.containing(TPX - 20, TPY - 10, TPZ - 15),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
			amount = Mth.nextInt(RandomSource.create(), 4, 7);
			for (int index0 = 0; index0 < (int) (amount * 1); index0++) {
				entityspawn = Mth.nextInt(RandomSource.create(), 1, 2);
				if (entityspawn == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CraftNoTaizaiModEntities.CLAY_DRAGON.get().spawn(_level, BlockPos.containing(92 + Mth.nextDouble(RandomSource.create(), 0, 5), 92, 226 + Mth.nextDouble(RandomSource.create(), 0, 5)),
								MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
				if (entityspawn == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CraftNoTaizaiModEntities.TYRANT_DRAGON_CAVE.get().spawn(_level, BlockPos.containing(92 + Mth.nextDouble(RandomSource.create(), 0, 5), 92, 226 + Mth.nextDouble(RandomSource.create(), 0, 5)),
								MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
			}
		}
		entity.getPersistentData().putDouble("TPX", TPX);
		entity.getPersistentData().putDouble("TPY", TPY);
		entity.getPersistentData().putDouble("TPZ", TPZ);
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("TPX")), (entity.getPersistentData().getDouble("TPY")), (entity.getPersistentData().getDouble("TPZ")), _ent.getYRot(), _ent.getXRot());
		}
	}
}
