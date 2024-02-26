package bayhasoft.simplechanges;

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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    
    public static final Block SANDSTONE_BRICK_BLOCK = registerBlock("sandstone_brick_block",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).strength(0.8f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
        new SlabBlock(FabricBlockSettings.copyOf(SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
        new StairsBlock(SANDSTONE_BRICK_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS); 
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
        new WallBlock(FabricBlockSettings.copyOf(SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS);

    public static final Block RED_SANDSTONE_BRICK_BLOCK = registerBlock("red_sandstone_brick_block",
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.ORANGE).strength(0.8f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
        new SlabBlock(FabricBlockSettings.copyOf(RED_SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS);
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
        new StairsBlock(RED_SANDSTONE_BRICK_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(RED_SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS); 
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
        new WallBlock(FabricBlockSettings.copyOf(RED_SANDSTONE_BRICK_BLOCK)), ItemGroups.BUILDING_BLOCKS);
    
    public static final Block OAK_WALL = registerBlock("oak_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.SPRUCE_BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block BIRCH_WALL = registerBlock("birch_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.PALE_YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block ACACIA_WALL = registerBlock("acacia_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.ORANGE).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block CHERRY_WALL = registerBlock("cherry_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.TERRACOTTA_WHITE).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block DARK_OAK_WALL = registerBlock("dark_oak_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MANGROVE_WALL = registerBlock("mangrove_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.RED).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block BAMBOO_WALL = registerBlock("bamboo_wall",
        new WallBlock(FabricBlockSettings.of(Material.WOOD, MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block CRIMSON_WALL = registerBlock("crimson_wall",
        new WallBlock(FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DULL_PINK).strength(2.0f, 3.0f).sounds(BlockSoundGroup.NETHER_WOOD)), ItemGroups.BUILDING_BLOCKS);
    public static final Block WARPED_WALL = registerBlock("warped_wall",
        new WallBlock(FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_AQUA).strength(2.0f, 3.0f).sounds(BlockSoundGroup.NETHER_WOOD)), ItemGroups.BUILDING_BLOCKS);

    


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


