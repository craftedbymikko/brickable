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

        dropSelf(ModBlocks.CALCITE_BRICKS_STAIRS);
        dropSelf(ModBlocks.CALCITE_BRICKS_WALL);

        add(ModBlocks.CALCITE_BRICKS_SLAB,createSlabItemTable(ModBlocks.CALCITE_BRICKS_SLAB));


    }
}
