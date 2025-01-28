package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModParticleTypes;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class HelbrumswordRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double yaw = 0;
		double rep = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
		entity.getPersistentData().putDouble("range", 0.5);
		for (int index0 = 0; index0 < 40; index0++) {
			rep = rep + 0.3;
			CraftNoTaizaiMod.queueServerWork((int) rep, () -> {
				entity.getPersistentData().putDouble("range", (entity.getPersistentData().getDouble("range") + 0.5));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (CraftNoTaizaiModParticleTypes.FAIRY_SWORD_PARTICLES.get()), (entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range")),
							(entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range")), (entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range")), 3, 0.3, 0.3, 0.3, 0.1);
				HolyTreeSwordDamageProcedure.execute(world, entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("range"), entity.getY() + 1.5 + entity.getLookAngle().y * entity.getPersistentData().getDouble("range"),
						entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("range"), entity);
			});
		}
	}
}
