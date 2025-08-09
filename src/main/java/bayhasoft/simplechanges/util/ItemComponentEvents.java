package bayhasoft.simplechanges.util;

import bayhasoft.simplechanges.SimpleChanges;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.DamageResistantComponent;
import net.minecraft.item.Items;

public class ItemComponentEvents {
    public static void ModifyItemComponents() {
        SimpleChanges.LOGGER.info(SimpleChanges.MOD_ID + "modifying item components");

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.ENDER_PEARL, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.ARMOR_STAND, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.SNOWBALL, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MILK_BUCKET, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.HONEY_BOTTLE, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        // DefaultItemComponentEvents.MODIFY.register(context -> {
        //     context.modify(Items.ENCHANTED_BOOK, 
        //     builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        // });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.SADDLE, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.TOTEM_OF_UNDYING, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

// House Armor Items
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LEATHER_HORSE_ARMOR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.IRON_HORSE_ARMOR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.GOLDEN_HORSE_ARMOR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.DIAMOND_HORSE_ARMOR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

// Harness Items
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.WHITE_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.ORANGE_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MAGENTA_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LIGHT_BLUE_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.YELLOW_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LIME_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.PINK_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.GRAY_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LIGHT_GRAY_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.CYAN_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.PURPLE_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BLUE_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BROWN_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.GREEN_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.RED_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BLACK_HARNESS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 16));
        });

// Shulker Box Items
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.WHITE_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.ORANGE_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MAGENTA_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LIGHT_BLUE_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.YELLOW_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LIME_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.PINK_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.GRAY_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.LIGHT_GRAY_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.CYAN_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.PURPLE_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BLUE_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BROWN_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.GREEN_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.RED_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BLACK_SHULKER_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

// Music Disc Items
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_11, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_13, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_5, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_BLOCKS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_CAT, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_CHIRP, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_CREATOR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_CREATOR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_CREATOR_MUSIC_BOX, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_FAR, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

        // DefaultItemComponentEvents.MODIFY.register(context -> {
        //     context.modify(Items.MUSIC_DISC_LAVA_CHICKEN, 
        //     builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        // });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_MALL, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_MELLOHI, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_OTHERSIDE, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_PIGSTEP, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_PRECIPICE, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_RELIC, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_STAL, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_STRAD, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_TEARS, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_WAIT, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.MUSIC_DISC_WARD, 
            builder -> builder.add(DataComponentTypes.MAX_STACK_SIZE, 64));
        });

// Obsidian Items
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.OBSIDIAN, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.CRYING_OBSIDIAN, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.RESPAWN_ANCHOR, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.ENCHANTING_TABLE, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.DRAGON_EGG, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.ENDER_CHEST, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });
        
        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.BEACON, 
            builder -> builder.add(DataComponentTypes.DAMAGE_RESISTANT, new DamageResistantComponent(ModTags.DamageTypes.IS_FIRE_OR_EXPLOSION)));
        });
    }
}
