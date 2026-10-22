package bayhasoft.simplechanges.mixin;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BucketItem.class)
public abstract class BucketStackMixin {

    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static Item.Properties modifyStackSize(Item.Properties settings) {
        return settings.stacksTo(64);
    }
}