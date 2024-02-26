package net.simplechanges.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Blocks;
import net.simplechanges.ModBlocks;
import net.simplechanges.SimpleChanges;

public class ModRegisteries {
    public static void registerModThings() {
        registerFlammableBlock();
        registerFuels();
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
        instance.add(ModBlocks.BAMBOO_WALL, 5, 20);
        instance.add(Blocks.CRAFTING_TABLE, 5, 20);
    }
    private static void registerFuels() {
        SimpleChanges.LOGGER.info("Registering Fuels from " + SimpleChanges.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModBlocks.OAK_WALL, 300);
        registry.add(ModBlocks.SPRUCE_WALL, 300);
        registry.add(ModBlocks.BIRCH_WALL, 300);
        registry.add(ModBlocks.JUNGLE_WALL, 300);
        registry.add(ModBlocks.ACACIA_WALL, 300);
        registry.add(ModBlocks.DARK_OAK_WALL, 300);
        registry.add(ModBlocks.MANGROVE_WALL, 300);
        registry.add(ModBlocks.CHERRY_WALL, 300);
        registry.add(ModBlocks.BAMBOO_WALL, 300);
    }
}
