package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.configuration.CraftNoTaizaiConfiguration;

public class GiveRerollMagicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (CraftNoTaizaiConfiguration.REROLL.get()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.RE_ROLL_MAGIC.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
