package net.mcreator.craftnotaizai.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.craftnotaizai.world.inventory.KegGuiMenu;
import net.mcreator.craftnotaizai.procedures.DisplayKegTickProcedure;
import net.mcreator.craftnotaizai.procedures.CupsLeftProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class KegGuiScreen extends AbstractContainerScreen<KegGuiMenu> {
	private final static HashMap<String, Object> guistate = KegGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public KegGuiScreen(KegGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 182;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_no_taizai:textures/screens/keg_gui.png");

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

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/1keg_gui-export.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 182, 166, 182, 166);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/honey_bottle_je1_be2.png"), this.leftPos + 136, this.topPos + 40, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("craft_no_taizai:textures/screens/agave.png"), this.leftPos + 29, this.topPos + 40, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.craft_no_taizai.keg_gui.label_keg"), 4, 4, -16777216, false);
		guiGraphics.drawString(this.font,

				DisplayKegTickProcedure.execute(world, x, y, z), 109, 3, -16777216, false);
		guiGraphics.drawString(this.font,

				CupsLeftProcedure.execute(world, x, y, z), 109, 21, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
