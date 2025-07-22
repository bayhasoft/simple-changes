package bayhasoft.simplechanges;

import java.util.function.Function;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    
    public static final Block SANDSTONE_BRICK_BLOCK = registerBlock("sandstone_brick_block", Block::new,
        AbstractBlock.Settings.create()
            .mapColor(MapColor.PALE_YELLOW)
            .strength(0.8f)
            .requiresTool(),
        true);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab", SlabBlock::new,
        AbstractBlock.Settings.copy(SANDSTONE_BRICK_BLOCK), true);
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall", WallBlock::new,
        AbstractBlock.Settings.copy(SANDSTONE_BRICK_BLOCK), true);
    public static final Block SANDSTONE_BRICK_STAIRS = registerStairsBlock("sandstone_brick_stairs",
        properties -> new StairsBlock(ModBlocks.SANDSTONE_BRICK_BLOCK.getDefaultState(),
            properties.mapColor(MapColor.PALE_YELLOW).strength(0.8f).requiresTool() ));

    public static final Block RED_SANDSTONE_BRICK_BLOCK = registerBlock("red_sandstone_brick_block", Block::new,
        AbstractBlock.Settings.create()
            .mapColor(MapColor.ORANGE)
            .strength(0.8f)
            .requiresTool(), 
        true);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab", SlabBlock::new,
        AbstractBlock.Settings.copy(RED_SANDSTONE_BRICK_BLOCK), true);
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall", WallBlock::new, 
        AbstractBlock.Settings.copy(RED_SANDSTONE_BRICK_BLOCK), true);
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerStairsBlock("red_sandstone_brick_stairs",
        properties -> new StairsBlock(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.getDefaultState(),
            properties.mapColor(MapColor.ORANGE).strength(0.8f).requiresTool() ));

    public static final Block OAK_WALL = registerBlock("oak_wall", WallBlock::new,
        AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall", WallBlock::new,
        AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block BIRCH_WALL = registerBlock("birch_wall", WallBlock::new, 
        AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall", WallBlock::new, 
        AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block ACACIA_WALL = registerBlock("acacia_wall", WallBlock::new, 
        AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block CHERRY_WALL = registerBlock("cherry_wall", WallBlock::new, 
        AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block PALE_OAK_WALL = registerBlock("pale_oak_wall", WallBlock::new, 
        AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block DARK_OAK_WALL = registerBlock("dark_oak_wall", WallBlock::new, 
        (AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)), true);
    public static final Block MANGROVE_WALL = registerBlock("mangrove_wall", WallBlock::new,
        AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block BAMBOO_WALL = registerBlock("bamboo_wall", WallBlock::new, 
        AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD), true);
    public static final Block CRIMSON_WALL = registerBlock("crimson_wall", WallBlock::new,
        AbstractBlock.Settings.create().mapColor(MapColor.DULL_PINK).strength(2.0f, 3.0f).sounds(BlockSoundGroup.NETHER_WOOD), true);
    public static final Block WARPED_WALL = registerBlock("warped_wall", WallBlock::new,
        AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).strength(2.0f, 3.0f).sounds(BlockSoundGroup.NETHER_WOOD), true);

    


    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean needsItem) {
            RegistryKey<Block> blockKey = keyOfBlock(name);
            Block block = blockFactory.apply(settings.registryKey(blockKey));    
            if (needsItem) {
                RegistryKey<Item> itemKey = keyOfItem(name);

			    BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
			    Registry.register(Registries.ITEM, itemKey, blockItem);
            }

		        return Registry.register(Registries.BLOCK, blockKey, block);
        }
        private static RegistryKey<Block> keyOfBlock(String name) {
		    return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SimpleChanges.MOD_ID, name));
	    }

	    private static RegistryKey<Item> keyOfItem(String name) {
		    return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SimpleChanges.MOD_ID, name));
	    }
    
    public static void registerModBlocks() {
        SimpleChanges.LOGGER.debug("Registering ModBlocks for " + SimpleChanges.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
	        itemGroup.add(ModBlocks.SANDSTONE_BRICK_BLOCK.asItem());
            itemGroup.add(ModBlocks.SANDSTONE_BRICK_SLAB.asItem());
            itemGroup.add(ModBlocks.SANDSTONE_BRICK_STAIRS.asItem());
            itemGroup.add(ModBlocks.SANDSTONE_BRICK_WALL.asItem());

	        itemGroup.add(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem());
            itemGroup.add(ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem());
            itemGroup.add(ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem());
            itemGroup.add(ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem());
            
            itemGroup.add(ModBlocks.OAK_WALL.asItem());
            itemGroup.add(ModBlocks.SPRUCE_WALL.asItem());
            itemGroup.add(ModBlocks.BIRCH_WALL.asItem());
            itemGroup.add(ModBlocks.JUNGLE_WALL.asItem());
            itemGroup.add(ModBlocks.ACACIA_WALL.asItem());
            itemGroup.add(ModBlocks.CHERRY_WALL.asItem());
            itemGroup.add(ModBlocks.PALE_OAK_WALL.asItem());
            itemGroup.add(ModBlocks.DARK_OAK_WALL.asItem());
            itemGroup.add(ModBlocks.MANGROVE_WALL.asItem());
            itemGroup.add(ModBlocks.BAMBOO_WALL.asItem());
            itemGroup.add(ModBlocks.CRIMSON_WALL.asItem());
            itemGroup.add(ModBlocks.WARPED_WALL.asItem());
        });
    }

    private static Block registerStairsBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block block = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SimpleChanges.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SimpleChanges.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SimpleChanges.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SimpleChanges.MOD_ID, name)))));
    }

}


