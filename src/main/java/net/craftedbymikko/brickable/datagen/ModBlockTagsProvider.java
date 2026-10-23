package net.craftedbymikko.brickable.datagen;

import net.craftedbymikko.brickable.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS_WALL))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS_SLAB));






        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS_WALL));
    }
}
