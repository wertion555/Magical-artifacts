package net.mcreator.magicalartifacts.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SpellLevitationTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() instanceof LiquidBlock) {
			immediatesourceentity.setNoGravity(false);
		} else {
			immediatesourceentity.setNoGravity(true);
		}
	}
}
