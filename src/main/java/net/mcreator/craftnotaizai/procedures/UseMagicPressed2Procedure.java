package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class UseMagicPressed2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ElizabethArkProcedure.execute(world, entity);
		DeathkeypressProcedure.execute(world, x, y, z, entity);
		WallKeyBindOnKeyPressedProcedure.execute(entity);
		PurgeBindOnKeyPressedProcedure.execute(entity);
		BreakBindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		HellBlazeFullCounterOnKeyPressedProcedure.execute(world, entity);
		HunterWispbindOnKeyPressedProcedure.execute(world, x, y, z, entity);
		ExplosionBindOnKeyPressedProcedure.execute(world, entity);
		BoostKeyPressProcedure.execute(world, x, y, z, entity);
		GreatThunderOnKeyPressedProcedure.execute(world, x, y, z, entity);
	}
}
