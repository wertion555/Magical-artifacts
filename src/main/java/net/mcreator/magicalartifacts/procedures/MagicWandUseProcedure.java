package net.mcreator.magicalartifacts.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.magicalartifacts.init.MagicalArtifactsModEntities;
import net.mcreator.magicalartifacts.entity.SpellBomdardoEntity;

public class MagicWandUseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = new Object() {
				public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
					AbstractArrow entityToSpawn = new SpellBomdardoEntity(MagicalArtifactsModEntities.SPELL_BOMDARDO.get(), level);
					entityToSpawn.setOwner(shooter);
					entityToSpawn.setBaseDamage(damage);
					entityToSpawn.setKnockback(knockback);
					entityToSpawn.setSilent(true);
					entityToSpawn.setPierceLevel(piercing);
					return entityToSpawn;
				}
			}.getArrow(projectileLevel, entity, 5, 15, (byte) 3);
			_entityToSpawn.setPos(x, (y + 1), z);
			_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}
}
