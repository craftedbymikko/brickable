package net.craftedbymikko.brickable.item.custom;

import net.craftedbymikko.brickable.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.function.Consumer;

public class The_Magic_Brick_Wand extends Item {

    private static final Map<Block, Block> THE_MAGIC_BRICK_WAND_MAP = Map.ofEntries(
            Map.entry(Blocks.STONE, Blocks.STONE_BRICKS),
            Map.entry(Blocks.STONE_BRICKS, Blocks.STONE),
            Map.entry(Blocks.END_STONE, Blocks.END_STONE_BRICKS),
            Map.entry(Blocks.END_STONE_BRICKS, Blocks.END_STONE),
            Map.entry(Blocks.NETHERRACK, Blocks.NETHER_BRICKS),
            Map.entry(Blocks.NETHER_BRICKS, Blocks.NETHERRACK),
            Map.entry(Blocks.PACKED_MUD, Blocks.MUD_BRICKS),
            Map.entry(Blocks.MUD_BRICKS, Blocks.PACKED_MUD),
            Map.entry(Blocks.DEEPSLATE, Blocks.DEEPSLATE_BRICKS),
            Map.entry(Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE),
            Map.entry(Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS),
            Map.entry(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE),
            Map.entry(Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS),
            Map.entry(Blocks.TUFF_BRICKS, Blocks.POLISHED_TUFF),
            Map.entry (Blocks.RESIN_BLOCK, Blocks.RESIN_BRICKS),
            Map.entry (Blocks.RESIN_BRICKS, Blocks.RESIN_BLOCK),
            Map.entry (Blocks.POLISHED_SULFUR, Blocks.SULFUR_BRICKS),
            Map.entry(Blocks.SULFUR_BRICKS, Blocks.POLISHED_SULFUR),
            Map.entry(Blocks.POLISHED_CINNABAR, Blocks.CINNABAR_BRICKS),
            Map.entry(Blocks.CINNABAR_BRICKS, Blocks.POLISHED_CINNABAR),
            Map.entry(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BRICKS),
            Map.entry(Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BLOCK),
            Map.entry(Blocks.CALCITE, ModBlocks.CALCITE_BRICKS),
            Map.entry(ModBlocks.CALCITE_BRICKS, Blocks.CALCITE)
    );




    public The_Magic_Brick_Wand(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        // right click block
        //change block from a to b


        Level level = context.getLevel();
        Block clickedblock = level.getBlockState(context.getClickedPos()).getBlock();

        if (THE_MAGIC_BRICK_WAND_MAP.containsKey(clickedblock) && !level.isClientSide()) {
            //we are on the server!
            level.setBlockAndUpdate(context.getClickedPos(), THE_MAGIC_BRICK_WAND_MAP.get(clickedblock).defaultBlockState());

            context.getItemInHand().hurtAndBreak( 1, context.getPlayer(), context.getHand());

        }


        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag){
        if (Minecraft.getInstance().hasShiftDown()) {
            builder.accept(Component.translatable("tooltip.testmod.bedrock_wand.shift_down"));

        } else {
            builder.accept(Component.translatable("tooltip.testmod.bedrock_wand."));
        }


        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
    }
}