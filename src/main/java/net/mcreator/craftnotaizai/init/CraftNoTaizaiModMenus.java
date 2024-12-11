
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftnotaizai.world.inventory.ZaneriGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.TeleportationGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.StoryBoardMenu;
import net.mcreator.craftnotaizai.world.inventory.SideQuestGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.MonsterBlockGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.MagicMenuMenu;
import net.mcreator.craftnotaizai.world.inventory.KegGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.JennaGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.HumanClanMenu;
import net.mcreator.craftnotaizai.world.inventory.GaintClanMenu;
import net.mcreator.craftnotaizai.world.inventory.FairyClanMenu;
import net.mcreator.craftnotaizai.world.inventory.DisasterMenuMenu;
import net.mcreator.craftnotaizai.world.inventory.DemonStatMenu;
import net.mcreator.craftnotaizai.world.inventory.DemonKingGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.DemonClanMenu;
import net.mcreator.craftnotaizai.world.inventory.CloverTradingMenu;
import net.mcreator.craftnotaizai.world.inventory.ClonesGuiMenu;
import net.mcreator.craftnotaizai.world.inventory.CannonGuiMenu;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

public class CraftNoTaizaiModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftNoTaizaiMod.MODID);
	public static final RegistryObject<MenuType<DemonClanMenu>> DEMON_CLAN = REGISTRY.register("demon_clan", () -> IForgeMenuType.create(DemonClanMenu::new));
	public static final RegistryObject<MenuType<DemonStatMenu>> DEMON_STAT = REGISTRY.register("demon_stat", () -> IForgeMenuType.create(DemonStatMenu::new));
	public static final RegistryObject<MenuType<HumanClanMenu>> HUMAN_CLAN = REGISTRY.register("human_clan", () -> IForgeMenuType.create(HumanClanMenu::new));
	public static final RegistryObject<MenuType<FairyClanMenu>> FAIRY_CLAN = REGISTRY.register("fairy_clan", () -> IForgeMenuType.create(FairyClanMenu::new));
	public static final RegistryObject<MenuType<GaintClanMenu>> GAINT_CLAN = REGISTRY.register("gaint_clan", () -> IForgeMenuType.create(GaintClanMenu::new));
	public static final RegistryObject<MenuType<StoryBoardMenu>> STORY_BOARD = REGISTRY.register("story_board", () -> IForgeMenuType.create(StoryBoardMenu::new));
	public static final RegistryObject<MenuType<MagicMenuMenu>> MAGIC_MENU = REGISTRY.register("magic_menu", () -> IForgeMenuType.create(MagicMenuMenu::new));
	public static final RegistryObject<MenuType<TeleportationGuiMenu>> TELEPORTATION_GUI = REGISTRY.register("teleportation_gui", () -> IForgeMenuType.create(TeleportationGuiMenu::new));
	public static final RegistryObject<MenuType<KegGuiMenu>> KEG_GUI = REGISTRY.register("keg_gui", () -> IForgeMenuType.create(KegGuiMenu::new));
	public static final RegistryObject<MenuType<SideQuestGuiMenu>> SIDE_QUEST_GUI = REGISTRY.register("side_quest_gui", () -> IForgeMenuType.create(SideQuestGuiMenu::new));
	public static final RegistryObject<MenuType<ClonesGuiMenu>> CLONES_GUI = REGISTRY.register("clones_gui", () -> IForgeMenuType.create(ClonesGuiMenu::new));
	public static final RegistryObject<MenuType<MonsterBlockGuiMenu>> MONSTER_BLOCK_GUI = REGISTRY.register("monster_block_gui", () -> IForgeMenuType.create(MonsterBlockGuiMenu::new));
	public static final RegistryObject<MenuType<DemonKingGuiMenu>> DEMON_KING_GUI = REGISTRY.register("demon_king_gui", () -> IForgeMenuType.create(DemonKingGuiMenu::new));
	public static final RegistryObject<MenuType<DisasterMenuMenu>> DISASTER_MENU = REGISTRY.register("disaster_menu", () -> IForgeMenuType.create(DisasterMenuMenu::new));
	public static final RegistryObject<MenuType<CloverTradingMenu>> CLOVER_TRADING = REGISTRY.register("clover_trading", () -> IForgeMenuType.create(CloverTradingMenu::new));
	public static final RegistryObject<MenuType<CannonGuiMenu>> CANNON_GUI = REGISTRY.register("cannon_gui", () -> IForgeMenuType.create(CannonGuiMenu::new));
	public static final RegistryObject<MenuType<JennaGuiMenu>> JENNA_GUI = REGISTRY.register("jenna_gui", () -> IForgeMenuType.create(JennaGuiMenu::new));
	public static final RegistryObject<MenuType<ZaneriGuiMenu>> ZANERI_GUI = REGISTRY.register("zaneri_gui", () -> IForgeMenuType.create(ZaneriGuiMenu::new));
}
