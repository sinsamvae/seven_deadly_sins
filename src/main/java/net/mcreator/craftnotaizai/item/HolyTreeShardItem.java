
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HolyTreeShardItem extends Item {
	public HolyTreeShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}