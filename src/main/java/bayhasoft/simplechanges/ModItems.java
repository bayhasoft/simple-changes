package bayhasoft.simplechanges;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    
   public static final Item pig_skin = registerItem("pig_skin", new Item(new FabricItemSettings()));
   
   private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, new Identifier(SimpleChanges.MOD_ID, name), item);
   }

   public static void addItemsToItemGroup() {
      addToItemGroup(ItemGroups.INGREDIENTS, pig_skin);
   }

   private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
      ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
  }
   
  public static void registerModItems() {
      SimpleChanges.LOGGER.debug("Registering ModItems for" + SimpleChanges.MOD_ID);
      
      addItemsToItemGroup();
  }   
}
  