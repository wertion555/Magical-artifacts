package net.mcreator.magicalartifacts.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.magicalartifacts.network.MagicalArtifactsModVariables;

public class LevitationBttnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "levitation";
			entity.getCapability(MagicalArtifactsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.selectedSpell = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
