package bayhasoft.simplechanges.mixin;

import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(EnderPearlItem.class)
public abstract class EnderPearlStackMixin {

    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static Item.Settings modifyStackSize(Item.Settings settings) {
        return settings.maxCount(64);
    }
}