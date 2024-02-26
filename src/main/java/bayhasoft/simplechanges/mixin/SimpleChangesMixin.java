package bayhasoft.simplechanges.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import bayhasoft.simplechanges.SimpleChanges;
import net.minecraft.client.gui.screen.TitleScreen;

@Mixin(TitleScreen.class)
public class SimpleChangesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SimpleChanges.LOGGER.debug("");
	}
}
