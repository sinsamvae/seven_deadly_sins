
package net.mcreator.craftnotaizai.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.craftnotaizai.procedures.SetstrengthcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetlevelcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SethealthcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetdexcommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetdemoneyesProcedure;
import net.mcreator.craftnotaizai.procedures.SetallstatProcedure;
import net.mcreator.craftnotaizai.procedures.SetStoryProcedure;
import net.mcreator.craftnotaizai.procedures.SetSpeedCommandProcedure;
import net.mcreator.craftnotaizai.procedures.SetRedDemonBloodProcedure;
import net.mcreator.craftnotaizai.procedures.SetPossessionProcedure;
import net.mcreator.craftnotaizai.procedures.SetMaxManaProcedure;
import net.mcreator.craftnotaizai.procedures.SetGrayDemonBloodProcedure;
import net.mcreator.craftnotaizai.procedures.MagicdmgprocedureProcedure;
import net.mcreator.craftnotaizai.procedures.GivexpcommandProcedure;
import net.mcreator.craftnotaizai.procedures.GiveRhittaStorePowerProcedureProcedure;
import net.mcreator.craftnotaizai.procedures.GiveGodProcedureProcedure;
import net.mcreator.craftnotaizai.procedures.CommandmentProcedureProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeracehumancommandProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicthunderboltProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicsnatchProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicicefangProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicgreatthunderProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagiccommandProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicarkelizebethProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicTransparencyProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicSunShineProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicPurgeProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicMiracleWindProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicInvasionProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicInfinityProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicHunterWispProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicHellblazeFullcounterProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicHellBlazeProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicGodSpeedProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicExplosionProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicDisasterProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicCreationProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicChaosProcedure;
import net.mcreator.craftnotaizai.procedures.ChangemagicBreakProcedure;
import net.mcreator.craftnotaizai.procedures.ChangegaintProcedure;
import net.mcreator.craftnotaizai.procedures.ChangefairyProcedure;
import net.mcreator.craftnotaizai.procedures.ChangedemonProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMaigcTempestProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMaigcAuraBurstProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMaigcAcidProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicWindShooterProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicWallProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicTrickStarProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicOverPowerCommandProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicOminousNebulaProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicHellGateProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicGroundProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicGravityProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicGoennoJujinProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicFullSizeProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicFullConterProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicFlickStoneProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicDisasterGloxiniaProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicCurseProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicCriticalOverProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicComboStarProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicBulletSquallProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicBoostProcedure;
import net.mcreator.craftnotaizai.procedures.ChangeMagicBlizzardProcedure;
import net.mcreator.craftnotaizai.procedures.AddTpCommandProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

@Mod.EventBusSubscriber
public class SdsSetCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("sds_set").requires(s -> s.hasPermission(1)).then(Commands.literal("Race").then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Human").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeracehumancommandProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Demon").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangedemonProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Fairy").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangefairyProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Giant").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangegaintProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("Magic").then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("OminousNebula").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicOminousNebulaProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Hell_Gate").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicHellGateProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Curse").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicCurseProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Ground").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicGroundProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Disaster_Gloxinia").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicDisasterGloxiniaProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Chaos").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicChaosProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("CriticalOver").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicCriticalOverProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("PhysicalFullCounter").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicFullConterProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("FullSize").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicFullSizeProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("TrickStar").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicTrickStarProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("ComboStar").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicComboStarProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Wall").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicWallProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Blaze").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagiccommandProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Boost").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicBoostProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Acid").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMaigcAcidProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Tempest").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMaigcTempestProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Thunderbolt").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicthunderboltProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("GreatThunder").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicgreatthunderProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Snatch").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicsnatchProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("IceFang").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicicefangProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Transparency").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicTransparencyProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Explosion").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicExplosionProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Purge").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicPurgeProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Break").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicBreakProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Infinity").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicInfinityProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("HellBlaze").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicHellBlazeProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Invasion").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicInvasionProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Creation").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicCreationProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("HunterWisp").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicHunterWispProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("MagicalFullCounter").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicHellblazeFullcounterProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Disaster").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicDisasterProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Creation").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicCreationProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Wind_Shooter").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicWindShooterProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("ark_elizebeth").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicarkelizebethProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("GodSpeed").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicGodSpeedProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("SunShine").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicSunShineProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("MiracleWind").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangemagicMiracleWindProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Aura_Burst").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMaigcAuraBurstProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Bullet_Squall").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicBulletSquallProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Gravity_Manipulation").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicGravityProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Goen_no_Jujin").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicGoennoJujinProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Flick_Stone").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicFlickStoneProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("OverPower").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicOverPowerCommandProcedure.execute(arguments);
			return 0;
		}))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Blizzard").executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ChangeMagicBlizzardProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("Stat").then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Level").then(Commands.argument("number", DoubleArgumentType.doubleArg(0)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetlevelcommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("XP").then(Commands.argument("number", DoubleArgumentType.doubleArg(0)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			GivexpcommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("TP").then(Commands.argument("number", DoubleArgumentType.doubleArg(0)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			AddTpCommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Max_Health").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SethealthcommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Strength").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetstrengthcommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Spirt").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetdexcommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Agility").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetSpeedCommandProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Max_Mana").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetMaxManaProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("Magic_Damage").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			MagicdmgprocedureProcedure.execute(arguments);
			return 0;
		})))).then(Commands.argument("Player", EntityArgument.players()).then(Commands.literal("All_Stats").then(Commands.argument("number", DoubleArgumentType.doubleArg()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetallstatProcedure.execute(arguments);
			return 0;
		}))))).then(Commands.literal("Miscellaneous").then(Commands.literal("Immortality").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("name", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetdemoneyesProcedure.execute(world, arguments);
			return 0;
		})))).then(Commands.literal("God").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("name", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			GiveGodProcedureProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("RhittaStorePower").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("number", DoubleArgumentType.doubleArg(0)).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			GiveRhittaStorePowerProcedureProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("Red_Demon_Blood").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("name", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetRedDemonBloodProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("Gray_Demon_Blood").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("name", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetGrayDemonBloodProcedure.execute(arguments);
			return 0;
		})))).then(Commands.literal("Possession").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("name", BoolArgumentType.bool()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetPossessionProcedure.execute(arguments);
			return 0;
		}))))).then(Commands.literal("Commandment").then(Commands.argument("Player", EntityArgument.players()).then(Commands.argument("name", StringArgumentType.string()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			CommandmentProcedureProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("Story").then(Commands.argument("Player", EntityArgument.player()).then(Commands.argument("name", StringArgumentType.word()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			SetStoryProcedure.execute(arguments, entity);
			return 0;
		})))));
	}
}
