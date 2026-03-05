package net.thenu.pl;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.thenu.pl.block.PLblock;

import java.util.function.Supplier;

import static net.thenu.utils.Registering.CREATIVE_MODE_TAB;

public class ItemGroup {public static void register(IEventBus eventBus) {}


    public static final Supplier<CreativeModeTab> PASTEL_BLOCKS_TAB = CREATIVE_MODE_TAB.register("pastel_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(PLblock.WHITE_PASTEL_BLOCK))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "pastel_items_tab"))
            .title(Component.translatable("creativetab.pl.pastel_blocks"))
            .displayItems((itemDisplayParameters, output) -> {


            output.accept(PLblock.WHITE_PASTEL_BLOCK);


            }).build());
}
