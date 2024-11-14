package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.GaintClanMenu;
import net.mcreator.craftnotaizai.network.GaintClanButtonMessage;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GaintClanScreen extends AbstractContainerScreen<GaintClanMenu> {
	private final static HashMap<String, Object> guistate = GaintClanMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_overarrow;
	ImageButton imagebutton_overarrow2;
	ImageButton imagebutton_select;

	public GaintClanScreen(GaintClanMenu container, Inventory inventory, Component text) {
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
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/gaint_clan.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/gui.png"), this.leftPos + -108, this.topPos + -104, 0, 0, 196, 186, 196, 186);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/image_1.png"), this.leftPos + -89, this.topPos + -62, 0, 0, 42, 42, 42, 42);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_stats"), -81, -32, -26368, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_30_health"), -84, -22, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_50_strength"), -85, -9, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_40_spirit"), -84, 4, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_15_magic_damage"), -84, 19, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_magic"), -73, 41, -26368, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_random_200_to_500"), -73, 50, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_giant_race"), -46, -46, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_empty"), -133, -11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_empty1"), 107, -11, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.gaint_clan.label_select"), -32, 96, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_overarrow = new ImageButton(this.leftPos + -138, this.topPos + -14, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new GaintClanButtonMessage(0, x, y, z));
				GaintClanButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overarrow", imagebutton_overarrow);
		this.addRenderableWidget(imagebutton_overarrow);
		imagebutton_overarrow2 = new ImageButton(this.leftPos + 102, this.topPos + -14, 16, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_overarrow2.png"), 16, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new GaintClanButtonMessage(1, x, y, z));
				GaintClanButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overarrow2", imagebutton_overarrow2);
		this.addRenderableWidget(imagebutton_overarrow2);
		imagebutton_select = new ImageButton(this.leftPos + -48, this.topPos + 91, 64, 16, 0, 0, 16, new ResourceLocation("craft_no_taizai:textures/screens/atlas/imagebutton_select.png"), 64, 32, e -> {
			if (true) {
				CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new GaintClanButtonMessage(2, x, y, z));
				GaintClanButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_select", imagebutton_select);
		this.addRenderableWidget(imagebutton_select);
	}
}
