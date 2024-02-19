package net.simplechanges.Screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.simplechanges.SimpleChanges;

public class ModScreenHandlers {
    public static ScreenHandlerType<SawmillScreenHandler> SAWMILL_SCREEN_HANDLER =
            new ExtendedScreenHandlerType<>(SawmillScreenHandler::new);

    public static void registerAllScreenHandlers() {
        Registry.register(Registries.SCREEN_HANDLER, new Identifier(SimpleChanges.MOD_ID, "sawmill"),
                SAWMILL_SCREEN_HANDLER);
    }
}
