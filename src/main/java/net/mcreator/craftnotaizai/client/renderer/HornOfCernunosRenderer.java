
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.HornOfCernunosEntity;
import net.mcreator.craftnotaizai.client.model.Modelhorn;

import com.mojang.blaze3d.vertex.PoseStack;

public class HornOfCernunosRenderer extends MobRenderer<HornOfCernunosEntity, Modelhorn<HornOfCernunosEntity>> {
	public HornOfCernunosRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhorn(context.bakeLayer(Modelhorn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(HornOfCernunosEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HornOfCernunosEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/horn_texture.png");
	}
}
