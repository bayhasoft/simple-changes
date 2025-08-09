package bayhasoft.simplechanges.datagen;

import bayhasoft.simplechanges.block.ModBlocks;
import bayhasoft.simplechanges.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool sandstonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_BRICK_BLOCK);
        sandstonebrickPool.stairs(ModBlocks.SANDSTONE_BRICK_STAIRS);
        sandstonebrickPool.slab(ModBlocks.SANDSTONE_BRICK_SLAB);
        sandstonebrickPool.wall(ModBlocks.SANDSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool redsandstonebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_SANDSTONE_BRICK_BLOCK);
        redsandstonebrickPool.stairs(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redsandstonebrickPool.slab(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        redsandstonebrickPool.wall(ModBlocks.RED_SANDSTONE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
         itemModelGenerator.register(ModItems.PIG_SKIN, Models.GENERATED);
    }
}
