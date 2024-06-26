
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.magicalartifacts.entity.SpellRepulsionEntity;
import net.mcreator.magicalartifacts.entity.SpellLevitationEntity;
import net.mcreator.magicalartifacts.entity.SpellBomdardoEntity;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicalArtifactsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MagicalArtifactsMod.MODID);
	public static final RegistryObject<EntityType<SpellBomdardoEntity>> SPELL_BOMDARDO = register("spell_bomdardo",
			EntityType.Builder.<SpellBomdardoEntity>of(SpellBomdardoEntity::new, MobCategory.MISC).setCustomClientFactory(SpellBomdardoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpellRepulsionEntity>> SPELL_REPULSION = register("spell_repulsion",
			EntityType.Builder.<SpellRepulsionEntity>of(SpellRepulsionEntity::new, MobCategory.MISC).setCustomClientFactory(SpellRepulsionEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpellLevitationEntity>> SPELL_LEVITATION = register("spell_levitation", EntityType.Builder.<SpellLevitationEntity>of(SpellLevitationEntity::new, MobCategory.MISC)
			.setCustomClientFactory(SpellLevitationEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
