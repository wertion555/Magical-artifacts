
package net.mcreator.magicalartifacts.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ForgeHooks;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class AnuphoomBlock extends SugarCaneBlock {
	public AnuphoomBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy"))))
				.instabreak().lightLevel(s -> 10).noOcclusion().dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(7, 0, 7, 9, 7, 9), box(5, 2, 6, 7, 8, 8), box(4, 5, 5, 6, 11, 7), box(8, 4, 6, 10, 8, 8), box(6, 6, 10, 8, 10, 12), box(9, 6, 10, 11, 10, 12), box(10, 7, 11, 12, 12, 13), box(5, 7, 11, 7, 11, 13), box(7, 3, 9, 9, 9, 11),
				box(9, 5, 5, 11, 9, 7), box(10, 6, 4, 12, 13, 6), box(3, 6, 2, 13, 14, 3), box(3, 6, 14, 13, 14, 15), box(2, 6, 3, 3, 14, 14), box(13, 6, 3, 14, 14, 14), box(3, 14, 3, 13, 15, 14), box(7, 17, 8, 9, 19, 10), box(9, 15, 6, 11, 18, 8),
				box(9, 15, 10, 11, 18, 12), box(5, 15, 6, 7, 18, 8), box(5, 15, 10, 7, 18, 12));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.PLAINS;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		if (world.isEmptyBlock(pos.above())) {
			int i = 1;
			for (; world.getBlockState(pos.below(i)).is(this); ++i);
			if (i < 6) {
				int j = blockstate.getValue(AGE);
				if (ForgeHooks.onCropsGrowPre(world, pos, blockstate, true)) {
					if (j == 15) {
						world.setBlockAndUpdate(pos.above(), defaultBlockState());
						world.setBlock(pos, blockstate.setValue(AGE, 0), 4);
					} else {
						world.setBlock(pos, blockstate.setValue(AGE, j + 1), 4);
					}
				}
			}
		}
	}
}
