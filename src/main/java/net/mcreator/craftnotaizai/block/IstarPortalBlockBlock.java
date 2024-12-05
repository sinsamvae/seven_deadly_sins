
package net.mcreator.craftnotaizai.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.procedures.IstarPortalBlockEntityCollidesInTheBlockProcedure;

public class IstarPortalBlockBlock extends Block {
	public IstarPortalBlockBlock() {
		super(BlockBehaviour.Properties.of().air().sound(SoundType.EMPTY).strength(1f, 10f).noCollission());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		IstarPortalBlockEntityCollidesInTheBlockProcedure.execute(entity);
	}
}
