
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftnotaizai.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftnotaizai.client.renderer.ZaneriRenderer;
import net.mcreator.craftnotaizai.client.renderer.WickedBiteRenderer;
import net.mcreator.craftnotaizai.client.renderer.WeinheidtAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.VivianAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.VineRenderer;
import net.mcreator.craftnotaizai.client.renderer.TyrantDragonRenderer;
import net.mcreator.craftnotaizai.client.renderer.TwigoAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.TrollRenderer;
import net.mcreator.craftnotaizai.client.renderer.TheoRenderer;
import net.mcreator.craftnotaizai.client.renderer.TallAlbionRenderer;
import net.mcreator.craftnotaizai.client.renderer.TaizooAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.SwordWolfRenderer;
import net.mcreator.craftnotaizai.client.renderer.SuperSlashRenderer;
import net.mcreator.craftnotaizai.client.renderer.SunflowerRenderer;
import net.mcreator.craftnotaizai.client.renderer.SunFlowerTrueSpirtSpearRenderer;
import net.mcreator.craftnotaizai.client.renderer.StoryBanAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.StoryBan2AnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.SoldierAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.SmallHawksRenderer;
import net.mcreator.craftnotaizai.client.renderer.SladerAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.SimonAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.ServantRenderer;
import net.mcreator.craftnotaizai.client.renderer.RuinAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.RoyalGurardAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.RoyalGuardAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.RockRushProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.RisingMeteorRenderer;
import net.mcreator.craftnotaizai.client.renderer.RedKnightAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.RedDemonGeckolibRenderer;
import net.mcreator.craftnotaizai.client.renderer.PurgatoryVenomProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.PuoraRenderer;
import net.mcreator.craftnotaizai.client.renderer.PollenGardenRenderer;
import net.mcreator.craftnotaizai.client.renderer.PhysicalCloneRenderer;
import net.mcreator.craftnotaizai.client.renderer.ParadaAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.MutilatorRabbitsRenderer;
import net.mcreator.craftnotaizai.client.renderer.MuramoDemonFormRenderer;
import net.mcreator.craftnotaizai.client.renderer.MuramoAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.MoonRoseRenderer;
import net.mcreator.craftnotaizai.client.renderer.MerlinBossAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.MeliodasBossAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.MatronaRenderer;
import net.mcreator.craftnotaizai.client.renderer.MarmasRenderer;
import net.mcreator.craftnotaizai.client.renderer.MantaRenderer;
import net.mcreator.craftnotaizai.client.renderer.LuigiRenderer;
import net.mcreator.craftnotaizai.client.renderer.LightningbeastProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.KulumilRenderer;
import net.mcreator.craftnotaizai.client.renderer.KingBossAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.KillerIcebergProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.KamichigiriProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.JumanjuEntityRenderer;
import net.mcreator.craftnotaizai.client.renderer.JillianAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.JethammerProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.JerichoDemonFormRenderer;
import net.mcreator.craftnotaizai.client.renderer.JerichoAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.JennaRenderer;
import net.mcreator.craftnotaizai.client.renderer.InsectRenderer;
import net.mcreator.craftnotaizai.client.renderer.InsectFRenderer;
import net.mcreator.craftnotaizai.client.renderer.IncreaseProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.IceBulletsProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.HunterWispProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.HugoAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.HowzerAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.HornOfCernunosRenderer;
import net.mcreator.craftnotaizai.client.renderer.HideAndSeekRenderer;
import net.mcreator.craftnotaizai.client.renderer.HendricksonAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.HellblazeOmegaProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.HellGateRedDemonsRenderer;
import net.mcreator.craftnotaizai.client.renderer.HellFireBirdRenderer;
import net.mcreator.craftnotaizai.client.renderer.HellBlazeProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.HellBlaze2Renderer;
import net.mcreator.craftnotaizai.client.renderer.HelbremAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.HawksRenderer;
import net.mcreator.craftnotaizai.client.renderer.GustafAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GuilaDemonanimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GuilaAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GuardianTrueSpirtSpearRenderer;
import net.mcreator.craftnotaizai.client.renderer.Guardian1Renderer;
import net.mcreator.craftnotaizai.client.renderer.GriamoreAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GreenKnightAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GrayDemonRenderer;
import net.mcreator.craftnotaizai.client.renderer.GrayDemonHendricksonAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GrayDemonEntityRenderer;
import net.mcreator.craftnotaizai.client.renderer.GowtherStory1Renderer;
import net.mcreator.craftnotaizai.client.renderer.GowtherBossAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GolgiusAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GoddessBlessEntityRenderer;
import net.mcreator.craftnotaizai.client.renderer.GilThunderAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.GilThunderAnimated2Renderer;
import net.mcreator.craftnotaizai.client.renderer.GigaPickRenderer;
import net.mcreator.craftnotaizai.client.renderer.GigaFallRenderer;
import net.mcreator.craftnotaizai.client.renderer.GigaCrushRenderer;
import net.mcreator.craftnotaizai.client.renderer.GerheadeRenderer;
import net.mcreator.craftnotaizai.client.renderer.GeckolibKrakenRenderer;
import net.mcreator.craftnotaizai.client.renderer.GalandRenderer;
import net.mcreator.craftnotaizai.client.renderer.FurkuuSutonRenderer;
import net.mcreator.craftnotaizai.client.renderer.FrozenBreathRenderer;
import net.mcreator.craftnotaizai.client.renderer.FriesiaAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.FossProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.FiveLostProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.FinalProminenceRenderer;
import net.mcreator.craftnotaizai.client.renderer.FightingAreaRenderer;
import net.mcreator.craftnotaizai.client.renderer.FakeBallProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.FairyHelbremAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.ExterminateRayProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.EvilhoundProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.EscanorBossRenderer;
import net.mcreator.craftnotaizai.client.renderer.ElaineRenderer;
import net.mcreator.craftnotaizai.client.renderer.EarthGolemRenderer;
import net.mcreator.craftnotaizai.client.renderer.EarthCrawlerRenderer;
import net.mcreator.craftnotaizai.client.renderer.DuskBison1Renderer;
import net.mcreator.craftnotaizai.client.renderer.DumblebbasAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.DriftBombProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.DreyfusAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.DogedoRenderer;
import net.mcreator.craftnotaizai.client.renderer.DivineSlashRenderer;
import net.mcreator.craftnotaizai.client.renderer.DianeBossAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.DianeAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.DiamondTowerRenderer;
import net.mcreator.craftnotaizai.client.renderer.DemonKingRenderer;
import net.mcreator.craftnotaizai.client.renderer.DemonHendricksonAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.DeathThornRenderer;
import net.mcreator.craftnotaizai.client.renderer.DeadHelbramanimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.DeadEndRenderer;
import net.mcreator.craftnotaizai.client.renderer.DalefinalRenderer;
import net.mcreator.craftnotaizai.client.renderer.DaleSecRenderer;
import net.mcreator.craftnotaizai.client.renderer.DaleArmoredRenderer;
import net.mcreator.craftnotaizai.client.renderer.CruelSunProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.CrazyProminenceRenderer;
import net.mcreator.craftnotaizai.client.renderer.CondensePowerProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.CocoonOfDarknessRenderer;
import net.mcreator.craftnotaizai.client.renderer.CloverRenderer;
import net.mcreator.craftnotaizai.client.renderer.ClayDragonRenderer;
import net.mcreator.craftnotaizai.client.renderer.ChickenRenderer;
import net.mcreator.craftnotaizai.client.renderer.ChatifolshotRenderer;
import net.mcreator.craftnotaizai.client.renderer.ChastiefolTrueSpirtSpearRenderer;
import net.mcreator.craftnotaizai.client.renderer.ChainExplosionV2Renderer;
import net.mcreator.craftnotaizai.client.renderer.CannonEntityRenderer;
import net.mcreator.craftnotaizai.client.renderer.CainBarzadAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.BusterIceRenderer;
import net.mcreator.craftnotaizai.client.renderer.BulletSquallRenderer;
import net.mcreator.craftnotaizai.client.renderer.BrilliantDetonationProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.BlazeProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.BlackOutRenderer;
import net.mcreator.craftnotaizai.client.renderer.BlackOutProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.BlackHoundRenderer;
import net.mcreator.craftnotaizai.client.renderer.BasquiasProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.BasquiasGuardianRenderer;
import net.mcreator.craftnotaizai.client.renderer.BanBossAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.AshDragonRenderer;
import net.mcreator.craftnotaizai.client.renderer.ArrowShotProjectileRenderer;
import net.mcreator.craftnotaizai.client.renderer.AngleCureRenderer;
import net.mcreator.craftnotaizai.client.renderer.AndreDemonFormRenderer;
import net.mcreator.craftnotaizai.client.renderer.AndreAnimatedRenderer;
import net.mcreator.craftnotaizai.client.renderer.AlbionTallRenderer;
import net.mcreator.craftnotaizai.client.renderer.AlbionRenderer;
import net.mcreator.craftnotaizai.client.renderer.AlbionFatRenderer;
import net.mcreator.craftnotaizai.client.renderer.AealHealRenderer;
import net.mcreator.craftnotaizai.client.renderer.AcidTwowerMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftNoTaizaiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CraftNoTaizaiModEntities.RISING_METEOR.get(), RisingMeteorRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.POLLEN_GARDEN.get(), PollenGardenRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SUNFLOWER.get(), SunflowerRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MANTA.get(), MantaRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CHICKEN.get(), ChickenRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GECKOLIB_KRAKEN.get(), GeckolibKrakenRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.RED_DEMON_GECKOLIB.get(), RedDemonGeckolibRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GUARDIAN_1.get(), Guardian1Renderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HAWKS.get(), HawksRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BLACK_HOUND.get(), BlackHoundRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SWORD_WOLF.get(), SwordWolfRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DALE_ARMORED.get(), DaleArmoredRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DALE_SEC.get(), DaleSecRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DALEFINAL.get(), DalefinalRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ELAINE.get(), ElaineRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.INSECT.get(), InsectRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BLAZE_PROJECTILE.get(), BlazeProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MANPUUNO_GEKIRIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SOYOKAZENO_GEKIRIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HELL_BLAZE_PROJECTILE.get(), HellBlazeProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HELLBLAZE_OMEGA_PROJECTILE.get(), HellblazeOmegaProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ROCK_RUSH_PROJECTILE.get(), RockRushProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ACIDTOWER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.EVILHOUND_PROJECTILE.get(), EvilhoundProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.WHIRL_SHOCK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BREAKTHROUGH_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.LIGHTNINGBEAST_PROJECTILE.get(), LightningbeastProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.EMBRACEOFTHE_THUNDER_GOD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ICE_BULLETS_PROJECTILE.get(), IceBulletsProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FREEZE_SHIELD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.KILLER_ICEBERG_PROJECTILE.get(), KillerIcebergProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DRIFT_BOMB_PROJECTILE.get(), DriftBombProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BRILLIANT_DETONATION_PROJECTILE.get(), BrilliantDetonationProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HUNTER_WISP_PROJECTILE.get(), HunterWispProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.JETHAMMER_PROJECTILE.get(), JethammerProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SNOWFLOWERBEAM_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.RAKAN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CONDENSE_POWER_PROJECTILE.get(), CondensePowerProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FOSS_PROJECTILE.get(), FossProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BANISHING_KILL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FAKE_BALL_PROJECTILE.get(), FakeBallProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.EXTERMINATE_RAY_PROJECTILE.get(), ExterminateRayProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PURGATORY_VENOM_PROJECTILE.get(), PurgatoryVenomProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.KILL_SWITCH_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CRUEL_SUN_PROJECTILE.get(), CruelSunProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GRAY_DEMON.get(), GrayDemonRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HIDE_AND_SEEK.get(), HideAndSeekRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.VINE.get(), VineRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FROZEN_BREATH.get(), FrozenBreathRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.NOROI_NO_KOE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DESPAIR_VENOM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.INSECT_F.get(), InsectFRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CHATIFOLSHOT.get(), ChatifolshotRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CRAZY_PROMINENCE.get(), CrazyProminenceRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FIGHTING_AREA.get(), FightingAreaRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FINAL_PROMINENCE.get(), FinalProminenceRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.LUIGI.get(), LuigiRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.TYRANT_DRAGON.get(), TyrantDragonRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MUTILATOR_RABBITS.get(), MutilatorRabbitsRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ANGLE_CURE.get(), AngleCureRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DUSK_BISON_1.get(), DuskBison1Renderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.WIND_SHOT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.WIND_SHOT_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.WINDSHOT_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.AURA_BURST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BULLET_SQUALL.get(), BulletSquallRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.JERICHO_DEMON_FORM.get(), JerichoDemonFormRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.TROLL.get(), TrollRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.KULUMIL.get(), KulumilRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PUORA.get(), PuoraRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.EARTH_CRAWLER.get(), EarthCrawlerRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CHAIN_EXPLOSION_V_2.get(), ChainExplosionV2Renderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CLAY_DRAGON.get(), ClayDragonRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MURAMO_DEMON_FORM.get(), MuramoDemonFormRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ANDRE_DEMON_FORM.get(), AndreDemonFormRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ENERGY_ARROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ACID_TWOWER_MOB.get(), AcidTwowerMobRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DEAD_END.get(), DeadEndRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.EARTH_GOLEM.get(), EarthGolemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PAIN_EDITION.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PAIN_EDITION_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PAIN_EDITION_3.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ARROW_SHOT_PROJECTILE.get(), ArrowShotProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PHYSICAL_CLONE.get(), PhysicalCloneRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HELL_FIRE_BIRD.get(), HellFireBirdRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ASH_DRAGON.get(), AshDragonRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BUSTER_ICE.get(), BusterIceRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CHASTIEFOL_TRUE_SPIRT_SPEAR.get(), ChastiefolTrueSpirtSpearRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GUARDIAN_TRUE_SPIRT_SPEAR.get(), GuardianTrueSpirtSpearRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HELL_BLAZE_2.get(), HellBlaze2Renderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.LET_THERE_BE_LIGHT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.INFERNO_INCANTATION.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.TWIGO_ANIMATED.get(), TwigoAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GRAY_DEMON_ENTITY.get(), GrayDemonEntityRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GIL_THUNDER_ANIMATED.get(), GilThunderAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GOLGIUS_ANIMATED.get(), GolgiusAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DIANE_ANIMATED.get(), DianeAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.RUIN_ANIMATED.get(), RuinAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FRIESIA_ANIMATED.get(), FriesiaAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GUILA_ANIMATED.get(), GuilaAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.TAIZOO_ANIMATED.get(), TaizooAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GRIAMORE_ANIMATED.get(), GriamoreAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HOWZER_ANIMATED.get(), HowzerAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CAIN_BARZAD_ANIMATED.get(), CainBarzadAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.STORY_BAN_ANIMATED.get(), StoryBanAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.JERICHO_ANIMATED.get(), JerichoAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GUILA_DEMONANIMATED.get(), GuilaDemonanimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HELBREM_ANIMATED.get(), HelbremAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GIL_THUNDER_ANIMATED_2.get(), GilThunderAnimated2Renderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.RED_KNIGHT_ANIMATED.get(), RedKnightAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GREEN_KNIGHT_ANIMATED.get(), GreenKnightAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DREYFUS_ANIMATED.get(), DreyfusAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FAIRY_HELBREM_ANIMATED.get(), FairyHelbremAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DEAD_HELBRAMANIMATED.get(), DeadHelbramanimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.VIVIAN_ANIMATED.get(), VivianAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ROYAL_GURARD_ANIMATED.get(), RoyalGurardAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ROYAL_GUARD_ANIMATED.get(), RoyalGuardAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SOLDIER_ANIMATED.get(), SoldierAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HENDRICKSON_ANIMATED.get(), HendricksonAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.STORY_BAN_2_ANIMATED.get(), StoryBan2AnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.PARADA_ANIMATED.get(), ParadaAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DEMON_HENDRICKSON_ANIMATED.get(), DemonHendricksonAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GRAY_DEMON_HENDRICKSON_ANIMATED.get(), GrayDemonHendricksonAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ANDRE_ANIMATED.get(), AndreAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MURAMO_ANIMATED.get(), MuramoAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DUMBLEBBAS_ANIMATED.get(), DumblebbasAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.WEINHEIDT_ANIMATED.get(), WeinheidtAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HUGO_ANIMATED.get(), HugoAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.JILLIAN_ANIMATED.get(), JillianAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SIMON_ANIMATED.get(), SimonAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BAN_BOSS_ANIMATED.get(), BanBossAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SLADER_ANIMATED.get(), SladerAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GUSTAF_ANIMATED.get(), GustafAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DIANE_BOSS_ANIMATED.get(), DianeBossAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GOWTHER_BOSS_ANIMATED.get(), GowtherBossAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.KING_BOSS_ANIMATED.get(), KingBossAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MELIODAS_BOSS_ANIMATED.get(), MeliodasBossAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MERLIN_BOSS_ANIMATED.get(), MerlinBossAnimatedRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.WICKED_BITE.get(), WickedBiteRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.KAMICHIGIRI_PROJECTILE.get(), KamichigiriProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DEATH_THORN.get(), DeathThornRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BASQUIAS_GUARDIAN.get(), BasquiasGuardianRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DIVINE_SLASH.get(), DivineSlashRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ARROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GIGA_PICK.get(), GigaPickRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GIGA_FALL.get(), GigaFallRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GIGA_CRUSH.get(), GigaCrushRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BLACK_OUT.get(), BlackOutRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FURKUU_SUTON.get(), FurkuuSutonRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BLACK_OUT_PROJECTILE.get(), BlackOutProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SUN_FLOWER_TRUE_SPIRT_SPEAR.get(), SunFlowerTrueSpirtSpearRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MOON_ROSE.get(), MoonRoseRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.BASQUIAS_PROJECTILE.get(), BasquiasProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.FIVE_LOST_PROJECTILE.get(), FiveLostProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HELL_GATE_RED_DEMONS.get(), HellGateRedDemonsRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.JUMANJU_ENTITY.get(), JumanjuEntityRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.COCOON_OF_DARKNESS.get(), CocoonOfDarknessRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GERHEADE.get(), GerheadeRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SERVANT.get(), ServantRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MARMAS.get(), MarmasRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.AEAL_HEAL.get(), AealHealRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SUPER_SLASH.get(), SuperSlashRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.HORN_OF_CERNUNOS.get(), HornOfCernunosRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SPIRAL_HAIL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.INCREASE_PROJECTILE.get(), IncreaseProjectileRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DOGEDO.get(), DogedoRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GOWTHER_STORY_1.get(), GowtherStory1Renderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ALBION.get(), AlbionRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CANNON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ALBION_FAT.get(), AlbionFatRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.TALL_ALBION.get(), TallAlbionRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ALBION_TALL.get(), AlbionTallRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GODDESS_BLESS_ENTITY.get(), GoddessBlessEntityRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DEMON_KING.get(), DemonKingRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.SMALL_HAWKS.get(), SmallHawksRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.GALAND.get(), GalandRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.MATRONA.get(), MatronaRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.THEO.get(), TheoRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.JENNA.get(), JennaRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ZANERI.get(), ZaneriRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.DIAMOND_TOWER.get(), DiamondTowerRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.ESCANOR_BOSS.get(), EscanorBossRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CLOVER.get(), CloverRenderer::new);
		event.registerEntityRenderer(CraftNoTaizaiModEntities.CANNON_ENTITY.get(), CannonEntityRenderer::new);
	}
}