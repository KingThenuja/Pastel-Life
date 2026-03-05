package net.thenu.pl.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.thenu.utils.BlockFamily.BlockFamily;

import java.util.List;

public class PLBlock {

    public static final BlockFamily WHITE_PASTEL = BlockFamily.create(
            "white_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily ROSE_PASTEL = BlockFamily.create(
            "rose_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily ORANGE_PASTEL = BlockFamily.create(
            "orange_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily YELLOW_PASTEL = BlockFamily.create(
            "yellow_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily LIME_PASTEL = BlockFamily.create(
            "lime_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily GREEN_PASTEL = BlockFamily.create(
            "green_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily CYAN_PASTEL = BlockFamily.create(
            "cyan_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily SKY_BLUE_PASTEL = BlockFamily.create(
            "sky_blue_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily LIGHT_BLUE_PASTEL = BlockFamily.create(
            "light_blue_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily BLUE_PASTEL = BlockFamily.create(
            "blue_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily MAGENTA_PASTEL = BlockFamily.create(
            "magenta_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily PURPLE_PASTEL = BlockFamily.create(
            "purple_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily PINK_PASTEL = BlockFamily.create(
            "pink_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily BROWN_PASTEL = BlockFamily.create(
            "brown_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily RED_PASTEL = BlockFamily.create(
            "red_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());
    public static final BlockFamily BLACK_PASTEL = BlockFamily.create(
            "black_pastel", AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f).requiresTool());



    public static List<BlockFamily> getAllPastelBlocks() {
        return List.of(
                WHITE_PASTEL, ROSE_PASTEL, ORANGE_PASTEL,
                YELLOW_PASTEL, GREEN_PASTEL, LIME_PASTEL,
                CYAN_PASTEL, SKY_BLUE_PASTEL, LIGHT_BLUE_PASTEL,
                BLUE_PASTEL, MAGENTA_PASTEL, PURPLE_PASTEL,
                PINK_PASTEL, BROWN_PASTEL, RED_PASTEL,
                BLACK_PASTEL
        );
    }

    public static void registerPastelBlocks() {

    }
}
