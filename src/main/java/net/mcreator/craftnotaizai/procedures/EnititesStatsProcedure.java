package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnititesStatsProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double power = 0;
		if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_no_taizai:tamed_skills")))) {
			if (entity instanceof LivingEntity && entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) != null) {
				power = entity instanceof LivingEntity _attributeContext ? _attributeContext.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) : 0.0D;
			} else {
				power = 0;
			}
			entity.getPersistentData().putDouble("BP", (entity.getPersistentData().getDouble("strength") + entity.getPersistentData().getDouble("Spirit") + entity.getPersistentData().getDouble("Mana")));
			entity.getPersistentData().putDouble("strength", power);
			entity.getPersistentData().putDouble("Spirit", (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0));
			entity.getPersistentData().putDouble("Mana", (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1));
		}
	}
}
