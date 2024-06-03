
package net.mcreator.magicalartifacts.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AnuphoomState2Block extends Block {
	public AnuphoomState2Block() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.place"))))
				.strength(0.1f, 0f).lightLevel(s -> 10).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(7, 0, 7, 9, 3, 9), box(6, 2, 7, 7, 3, 8), box(5, 2, 7, 6, 4, 8), box(8, 3, 6, 9, 4, 8), box(8, 3, 5, 9, 5, 6));
	}
}
