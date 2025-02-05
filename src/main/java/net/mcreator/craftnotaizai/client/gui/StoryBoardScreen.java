package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.StoryBoardMenu;
import net.mcreator.craftnotaizai.procedures.Stroy32Procedure;
import net.mcreator.craftnotaizai.procedures.Story9Procedure;
import net.mcreator.craftnotaizai.procedures.Story8Procedure;
import net.mcreator.craftnotaizai.procedures.Story7Procedure;
import net.mcreator.craftnotaizai.procedures.Story6Procedure;
import net.mcreator.craftnotaizai.procedures.Story5Procedure;
import net.mcreator.craftnotaizai.procedures.Story4Procedure;
import net.mcreator.craftnotaizai.procedures.Story48Procedure;
import net.mcreator.craftnotaizai.procedures.Story47Procedure;
import net.mcreator.craftnotaizai.procedures.Story46Procedure;
import net.mcreator.craftnotaizai.procedures.Story45Procedure;
import net.mcreator.craftnotaizai.procedures.Story44Procedure;
import net.mcreator.craftnotaizai.procedures.Story43Procedure;
import net.mcreator.craftnotaizai.procedures.Story42Procedure;
import net.mcreator.craftnotaizai.procedures.Story41Procedure;
import net.mcreator.craftnotaizai.procedures.Story40Procedure;
import net.mcreator.craftnotaizai.procedures.Story3Procedure;
import net.mcreator.craftnotaizai.procedures.Story39Procedure;
import net.mcreator.craftnotaizai.procedures.Story38Procedure;
import net.mcreator.craftnotaizai.procedures.Story37Procedure;
import net.mcreator.craftnotaizai.procedures.Story36Procedure;
import net.mcreator.craftnotaizai.procedures.Story35Procedure;
import net.mcreator.craftnotaizai.procedures.Story34Procedure;
import net.mcreator.craftnotaizai.procedures.Story33Procedure;
import net.mcreator.craftnotaizai.procedures.Story31Procedure;
import net.mcreator.craftnotaizai.procedures.Story30Procedure;
import net.mcreator.craftnotaizai.procedures.Story2Procedure;
import net.mcreator.craftnotaizai.procedures.Story29Procedure;
import net.mcreator.craftnotaizai.procedures.Story28Procedure;
import net.mcreator.craftnotaizai.procedures.Story27Procedure;
import net.mcreator.craftnotaizai.procedures.Story26Procedure;
import net.mcreator.craftnotaizai.procedures.Story25Procedure;
import net.mcreator.craftnotaizai.procedures.Story24Procedure;
import net.mcreator.craftnotaizai.procedures.Story23Procedure;
import net.mcreator.craftnotaizai.procedures.Story22Procedure;
import net.mcreator.craftnotaizai.procedures.Story21Procedure;
import net.mcreator.craftnotaizai.procedures.Story20Procedure;
import net.mcreator.craftnotaizai.procedures.Story1Procedure;
import net.mcreator.craftnotaizai.procedures.Story19Procedure;
import net.mcreator.craftnotaizai.procedures.Story18Procedure;
import net.mcreator.craftnotaizai.procedures.Story17Procedure;
import net.mcreator.craftnotaizai.procedures.Story16Procedure;
import net.mcreator.craftnotaizai.procedures.Story15Procedure;
import net.mcreator.craftnotaizai.procedures.Story14Procedure;
import net.mcreator.craftnotaizai.procedures.Story13Procedure;
import net.mcreator.craftnotaizai.procedures.Story12Procedure;
import net.mcreator.craftnotaizai.procedures.Story11Procedure;
import net.mcreator.craftnotaizai.procedures.Story10Procedure;
import net.mcreator.craftnotaizai.procedures.Start2Procedure;
import net.mcreator.craftnotaizai.procedures.RoylekillcountProcedure;
import net.mcreator.craftnotaizai.procedures.RedDemonKillProcedure;
import net.mcreator.craftnotaizai.procedures.KillGiantVarProcedure;
import net.mcreator.craftnotaizai.procedures.GrayDemonKillProcedure;
import net.mcreator.craftnotaizai.procedures.EarthCrawlerKillsProcedure;
import net.mcreator.craftnotaizai.procedures.CaveOfTrainingVarProcedure;
import net.mcreator.craftnotaizai.procedures.BlueDemonKillsProcedure;
import net.mcreator.craftnotaizai.network.StoryBoardButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoryBoardScreen extends AbstractContainerScreen<StoryBoardMenu> {
	private final static HashMap<String, Object> guistate = StoryBoardMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	ImageButton imagebutton_startbutton;
	ImageButton imagebutton_restart;

	public StoryBoardScreen(StoryBoardMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 149 && mouseX < leftPos + 173 && mouseY > topPos + -82 && mouseY < topPos + -58)
			guiGraphics.renderTooltip(font, Component.translatable("gui.craft_no_taizai.story_board.tooltip_back"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/story_gui.png"), this.leftPos + -153, this.topPos + -82, 0, 0, 302, 167, 302, 167);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_start"), -11, 49, -1, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_this_is_a_tale_of_ancient_times"), -142, -71, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_human_and_nonhuman_worlds_were"), -140, -56, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_when_the_holy_knights_defended_t"), -142, -42, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_their_magical_powers_they_were"), -143, -29, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_respected_but_among_them_a_grou"), -144, -12, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_this_is_a_tale_of_ancient_times1"), -143, -4, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_holy_knights_they_were_known_t"), -143, 9, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_this_is_a_tale_of_ancient_times2"), -79, 9, -16777216, false);
		if (Story1Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_land_as_the_seven_deadly_sin"), -88, 26, -16777216, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_seven_deadly_sins"), -141, -71, -16711681, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_youve_met_elizabeth_young_girl"), -143, -57, -16777216, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_seven_deadly_sins"), -142, -43, -16777216, false);
		if (Story2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_twigo"), -143, -22, -13369345, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep2_the_sin_in_the_sleeping_fore"), -142, -71, -16711681, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_after_the_fight_with_twigo"), -141, -58, -16777216, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_other_memebers_of_the_seven"), -142, -42, -16777216, false);
		if (Start2Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_go_to_the_sleeping_forest_biome"), -143, -22, -13369345, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep4_a_little_girls_dream"), -142, -71, -16711681, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_dinae_joins_the_mission_to_free"), -141, -57, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_baste_dungeon_but_the_group_is"), -140, -42, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_set_on_crushing_the_whole_town_a"), -141, -29, -16777216, false);
		if (Story3Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_gilthunder"), -143, -15, -13369345, false);
		if (Story4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep5"), -142, -71, -16711681, false);
		if (Story4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_golgiu_tries_to_seize_the_sword"), -144, -48, -16777216, false);
		if (Story4Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect"), -143, -22, -13369345, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep5_part_2_even_if_you_should_d"), -142, -71, -16711681, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_sound_of_a_mysterious_bell"), -145, -57, -16777216, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_each_other"), -143, -43, -16777216, false);
		if (Story5Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_diane"), -143, -30, -13369345, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_6_part_1the_poem_of_beginnin"), -142, -71, -16711681, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_must_fight_the_holy_knights_frie"), -144, -57, -16777216, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_proceed_to_the_dungeon"), -144, -42, -16777216, false);
		if (Story6Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_ruin"), -143, -30, -13369345, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_6_part_2"), -140, -71, -16711681, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_must_fight_the_holy_knights_frie1"), -144, -58, -16777216, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_proceed_to_the_dungeon1"), -144, -43, -16777216, false);
		if (Story7Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty"), -142, -29, -13369345, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_7_part_1a_touching_reunion"), -141, -71, -16711681, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty1"), -143, -57, -16777216, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_grizzlys_sins_of_sloth"), -145, -42, -16777216, false);
		if (Story8Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_locate_capital_of_the_dead"), -143, -28, -13369345, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_8the_fearsome_pursuer"), -143, -71, -16711681, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_holy_knight_guila_follows_you_to"), -144, -58, -16777216, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_capital_of_the_dead"), -144, -42, -16777216, false);
		if (Story9Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_guila"), -142, -28, -13369345, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10"), -143, -71, -16711681, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_upon_learning_the_fighting_festi"), -144, -57, -16777216, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_gideon_you_decide_to_participat"), -144, -43, -16777216, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_howzer_and_griamore"), -143, -30, -16777216, false);
		if (Story10Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_all_vaizel_fighting_festi"), -144, -16, -13369345, false);
		if (Story11Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty2"), -143, -71, -16711681, false);
		if (Story11Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_roun_1"), -146, -48, -16777216, false);
		if (Story11Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_taizoo"), -144, -31, -13369345, false);
		if (Story12Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_empty3"), -143, -71, -16711681, false);
		if (Story12Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_next_challanger_griamore_appears"), -145, -48, -16777216, false);
		if (Story12Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_griamore"), -143, -31, -13369345, false);
		if (Story13Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10the_vaizel_fighting_festiv"), -143, -71, -16711681, false);
		if (Story13Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_thrid_round"), -144, -46, -16777216, false);
		if (Story13Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_howzer"), -144, -30, -13369345, false);
		if (Story14Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10the_vaizel_fighting_festiv1"), -142, -71, -16711681, false);
		if (Story14Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_four_round_challanger_cainbarzad"), -144, -47, -16777216, false);
		if (Story14Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_cain_barzad"), -144, -28, -13369345, false);
		if (Story15Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10the_vaizel_fighting_festiv2"), -143, -71, -16711681, false);
		if (Story15Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_fith_round_challanger_ban_appear"), -143, -56, -16777216, false);
		if (Story15Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_ban"), -144, -28, -13369345, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_11"), -142, -72, -16711681, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_during_the_last_match_of_the_fes"), -144, -58, -16777216, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_out_in_pandemonium_when_a_group"), -144, -43, -16777216, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_have_they_come_for"), -143, -29, -16777216, false);
		if (Story16Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_jericho"), -143, -15, -13369345, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_12_bloodcurdling_canon_part"), -142, -71, -16711681, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_during_the_last_match_of_the_fes1"), -144, -57, -16777216, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_out_in_pandemonium_when_a_group1"), -144, -37, -16777216, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_have_they_come_for1"), -143, -29, -16777216, false);
		if (Story17Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect1"), -144, -16, -13369345, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_12_bloodcurdling_canon_part1"), -143, -71, -16711681, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_during_the_last_match_of_the_fes2"), -143, -56, -16777216, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_out_in_pandemonium_when_a_group2"), -145, -43, -16777216, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_have_they_come_for2"), -143, -25, -16777216, false);
		if (Story18Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_armord_helbram"), -145, -13, -13369345, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_1415_unholy_knight"), -143, -71, -16711681, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_new_search_for_the_remaining"), -143, -57, -16777216, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_holy_knight_helbram_dispatch"), -144, -44, -16777216, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_armor_giant"), -142, -29, -16777216, false);
		if (Story19Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_armor_giant"), -143, -15, -13369345, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_1617the_first_sacrifice"), -142, -72, -16711681, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_when_elizabeth_is_kidnapped"), -144, -57, -16777216, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_capital"), -145, -39, -16777216, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_15_royale_gurard"), -143, -15, -13369345, false);
		if (Story20Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					RoylekillcountProcedure.execute(entity), -144, 0, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_18_even_if_it_costs_me_my_li"), -142, -71, -16711681, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_has_a_brush_with_dealth_wh"), -143, -56, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_howzer_and_guila_are_forced_into"), -143, -41, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_formidable_magical_powers"), -142, -28, -16777216, false);
		if (Story21Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_dreyfus"), -145, -12, -13369345, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep"), -142, -71, -16711681, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_king_recalls_how_he_met_diane_70"), -145, -57, -16777216, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_evvent_that_occurred_between_him"), -144, -41, -16777216, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_promise_did_these_once_good_frie"), -143, -26, -16777216, false);
		if (Story22Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defect_helbram"), -144, -13, -13369345, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_23_the_courage_charm"), -143, -71, -16711681, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_in_order_to_take_elizabeth_back"), -144, -57, -16777216, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_arthur_to_fight_a_fierce_battle"), -145, -42, -16777216, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_and_gilthunder"), -143, -23, -16777216, false);
		if (Story23Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_hendrickson_and_gilthunde"), -144, -8, -13369345, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_21"), -142, -71, -16711681, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_appearance_of_merlin_crushes"), -144, -56, -16777216, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_is_reunited_with_elizab"), -144, -40, -16777216, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_kill_someone_in_order_to_resurre"), -145, -25, -16777216, false);
		if (Story24Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_corrupted_jericho"), -144, -7, -13369345, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_what_i_can_do_for_you"), -142, -71, -16711681, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_loses_elizabeth_again"), -149, -57, -16777216, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_he_has_to_kill_in_order_to_save"), -147, -42, -16777216, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_and_company_battle_the_new"), -141, -27, -16777216, false);
		if (Story25Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_ban_and_helbram"), -142, -9, -13369345, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_22_what_i_can_do_for_you"), -141, -71, -16711681, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_loses_elizabeth_again1"), -148, -58, -16777216, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_he_has_to_kill_in_order_to_save1"), -146, -43, -16777216, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_and_company_battle_the_new1"), -143, -26, -16777216, false);
		if (Story26Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_ban_and_helbram1"), -144, -10, -13369345, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_23_descent_into_despair"), -142, -71, -16711681, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_chased_by_the_seven_deadly_sins"), -144, -55, -16777216, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_discoveries_that_give_him_the_ul"), -144, -35, -16777216, false);
		if (Story27Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_bloodred_form_hendrickso"), -145, -5, -13369345, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep24_the_heroes"), -142, -71, -16711681, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_when_it_seems_the_seven_deadly_s"), -145, -57, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_will_be_defeated_by_hendrickson"), 42, -56, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_hendricksons_overwhelming_power"), -145, -41, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_power_returns"), -143, -21, -16777216, false);
		if (Story28Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_gray_demon"), -142, -10, -16711681, false);
		if (Story29Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_end"), -147, -72, -16711681, false);
		if (Story29Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_obtain_coffin_of_eternal_darknes"), -144, -13, -13369345, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_revival_of_the_demon_clan"), -145, -71, -16711681, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_as_the_kingdom_begins_to_rebuild"), -146, -57, -16777216, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_king_honors_the_seven_deadly"), -148, -44, -16777216, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_with_a_medal_ceremoney"), -146, -29, -16777216, false);
		if (Story30Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_dogedo"), -144, -10, -13369345, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_existence_proof"), -144, -72, -16711681, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_with_fraudrins_manipulation_of"), -144, -56, -16777216, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ten_commandments_return_to_the_p"), -144, -43, -16777216, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_follows_ban_to_the_fairy_kings"), -145, -27, -16777216, false);
		if (Story31Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_gowther"), -144, -10, -13369345, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_3the_scared_treasure_lostvay"), -145, -72, -16711681, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_confronts_gowther_after_he"), -146, -57, -16777216, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_zeals_memories_with_the_return"), -144, -43, -16777216, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_threats_descend_upon_allied_clan"), -144, -26, -16777216, false);
		if (Stroy32Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_albion"), -144, -11, -13369345, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_3the_scared_treasure_lostvay1"), -145, -71, -16711681, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_king_struggles_to_fend_off_the_g"), -145, -57, -16777216, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_destory_the_fairy_kings_forest"), -146, -42, -16777216, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_commandments_appears_before_meli"), -146, -26, -16777216, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_tall_albion"), -144, 2, -13369345, false);
		if (Story33Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_go_to_the_fairy_king_forest_biom"), -145, -12, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_5_overwhelming_violence"), -145, -71, -16711681, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_fairies_reconcile_their_diff"), -146, -57, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_leaves_the_forest_meanwhile_me"), -147, -42, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_overwhelmed_by_the_sheer_power_o"), -145, -26, -16777216, false);
		if (Story34Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_galand"), -144, -8, -13369345, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_6_the_chief_holy_knight_aton"), -145, -72, -16711681, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_hendrickson_thought_to_have_bee"), -145, -58, -16777216, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_against_meliodas_aids_gilthunde"), -147, -43, -16777216, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_against_a_powerful_gray_demon"), -147, -25, -16777216, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat"), -144, -7, -13369345, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					RedDemonKillProcedure.execute(entity), -144, 12, -13369345, false);
		if (Story35Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					GrayDemonKillProcedure.execute(entity), -144, 25, -13369345, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_7_where_memories_lead"), -145, -71, -16711681, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_an_injured_diane_awakens_having"), -148, -57, -16777216, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_comrades_with_her_memories_fadi"), -147, -42, -16777216, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_megadoza_home_of_the_giant_clan"), -145, -25, -16777216, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_15_giants"), -144, -8, -13369345, false);
		if (Story36Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					KillGiantVarProcedure.execute(entity), -144, 11, -13369345, false);
		if (Story37Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_druids_holy_land"), -146, -72, -16711681, false);
		if (Story37Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_meliodas_and_others_head_to_mega"), -147, -57, -16777216, false);
		if (Story37Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_diane_meanwhile_a_confused_dia"), -147, -43, -16777216, false);
		if (Story37Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_of_the_ten_commandments_once_aga"), -145, -27, -16777216, false);
		if (Story37Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_find_entrance_of_istar"), -144, 1, -13369345, false);
		if (Story38Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_9_a_promise_to_a_loved_one"), -145, -72, -16711681, false);
		if (Story38Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_acknowledging_his_lack_of_streng"), -147, -58, -16777216, false);
		if (Story38Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_commandments_meliodas_vigorousl"), -145, -42, -16777216, false);
		if (Story38Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_of_istar_to_regin_his_sealed_pow"), -146, -25, -16777216, false);
		if (Story38Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_entities_cave_of_training"), -144, 4, -13369345, false);
		if (Story38Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					CaveOfTrainingVarProcedure.execute(entity), -144, 22, -13369345, false);
		if (Story39Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_10_what_we_lacked"), -146, -72, -16711681, false);
		if (Story39Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ban_relects_on_his_past_after_re"), -147, -57, -16777216, false);
		if (Story39Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_home_in_ravens_meliodass_allie"), -146, -40, -16777216, false);
		if (Story39Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_inevitable_war_with_the_ten_comm"), -144, -22, -16777216, false);
		if (Story39Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_king"), -143, -5, -13369345, false);
		if (Story40Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_11_father_son"), -145, -72, -16711681, false);
		if (Story40Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_a_frail_zhivago_reunites_wtih_ba"), -145, -57, -16777216, false);
		if (Story40Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_son_meanwhile_a_wary_king_conf"), -146, -38, -16777216, false);
		if (Story40Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_intentions"), -145, -19, -16777216, false);
		if (Story40Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_galand1"), -144, 12, -13369345, false);
		if (Story41Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_12_where_love_is_found"), -146, -71, -16711681, false);
		if (Story41Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_a_revived_but_pssessed_elaine_at"), -146, -57, -16777216, false);
		if (Story41Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_as_melascula_and_galand_of_the_t"), -146, -39, -16777216, false);
		if (Story41Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_to_destory_those_in_their_path"), -144, -18, -16777216, false);
		if (Story41Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_go_to_the_plains_biome"), -143, 0, -13369345, false);
		if (Story42Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_13_farewell_beloved_thief"), -145, -72, -16711681, false);
		if (Story42Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_a_revived_but_possessed_elaine_a"), -146, -56, -16777216, false);
		if (Story42Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_as_melascula_and_galand_of_the_t1"), -146, -37, -16777216, false);
		if (Story42Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_to_destory_those_in_their_path1"), -144, -21, -16777216, false);
		if (Story42Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_elaine"), -144, -1, -13369345, false);
		if (Story43Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_14_master_of_the_sun"), -146, -72, -16711681, false);
		if (Story43Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_jericho_carries_severely_injured"), -147, -57, -16777216, false);
		if (Story43Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_back_while_escaping_from_galand"), -146, -40, -16777216, false);
		if (Story43Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_stumbling_into_a_bar_deep_inside"), -145, -19, -16777216, false);
		if (Story43Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_galand2"), -144, 0, -13369345, false);
		if (Story44Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_15_a_bloodcurdling_confessio"), -145, -72, -16711681, false);
		if (Story44Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_gloxinia_and_drole_of_the_ten_co"), -146, -56, -16777216, false);
		if (Story44Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_fighters_to_vaizel_by_offering_t"), -146, -39, -16777216, false);
		if (Story44Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_winner_of_their_great_fight_fest"), -146, -17, -16777216, false);
		if (Story44Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_go_to_plains_biome"), -144, -1, -13369345, false);
		if (Story45Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_16_deathtrap_maze"), -145, -72, -16711681, false);
		if (Story45Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_an_elaborate_trapladen_deadly_m"), -146, -57, -16777216, false);
		if (Story45Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_begins_to_weed_out_the_weaker_ch"), -145, -41, -16777216, false);
		if (Story45Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_gathered_for_the_great_fight_fes"), -145, -22, -16777216, false);
		if (Story45Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_5_earth_crawlers"), -144, -1, -13369345, false);
		if (Story45Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					EarthCrawlerKillsProcedure.execute(entity), -144, 17, -13369345, false);
		if (Story46Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_17_legendary_figures"), -145, -72, -16711681, false);
		if (Story46Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_surviving_challengers_of_the"), -145, -57, -16777216, false);
		if (Story46Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_are_split_into_pairs_and_made_to"), -145, -40, -16777216, false);
		if (Story46Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_tag_team_battle"), -145, -22, -16777216, false);
		if (Story46Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_jigumo"), -144, 1, -13369345, false);
		if (Story47Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_17_legendary_figures_part_2"), -145, -72, -16711681, false);
		if (Story47Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_surviving_challengers_of_the1"), -145, -56, -16777216, false);
		if (Story47Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_are_split_into_pairs_and_made_to1"), -145, -37, -16777216, false);
		if (Story47Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_tag_team_battle1"), -144, -19, -16777216, false);
		if (Story47Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_defeat_jigumo1"), -144, 3, -13369345, false);
		if (Story48Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_ep_17_legendary_figures_part_3"), -146, -71, -16711681, false);
		if (Story48Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_the_surviving_challengers_of_the2"), -146, -57, -16777216, false);
		if (Story48Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_are_split_into_pairs_and_made_to2"), -146, -40, -16777216, false);
		if (Story48Procedure.execute(entity))
			guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.story_board.label_tag_team_battle2"), -145, -18, -16777216, false);
		if (Story48Procedure.execute(entity))
			guiGraphics.drawString(this.font,

					BlueDemonKillsProcedure.execute(entity), -144, 14, -13369345, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_startbutton = new ImageButton(this.leftPos + -30, this.topPos + 45, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_startbutton.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new StoryBoardButtonMessage(0, x, y, z, textstate));
				StoryBoardButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_startbutton", imagebutton_startbutton);
		this.addRenderableWidget(imagebutton_startbutton);
		imagebutton_restart = new ImageButton(this.leftPos + 149, this.topPos + -82, 20, 20, 0, 0, 20, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_restart.png"), 20, 40, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new StoryBoardButtonMessage(1, x, y, z, textstate));
				StoryBoardButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		});
		guistate.put("button:imagebutton_restart", imagebutton_restart);
		this.addRenderableWidget(imagebutton_restart);
	}
}
