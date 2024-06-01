
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicalartifacts.MagicalArtifactsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicalArtifactsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicalArtifactsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGICAL_ARTIFACTS = REGISTRY.register("magical_artifacts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.magical_artifacts.magical_artifacts")).icon(() -> new ItemStack(MagicalArtifactsModItems.MAGIC_WAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MagicalArtifactsModItems.MAGIC_WAND.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MagicalArtifactsModBlocks.MAGICAL_GEMS_ORE.get().asItem());
			tabData.accept(MagicalArtifactsModBlocks.MAGICAL_GEMS_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MagicalArtifactsModItems.MAGICAL_GEMS.get());
		}
	}
}
