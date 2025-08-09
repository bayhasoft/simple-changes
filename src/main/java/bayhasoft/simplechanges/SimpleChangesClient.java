package bayhasoft.simplechanges;

import bayhasoft.simplechanges.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class SimpleChangesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        // blocks
        BlockRenderLayerMap.putBlock(ModBlocks.COPPER_RAIL, BlockRenderLayer.CUTOUT);
    }
}
