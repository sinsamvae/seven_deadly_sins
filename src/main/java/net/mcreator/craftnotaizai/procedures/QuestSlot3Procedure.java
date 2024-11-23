package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class QuestSlot3Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String quest = "";
		String skill = "";
		quest = ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).sidequest).getOrCreateTag()
				.getString(("learn_quest" + new java.text.DecimalFormat("##").format(3 * (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).SlotSwitch)));
		if ((quest).equals("")) {
			quest = "NONE";
		}
		return quest;
	}
}
