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
        //blockModelGenerators.createTrivialCube(ModBlocks.CALCITE_BRICKS);

        blockModelGenerators.family(ModBlocks.CALCITE_BRICKS)
                .stairs(ModBlocks.CALCITE_BRICKS_STAIRS)
                .slab(ModBlocks.CALCITE_BRICKS_SLAB)
                .wall(ModBlocks.CALCITE_BRICKS_WALL);


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.BEDROCK_INGOT, ModelTemplates.FLAT_ITEM);
    }
}
