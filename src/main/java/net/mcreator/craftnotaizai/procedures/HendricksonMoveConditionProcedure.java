package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.Entity;

public class HendricksonMoveConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getBoolean("GilThunderDeath") == true;
	}
}
