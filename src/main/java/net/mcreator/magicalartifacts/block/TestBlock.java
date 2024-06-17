
package net.mcreator.magicalartifacts.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class TestBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 3);

	public TestBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRASS).strength(0.05f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 5;
				if (s.getValue(BLOCKSTATE) == 2)
					return 5;
				if (s.getValue(BLOCKSTATE) == 3)
					return 5;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		if (state.getValue(BLOCKSTATE) == 1) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return box(0, 0, 0, 16, 16, 16);
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return Shapes.or(box(7, 0, 7, 9, 7, 9), box(5, 2, 6, 7, 8, 8), box(4, 5, 5, 6, 11, 7), box(8, 4, 6, 10, 8, 8), box(6, 6, 10, 8, 10, 12), box(9, 6, 10, 11, 10, 12), box(10, 7, 11, 12, 12, 13), box(5, 7, 11, 7, 11, 13),
					box(7, 3, 9, 9, 9, 11), box(9, 5, 5, 11, 9, 7), box(10, 6, 4, 12, 13, 6), box(3, 6, 2, 13, 14, 3), box(3, 6, 14, 13, 14, 15), box(2, 6, 3, 3, 14, 14), box(13, 6, 3, 14, 14, 14), box(3, 14, 3, 13, 15, 14), box(7, 17, 8, 9, 19, 10),
					box(9, 15, 6, 11, 18, 8), box(9, 15, 10, 11, 18, 12), box(5, 15, 6, 7, 18, 8), box(5, 15, 10, 7, 18, 12));
		}
		return Shapes.or(box(7, 0, 7, 9, 1, 9), box(7, 1, 7, 8, 3, 8), box(8, 1, 8, 9, 2, 9));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(BLOCKSTATE);
	}
}
