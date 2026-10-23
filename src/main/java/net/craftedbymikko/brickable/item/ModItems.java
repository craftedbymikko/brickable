package net.craftedbymikko.brickable.item;

import net.craftedbymikko.brickable.Brickable;
import net.craftedbymikko.brickable.item.custom.The_Magic_Brick_Wand;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModItems {
    //public static final Item BEDROCK_INGOT = registerItem("bedrock_ingot", Item::new);
    public static final Item THE_MAGIC_BRICK_WAND = registerItem("the_magic_brick_wand", properties -> new The_Magic_Brick_Wand(properties.durability(128)));


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Brickable.LOGGER.info("Registering Mod Items for " + Brickable.MOD_ID);

      //  CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {output.accept(BEDROCK_INGOT);});
    }
    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}