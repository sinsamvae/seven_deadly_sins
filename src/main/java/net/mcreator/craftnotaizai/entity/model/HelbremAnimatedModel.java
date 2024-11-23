package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HelbremAnimatedEntity;

public class HelbremAnimatedModel extends GeoModel<HelbremAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(HelbremAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/helbram_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HelbremAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/helbram_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HelbremAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}