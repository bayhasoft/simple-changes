package bayhasoft.simplechanges.datagen;

import bayhasoft.simplechanges.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.SANDSTONE_BRICK_BLOCK);
        dropSelf(ModBlocks.SANDSTONE_BRICK_STAIRS);
        dropSelf(ModBlocks.SANDSTONE_BRICK_WALL);
        add(ModBlocks.SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.SANDSTONE_BRICK_SLAB));


        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_BLOCK);
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_WALL);
        add(ModBlocks.RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(ModBlocks.RED_SANDSTONE_BRICK_SLAB));


        dropSelf(ModBlocks.OAK_WALL);
        dropSelf(ModBlocks.SPRUCE_WALL);
        dropSelf(ModBlocks.BIRCH_WALL);
        dropSelf(ModBlocks.JUNGLE_WALL);
        dropSelf(ModBlocks.ACACIA_WALL);
        dropSelf(ModBlocks.CHERRY_WALL);
        dropSelf(ModBlocks.PALE_OAK_WALL);
        dropSelf(ModBlocks.DARK_OAK_WALL);
        dropSelf(ModBlocks.MANGROVE_WALL);
        dropSelf(ModBlocks.POPLAR_WALL);
        dropSelf(ModBlocks.BAMBOO_WALL);
        dropSelf(ModBlocks.CRIMSON_WALL);
        dropSelf(ModBlocks.WARPED_WALL);

        dropSelf(ModBlocks.COPPER_RAIL);
    }
}
