package net.mcreator.magicalartifacts.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.magicalartifacts.init.MagicalArtifactsModBlockEntities;

public class AnuphoomBlockEntity extends BlockEntity {
	public AnuphoomBlockEntity(BlockPos pos, BlockState state) {
		super(MagicalArtifactsModBlockEntities.ANUPHOOM.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
