package bayhasoft.simplechanges.mixin.minecartcontrol;

import bayhasoft.simplechanges.block.ModBlocks;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.block.BlockState;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.DefaultMinecartController;
import net.minecraft.entity.vehicle.MinecartController;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(DefaultMinecartController.class)
public abstract class DefaultMinecartControllerMixin extends MinecartController {

    protected DefaultMinecartControllerMixin(AbstractMinecartEntity minecart) {
        super(minecart);
    }
    @ModifyExpressionValue(
        method = "moveOnRail",
        at = @At(value = "INVOKE",
            target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z")
        )
        private boolean modifyIsPoweredRailCheck(boolean original, @Local(ordinal = 0) BlockState blockState) {
            return (original || blockState.isOf(ModBlocks.COPPER_RAIL));
        }
}
