
package net.mcreator.craftnotaizai.world.inventory;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftnotaizai.procedures.MagicMenuThisGUIIsClosedProcedure;
import net.mcreator.craftnotaizai.init.CraftNoTaizaiModMenus;
import net.mcreator.craftnotaizai.client.gui.MagicMenuScreen;
import net.mcreator.craftnotaizai.CraftNoTaizaiMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class MagicMenuMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public MagicMenuMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(CraftNoTaizaiModMenus.MAGIC_MENU.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.internal = new ItemStackHandler(0);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		return ItemStack.EMPTY;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (this.world != null && this.world.isClientSide) {
			textBoxStart();
		}
	}

	public void textBoxStart() {
		CraftNoTaizaiMod.PACKET_HANDLER.sendToServer(new MagicMenuOtherMessage(1, x, y, z, MagicMenuScreen.getTextboxValues()));
		MagicMenuOtherMessage.handleOtherAction(entity, 1, x, y, z, MagicMenuScreen.getTextboxValues());
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class MagicMenuOtherMessage {
		private final int mode, x, y, z;
		private HashMap<String, String> textstate;

		public MagicMenuOtherMessage(FriendlyByteBuf buffer) {
			this.mode = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.textstate = readTextState(buffer);
		}

		public MagicMenuOtherMessage(int mode, int x, int y, int z, HashMap<String, String> textstate) {
			this.mode = mode;
			this.x = x;
			this.y = y;
			this.z = z;
			this.textstate = textstate;
		}

		public static void buffer(MagicMenuOtherMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.mode);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			writeTextState(message.textstate, buffer);
		}

		public static void handler(MagicMenuOtherMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				Player entity = context.getSender();
				int mode = message.mode;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				HashMap<String, String> textstate = message.textstate;
				handleOtherAction(entity, mode, x, y, z, textstate);
			});
			context.setPacketHandled(true);
		}

		public static void handleOtherAction(Player entity, int mode, int x, int y, int z, HashMap<String, String> textstate) {
			Level world = entity.level();
			HashMap guistate = MagicMenuMenu.guistate;
			for (Map.Entry<String, String> entry : textstate.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				guistate.put(key, value);
			}
			// security measure to prevent arbitrary chunk generation
			if (!world.hasChunkAt(new BlockPos(x, y, z)))
				return;
			if (mode == 1) {
				MagicMenuThisGUIIsClosedProcedure.execute(entity);
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			CraftNoTaizaiMod.addNetworkMessage(MagicMenuOtherMessage.class, MagicMenuOtherMessage::buffer, MagicMenuOtherMessage::new, MagicMenuOtherMessage::handler);
		}

		public static void writeTextState(HashMap<String, String> map, FriendlyByteBuf buffer) {
			buffer.writeInt(map.size());
			for (Map.Entry<String, String> entry : map.entrySet()) {
				buffer.writeComponent(Component.literal(entry.getKey()));
				buffer.writeComponent(Component.literal(entry.getValue()));
			}
		}

		public static HashMap<String, String> readTextState(FriendlyByteBuf buffer) {
			int size = buffer.readInt();
			HashMap<String, String> map = new HashMap<>();
			for (int i = 0; i < size; i++) {
				String key = buffer.readComponent().getString();
				String value = buffer.readComponent().getString();
				map.put(key, value);
			}
			return map;
		}
	}
}
