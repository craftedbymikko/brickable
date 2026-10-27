package net.craftedbymikko.brickable.datagen;

import net.craftedbymikko.brickable.block.ModBlocks;
import net.craftedbymikko.brickable.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

import java.util.Map;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        //blockModelGenerators.createTrivialCube(ModBlocks.CALCITE_BRICKS);\

        blockModelGenerators.family(ModBlocks.CALCITE_BRICKS)
                .stairs(ModBlocks.CALCITE_BRICK_STAIRS)
                .slab(ModBlocks.CALCITE_BRICK_SLAB)
                .wall(ModBlocks.CALCITE_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.SNOW_BRICKS)
                .stairs(ModBlocks.SNOW_BRICK_STAIRS)
                .slab(ModBlocks.SNOW_BRICK_SLAB)
                .wall(ModBlocks.SNOW_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.SMOOTH_BASALT_BRICKS)
                .stairs(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS)
                .slab(ModBlocks.SMOOTH_BASALT_BRICK_SLAB)
                .wall(ModBlocks.SMOOTH_BASALT_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.AMETHYST_BRICKS)
                .stairs(ModBlocks.AMETHYST_BRICK_STAIRS)
                .slab(ModBlocks.AMETHYST_BRICK_SLAB)
                .wall(ModBlocks.AMETHYST_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.ANDESITE_BRICKS)
                .stairs(ModBlocks.ANDESITE_BRICK_STAIRS)
                .slab(ModBlocks.ANDESITE_BRICK_SLAB)
                .wall(ModBlocks.ANDESITE_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.GRANITE_BRICKS)
                .stairs(ModBlocks.GRANITE_BRICK_STAIRS)
                .slab(ModBlocks.GRANITE_BRICK_SLAB)
                .wall(ModBlocks.GRANITE_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.DIORITE_BRICKS)
                .stairs(ModBlocks.DIORITE_BRICK_STAIRS)
                .slab(ModBlocks.DIORITE_BRICK_SLAB)
                .wall(ModBlocks.DIORITE_BRICK_WALL);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.MAGIC_BRICK_WAND, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
