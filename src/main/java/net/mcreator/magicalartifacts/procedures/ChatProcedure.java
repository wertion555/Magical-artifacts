package net.mcreator.magicalartifacts.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.magicalartifacts.network.MagicalArtifactsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChatProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer(), event.getRawText());
	}

	public static void execute(Entity entity, String text) {
		execute(null, entity, text);
	}

	private static void execute(@Nullable Event event, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if (text.startsWith("spell ")) {
			{
				String _setval = text.substring(6);
				entity.getCapability(MagicalArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.selectedSpell = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
