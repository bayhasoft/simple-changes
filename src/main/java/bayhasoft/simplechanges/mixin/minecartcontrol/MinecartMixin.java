package bayhasoft.simplechanges.mixin.minecartcontrol;

import bayhasoft.simplechanges.block.ModBlocks;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractMinecart.class)
public abstract class MinecartMixin extends VehicleEntity {

    public MinecartMixin(EntityType<?> entityType, Level world) {
        super(entityType, world);
    }
        @ModifyExpressionValue(
            method = "getRedstoneDirection",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"

            )
        )
        private boolean modifyIsPoweredRailCheck(boolean original, @Local(name = "state") BlockState state) {
            return (original || state.is(ModBlocks.COPPER_RAIL));
        }
}
