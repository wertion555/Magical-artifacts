
package net.mcreator.magicalartifacts.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Mob;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class NotRipeAnuphoomBlock extends Block {
	public NotRipeAnuphoomBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.place")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.destroy")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("magical_artifacts:anumhoom.step"))))
				.strength(1f, 10f).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0.6f, 1f, 0.8f};
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
		return Shapes.or(box(7, 0, 7, 9, 7, 9), box(5, 2, 6, 7, 8, 8), box(4, 5, 5, 6, 11, 7), box(8, 4, 6, 10, 8, 8), box(6, 6, 10, 8, 10, 12), box(9, 6, 10, 11, 10, 12), box(10, 7, 11, 12, 12, 13), box(5, 7, 11, 7, 11, 13), box(7, 3, 9, 9, 9, 11),
				box(9, 5, 5, 11, 9, 7), box(10, 6, 4, 12, 13, 6), box(3, 6, 2, 13, 14, 3), box(3, 6, 14, 13, 14, 15), box(2, 6, 3, 3, 14, 14), box(13, 6, 3, 14, 14, 14), box(3, 14, 3, 13, 15, 14), box(7, 17, 8, 9, 19, 10), box(9, 15, 6, 11, 18, 8),
				box(9, 15, 10, 11, 18, 12), box(5, 15, 6, 7, 18, 8), box(5, 15, 10, 7, 18, 12));
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 100f;
	}

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.LAVA;
	}
}
