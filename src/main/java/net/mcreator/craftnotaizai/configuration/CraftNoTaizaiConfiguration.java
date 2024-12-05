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
	static {
		BUILDER.push("Craft No Taizai Random Race");
		RANDOM_RACE = BUILDER.comment("This will determine if you get random race when you join world (Default True)").define("random_race", true);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai Mana");
		MANA_REGEN = BUILDER.comment("This will change how much mana is regen(Default 0.04)").define("mana_regen", (double) 0.04);
		MANA_DRAIN_ONE = BUILDER.define("mana_drain_one", (double) 0.09);
		MANA_DRAIN_TWO = BUILDER.define("mana_drain_two", (double) 0.13);
		MANA_DRAIN_THREE = BUILDER.define("mana_drain_three", (double) 0.15);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai xp & tp");
		TP_AMOUNT = BUILDER.define("Tp_Amount", (double) 10);
		XP_AMOUNT = BUILDER.define("Xp_Amount", (double) 10);
		BUILDER.pop();
		BUILDER.push("Craft No Taizai Speed");
		SPEED = BUILDER.define("Speed", (double) 100);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
