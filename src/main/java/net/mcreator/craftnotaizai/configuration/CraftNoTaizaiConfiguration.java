package net.mcreator.craftnotaizai.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class CraftNoTaizaiConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RANDOM_RACE;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_REGEN;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN;
	public static final ForgeConfigSpec.ConfigValue<Double> TP_AMOUNT;
	public static final ForgeConfigSpec.ConfigValue<Double> XP_AMOUNT;
	public static final ForgeConfigSpec.ConfigValue<Double> CAVE_OF_TRAINING;
	public static final ForgeConfigSpec.ConfigValue<Double> TOWER_OF_TRAILS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> IMMORTALITY;
	public static final ForgeConfigSpec.ConfigValue<Boolean> REROLL;
	static {
		BUILDER.push("Craft No Taizai Random Race");
		RANDOM_RACE = BUILDER.comment("This will determine if you get random race when you join world (Default True)").define("random_race", true);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai Mana");
		MANA_REGEN = BUILDER.comment("This will change how much mana is regen(Default 0.04)").define("mana_regen", (double) 0.04);
		MANA_DRAIN = BUILDER.comment("This will determine how much mana is drain(Default 0.09)").define("mana_drain", (double) 0.09);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai xp & tp");
		TP_AMOUNT = BUILDER.comment("This will determine how much TP you gain after leveling up (Default 1)").define("Tp_Amount", (double) 1);
		XP_AMOUNT = BUILDER.comment("This will determine how much xp you gain after killing mobs (Default 10)").define("Xp_Amount", (double) 10);
		BUILDER.pop();
		BUILDER.push("Istar");
		CAVE_OF_TRAINING = BUILDER.comment("This will determine how much stat you get when killing mob (Default 2)").define("cave_of_training", (double) 2);
		TOWER_OF_TRAILS = BUILDER.comment("This will determine how much stat you get when killing mob (Default 2)").define("tower_of_trails", (double) 2);
		BUILDER.pop();
		BUILDER.push("immortality");
		IMMORTALITY = BUILDER.comment("This will determine if immortality can be obtain in game(Default True)").define("immortality", true);
		BUILDER.pop();
		BUILDER.push("re-roll");
		REROLL = BUILDER.comment("this will determine if you can re-roll magic item first join").define("reroll", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
