package bayhasoft.simplechanges.util;

import bayhasoft.simplechanges.SimpleChanges;
import bayhasoft.simplechanges.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;


public class ItemComponentEvents {

    public static void ModifyItemComponents() {
        ChangeMaxStack(Items.ENDER_PEARL, 64);
        ChangeMaxStack(Items.ARMOR_STAND, 64);
        ChangeMaxStack(Items.SNOWBALL, 64);
        ChangeMaxStack(Items.MILK_BUCKET, 64);
        ChangeMaxStack(Items.HONEY_BOTTLE, 64);
        ChangeMaxStack(Items.SADDLE, 16);
        ChangeMaxStack(Items.TOTEM_OF_UNDYING, 16);
        ChangeMaxStack(Items.COPPER_HORSE_ARMOR, 16);
        ChangeMaxStack(Items.LEATHER_HORSE_ARMOR, 16);
        ChangeMaxStack(Items.IRON_HORSE_ARMOR, 16);
        ChangeMaxStack(Items.GOLDEN_HORSE_ARMOR, 16);
        ChangeMaxStack(Items.DIAMOND_HORSE_ARMOR, 16);
        ChangeMaxStack(Items.NETHERITE_HORSE_ARMOR, 16);
        ChangeMaxStack(Items.COPPER_NAUTILUS_ARMOR, 16);
        ChangeMaxStack(Items.IRON_NAUTILUS_ARMOR, 16);
        ChangeMaxStack(Items.GOLDEN_NAUTILUS_ARMOR, 16);
        ChangeMaxStack(Items.DIAMOND_NAUTILUS_ARMOR, 16);
        ChangeMaxStack(Items.NETHERITE_NAUTILUS_ARMOR, 16);
        ChangeMaxStack(Items.WOLF_ARMOR, 16);
        ChangeMaxStack(Items.HARNESS.white(), 16);
        ChangeMaxStack(Items.HARNESS.orange(), 16);
        ChangeMaxStack(Items.HARNESS.magenta(), 16);
        ChangeMaxStack(Items.HARNESS.lightBlue(), 16);
        ChangeMaxStack(Items.HARNESS.yellow(), 16);
        ChangeMaxStack(Items.HARNESS.lime(), 16);
        ChangeMaxStack(Items.HARNESS.pink(), 16);
        ChangeMaxStack(Items.HARNESS.gray(), 16);
        ChangeMaxStack(Items.HARNESS.lightGray(), 16);
        ChangeMaxStack(Items.HARNESS.cyan(), 16);
        ChangeMaxStack(Items.HARNESS.purple(), 16);
        ChangeMaxStack(Items.HARNESS.blue(), 16);
        ChangeMaxStack(Items.HARNESS.brown(), 16);
        ChangeMaxStack(Items.HARNESS.green(), 16);
        ChangeMaxStack(Items.HARNESS.red(), 16);
        ChangeMaxStack(Items.HARNESS.black(), 16);
        ChangeMaxStack(Items.SHULKER_BOX, 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.white(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.orange(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.magenta(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.lightBlue(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.yellow(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.lime(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.pink(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.gray(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.lightGray(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.cyan(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.purple(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.blue(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.brown(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.green(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.red(), 64);
        ChangeMaxStack(Items.DYED_SHULKER_BOX.black(), 64);
        ChangeMaxStack(Items.BED.white(), 16);
        ChangeMaxStack(Items.BED.orange(), 16);
        ChangeMaxStack(Items.BED.magenta(), 16);
        ChangeMaxStack(Items.BED.lightBlue(), 16);
        ChangeMaxStack(Items.BED.yellow(), 16);
        ChangeMaxStack(Items.BED.lime(), 16);
        ChangeMaxStack(Items.BED.pink(), 16);
        ChangeMaxStack(Items.BED.gray(), 16);
        ChangeMaxStack(Items.BED.lightGray(), 16);
        ChangeMaxStack(Items.BED.cyan(), 16);
        ChangeMaxStack(Items.BED.purple(), 16);
        ChangeMaxStack(Items.BED.blue(), 16);
        ChangeMaxStack(Items.BED.brown(), 16);
        ChangeMaxStack(Items.BED.green(), 16);
        ChangeMaxStack(Items.BED.red(), 16);
        ChangeMaxStack(Items.BED.black(), 16);
        ChangeMaxStack(Items.MUSIC_DISC_11, 64);
        ChangeMaxStack(Items.MUSIC_DISC_13, 64);
        ChangeMaxStack(Items.MUSIC_DISC_5, 64);
        ChangeMaxStack(Items.MUSIC_DISC_BLOCKS, 64);
        ChangeMaxStack(Items.MUSIC_DISC_CAT, 64);
        ChangeMaxStack(Items.MUSIC_DISC_CHIRP, 64);
        ChangeMaxStack(Items.MUSIC_DISC_CREATOR, 64);
        ChangeMaxStack(Items.MUSIC_DISC_CREATOR_MUSIC_BOX, 64);
        ChangeMaxStack(Items.MUSIC_DISC_FAR, 64);
        ChangeMaxStack(Items.MUSIC_DISC_LAVA_CHICKEN, 64);
        ChangeMaxStack(Items.MUSIC_DISC_MALL, 64);
        ChangeMaxStack(Items.MUSIC_DISC_MELLOHI, 64);
        ChangeMaxStack(Items.MUSIC_DISC_OTHERSIDE, 64);
        ChangeMaxStack(Items.MUSIC_DISC_PIGSTEP, 64);
        ChangeMaxStack(Items.MUSIC_DISC_PRECIPICE, 64);
        ChangeMaxStack(Items.MUSIC_DISC_RELIC, 64);
        ChangeMaxStack(Items.MUSIC_DISC_STAL, 64);
        ChangeMaxStack(Items.MUSIC_DISC_STRAD, 64);
        ChangeMaxStack(Items.MUSIC_DISC_TEARS, 64);
        ChangeMaxStack(Items.MUSIC_DISC_WAIT, 64);
        ChangeMaxStack(Items.MUSIC_DISC_WARD, 64);
        ChangeMaxStack(Items.MUSIC_DISC_BOUNCE, 64);
        ChangeMaxStack(Items.OAK_SIGN, 64);
        ChangeMaxStack(Items.SPRUCE_SIGN, 64);
        ChangeMaxStack(Items.BIRCH_SIGN, 64);
        ChangeMaxStack(Items.JUNGLE_SIGN, 64);
        ChangeMaxStack(Items.ACACIA_SIGN, 64);
        ChangeMaxStack(Items.CHERRY_SIGN, 64);
        ChangeMaxStack(Items.PALE_OAK_SIGN, 64);
        ChangeMaxStack(Items.DARK_OAK_SIGN, 64);
        ChangeMaxStack(Items.MANGROVE_SIGN, 64);
        ChangeMaxStack(Items.POPLAR_SIGN, 64);
        ChangeMaxStack(Items.BAMBOO_SIGN, 64);
        ChangeMaxStack(Items.CRIMSON_SIGN, 64);
        ChangeMaxStack(Items.WARPED_SIGN, 64);
//        ChangeMaxStack(Items.ENCHANTED_BOOK, 64);

        AddFuelTime(ModBlocks.OAK_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.SPRUCE_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.BIRCH_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.JUNGLE_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.ACACIA_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.CHERRY_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.PALE_OAK_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.DARK_OAK_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.MANGROVE_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.POPLAR_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);
        AddFuelTime(ModBlocks.BAMBOO_WALL.asItem(), ContextIntProviders.COOKING_TIME_WOOD_BLOCKS);


        AddDamageResist(Items.OBSIDIAN, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);
        AddDamageResist(Items.CRYING_OBSIDIAN, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);
        AddDamageResist(Items.RESPAWN_ANCHOR, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);
        AddDamageResist(Items.ENCHANTING_TABLE, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);
        AddDamageResist(Items.DRAGON_EGG, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);
        AddDamageResist(Items.ENDER_CHEST, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);
        AddDamageResist(Items.BEACON, ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION);

        SimpleChanges.LOGGER.info(SimpleChanges.MOD_ID + "modifying item components");
    }

    protected static void ChangeMaxStack(Item item, int stackSize){
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(item, builder ->
                    builder.set(DataComponents.MAX_STACK_SIZE, stackSize));
        });
    }

    protected static void AddFuelTime(Item item, ResourceKey fuelTime){
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(item, builder ->
                    builder.set(DataComponents.COOKING_FUEL, new CookingFuel(fuelTime, ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)));
        });
    }

    protected static void AddDamageResist(Item item, TagKey<DamageType> type) {
        DefaultItemComponentEvents.MODIFY.register(modifyContext -> {
            modifyContext.modify(item, (builder, lookupProvider, item2) ->
                    builder.set(DataComponents.DAMAGE_RESISTANT, new DamageResistant(lookupProvider.getOrThrow(type))));
        });
    }


}
