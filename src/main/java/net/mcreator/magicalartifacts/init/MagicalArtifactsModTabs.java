
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicalArtifactsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGICAL_ARTIFACTS = REGISTRY.register("magical_artifacts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.magical_artifacts.magical_artifacts")).icon(() -> new ItemStack(MagicalArtifactsModItems.MAGIC_WAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MagicalArtifactsModItems.MAGIC_WAND.get());
				tabData.accept(MagicalArtifactsModItems.DUNETITE.get());
				tabData.accept(MagicalArtifactsModBlocks.DUNETITE_ORE.get().asItem());
				tabData.accept(MagicalArtifactsModBlocks.DUNETITE_BLOCK.get().asItem());
				tabData.accept(MagicalArtifactsModBlocks.TEST.get().asItem());
			})

					.build());
}
