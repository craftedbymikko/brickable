package net.craftedbymikko.brickable.creativemodetab;

import net.craftedbymikko.brickable.Brickable;
import net.craftedbymikko.brickable.block.ModBlocks;
import net.craftedbymikko.brickable.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab Brickable_BRICKS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Brickable.MOD_ID, "brickable_bricks"),
            FabricCreativeModeTab.builder().icon( () -> new ItemStack(ModBlocks.CALCITE_BRICKS))
                    .title(Component.translatable("Creativemodetab.Brickable_brickable_bricks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.CALCITE_BRICKS);


                    })
                    .build());

    public static void registerModCreativeModeTabs(){
        Brickable.LOGGER.info("Registering Creativemode Tabs For" + Brickable.MOD_ID);
    }
}
