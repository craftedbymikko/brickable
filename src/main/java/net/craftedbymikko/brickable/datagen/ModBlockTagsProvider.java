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
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.SNOW_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SNOW_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SNOW_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SNOW_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_WALL));




        tag(BlockTags.NEEDS_DIAMOND_TOOL);
                //.add(ModBlocks.getRK(ModBlocks.BEDROCK_ORE));


        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_WALL));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.SNOW_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.SNOW_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.SNOW_BRICK_WALL));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.SMOOTH_BASALT_BRICK_WALL));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_WALL));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_WALL));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_WALL));
        tag(BlockTags.STAIRS).add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_STAIRS));
        tag(BlockTags.SLABS).add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_SLAB));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_WALL));


    }
}
