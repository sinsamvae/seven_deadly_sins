package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class IncreaseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rep = 0;
		double num_rep = 0;
		entity.getPersistentData().putDouble("range", 0.1);
		entity.getPersistentData().putDouble("look_x", (entity.getLookAngle().x));
		entity.getPersistentData().putDouble("look_y", (entity.getLookAngle().y));
		entity.getPersistentData().putDouble("look_z", (entity.getLookAngle().z));
		for (int index0 = 0; index0 < 500; index0++) {
			num_rep = num_rep + 0.3;
			CraftNoTaizaiMod.queueServerWork((int) num_rep, () -> {
				entity.getPersistentData().putDouble("range", (entity.getPersistentData().getDouble("range") + 0.1));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.INCREASE_PARTICLE.get()), (entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
							(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")), (int) 1.2, 0.75, 0.75, 0.75, 0);
				IncreaseDamgeProcedure.execute(world, entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range"), entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range"),
						entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range"), entity);
			});
		}
	}
}
