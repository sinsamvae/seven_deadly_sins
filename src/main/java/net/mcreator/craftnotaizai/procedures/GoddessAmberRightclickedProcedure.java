package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.RedDemonGeckolibEntity;
import net.mcreator.craftnotaizai.entity.HellGateRedDemonsEntity;
import net.mcreator.craftnotaizai.entity.GrayDemonEntityEntity;

import java.util.List;
import java.util.Comparator;

public class GoddessAmberRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof HellGateRedDemonsEntity || entityiterator instanceof RedDemonGeckolibEntity || entityiterator instanceof GrayDemonEntityEntity) {
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
			}
		}
		itemstack.shrink(1);
		if (world instanceof Level _level) {
			if (_level.isClientSide()) {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
