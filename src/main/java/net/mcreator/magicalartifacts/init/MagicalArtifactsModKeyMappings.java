
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicalartifacts.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.magicalartifacts.network.SpellSelectMessage;
import net.mcreator.magicalartifacts.MagicalArtifactsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MagicalArtifactsModKeyMappings {
	public static final KeyMapping SPELL_SELECT = new KeyMapping("key.magical_artifacts.spell_select", GLFW.GLFW_KEY_TAB, "key.categories.magical_artifacts") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MagicalArtifactsMod.PACKET_HANDLER.sendToServer(new SpellSelectMessage(0, 0));
				SpellSelectMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SPELL_SELECT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SPELL_SELECT.consumeClick();
			}
		}
	}
}
