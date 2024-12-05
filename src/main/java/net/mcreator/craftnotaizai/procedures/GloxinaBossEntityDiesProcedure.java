package net.mcreator.craftnotaizai.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;
import net.mcreator.craftnotaizai.configuration.CraftNoTaizaiConfiguration;

import java.util.List;
import java.util.Comparator;

public class GloxinaBossEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double drop = 0;
		if (!(entity instanceof Player)) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(65 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player && !(entityiterator == entity)) {
						{
							double _setval = ((entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).xp
									+ Math.ceil(entityiterator.getPersistentData().getDouble("level")) * 0.5 + 800) * ((double) CraftNoTaizaiConfiguration.XP_AMOUNT.get() / 10);
							entityiterator.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.xp = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
					}
				}
			}
		}
		if (CraftNoTaizaiModVariables.MapVariables.get(world).Basquias) {
			drop = Mth.nextInt(RandomSource.create(), 1, 100);
			if (drop <= 15) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(CraftNoTaizaiModItems.BASQUIAS.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
				CraftNoTaizaiModVariables.MapVariables.get(world).Basquias = true;
				CraftNoTaizaiModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
