
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalartifacts.block.DunetiteOreBlock;
import net.mcreator.magicalartifacts.block.DunetiteBlockBlock;
import net.mcreator.magicalartifacts.block.AnuphoomBlock;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;
import net.mcreator.magicalartifacts.AnuphoomPlants;

public class MagicalArtifactsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicalArtifactsMod.MODID);
	public static final RegistryObject<Block> DUNETITE_ORE = REGISTRY.register("dunetite_ore", () -> new DunetiteOreBlock());
	public static final RegistryObject<Block> DUNETITE_BLOCK = REGISTRY.register("dunetite_block", () -> new DunetiteBlockBlock());
	public static final RegistryObject<Block> ANUPHOOM = REGISTRY.register("anuphoom", () -> new AnuphoomBlock());
	// Start of user code block custom blocks
	public static final RegistryObject<Block> ANUPHOOM_PLANTS = REGISTRY.register("anuphoom", () -> new AnuphoomPlants());
	// End of user code block custom blocks
}
