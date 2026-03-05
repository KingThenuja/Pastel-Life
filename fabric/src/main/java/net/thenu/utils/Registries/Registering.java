package net.thenu.utils.Registries;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.thenu.pl.Constants.MOD_ID;

public class Registering {


    public static Block registerBlock(String name, Block block) {

        Identifier id = Identifier.of(MOD_ID, name);

        Registry.register(Registries.BLOCK, id, block);

        BlockItem item = Registry.register(
                Registries.ITEM,
                id,
                new BlockItem(block, new Item.Settings())
        );

        // 🔥 Auto add to creative registry
        ItemGroupRegistry.add(item);

        return block;
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

}
