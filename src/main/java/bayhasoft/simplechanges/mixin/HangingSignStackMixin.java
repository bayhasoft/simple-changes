package bayhasoft.simplechanges.mixin;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(HangingSignItem.class)
public abstract class HangingSignStackMixin {

    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static Item.Properties modifyStackSize(Item.Properties settings) {
        return settings.stacksTo(64);
    }
}