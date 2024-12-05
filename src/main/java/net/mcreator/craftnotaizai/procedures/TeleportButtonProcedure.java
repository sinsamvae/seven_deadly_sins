package net.mcreator.craftnotaizai.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.HashMap;

public class TeleportButtonProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		String x = "";
		String y = "";
		String z = "";
		x = guistate.containsKey("textin:X") ? (String) guistate.get("textin:X") : "";
		y = guistate.containsKey("textin:Y") ? (String) guistate.get("textin:Y") : "";
		z = guistate.containsKey("textin:Z") ? (String) guistate.get("textin:Z") : "";
		{
			Entity _ent = entity;
			_ent.teleportTo(new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("textin:X") ? (String) guistate.get("textin:X") : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("textin:Y") ? (String) guistate.get("textin:Y") : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("textin:Z") ? (String) guistate.get("textin:Z") : ""));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("textin:X") ? (String) guistate.get("textin:X") : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("textin:Y") ? (String) guistate.get("textin:Y") : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("textin:Z") ? (String) guistate.get("textin:Z") : ""), _ent.getYRot(), _ent.getXRot());
		}
	}
}
