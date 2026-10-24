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

        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        dropSelf(ModBlocks.CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.SNOW_BRICK_STAIRS);
        dropSelf(ModBlocks.SNOW_BRICK_WALL);



        add(ModBlocks.CALCITE_BRICK_SLAB,createSlabItemTable(ModBlocks.CALCITE_BRICK_SLAB));
        add(ModBlocks.SNOW_BRICK_SLAB,createSlabItemTable(ModBlocks.CALCITE_BRICK_SLAB));


    }
}
