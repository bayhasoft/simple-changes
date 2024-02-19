package net.simplechanges.Recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public interface ModRecipeType<T extends Recipe<?>> {
    public static final RecipeType<SawMillRecipe> WOODMILLING = RecipeType.register("wood_milling");

    public static <T extends Recipe<?>> RecipeType<T> register(final String id) {
        return Registry.register(Registries.RECIPE_TYPE, new Identifier(id), new RecipeType<T>(){

            public String toString() {
                return id;
            }
        });
    }
}

