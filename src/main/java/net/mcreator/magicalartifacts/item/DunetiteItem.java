
package net.mcreator.magicalartifacts.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DunetiteItem extends Item {
	public DunetiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
