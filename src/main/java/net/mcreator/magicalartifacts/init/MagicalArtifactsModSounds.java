
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.magicalartifacts.MagicalArtifactsMod;

public class MagicalArtifactsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MagicalArtifactsMod.MODID);
	public static final RegistryObject<SoundEvent> ANUMHOOM_DESTROY = REGISTRY.register("anumhoom.destroy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("magical_artifacts", "anumhoom.destroy")));
	public static final RegistryObject<SoundEvent> ANUMHOOM_PLACE = REGISTRY.register("anumhoom.place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("magical_artifacts", "anumhoom.place")));
	public static final RegistryObject<SoundEvent> ANUMHOOM_STEP = REGISTRY.register("anumhoom.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("magical_artifacts", "anumhoom.step")));
}
