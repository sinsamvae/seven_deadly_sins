
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RankItem extends Item {
	public RankItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}