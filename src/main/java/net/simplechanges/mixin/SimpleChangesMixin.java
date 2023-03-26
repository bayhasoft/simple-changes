package net.simplechanges.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.simplechanges.SimpleChanges;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SimpleChangesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SimpleChanges.LOGGER.debug("");
	}
}
