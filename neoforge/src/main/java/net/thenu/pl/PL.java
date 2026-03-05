package net.thenu.pl;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.thenu.pl.block.PLblock;
import net.thenu.utils.Registering;

import static net.thenu.pl.Constants.MOD_ID;

@Mod(MOD_ID)
public class PL {

    public PL(IEventBus eventBus, ModContainer modContainer) {

        Registering.register(eventBus);
        ItemGroup.register(eventBus);
        PLblock.register(eventBus);

        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();

        // You can use SubscribeEvent and let the Event Bus discover methods to call


    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}