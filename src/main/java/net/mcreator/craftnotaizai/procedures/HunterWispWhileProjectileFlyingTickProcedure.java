package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;

import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class HunterWispWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double delay = 0;
		double distance = 0;
		double range = 0;
		double speed = 0;
		double Random = 0;
		double r = 0;
		double a = 0;
		double cubesize = 0;
		double ssev = 0;
		double sevx = 0;
		double sevy = 0;
		double sevz = 0;
		double ted = 0;
		double tedx = 0;
		double tedy = 0;
		double tedz = 0;
		double sev2 = 0;
		double sevx2 = 0;
		double sevy2 = 0;
		double sevz2 = 0;
		double sev = 0;
		immediatesourceentity.setNoGravity(true);
		ProjectileFullCounterProcedure.execute(world, x, y, z, entity, immediatesourceentity);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.HUNTER_WISPPARTICLE.get()), x, y, z, 4, 0.5, 0.5, 0.5, 0);
		immediatesourceentity.getPersistentData().putBoolean("dong", true);
		immediatesourceentity.getPersistentData().putDouble("Flying", (immediatesourceentity.getPersistentData().getDouble("Flying") + 1));
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 5) {
			a = 0.5;
			cubesize = 50;
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(cubesize / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getPersistentData().getDouble("homingtarget") == 1) {
						if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), cubesize, cubesize, cubesize), e -> true).isEmpty()) {
							sev = Math.sqrt(Math.pow(immediatesourceentity.getDeltaMovement().x(), 2) + Math.pow(immediatesourceentity.getDeltaMovement().y(), 2) + Math.pow(immediatesourceentity.getDeltaMovement().z(), 2));
							sevx = immediatesourceentity.getDeltaMovement().x() / sev;
							sevy = immediatesourceentity.getDeltaMovement().y() / sev;
							sevz = immediatesourceentity.getDeltaMovement().z() / sev;
							tedx = entityiterator.getX() - immediatesourceentity.getX();
							tedy = entityiterator.getY() - immediatesourceentity.getY();
							tedz = entityiterator.getZ() - immediatesourceentity.getZ();
							ted = Math.sqrt(Math.pow(tedx, 2) + Math.pow(tedy, 2) + Math.pow(tedz, 2));
							tedx = tedx / ted;
							tedy = tedy / ted;
							tedz = tedz / ted;
							sevx2 = a * tedx + sevx2;
							sevy2 = a * tedy + sevy2;
							sevz2 = a * tedz + sevz2;
							sev2 = Math.sqrt(Math.pow(sevx2, 2) + Math.pow(sevy2, 2) + Math.pow(sevz2, 2));
							sevx2 = sevx2 / sev2;
							sevy2 = sevy2 / sev2;
							sevz2 = sevz2 / sev2;
							immediatesourceentity.setDeltaMovement(new Vec3((sev * sevx2), (sev * sevy2), (sev * sevz2)));
						}
					}
				}
			}
		}
		if (immediatesourceentity.getPersistentData().getDouble("Flying") >= 200) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
