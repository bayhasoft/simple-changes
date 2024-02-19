package net.simplechanges.Recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class SawMillRecipe implements Recipe<SimpleInventory> {
    private final Identifier id;
    final ItemStack output;
    private final DefaultedList<Ingredient> recipeItems;

    public SawMillRecipe(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }

    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient()) {
            return false;
        }

        return recipeItems.get(0).test(inventory.getStack(1));
    }

    // TODO: below method is difrent may break.  
    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager dynamicRegistryManager) {
        return this.output;
    }

    @Override
    public boolean fits(int var1, int var2) {
        return true;
    }

    // TODO: below method is difrent may break. 
    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return this.output.copy();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<SawMillRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "woodmilling";
    }

    public static class Serializer implements RecipeSerializer<SawMillRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "wood_milling";     /*  ID is the name given in the json file */
        private RecipeFactory<net.simplechanges.Recipe.T> recipeFactory;

        protected Serializer(RecipeFactory<T> recipeFactory) {
            this.recipeFactory = recipeFactory;
        }

        @Override
        public SawMillRecipe read(Identifier identifier, JsonObject jsonObject) {
            String string = JsonHelper.getString(jsonObject, "group", "");
            Ingredient ingredient = JsonHelper.hasArray(jsonObject, "ingredient") ? Ingredient.fromJson(JsonHelper.getArray(jsonObject, "ingredient")) : Ingredient.fromJson(JsonHelper.getObject(jsonObject, "ingredient"));
            String string2 = JsonHelper.getString(jsonObject, "result");
            int i = JsonHelper.getInt(jsonObject, "count");
            ItemStack itemStack = new ItemStack(Registries.ITEM.get(new Identifier(string2)), i);
            return this.recipeFactory.create(identifier, string, ingredient, itemStack);
        }

        @Override
        public SawMillRecipe read(Identifier identifier, PacketByteBuf packetByteBuf) {
            String string = packetByteBuf.readString();
            Ingredient ingredient = Ingredient.fromPacket(packetByteBuf);
            ItemStack itemStack = packetByteBuf.readItemStack();
            return this.recipeFactory.create(identifier, string, ingredient, itemStack);
        }

        @Override
        public SawMillRecipe write(PacketByteBuf packetByteBuf, T cuttingRecipe) {
            packetByteBuf.writeString(((CuttingRecipe)cuttingRecipe).group);
            ((CuttingRecipe)cuttingRecipe).input.write(packetByteBuf);
            packetByteBuf.writeItemStack(((CuttingRecipe)cuttingRecipe).output);
        }

        public static interface RecipeFactory<T extends CuttingRecipe> {
            public T create(Identifier var1, String var2, Ingredient var3, ItemStack var4);
        }
    }
}