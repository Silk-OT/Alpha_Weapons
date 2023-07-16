package com.alphasquad.alpha_weapons.item;

import com.alphasquad.alpha_weapons.Alpha_WeaponsMain;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

/*
	The purpose of ModWeapons.java is to register and add all new weapons that Alpha_Weapons provides.
	Any non-weapon items should instead be added to ModItems.java.
 */
public class ModWeapons {
	/*
		RANGED SECTION
	 */
	public static final Item shotgun_placeholder = registerItem( "shotgun_placeholder", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));

	public static final Item rifle_placeholder = registerItem( "rifle_placeholder", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));
	public static final Item pistol_placeholder = registerItem( "pistol_placeholder", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));
/*
	MELEE SECTION
 */
	public static final Item sword_placeholder = registerItem( "sword_placeholder", new Item(new QuiltItemSettings(
		//TODO Add to Weapon Group (may not be here)
	)));

	//Quilt is absolutely terrible with documentation oh my lord
	//Fabric is better, but 1.20 changes lots so documentation is bad
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Alpha_WeaponsMain.MOD_ID, name), item);
	}

	private static void addWeaponstoGroup(Item items) { //normally meant to be static, but let's see how this works out.
		addItemtoGroup(ItemGroups.COMBAT, items);
	}

	private static void addItemtoGroup(RegistryKey<ItemGroup> itemgroup, Item item) { //maybe make public/move to ModItems for reusability
		//Using Fabric's API (Quilt doesn't support this yet...) this adds the item to the specified group.
		//Maybe move this to a ModItems for ease of reading and usage...
		ItemGroupEvents.modifyEntriesEvent(itemgroup).register(entries -> entries.addAfter(Items.TRIDENT, item));
	}

	public static void registerModItems() { //referenced in Main's 'OnInitialize', meant to be static
		Alpha_WeaponsMain.LOGGER.debug("Registering Items for Mod: " + Alpha_WeaponsMain.MOD_ID);
		addWeaponstoGroup(shotgun_placeholder);
		addWeaponstoGroup(pistol_placeholder);
		addWeaponstoGroup(rifle_placeholder);
		addWeaponstoGroup(sword_placeholder);
		//I wish I could use an array or a vector or anything to make this more concise but whatever :c
	}
}
