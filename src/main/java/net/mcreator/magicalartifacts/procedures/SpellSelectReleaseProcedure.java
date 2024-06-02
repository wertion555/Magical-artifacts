package net.mcreator.magicalartifacts.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.magicalartifacts.world.inventory.SpellSelectInterfaceMenu;

public class SpellSelectReleaseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof SpellSelectInterfaceMenu) {
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
