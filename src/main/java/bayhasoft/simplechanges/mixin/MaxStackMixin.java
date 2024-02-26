package bayhasoft.simplechanges.mixin;

import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Items.class)
public class MaxStackMixin {

//Potion Items
	@ModifyArg(method = "<clinit>",
			at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
			slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/PotionItem;")))
	private static int StackPotion(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SplashPotionItem;")))
	private static int StackSplashPotion(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/LingeringPotionItem;")))
	private static int StackLingeringPotion(int old) {return 16;}

//Misc Items
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/ShieldItem;")))
	private static int StackTotemOfUundying(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/EggItem;")))
	private static int StackEgg(int old) {return 64;}	

	@ModifyArg(method = "<clinit>",
	at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
	slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SnowballItem;")))
	private static int StackSnowball(int old) {return 64;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/EnderPearlItem;")))
	private static int StackEnderPearl(int old) {return 64;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/HoneyBottleItem;")))
	private static int StackHoneyBottle(int old) {return 64;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BucketItem;")))
	private static int StackBucket(int old) {return 64;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/ArmorStandItem;")))
	private static int StackArmorStand(int old) {return 64;}

//Minecart Items	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/MinecartItem;")))
	private static int StackMinecart(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 1),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/MinecartItem;")))
	private static int StackChestMinecart(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 2),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/MinecartItem;")))
	private static int StackFurnaceMinecart(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 3),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/MinecartItem;")))
	private static int StackTntMinecart(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 4),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/MinecartItem;")))
	private static int StackHopperMinecart(int old) {return 16;}

//BoatItems
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackOakBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 1),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestOakBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 2),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackSpruceBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 3),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestSpruceBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 4),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackBirchBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 5),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestBirchBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 6),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackJungleBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 7),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestJungleBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 8),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackAcaciaBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 9),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestAcaciaBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 12),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackDarkOakBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 13),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestDarkOakBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 14),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackMangroveBoat(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 15),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BoatItem;")))
	private static int StackChestMangroveBoat(int old) {return 16;}

//Sign Items
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackOakSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 1),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackSpruceSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 2),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackBirchSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 3),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackJungleSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 4),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackAcaciaSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 6),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackDarkOakSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 7),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackMangroveSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 9),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackCrimsonSign(int old) {return 64;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 10),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SignItem;")))
	private static int StackWarpedSign(int old) {return 64;}
	
//Horse Items 
//	TODO:fix sadles equip bug for horses (look at lama and carpet maybe)
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/SaddleItem;")))
	private static int StackSaddle(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/HorseArmorItem;")))
	private static int StackItronHorseArmor(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 1),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/HorseArmorItem;")))
	private static int StackGoldHorseArmor(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 2),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/HorseArmorItem;")))
	private static int StackDiamondHorseArmor(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 3),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/HorseArmorItem;")))
	private static int StackLeatherHorseArmor(int old) {return 16;}

//Bed Items
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 0),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackWhiteBed(int old) {return 16;}

	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 1),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackOrangeBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 2),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackMagentaBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 3),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackLightBlueBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 4),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackYellowBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 5),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackLimeBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 6),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackPinkBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 7),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackGrayBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 8),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackLightGrayBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 9),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackCyanBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 10),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackPurpleBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 11),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackBlueBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 12),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackBrownBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 13),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackGreenBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 14),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackRedBed(int old) {return 16;}
	
	@ModifyArg(method = "<clinit>",
		at = @At(value = "INVOKE", target = "Lnet/minecraft/item/Item$Settings;maxCount(I)Lnet/minecraft/item/Item$Settings;", ordinal = 15),
		slice = @Slice( from = @At(value = "NEW", target = "Lnet/minecraft/item/BedItem;")))
	private static int StackBlackBed(int old) {return 16;}
}
