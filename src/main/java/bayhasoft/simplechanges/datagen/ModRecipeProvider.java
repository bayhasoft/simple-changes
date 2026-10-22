package bayhasoft.simplechanges.datagen;

import bayhasoft.simplechanges.ModItems;
import bayhasoft.simplechanges.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipeContext, BootstrapContext<Advancement> advancementContext) {
        return new RecipeProvider(recipeContext, advancementContext) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_BLOCK.asItem(), 4)
                        .pattern("xx")
                        .pattern("xx")
                        .define('x', Items.CUT_SANDSTONE)
                        .unlockedBy(getHasName(ModBlocks.SANDSTONE_BRICK_BLOCK.asItem()), has(Items.CUT_SANDSTONE))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB.asItem(), 6)
                        .pattern("xxx")
                        .define('x', ModBlocks.SANDSTONE_BRICK_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.SANDSTONE_BRICK_SLAB.asItem()), has(ModBlocks.SANDSTONE_BRICK_BLOCK.asItem()))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL.asItem(), 6)
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', ModBlocks.SANDSTONE_BRICK_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.SANDSTONE_BRICK_WALL.asItem()), has(ModBlocks.SANDSTONE_BRICK_BLOCK.asItem()))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS.asItem(), 4)
                        .pattern("x  ")
                        .pattern("xx ")
                        .pattern("xxx")
                        .define('x', ModBlocks.SANDSTONE_BRICK_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.SANDSTONE_BRICK_STAIRS.asItem()), has(ModBlocks.SANDSTONE_BRICK_BLOCK.asItem()))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem(), 4)
                        .pattern("xx")
                        .pattern("xx")
                        .define('x', Items.CUT_RED_SANDSTONE)
                        .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem()), has(Items.CUT_RED_SANDSTONE))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem(), 6)
                        .pattern("xxx")
                        .define('x', ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem()), has(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem()))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem(), 6)
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem()), has(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem()))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem(), 4)
                        .pattern("x  ")
                        .pattern("xx ")
                        .pattern("xxx")
                        .define('x', ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem())
                        .unlockedBy(getHasName(ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem()), has(ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem()))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.OAK_SLAB)
                        .unlockedBy(getHasName(ModBlocks.OAK_WALL.asItem()), has(Items.OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.SPRUCE_SLAB)
                        .unlockedBy(getHasName(ModBlocks.SPRUCE_WALL.asItem()), has(Items.SPRUCE_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.BIRCH_SLAB)
                        .unlockedBy(getHasName(ModBlocks.BIRCH_WALL.asItem()), has(Items.BIRCH_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.JUNGLE_SLAB)
                        .unlockedBy(getHasName(ModBlocks.JUNGLE_WALL.asItem()), has(Items.JUNGLE_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.ACACIA_SLAB)
                        .unlockedBy(getHasName(ModBlocks.ACACIA_WALL.asItem()), has(Items.ACACIA_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.CHERRY_SLAB)
                        .unlockedBy(getHasName(ModBlocks.CHERRY_WALL.asItem()), has(Items.CHERRY_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_OAK_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.PALE_OAK_SLAB)
                        .unlockedBy(getHasName(ModBlocks.PALE_OAK_WALL.asItem()), has(Items.PALE_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.DARK_OAK_SLAB)
                        .unlockedBy(getHasName(ModBlocks.DARK_OAK_WALL.asItem()), has(Items.DARK_OAK_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.MANGROVE_SLAB)
                        .unlockedBy(getHasName(ModBlocks.MANGROVE_WALL.asItem()), has(Items.MANGROVE_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POPLAR_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.POPLAR_SLAB)
                        .unlockedBy(getHasName(ModBlocks.POPLAR_WALL.asItem()), has(Items.POPLAR_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.BAMBOO_SLAB)
                        .unlockedBy(getHasName(ModBlocks.BAMBOO_WALL.asItem()), has(Items.BAMBOO_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.CRIMSON_SLAB)
                        .unlockedBy(getHasName(ModBlocks.CRIMSON_WALL.asItem()), has(Items.CRIMSON_SLAB))
                        .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_WALL.asItem(), 3)
                        .group("wood_wall")
                        .pattern("   ")
                        .pattern("xxx")
                        .pattern("xxx")
                        .define('x', Items.WARPED_SLAB)
                        .unlockedBy(getHasName(ModBlocks.WARPED_WALL.asItem()), has(Items.WARPED_SLAB))
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.COPPER_RAIL.asItem(), 16)
                        .group("wood_wall")
                        .pattern("C C")
                        .pattern("CSC")
                        .pattern("CRC")
                        .define('C', Items.COPPER_INGOT)
                        .define('S', Items.STICK)
                        .define('R', Items.REDSTONE)
                        .unlockedBy(getHasName(ModBlocks.COPPER_RAIL.asItem()), has(Items.COPPER_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, Items.DYE.green(), 2)
                        .group("green dye")
                        .requires(Items.DYE.yellow())
                        .requires(Items.DYE.blue())
                        .unlockedBy(getHasName(Items.DYE.green()), has(Items.DYE.yellow()))
                        .save(output);

                shapeless(RecipeCategory.MISC, Items.LEATHER)
                        .group("leather")
                        .requires(ModItems.PIG_SKIN, 2)
                        .unlockedBy(getHasName(Items.LEATHER), has(ModItems.PIG_SKIN))
                        .save(output);
                shapeless(RecipeCategory.MISC, Items.LEATHER)
                        .group("leather")
                        .requires(Items.PHANTOM_MEMBRANE)
                        .unlockedBy(getHasName(Items.LEATHER), has(Items.PHANTOM_MEMBRANE))
                        .save(output, "leather_from_phantom_membrane");

                shapeless(RecipeCategory.MISC, Items.QUARTZ, 9)
                        .group("quartz")
                        .requires(Items.QUARTZ_BLOCK)
                        .unlockedBy(getHasName(Items.QUARTZ), has(Items.QUARTZ_BLOCK))
                        .save(output);

                shaped(RecipeCategory.MISC, Items.STICK, 2)
                        .group("sticks")
                        .pattern("x")
                        .pattern("x")
                        .define('x', ItemTags.SAPLINGS)
                        .unlockedBy(getHasName(Items.STICK), has(ItemTags.SAPLINGS))
                        .save(output);


                oreSmelting(
                        List.of(Items.RAW_COPPER_BLOCK),
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        Items.COPPER_BLOCK.weathering().unaffected(),
                        6.3f,
                        1600,
                        "copper_block"
                );
                oreBlasting(
                        List.of(Items.RAW_COPPER_BLOCK),
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        Items.COPPER_BLOCK.weathering().unaffected(),
                        6.3f,
                        1600,
                        "copper_block"
                );
                oreSmelting(
                        List.of(Items.RAW_IRON_BLOCK),
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        Items.IRON_BLOCK,
                        6.3f,
                        1600,
                        "iron_block"
                );
                oreBlasting(
                        List.of(Items.RAW_IRON_BLOCK),
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        Items.IRON_BLOCK,
                        6.3f,
                        1600,
                        "iron_block"
                );
                oreSmelting(
                        List.of(Items.RAW_GOLD_BLOCK),
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        Items.GOLD_BLOCK,
                        9.0f,
                        1600,
                        "gold_block"
                );
                oreBlasting(
                        List.of(Items.RAW_GOLD_BLOCK),
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        Items.GOLD_BLOCK,
                        9.0f,
                        1600,
                        "gold_block"
                );


                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_BLOCK.asItem(), Items.CUT_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_BLOCK.asItem(), Items.SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB.asItem(), ModBlocks.SANDSTONE_BRICK_BLOCK.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB.asItem(), Items.CUT_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB.asItem(), Items.SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS.asItem(), ModBlocks.SANDSTONE_BRICK_BLOCK.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS.asItem(), Items.CUT_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_STAIRS.asItem(), Items.SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL.asItem(), ModBlocks.SANDSTONE_BRICK_BLOCK.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL.asItem(), Items.CUT_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL.asItem(), Items.SANDSTONE);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem(), Items.CUT_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem(), Items.RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem(), ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem(), Items.CUT_RED_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_SLAB.asItem(), Items.RED_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem(), ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem(), Items.CUT_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_STAIRS.asItem(), Items.RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem(), ModBlocks.RED_SANDSTONE_BRICK_BLOCK.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem(), Items.CUT_RED_SANDSTONE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SANDSTONE_BRICK_WALL.asItem(), Items.RED_SANDSTONE);

            }
        };
    }
}
