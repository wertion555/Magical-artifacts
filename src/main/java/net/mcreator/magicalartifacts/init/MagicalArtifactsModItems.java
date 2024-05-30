
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.magicalartifacts.item.MagicWandItem;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicalArtifactsMod.MODID);
	public static final RegistryObject<Item> MAGIC_WAND = REGISTRY.register("magic_wand", () -> new MagicWandItem());
	// Start of user code block custom items
	// End of user code block custom items
}
