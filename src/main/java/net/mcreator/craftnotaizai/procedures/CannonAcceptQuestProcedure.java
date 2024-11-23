package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

public class CannonAcceptQuestProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean can_set = false;
		double random = 0;
		double check = 0;
		String quest = "";
		String skill = "";
		if (entity instanceof Player _player)
			_player.closeContainer();
		random = Mth.nextInt(RandomSource.create(), 1, 3);
		if (random == 1) {
			quest = "Kill 20 Zombies";
		}
		if (random == 2) {
			quest = "Collet 10 iron";
		}
		if (random == 3) {
			quest = "Kill 3 Demons";
		}
		((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).sidequest).getOrCreateTag().putString("quest", quest);
		can_set = true;
		for (int index0 = 0; index0 < (int) (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).questamount; index0++) {
			if ((((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).sidequest).getOrCreateTag()
					.getString(("learn_queset" + new java.text.DecimalFormat("##").format(check + 1)))).equals(quest)) {
				can_set = false;
			}
			check = check + 1;
		}
		if (can_set) {
			{
				double _setval = (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).questamount + 1;
				entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.questamount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).sidequest).getOrCreateTag().putString(
					("learn_quest" + new java.text.DecimalFormat("##").format((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).questamount)), quest);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You have new quest!"), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You already have this quest!"), false);
		}
	}
}
