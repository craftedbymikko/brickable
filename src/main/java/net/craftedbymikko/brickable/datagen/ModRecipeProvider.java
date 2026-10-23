package net.craftedbymikko.brickable.datagen;

import net.craftedbymikko.brickable.block.ModBlocks;
import net.craftedbymikko.brickable.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {



                shaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS)
                        .pattern("RR")
                        .pattern("RR")
                        .define('R', Blocks.CALCITE)
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .save(output, "compacted");



                stairBuilder(ModBlocks.CALCITE_BRICKS_STAIRS, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_SLAB, ModBlocks.CALCITE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS_WALL, ModBlocks.CALCITE_BRICKS);




            }
        };
    }
}
