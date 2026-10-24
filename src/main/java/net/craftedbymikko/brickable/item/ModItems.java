package net.craftedbymikko.brickable.item;

import net.craftedbymikko.brickable.Brickable;
import net.craftedbymikko.brickable.item.custom.Magic_Brick_Wand;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item MAGIC_BRICK_WAND = registerItem("magic_brick_wand", properties -> new Magic_Brick_Wand(properties.durability(128)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Brickable.LOGGER.info("Registering Mod Items for " + Brickable.MOD_ID);
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }
}
