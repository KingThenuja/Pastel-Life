package net.thenu.pl.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;

import static net.thenu.utils.Registering.registerBlock;

public class PLblock { public static void register(IEventBus eventBus) {}


    public static final DeferredBlock<Block>
    WHITE_PASTEL_BLOCK = registerBlock(
    "white_pastel_block",
    () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


}
