package net.thenu.utils.BlockFamily;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenu.pl.Constants;
import net.thenu.utils.Registries.ItemGroupRegistry;

import java.util.List;

public class BlockFamily {

    public final Block base;
    public final Block slab;
    public final Block stairs;
    public final Block wall;
    public final Block fence;
    public final Block fenceGate;

    public BlockFamily(Block base,
                        Block slab,
                        Block stairs,
                        Block wall,
                        Block fence, Block fenceGate) {
        this.base = base;
        this.slab = slab;
        this.stairs = stairs;
        this.wall = wall;
        this.fence = fence;
        this.fenceGate = fenceGate;
    }
    public List<Block> all() {
        return List.of(base, stairs, slab, wall, fence, fenceGate);
    }
    public static BlockFamily create(String name, AbstractBlock.Settings settings) {

        Block base = register(name, new Block(settings));

        Block slab = register(name + "_slab", new SlabBlock(settings));
        Block stairs = register(name + "_stairs",
                new StairsBlock(base.getDefaultState(), settings));
        Block wall = register(name + "_wall", new WallBlock(settings));
        Block fence = register(name + "_fence", new FenceBlock(settings));
        Block fenceGate = register(name + "_fence_gate", new FenceGateBlock(WoodType.ACACIA, settings));
        return new BlockFamily(base, slab, stairs, wall, fence, fenceGate);
    }
    public Block base() { return base; }
    public Block slab() { return slab; }
    public Block stairs() { return stairs; }
    public Block wall() { return wall; }
    public Block fence() { return fence; }
    public Block fenceGate() { return fenceGate; }
    private static Block register(String name, Block block) {
        Identifier id = Identifier.of(Constants.MOD_ID, name);

        Registry.register(Registries.BLOCK, id, block);

        BlockItem item = Registry.register(
                Registries.ITEM,
                id,
                new BlockItem(block, new Item.Settings())
        );
        ItemGroupRegistry.add(item);

        return block;
    }
}