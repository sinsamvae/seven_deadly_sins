package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class SetPriceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		entity.getPersistentData().putDouble("cost_amount", (Mth.nextInt(RandomSource.create(), 16, 64)));
	}
}
