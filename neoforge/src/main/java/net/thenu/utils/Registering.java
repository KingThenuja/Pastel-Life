package net.thenu.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.thenu.pl.Constants;

import java.util.function.Supplier;

public class Registering {
    public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
    CREATIVE_MODE_TAB.register(eventBus);
    ITEMS.register(eventBus);
}


    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {DeferredBlock<T> toReturn = BLOCKS.register(name, block);registerBlockItem(name, toReturn);return toReturn;}

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));}

}
