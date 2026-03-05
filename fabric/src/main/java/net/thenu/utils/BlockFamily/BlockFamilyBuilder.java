package net.thenu.utils.BlockFamily;

import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockFamilyBuilder {

    private final String modId;
    private final BlockFamilyDefinition definition;

    public BlockFamilyBuilder(String modId, BlockFamilyDefinition definition) {
        this.modId = modId;
        this.definition = definition;
    }

    public BlockFamily build() {



        String name = definition.name();
        AbstractBlock.Settings baseSettings = definition.settings();

        // Base block
        Block base = Registry.register(
                Registries.BLOCK,
                Identifier.of(modId, name),
                new Block(baseSettings)
        );

        // Stair
        Block stairs = Registry.register(
                Registries.BLOCK,
                Identifier.of(modId, name + "_stairs"),
                new StairsBlock(
                        base.getDefaultState(),
                        AbstractBlock.Settings.copy(base)
                )
        );

        // Slab
        Block slab = Registry.register(
                Registries.BLOCK,
                Identifier.of(modId, name + "_slab"),
                new SlabBlock(AbstractBlock.Settings.copy(base))
        );

        // Fence
        Block fence = Registry.register(
                Registries.BLOCK,
                Identifier.of(modId, name + "_fence"),
                new FenceBlock(AbstractBlock.Settings.copy(base))
        );

        // Fence Gate
        Block fenceGate = Registry.register(
                Registries.BLOCK,
                Identifier.of(modId, name + "_fence_gate"),
                new FenceGateBlock(
                        WoodType.OAK,
                        AbstractBlock.Settings.copy(base)
                )
        );

        // Wall
        Block wall = Registry.register(
                Registries.BLOCK,
                Identifier.of(modId, name + "_wall"),
                new WallBlock(AbstractBlock.Settings.copy(base))
        );

        return new BlockFamily(
                base,
                slab,
                stairs,
                wall,
                fence,
                fenceGate
        );
    }
}
