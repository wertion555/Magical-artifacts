
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.magicalartifacts.client.renderer.SpellBomdardoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicalArtifactsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MagicalArtifactsModEntities.SPELL_BOMDARDO.get(), SpellBomdardoRenderer::new);
	}
}
