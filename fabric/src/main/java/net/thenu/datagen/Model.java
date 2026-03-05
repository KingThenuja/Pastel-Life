package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.thenu.pl.block.PLBlock;
import net.thenu.utils.BlockFamily.BlockFamily;

public class Model extends FabricModelProvider {
    public Model(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator builder) {
        for (BlockFamily family : PLBlock.getAllPastelBlocks()) {
            builder.registerCubeAllModelTexturePool(family.base())
                    .stairs(family.stairs())
                    .slab(family.slab())
                    .wall(family.wall())
                    .fence(family.fence())
                    .fenceGate(family.fenceGate());
        }
    }
}