package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class GideonToolInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean manaboost = false;
		if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Giant")) {
			if (entity.getPersistentData().getBoolean("gideon") == false) {
				{
					double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack * 1.5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ManaAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("gideon", true);
			}
			if (entity.getPersistentData().getBoolean("gideon") == true) {
				{
					double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).ManaAttack / 1.5;
					entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ManaAttack = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("gideon", false);
			}
		}
	}
}
