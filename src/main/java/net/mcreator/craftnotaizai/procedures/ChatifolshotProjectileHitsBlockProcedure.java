package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class ChatifolshotProjectileHitsBlockProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level().isClientSide())
			immediatesourceentity.discard();
	}
}
