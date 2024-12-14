
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.craftnotaizai.client.gui.ZaneriGuiScreen;
import net.mcreator.craftnotaizai.client.gui.TheoTowerScreen;
import net.mcreator.craftnotaizai.client.gui.TheoGuiScreen;
import net.mcreator.craftnotaizai.client.gui.TheoCaveScreen;
import net.mcreator.craftnotaizai.client.gui.TeleportationGuiScreen;
import net.mcreator.craftnotaizai.client.gui.StoryBoardScreen;
import net.mcreator.craftnotaizai.client.gui.SideQuestGuiScreen;
import net.mcreator.craftnotaizai.client.gui.MonsterBlockGuiScreen;
import net.mcreator.craftnotaizai.client.gui.MagicMenuScreen;
import net.mcreator.craftnotaizai.client.gui.KegGuiScreen;
import net.mcreator.craftnotaizai.client.gui.JennaGuiScreen;
import net.mcreator.craftnotaizai.client.gui.HumanClanScreen;
import net.mcreator.craftnotaizai.client.gui.GaintClanScreen;
import net.mcreator.craftnotaizai.client.gui.FairyClanScreen;
import net.mcreator.craftnotaizai.client.gui.DisasterMenuScreen;
import net.mcreator.craftnotaizai.client.gui.DemonStatScreen;
import net.mcreator.craftnotaizai.client.gui.DemonKingGuiScreen;
import net.mcreator.craftnotaizai.client.gui.DemonClanScreen;
import net.mcreator.craftnotaizai.client.gui.CloverTradingScreen;
import net.mcreator.craftnotaizai.client.gui.ClonesGuiScreen;
import net.mcreator.craftnotaizai.client.gui.CannonGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftNoTaizaiModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CraftNoTaizaiModMenus.DEMON_CLAN.get(), DemonClanScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DEMON_STAT.get(), DemonStatScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.HUMAN_CLAN.get(), HumanClanScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.FAIRY_CLAN.get(), FairyClanScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.GAINT_CLAN.get(), GaintClanScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.STORY_BOARD.get(), StoryBoardScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.MAGIC_MENU.get(), MagicMenuScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.TELEPORTATION_GUI.get(), TeleportationGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.KEG_GUI.get(), KegGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.SIDE_QUEST_GUI.get(), SideQuestGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.CLONES_GUI.get(), ClonesGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.MONSTER_BLOCK_GUI.get(), MonsterBlockGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DEMON_KING_GUI.get(), DemonKingGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.DISASTER_MENU.get(), DisasterMenuScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.CLOVER_TRADING.get(), CloverTradingScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.CANNON_GUI.get(), CannonGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.JENNA_GUI.get(), JennaGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.ZANERI_GUI.get(), ZaneriGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.THEO_GUI.get(), TheoGuiScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.THEO_CAVE.get(), TheoCaveScreen::new);
			MenuScreens.register(CraftNoTaizaiModMenus.THEO_TOWER.get(), TheoTowerScreen::new);
		});
	}
}
