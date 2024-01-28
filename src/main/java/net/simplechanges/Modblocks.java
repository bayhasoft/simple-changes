package net.simplechanges;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class Modblocks {
    
    public static final Block SANDSTONE_BRICK_BLOCK = registerBlock("sandstone_brick_block",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).strength(0.8f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
        new SlabBlock(FabricBlockSettings.copyOf(SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
        new StairsBlock(SANDSTONE_BRICK_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS); 
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
        new WallBlock(FabricBlockSettings.copyOf(SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SimpleChanges.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SimpleChanges.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    
    public static void registerModBlocks() {
        SimpleChanges.LOGGER.debug("Registering ModBlocks for " + SimpleChanges.MOD_ID);
    }
}


