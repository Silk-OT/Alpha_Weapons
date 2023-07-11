package com.alphasquad.alpha_weapons.item;

import com.alphasquad.alpha_weapons.Alpha_WeaponsMain;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

/*
	The purpose of ModWeapons.java is to register and add all new weapons that Alpha_Weapons provides.
	Any non-weapon items should instead be added to ModItems.java.
	TODO: Maybe move the registering of items func into a third file both can access?
 */
public class ModWeapons {
/*
	RANGED SECTION
 */
	public static final Item SHOTGUN_PLACEHOLDER = registerItem( "SHOTGUN_PLACEHOLDER", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));
	public static final Item RIFLE_PLACEHOLDER = registerItem( "RIFLE_PLACEHOLDER", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));
	public static final Item PISTOL_PLACEHOLDER = registerItem( "PISTOL_PLACEHOLDER", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));
/*
	MELEE SECTION
 */
	public static final Item SWORD_PLACEHOLDER = registerItem( "SWORD_PLACEHOLDER", new Item(new QuiltItemSettings(
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
