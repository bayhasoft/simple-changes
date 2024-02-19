package net.simplechanges.Blocks.Custom;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.simplechanges.Screen.SawmillScreenHandler;


public class SawmillBlock extends Block{
    private static final Text TITLE = Text.translatable("container.sawmill");
    
    public SawmillBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        
        if(Screen.hasShiftDown()){
        tooltip.add(Text.translatable("simplechanges.sawmill.tooltip.line1"));
        tooltip.add(Text.translatable("simplechanges.sawmill.tooltip.line2"));
        }else{
        tooltip.add(Text.translatable("simplechanges.press.shift.tooltip").formatted(Formatting.BOLD, Formatting.AQUA));
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }
        player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
        return ActionResult.CONSUME;
    }
    
    @Override
    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, playerInventory, player) -> new SawmillScreenHandler(syncId, playerInventory, ScreenHandlerContext.create(world, pos)), TITLE);
    }

}
