package bayhasoft.simplechanges.mixin.minecartcontrol;

import bayhasoft.simplechanges.block.ModBlocks;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.block.BlockState;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.ExperimentalMinecartController;
import net.minecraft.entity.vehicle.MinecartController;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ExperimentalMinecartController.class)
public abstract class ExperimentalMinecartControllerMixin extends MinecartController {

    protected ExperimentalMinecartControllerMixin(AbstractMinecartEntity minecart) {
        super(minecart);
    }
    @ModifyExpressionValue(
        method = "decelerateFromPoweredRail",
        at = @At(value = "INVOKE",
            target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z")
        )
        private boolean modifyIsPoweredRailCheck1(boolean original, @Local(ordinal = 0) BlockState railState) {
            return (original || railState.isOf(ModBlocks.COPPER_RAIL));
        }

    @ModifyExpressionValue(
        method = "accelerateFromPoweredRail",
        at = @At(value = "INVOKE",
            target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z")
    )
    private boolean modifyIsPoweredRailCheck2(boolean original, @Local(ordinal = 0) BlockState railState) {
        return (original || railState.isOf(ModBlocks.COPPER_RAIL));
    }
}
