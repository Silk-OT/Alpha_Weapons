package com.alphasquad.alpha_weapons.item;

import com.alphasquad.alpha_weapons.Alpha_WeaponsMain;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item GUN_PLACEHOLDER = registerItem( "GUN_PLACEHOLDER", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));
	//Quilt is absolutely terrible with documentation oh my lord
	//Fabric is better, but 1.20 changes lots so documentation is bad
	private static Item registerItem(String name, Item item) {

		return Registry.register(Registries.ITEM, new Identifier(Alpha_WeaponsMain.MOD_ID, name), item);
	}
	public static void registerModItems() { //referenced in Main's 'OnInitialize'
		Alpha_WeaponsMain.LOGGER.debug("Registering Items for Mod: " + Alpha_WeaponsMain.MOD_ID);
	}
}
