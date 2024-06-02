
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.magicalartifacts.world.inventory.SpellSelectInterfaceMenu;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MagicalArtifactsMod.MODID);
	public static final RegistryObject<MenuType<SpellSelectInterfaceMenu>> SPELL_SELECT_INTERFACE = REGISTRY.register("spell_select_interface", () -> IForgeMenuType.create(SpellSelectInterfaceMenu::new));
}
