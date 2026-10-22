package bayhasoft.simplechanges.mixin.minecartcontrol;

import bayhasoft.simplechanges.block.ModBlocks;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.entity.vehicle.minecart.MinecartBehavior;
import net.minecraft.world.entity.vehicle.minecart.NewMinecartBehavior;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(NewMinecartBehavior.class)
public abstract class ExperimentalMinecartControllerMixin extends MinecartBehavior {

    protected ExperimentalMinecartControllerMixin(AbstractMinecart minecart) {
        super(minecart);
    }
    @ModifyExpressionValue(
        method = "calculateHaltTrackSpeed",
        at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z")
        )
        private boolean modifyIsPoweredRailCheck1(boolean original, @Local(ordinal = 0) BlockState state) {
            return (original || state.is(ModBlocks.COPPER_RAIL));
        }

    @ModifyExpressionValue(
        method = "calculateBoostTrackSpeed",
        at = @At(value = "INVOKE",
            target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z")
    )
    private boolean modifyIsPoweredRailCheck2(boolean original, @Local(ordinal = 0) BlockState state) {
        return (original || state.is(ModBlocks.COPPER_RAIL));
    }
}
