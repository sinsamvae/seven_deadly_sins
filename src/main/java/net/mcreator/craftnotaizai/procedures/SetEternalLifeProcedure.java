package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class SetEternalLifeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double n = 0;
		n = Mth.nextInt(RandomSource.create(), 1, 100);
		if (n <= 1 && !CraftNoTaizaiModVariables.MapVariables.get(world).eternallife) {
			CraftNoTaizaiModVariables.MapVariables.get(world).eternallife = true;
			CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			{
				boolean _setval = true;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EternalLife = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
