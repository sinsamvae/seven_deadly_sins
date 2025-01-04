package net.mcreator.craftnotaizai.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class CraftNoTaizaiConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> RANDOM_RACE;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_REGEN;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN_ONE;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN_TWO;
	public static final ForgeConfigSpec.ConfigValue<Double> MANA_DRAIN_THREE;
	public static final ForgeConfigSpec.ConfigValue<Double> TP_AMOUNT;
	public static final ForgeConfigSpec.ConfigValue<Double> XP_AMOUNT;
	public static final ForgeConfigSpec.ConfigValue<Double> SPEED;
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
		MANA_DRAIN_ONE = BUILDER.comment("This will determine how much mana is drain(Default 0.09)").define("mana_drain_one", (double) 0.09);
		MANA_DRAIN_TWO = BUILDER.comment("This will determine how much mana is drain(Default 0.13)").define("mana_drain_two", (double) 0.13);
		MANA_DRAIN_THREE = BUILDER.comment("This will determine how much mana is drain(Default 0.15)").define("mana_drain_three", (double) 0.15);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai xp & tp");
		TP_AMOUNT = BUILDER.comment("This will determine how much TP you gain after leveling up (Default 10)").define("Tp_Amount", (double) 10);
		XP_AMOUNT = BUILDER.comment("This will determine how much xp you gain after killing mobs (Default 10)").define("Xp_Amount", (double) 10);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai Speed");
		SPEED = BUILDER.comment("This will determine the max speed").define("Speed", (double) 100);
		BUILDER.pop();
		BUILDER.push("Istar");
		CAVE_OF_TRAINING = BUILDER.comment("This will determine how much stat you get when killing mob (Default 3)").define("cave_of_training", (double) 3);
		TOWER_OF_TRAILS = BUILDER.comment("This will determine how much stat you get when killing mob (Default 3)").define("tower_of_trails", (double) 3);
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
