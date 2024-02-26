package bayhasoft.simplechanges.util;

import bayhasoft.simplechanges.SimpleChanges;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class CustomTrades {
    public static void registerCustomTrades() {
                SimpleChanges.LOGGER.info("Registering Villager Trades From " + SimpleChanges.MOD_ID);

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 3,
            factories -> {
                factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.TUFF, 4),
                        16, 10, 0.05f));
            });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.HONEYCOMB, 5),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.05f));
                });

                TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 4,
                        factories -> {
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.EMERALD, 5),
                                    new ItemStack(Items.BEEHIVE, 1),
                                    5, 15, 0.05f));
                        });
        }
}
