
package net.mcreator.magicalartifacts.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicalGemsItem extends Item {
	public MagicalGemsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
