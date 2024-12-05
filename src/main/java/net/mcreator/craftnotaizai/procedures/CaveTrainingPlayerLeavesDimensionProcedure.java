package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class CaveTrainingPlayerLeavesDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 24000;
			entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.cave_of_training_cd = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
