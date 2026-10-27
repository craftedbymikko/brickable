package net.craftedbymikko.brickable.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.craftedbymikko.brickable.block.ModBlocks;
import net.craftedbymikko.brickable.item.ModItems;
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
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.CALCITE)
                        .unlockedBy(getHasName(Blocks.CALCITE), has(Blocks.CALCITE))
                        .save(output);

                stairBuilder(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS), has(ModBlocks.CALCITE_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);


                shaped(RecipeCategory.MISC, ModBlocks.SNOW_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.SNOW_BLOCK)
                        .unlockedBy(getHasName(Blocks.SNOW_BLOCK), has(Blocks.SNOW_BLOCK))
                        .save(output);

                stairBuilder(ModBlocks.SNOW_BRICK_STAIRS, Ingredient.of(ModBlocks.SNOW_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SNOW_BRICKS), has(ModBlocks.SNOW_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_SLAB, ModBlocks.SNOW_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_BRICK_WALL, ModBlocks.SNOW_BRICKS);



                shaped(RecipeCategory.MISC, ModBlocks.SMOOTH_BASALT_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.SMOOTH_BASALT)
                        .unlockedBy(getHasName(Blocks.SMOOTH_BASALT), has(Blocks.SMOOTH_BASALT))
                        .save(output);

                stairBuilder(ModBlocks.SMOOTH_BASALT_BRICK_STAIRS, Ingredient.of(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SMOOTH_BASALT_BRICKS), has(ModBlocks.SMOOTH_BASALT_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_BRICK_SLAB, ModBlocks.SMOOTH_BASALT_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_BRICK_WALL, ModBlocks.SMOOTH_BASALT_BRICKS);

                shaped(RecipeCategory.MISC, ModBlocks.AMETHYST_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.AMETHYST_BLOCK)
                        .unlockedBy(getHasName(Blocks.AMETHYST_BLOCK), has(Blocks.AMETHYST_BLOCK))
                        .save(output);

                stairBuilder(ModBlocks.AMETHYST_BRICK_STAIRS, Ingredient.of(ModBlocks.AMETHYST_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.AMETHYST_BRICKS), has(ModBlocks.AMETHYST_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_BRICK_SLAB, ModBlocks.AMETHYST_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_BRICK_WALL, ModBlocks.AMETHYST_BRICKS);

                shaped(RecipeCategory.MISC, ModBlocks.ANDESITE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.POLISHED_ANDESITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_ANDESITE), has(Blocks.POLISHED_ANDESITE))
                        .save(output);

                stairBuilder(ModBlocks.ANDESITE_BRICK_STAIRS, Ingredient.of(ModBlocks.ANDESITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.ANDESITE_BRICKS), has(ModBlocks.ANDESITE_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);

                shaped(RecipeCategory.MISC, ModBlocks.GRANITE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.POLISHED_GRANITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_GRANITE), has(Blocks.POLISHED_GRANITE))
                        .save(output);

                stairBuilder(ModBlocks.GRANITE_BRICK_STAIRS, Ingredient.of(ModBlocks.GRANITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GRANITE_BRICKS), has(ModBlocks.GRANITE_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);

                shaped(RecipeCategory.MISC, ModBlocks.DIORITE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C', Blocks.POLISHED_DIORITE)
                        .unlockedBy(getHasName(Blocks.POLISHED_DIORITE), has(Blocks.POLISHED_DIORITE))
                        .save(output);

                stairBuilder(ModBlocks.DIORITE_BRICK_STAIRS, Ingredient.of(ModBlocks.DIORITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.DIORITE_BRICKS), has(ModBlocks.DIORITE_BRICKS))
                        .save(output);

                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS);


                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);




                }
            };
        }
    }

