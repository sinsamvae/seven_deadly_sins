package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.world.inventory.CloverTradingMenu;
import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModItems;

import javax.annotation.Nullable;

import java.util.function.Supplier;
import java.util.Map;

@Mod.EventBusSubscriber
public class SetTradesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double amount = 0;
		boolean can_set = false;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof CloverTradingMenu) {
			if (!entity.getPersistentData().getBoolean("can_set")) {
				entity.getPersistentData().putBoolean("can_set", true);
				if (entity.getPersistentData().getDouble("Playertrade") == 1) {
					amount = Mth.nextDouble(RandomSource.create(), 5, 15);
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:common_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)))
								.copy();
						_setstack.setCount((int) amount);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity.getPersistentData().getDouble("Playertrade") == 2) {
					amount = Mth.nextDouble(RandomSource.create(), 3, 11);
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:uncommon_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)))
								.copy();
						_setstack.setCount((int) amount);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity.getPersistentData().getDouble("Playertrade") == 3) {
					amount = Mth.nextDouble(RandomSource.create(), 3, 8);
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:rare_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
						_setstack.setCount((int) amount);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity.getPersistentData().getDouble("Playertrade") == 4) {
					amount = Mth.nextDouble(RandomSource.create(), 1, 3);
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:epic_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
						_setstack.setCount((int) amount);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity.getPersistentData().getDouble("Playertrade") == 5) {
					if (!CraftNoTaizaiModVariables.MapVariables.get(world).lostvayne) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(CraftNoTaizaiModItems.LOSTVAYNE.get()).copy();
							_setstack.setCount(1);
							((Slot) _slots.get(1)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						amount = Mth.nextDouble(RandomSource.create(), 1, 3);
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(
									(ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("craft_no_taizai:legendary_clover_trades"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))).copy();
							_setstack.setCount((int) amount);
							((Slot) _slots.get(1)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				}
			}
		} else {
			entity.getPersistentData().putBoolean("can_set", false);
		}
	}
}
