package bayhasoft.simplechanges.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.MinecartItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(MinecartItem.class)
public abstract class MinecartStackMixin {

    @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true)
    private static Item.Properties modifyStackSize(Item.Properties settings) {
        return settings.stacksTo(16);
    }
}