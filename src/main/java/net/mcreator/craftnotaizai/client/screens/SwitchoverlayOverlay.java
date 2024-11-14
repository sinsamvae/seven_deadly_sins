
package net.mcreator.craftnotaizai.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.procedures.SkillCDProcedure;
import net.mcreator.craftnotaizai.procedures.RCoolDownVarProcedure;
import net.mcreator.craftnotaizai.procedures.RCoolDownTextProcedure;
import net.mcreator.craftnotaizai.procedures.CoolDownReturnProcedure;
import net.mcreator.craftnotaizai.procedures.AbilityDisplayProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SwitchoverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (RCoolDownTextProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						RCoolDownVarProcedure.execute(entity), w / 2 + -33, h / 2 + -1, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					AbilityDisplayProcedure.execute(entity), 4, h - 35, -1, false);
			if (CoolDownReturnProcedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						SkillCDProcedure.execute(entity), w / 2 + -33, h / 2 + -1, -1, false);
		}
	}
}
