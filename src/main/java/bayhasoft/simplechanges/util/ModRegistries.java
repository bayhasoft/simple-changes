package bayhasoft.simplechanges.util;

import bayhasoft.simplechanges.block.ModBlocks;
import bayhasoft.simplechanges.SimpleChanges;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.world.level.block.Blocks;

public class ModRegistries {
    public static void registerModThings() {
        registerFlammableBlock();
    }
    private static void registerFlammableBlock() {
        SimpleChanges.LOGGER.info("Makeing Blocks from " + SimpleChanges.MOD_ID + "Flammable");
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
        instance.add(ModBlocks.OAK_WALL, 5, 20);
        instance.add(ModBlocks.SPRUCE_WALL, 5, 20);
        instance.add(ModBlocks.BIRCH_WALL, 5, 20);
        instance.add(ModBlocks.JUNGLE_WALL, 5, 20);
        instance.add(ModBlocks.ACACIA_WALL, 5, 20);
        instance.add(ModBlocks.DARK_OAK_WALL, 5, 20);
        instance.add(ModBlocks.MANGROVE_WALL, 5, 20);
        instance.add(ModBlocks.CHERRY_WALL, 5, 20);
        instance.add(ModBlocks.PALE_OAK_WALL, 5, 20);
        instance.add(ModBlocks.POPLAR_WALL, 5, 20);
        instance.add(ModBlocks.BAMBOO_WALL, 5, 20);
        instance.add(Blocks.CRAFTING_TABLE, 5, 20);
    }
}
