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
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {
 public static final Block CALCITE_BRICKS = registerblock("calcite_bricks",
            properties -> new Block(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(10000)));

    public static final Block CALCITE_BRICK_STAIRS = registerblock("calcite_brick_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_BRICKS.defaultBlockState(),
                    (properties.strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(10000))));

    public static final Block CALCITE_BRICK_SLAB = registerblock("calcite_brick_slab",
            properties -> new SlabBlock(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE).explosionResistance(10000)));

    public static final Block CALCITE_BRICK_WALL = registerblock("calcite_brick_wall",
            properties -> new WallBlock(properties.strength(1F).requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

 public static final Block SNOW_BRICKS = registerblock("snow_bricks",
            properties -> new Block(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.SNOW).explosionResistance(10000)));

    public static final Block SNOW_BRICK_STAIRS = registerblock("snow_brick_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_BRICKS.defaultBlockState(),
                    (properties.strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.SNOW).explosionResistance(10000))));

    public static final Block SNOW_BRICK_SLAB = registerblock("snow_brick_slab",
            properties -> new SlabBlock(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.SNOW).explosionResistance(10000)));

    public static final Block SNOW_BRICK_WALL = registerblock("snow_brick_wall",
            properties -> new WallBlock(properties.strength(1F).requiresCorrectToolForDrops().sound(SoundType.SNOW)));

 public static final Block SMOOTH_BASALT_BRICKS = registerblock("smooth_basalt_bricks",
            properties -> new Block(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.BASALT).explosionResistance(10000)));

    public static final Block SMOOTH_BASALT_BRICK_STAIRS = registerblock("smooth_basalt_brick_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_BRICKS.defaultBlockState(),
                    (properties.strength(1f)
                            .requiresCorrectToolForDrops().sound(SoundType.BASALT).explosionResistance(10000))));

    public static final Block SMOOTH_BASALT_BRICK_SLAB = registerblock("smooth_basalt_brick_slab",
            properties -> new SlabBlock(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.BASALT).explosionResistance(10000)));

    public static final Block SMOOTH_BASALT_BRICK_WALL = registerblock("smooth_basalt_brick_wall",
            properties -> new WallBlock(properties.strength(1F).requiresCorrectToolForDrops().sound(SoundType.BASALT)));

 public static final Block AMETHYST_BRICKS = registerblock("amethyst_bricks",
            properties -> new Block(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST).explosionResistance(10000)));

    public static final Block AMETHYST_BRICK_STAIRS = registerblock("amethyst_brick_stairs",
            properties -> new StairBlock(ModBlocks.CALCITE_BRICKS.defaultBlockState(),
                    (properties.strength(1f)
                        .requiresCorrectToolForDrops().sound(SoundType.AMETHYST).explosionResistance(10000))));

    public static final Block AMETHYST_BRICK_SLAB = registerblock("amethyst_brick_slab",
            properties -> new SlabBlock(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST).explosionResistance(10000)));

    public static final Block AMETHYST_BRICK_WALL = registerblock("amethyst_brick_wall",
            properties -> new WallBlock(properties.strength(1F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

 public static final Block ANDESITE_BRICKS = registerblock("andesite_bricks",
            properties -> new Block(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(10000)));

    public static final Block ANDESITE_BRICK_STAIRS = registerblock("andesite_brick_stairs",
            properties -> new StairBlock(ModBlocks.ANDESITE_BRICKS.defaultBlockState(),
                    (properties.strength(1f)
                        .requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(10000))));

    public static final Block ANDESITE_BRICK_SLAB = registerblock("andesite_brick_slab",
            properties -> new SlabBlock(properties.strength(1f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(10000)));

    public static final Block ANDESITE_BRICK_WALL = registerblock("andesite_brick_wall",
            properties -> new WallBlock(properties.strength(1F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

 public static final Block GRANITE_BRICKS = registerblock("granite_bricks",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(10000)));

    public static final Block GRANITE_BRICK_STAIRS = registerblock("granite_brick_stairs",
            properties -> new StairBlock(ModBlocks.ANDESITE_BRICKS.defaultBlockState(),
                    (properties.strength(3f)
                        .requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(10000))));

    public static final Block GRANITE_BRICK_SLAB = registerblock("granite_brick_slab",
            properties -> new SlabBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE).explosionResistance(10000)));

    public static final Block GRANITE_BRICK_WALL = registerblock("granite_brick_wall",
            properties -> new WallBlock(properties.strength(1F).requiresCorrectToolForDrops().sound(SoundType.STONE)));




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
