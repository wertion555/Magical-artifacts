
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicalartifacts.block.TestBlock;
import net.mcreator.magicalartifacts.block.DunetiteOreBlock;
import net.mcreator.magicalartifacts.block.DunetiteBlockBlock;
import net.mcreator.magicalartifacts.block.AnuphoomState3Block;
import net.mcreator.magicalartifacts.block.AnuphoomState2Block;
import net.mcreator.magicalartifacts.block.AnuphoomState1Block;
import net.mcreator.magicalartifacts.block.AnuphoomBlock;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicalArtifactsMod.MODID);
	public static final RegistryObject<Block> DUNETITE_ORE = REGISTRY.register("dunetite_ore", () -> new DunetiteOreBlock());
	public static final RegistryObject<Block> DUNETITE_BLOCK = REGISTRY.register("dunetite_block", () -> new DunetiteBlockBlock());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> ANUPHOOM = REGISTRY.register("anuphoom", () -> new AnuphoomBlock());
	public static final RegistryObject<Block> ANUPHOOM_STATE_1 = REGISTRY.register("anuphoom_state_1", () -> new AnuphoomState1Block());
	public static final RegistryObject<Block> ANUPHOOM_STATE_2 = REGISTRY.register("anuphoom_state_2", () -> new AnuphoomState2Block());
	public static final RegistryObject<Block> ANUPHOOM_STATE_3 = REGISTRY.register("anuphoom_state_3", () -> new AnuphoomState3Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
