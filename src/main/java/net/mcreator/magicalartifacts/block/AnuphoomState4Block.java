
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

public class AnuphoomState4Block extends Block {
	public AnuphoomState4Block() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.place"))))
				.strength(1f, 10f).lightLevel(s -> 10).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(7, 0, 7, 9, 7, 9), box(5, 2, 6, 7, 8, 8), box(8, 4, 6, 10, 8, 8), box(6, 6, 10, 8, 10, 12), box(9, 6, 10, 11, 10, 12), box(7, 3, 9, 9, 9, 11), box(9, 5, 5, 11, 9, 7), box(3, 4, 3, 12, 11, 4), box(3, 4, 13, 12, 11, 14),
				box(2, 4, 4, 3, 11, 13), box(12, 4, 4, 13, 11, 13), box(3, 11, 4, 12, 12, 13));
	}
}
