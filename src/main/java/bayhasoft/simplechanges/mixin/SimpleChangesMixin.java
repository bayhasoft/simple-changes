package bayhasoft.simplechanges.mixin;

import net.minecraft.client.gui.screen.TitleScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import bayhasoft.simplechanges.SimpleChanges;

@Mixin(TitleScreen.class)
public class SimpleChangesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SimpleChanges.LOGGER.debug("");
	}
}
