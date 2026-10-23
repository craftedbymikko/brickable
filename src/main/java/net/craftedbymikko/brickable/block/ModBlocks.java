package net.craftedbymikko.brickable.block;

import net.craftedbymikko.brickable.Brickable;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {
    public static final Block CALCITE_BRICKS = registerblock("calcite_bricks",
            properties -> new Block(properties.strength(3.75f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(0.75f)));

    public static final Block CALCITE_BRICKS_STAIRS = registerblock("calcite_bricks_stair",
            properties -> new Block(properties.strength(3.75f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(0.75f)));

    public static final Block CALCITE_BRICKS_SLAB = registerblock("calcite_bricks_slab",
            properties -> new Block(properties.strength(3.75f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(0.75f)));

    public static final Block CALCITE_BRICKS_WALL = registerblock("calcite_bricks_wall",
            properties -> new Block(properties.strength(3.75f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(0.75f)));




    private static Block registerblock(String name, Function<BlockBehaviour.Properties, Block> function, Component... tooltips) {
        Block toregister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name))));
        registerBlockItem(name, toregister, tooltips);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name), toregister);
    }

    private static void registerBlockItem(String name, Block block, Component... tooltips){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name)))) {
                    @Override
                    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                        for (var component : tooltips) {
                            builder.accept(component);
                        }

                        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                    }
                });

    }
    private static Block registerblock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toregister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name))));
        registerBlockItem(name, toregister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name), toregister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brickable.MOD_ID, name)))));

    }

    public  static void registerModBlocks() {
        Brickable.LOGGER.info("registering Mod Blocks for" + Brickable.MOD_ID);
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
}
