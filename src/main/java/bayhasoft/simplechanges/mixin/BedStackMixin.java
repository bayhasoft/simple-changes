package bayhasoft.simplechanges.mixin;

import net.minecraft.item.BedItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BedItem.class)
public abstract class BedStackMixin {

    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static Item.Settings modifyStackSize(Item.Settings settings) {
        return settings.maxCount(16);
    }
}