package net.simplechanges.Recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.simplechanges.SimpleChanges;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(SimpleChanges.MOD_ID, SawMillRecipe.Serializer.ID),
                SawMillRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(SimpleChanges.MOD_ID, SawMillRecipe.Type.ID),
                SawMillRecipe.Type.INSTANCE);
    }
}