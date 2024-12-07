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
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModEntities;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CaveOfTrainingSetUpProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double TPX = 0;
		double Scenario = 0;
		double TPZ = 0;
		double TPY = 0;
		double amount = 0;
		double entityspawn = 0;
		if (!CraftNoTaizaiModVariables.MapVariables.get(world).cavetraining0) {
			CraftNoTaizaiMod.queueServerWork(2, () -> {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76The Pumpkin challenge's copper arena 1 is now on use"), false);
				CraftNoTaizaiModVariables.MapVariables.get(world).cavetraining0 = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			});
			Scenario = 1;
			TPX = 720;
			TPZ = 720;
		} else if (!CraftNoTaizaiModVariables.MapVariables.get(world).cavetraining1) {
			CraftNoTaizaiMod.queueServerWork(2, () -> {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76The Pumpkin challenge's copper arena 2 is now on use"), false);
				CraftNoTaizaiModVariables.MapVariables.get(world).cavetraining1 = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			});
			Scenario = 2;
			TPX = -1800;
			TPZ = 1780;
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
		if (entity.getPersistentData().getBoolean("CaveTPHolder")) {
			entity.getPersistentData().putBoolean("CaveTPHolder", false);
			CraftNoTaizaiMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_no_taizai", "cave_training1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(entity.getPersistentData().getDouble("TPX") - 24, entity.getPersistentData().getDouble("TPY") - 24, entity.getPersistentData().getDouble("TPZ") - 24),
								BlockPos.containing(entity.getPersistentData().getDouble("TPX") - 24, entity.getPersistentData().getDouble("TPY") - 24, entity.getPersistentData().getDouble("TPZ") - 24),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			amount = Mth.nextInt(RandomSource.create(), 4, 7);
			for (int index0 = 0; index0 < (int) (amount * 1); index0++) {
				entityspawn = Mth.nextInt(RandomSource.create(), 1, 3);
				if (entityspawn == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CraftNoTaizaiModEntities.CLAY_DRAGON.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 0, 3), y, z + Mth.nextDouble(RandomSource.create(), 0, 3)),
								MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
				if (entityspawn == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CraftNoTaizaiModEntities.TYRANT_DRAGON_CAVE.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 0, 3), y, z + Mth.nextDouble(RandomSource.create(), 0, 3)),
								MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
				if (entityspawn == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CraftNoTaizaiModEntities.ANAON.get().spawn(_level, BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 0, 3), y, z + Mth.nextDouble(RandomSource.create(), 0, 3)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				}
			}
		}
	}
}
