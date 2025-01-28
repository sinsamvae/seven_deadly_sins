package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class DemonMarkTickProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		String texture = "";
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		if (entity instanceof Player) {
			if ((entity.getDisplayName().getString()).equals("BilbLAZY") && (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark) {
				texture = "bilb_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getDisplayName().getString()).equals("Cromta") && (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark) {
				texture = "cromta_mark1";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getDisplayName().getString()).equals("_Qlover") && (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark) {
				texture = "clover_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("HellBlaze")
							|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Counter")
							|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full_Counter"))) {
				texture = "demon_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Invasion")) {
				texture = "gowthermark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Combo Star")) {
				texture = "deireri_demon_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Size")) {
				texture = "fraudrin_demon_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Trick Star")) {
				texture = "monspeet_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Critical Over")) {
				texture = "galand_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Curse")) {
				texture = "curse_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Full Counter")) {
				texture = "estarpssa_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Hell Gate")) {
				texture = "hell_gate_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).DemonMark
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Ominous Nebula")) {
				texture = "estarpssa_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark) {
				texture = "hendrickson_1";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Half) {
				texture = "eliz";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Awaken) {
				texture = "eliz_aweken";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
			if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Fairy")
					&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
				texture = "fairy_demon_mark";
			}
			if (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Race).equals("Giant")
					&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).humandemonmark) {
				texture = "giant_demon_mark";
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse(("craft_no_taizai:textures/entities/" + texture + ".png")) != null) {
						_texture = new ResourceLocation(("craft_no_taizai:textures/entities/" + texture + ".png"));
					}
					new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context, false, _texture).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 1);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 0);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 4);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 2);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 5);
				}
				if (_evt.getRenderer() instanceof PlayerRenderer _prmodel && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer.hidePlayerModelPiece(_prmodel.getModel(), 3);
				}
			}
		}
	}
}
