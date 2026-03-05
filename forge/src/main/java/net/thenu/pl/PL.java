package net.thenu.pl;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class PL {

    public PL() {

        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();

    }
}