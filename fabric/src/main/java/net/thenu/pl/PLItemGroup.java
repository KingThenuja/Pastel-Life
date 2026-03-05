package net.thenu.pl;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thenu.pl.block.PLBlock;
import net.thenu.utils.Registries.ItemGroupRegistry;

public class PLItemGroup {
    public static void register(){}

    public static final ItemGroup MAIN_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Constants.MOD_ID, "itemgroup.ge.pastel_blocks"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Pastel Blocks"))
                    .icon(() -> new ItemStack(PLBlock.PINK_PASTEL.stairs))
                    .entries((context, entries) -> {
                        ItemGroupRegistry.getItems().forEach(entries::add);
                    })
                    .build()
    );
}
