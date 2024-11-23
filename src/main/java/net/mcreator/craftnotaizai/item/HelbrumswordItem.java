
package net.mcreator.craftnotaizai.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

public class HelbrumswordItem extends SwordItem {
	public HelbrumswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CraftNoTaizaiModItems.HOLY_TREE_SHARD.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}