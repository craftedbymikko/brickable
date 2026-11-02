package net.craftedbymikko.brickable.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.craftedbymikko.brickable.Brickable;
import net.craftedbymikko.brickable.block.ModBlocks;
import net.craftedbymikko.brickable.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
public static final CreativeModeTab BRICKABLE_BRICKS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(Brickable.MOD_ID, "brickable_bricks"),
        FabricCreativeModeTab.builder().icon( () -> new ItemStack(ModBlocks.CALCITE_BRICKS))
                .title(Component.translatable("Creativemodetab.Brickable.Bricks_Tab"))
                .displayItems((parameters, output) -> {

output.accept(ModBlocks.CALCITE_BRICKS);
output.accept(ModBlocks.CALCITE_BRICK_STAIRS);
output.accept(ModBlocks.CALCITE_BRICK_SLAB);
output.accept(ModBlocks.CALCITE_BRICK_WALL);


output.accept(ModBlocks.SNOW_BRICKS);
output.accept(ModBlocks.SNOW_BRICK_STAIRS);
output.accept(ModBlocks.SNOW_BRICK_SLAB);
output.accept(ModBlocks.SNOW_BRICK_WALL);


output.accept(ModBlocks.SMOOTH_BASALT_BRICKS);
output.accept(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS);
output.accept(ModBlocks.SMOOTH_BASALT_BRICK_SLAB);
output.accept(ModBlocks.SMOOTH_BASALT_BRICK_WALL);


output.accept(ModBlocks.AMETHYST_BRICKS);
output.accept(ModBlocks.AMETHYST_BRICK_STAIRS);
output.accept(ModBlocks.AMETHYST_BRICK_SLAB);
output.accept(ModBlocks.AMETHYST_BRICK_WALL);

output.accept(ModBlocks.ANDESITE_BRICKS);
output.accept(ModBlocks.ANDESITE_BRICK_STAIRS);
output.accept(ModBlocks.ANDESITE_BRICK_SLAB);
output.accept(ModBlocks.ANDESITE_BRICK_WALL);

output.accept(ModBlocks.GRANITE_BRICKS);
output.accept(ModBlocks.GRANITE_BRICK_STAIRS);
output.accept(ModBlocks.GRANITE_BRICK_SLAB);
output.accept(ModBlocks.GRANITE_BRICK_WALL);

output.accept(ModBlocks.DIORITE_BRICKS);
output.accept(ModBlocks.DIORITE_BRICK_STAIRS);
output.accept(ModBlocks.DIORITE_BRICK_SLAB);
output.accept(ModBlocks.DIORITE_BRICK_WALL);
output.accept(ModItems.MAGIC_BRICK_WAND);

                })
                .build());

    public static void registerModCreativeModeTabs(){
        Brickable.LOGGER.info("Registering Creativemode Tabs For" + Brickable.MOD_ID);
    }
}
