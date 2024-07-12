
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicalartifacts.item.MagicWandItem;
import net.mcreator.magicalartifacts.item.DunetiteItem;
import net.mcreator.magicalartifacts.item.AnuphoomCristalItem;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicalArtifactsMod.MODID);
	public static final RegistryObject<Item> MAGIC_WAND = REGISTRY.register("magic_wand", () -> new MagicWandItem());
	public static final RegistryObject<Item> DUNETITE = REGISTRY.register("dunetite", () -> new DunetiteItem());
	public static final RegistryObject<Item> DUNETITE_ORE = block(MagicalArtifactsModBlocks.DUNETITE_ORE);
	public static final RegistryObject<Item> DUNETITE_BLOCK = block(MagicalArtifactsModBlocks.DUNETITE_BLOCK);
	public static final RegistryObject<Item> ANUPHOOM = block(MagicalArtifactsModBlocks.ANUPHOOM);
	public static final RegistryObject<Item> ANUPHOOM_CRISTAL = REGISTRY.register("anuphoom_cristal", () -> new AnuphoomCristalItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
