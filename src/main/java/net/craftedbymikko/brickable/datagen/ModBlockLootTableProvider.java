package net.craftedbymikko.brickable.datagen;

import net.craftedbymikko.brickable.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.CALCITE_BRICKS);
        dropSelf(ModBlocks.SNOW_BRICKS);
        dropSelf(ModBlocks.SMOOTH_BASALT_BRICKS);
        dropSelf(ModBlocks.AMETHYST_BRICKS);
        dropSelf(ModBlocks.ANDESITE_BRICKS);
        dropSelf(ModBlocks.GRANITE_BRICKS);

        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        dropSelf(ModBlocks.CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.SNOW_BRICK_STAIRS);
        dropSelf(ModBlocks.SNOW_BRICK_WALL);
        dropSelf(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS);
        dropSelf(ModBlocks.SMOOTH_BASALT_BRICK_WALL);
        dropSelf(ModBlocks.AMETHYST_BRICK_STAIRS);
        dropSelf(ModBlocks.AMETHYST_BRICK_WALL);
        dropSelf(ModBlocks.ANDESITE_BRICK_STAIRS);
        dropSelf(ModBlocks.ANDESITE_BRICK_WALL);
        dropSelf(ModBlocks.GRANITE_BRICK_STAIRS);
        dropSelf(ModBlocks.GRANITE_BRICK_WALL);



        add(ModBlocks.CALCITE_BRICK_SLAB,createSlabItemTable(ModBlocks.CALCITE_BRICK_SLAB));
        add(ModBlocks.SNOW_BRICK_SLAB,createSlabItemTable(ModBlocks.CALCITE_BRICK_SLAB));
        add(ModBlocks.SMOOTH_BASALT_BRICK_SLAB,createSlabItemTable(ModBlocks.SMOOTH_BASALT_BRICK_SLAB));
        add(ModBlocks.AMETHYST_BRICK_SLAB,createSlabItemTable(ModBlocks.AMETHYST_BRICK_SLAB));
        add(ModBlocks.ANDESITE_BRICK_SLAB,createSlabItemTable(ModBlocks.ANDESITE_BRICK_SLAB));
        add(ModBlocks.GRANITE_BRICK_SLAB,createSlabItemTable(ModBlocks.GRANITE_BRICK_SLAB));


    }
}
