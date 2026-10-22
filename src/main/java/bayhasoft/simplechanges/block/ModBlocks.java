package bayhasoft.simplechanges.block;

import java.util.function.Function;

import bayhasoft.simplechanges.SimpleChanges;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PoweredRailBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {
    
    public static final Block SANDSTONE_BRICK_BLOCK = registerBlock("sandstone_brick_block", Block::new,
        BlockBehaviour.Properties.of()
            .mapColor(MapColor.SAND)
            .strength(0.8f)
            .requiresCorrectToolForDrops(),
        true);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab", SlabBlock::new,
        BlockBehaviour.Properties.ofFullCopy(SANDSTONE_BRICK_BLOCK), true);
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall", WallBlock::new,
        BlockBehaviour.Properties.ofFullCopy(SANDSTONE_BRICK_BLOCK), true);
    public static final Block SANDSTONE_BRICK_STAIRS = registerStairsBlock("sandstone_brick_stairs",
        properties -> new StairBlock(ModBlocks.SANDSTONE_BRICK_BLOCK.defaultBlockState(),
            properties.mapColor(MapColor.SAND).strength(0.8f).requiresCorrectToolForDrops() ));

    public static final Block RED_SANDSTONE_BRICK_BLOCK = registerBlock("red_sandstone_brick_block", Block::new,
        BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops(), 
        true);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab", SlabBlock::new,
        BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_BRICK_BLOCK), true);
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall", WallBlock::new, 
        BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_BRICK_BLOCK), true);
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerStairsBlock("red_sandstone_brick_stairs",
        properties -> new StairBlock(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.defaultBlockState(),
            properties.mapColor(MapColor.COLOR_ORANGE).strength(0.8f).requiresCorrectToolForDrops() ));

    public static final Block OAK_WALL = registerBlock("oak_wall", WallBlock::new,
        BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall", WallBlock::new,
        BlockBehaviour.Properties.of().mapColor(MapColor.PODZOL).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block BIRCH_WALL = registerBlock("birch_wall", WallBlock::new, 
        BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall", WallBlock::new, 
        BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block ACACIA_WALL = registerBlock("acacia_wall", WallBlock::new, 
        BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block CHERRY_WALL = registerBlock("cherry_wall", WallBlock::new, 
        BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block PALE_OAK_WALL = registerBlock("pale_oak_wall", WallBlock::new, 
        BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block DARK_OAK_WALL = registerBlock("dark_oak_wall", WallBlock::new,
        BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block MANGROVE_WALL = registerBlock("mangrove_wall", WallBlock::new,
        BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block POPLAR_WALL = registerBlock("poplar_wall", WallBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block BAMBOO_WALL = registerBlock("bamboo_wall", WallBlock::new, 
        BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(2.0f, 3.0f).sound(SoundType.WOOD).ignitedByLava(), true);
    public static final Block CRIMSON_WALL = registerBlock("crimson_wall", WallBlock::new,
        BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(2.0f, 3.0f).sound(SoundType.NETHER_WOOD), true);
    public static final Block WARPED_WALL = registerBlock("warped_wall", WallBlock::new,
        BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).strength(2.0f, 3.0f).sound(SoundType.NETHER_WOOD), true);

    public static final Block COPPER_RAIL = registerBlock("copper_rail" , PoweredRailBlock::new,
        BlockBehaviour.Properties.of().noCollision().strength(0.7F).sound(SoundType.METAL),true);

    


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean needsItem) {
            ResourceKey<Block> blockKey = keyOfBlock(name);
            Block block = blockFactory.apply(settings.setId(blockKey));    
            if (needsItem) {
                ResourceKey<Item> itemKey = keyOfItem(name);

			    BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));
			    Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
            }

		        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        }
        private static ResourceKey<Block> keyOfBlock(String name) {
		    return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name));
	    }

	    private static ResourceKey<Item> keyOfItem(String name) {
		    return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name));
	    }
    
    public static void registerModBlocks() {
        SimpleChanges.LOGGER.debug("Registering ModBlocks for " + SimpleChanges.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
	        itemGroup.accept(ModBlocks.SANDSTONE_BRICK_BLOCK.asItem());
            itemGroup.accept(ModBlocks.SANDSTONE_BRICK_SLAB.asItem());
            itemGroup.accept(ModBlocks.SANDSTONE_BRICK_STAIRS.asItem());
            itemGroup.accept(ModBlocks.SANDSTONE_BRICK_WALL.asItem());

	        itemGroup.accept(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem());
            itemGroup.accept(ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem());
            itemGroup.accept(ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem());
            itemGroup.accept(ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem());
            
            itemGroup.accept(ModBlocks.OAK_WALL.asItem());
            itemGroup.accept(ModBlocks.SPRUCE_WALL.asItem());
            itemGroup.accept(ModBlocks.BIRCH_WALL.asItem());
            itemGroup.accept(ModBlocks.JUNGLE_WALL.asItem());
            itemGroup.accept(ModBlocks.ACACIA_WALL.asItem());
            itemGroup.accept(ModBlocks.CHERRY_WALL.asItem());
            itemGroup.accept(ModBlocks.PALE_OAK_WALL.asItem());
            itemGroup.accept(ModBlocks.DARK_OAK_WALL.asItem());
            itemGroup.accept(ModBlocks.MANGROVE_WALL.asItem());
            itemGroup.accept(ModBlocks.POPLAR_WALL.asItem());
            itemGroup.accept(ModBlocks.BAMBOO_WALL.asItem());
            itemGroup.accept(ModBlocks.CRIMSON_WALL.asItem());
            itemGroup.accept(ModBlocks.WARPED_WALL.asItem());
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.COPPER_RAIL.asItem());
        });
    }

    private static Block registerStairsBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block block = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name))));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SimpleChanges.MOD_ID, name)))));
    }

}


