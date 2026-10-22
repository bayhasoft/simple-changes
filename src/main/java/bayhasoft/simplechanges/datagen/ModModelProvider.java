package bayhasoft.simplechanges.datagen;

import bayhasoft.simplechanges.block.ModBlocks;
import bayhasoft.simplechanges.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider sandstonebrickPool = blockStateModelGenerator.family(ModBlocks.SANDSTONE_BRICK_BLOCK);
        sandstonebrickPool.stairs(ModBlocks.SANDSTONE_BRICK_STAIRS);
        sandstonebrickPool.slab(ModBlocks.SANDSTONE_BRICK_SLAB);
        sandstonebrickPool.wall(ModBlocks.SANDSTONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider redsandstonebrickPool = blockStateModelGenerator.family(ModBlocks.RED_SANDSTONE_BRICK_BLOCK);
        redsandstonebrickPool.stairs(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redsandstonebrickPool.slab(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        redsandstonebrickPool.wall(ModBlocks.RED_SANDSTONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider OakPlanksPool = blockStateModelGenerator.family(Blocks.OAK_PLANKS);
        OakPlanksPool.wall(ModBlocks.OAK_WALL);

        BlockModelGenerators.BlockFamilyProvider SprucePlanksPool = blockStateModelGenerator.family(Blocks.SPRUCE_PLANKS);
        SprucePlanksPool.wall(ModBlocks.SPRUCE_WALL);

        BlockModelGenerators.BlockFamilyProvider BirchPlanksPool = blockStateModelGenerator.family(Blocks.BIRCH_PLANKS);
        BirchPlanksPool.wall(ModBlocks.BIRCH_WALL);

        BlockModelGenerators.BlockFamilyProvider JunglePlanksPool = blockStateModelGenerator.family(Blocks.JUNGLE_PLANKS);
        JunglePlanksPool.wall(ModBlocks.JUNGLE_WALL);

        BlockModelGenerators.BlockFamilyProvider AcaciaPlanksPool = blockStateModelGenerator.family(Blocks.ACACIA_PLANKS);
        AcaciaPlanksPool.wall(ModBlocks.ACACIA_WALL);

        BlockModelGenerators.BlockFamilyProvider CherryPlanksPool = blockStateModelGenerator.family(Blocks.CHERRY_PLANKS);
        CherryPlanksPool.wall(ModBlocks.CHERRY_WALL);

        BlockModelGenerators.BlockFamilyProvider PalOakPlanksPool = blockStateModelGenerator.family(Blocks.PALE_OAK_PLANKS);
        PalOakPlanksPool.wall(ModBlocks.PALE_OAK_WALL);

        BlockModelGenerators.BlockFamilyProvider DarkOakPlanksPool = blockStateModelGenerator.family(Blocks.DARK_OAK_PLANKS);
        DarkOakPlanksPool.wall(ModBlocks.DARK_OAK_WALL);

        BlockModelGenerators.BlockFamilyProvider MangrovePlanksPool = blockStateModelGenerator.family(Blocks.MANGROVE_PLANKS);
        MangrovePlanksPool.wall(ModBlocks.MANGROVE_WALL);

        BlockModelGenerators.BlockFamilyProvider PoplarPlanksPool = blockStateModelGenerator.family(Blocks.POPLAR_PLANKS);
        PoplarPlanksPool.wall(ModBlocks.POPLAR_WALL);

        BlockModelGenerators.BlockFamilyProvider BambooPlanksPool = blockStateModelGenerator.family(Blocks.BAMBOO_PLANKS);
        BambooPlanksPool.wall(ModBlocks.BAMBOO_WALL);

        BlockModelGenerators.BlockFamilyProvider CrimsonPlanksPool = blockStateModelGenerator.family(Blocks.CRIMSON_PLANKS);
        CrimsonPlanksPool.wall(ModBlocks.CRIMSON_WALL);

        BlockModelGenerators.BlockFamilyProvider WarpedPlanksPool = blockStateModelGenerator.family(Blocks.WARPED_PLANKS);
        WarpedPlanksPool.wall(ModBlocks.WARPED_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
         itemModelGenerator.generateFlatItem(ModItems.PIG_SKIN, ModelTemplates.FLAT_ITEM);
    }
}
