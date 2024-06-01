
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalartifacts.block.MagicalGemsOreBlock;
import net.mcreator.magicalartifacts.block.MagicalGemsBlockBlock;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicalArtifactsMod.MODID);
	public static final RegistryObject<Block> MAGICAL_GEMS_ORE = REGISTRY.register("magical_gems_ore", () -> new MagicalGemsOreBlock());
	public static final RegistryObject<Block> MAGICAL_GEMS_BLOCK = REGISTRY.register("magical_gems_block", () -> new MagicalGemsBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
