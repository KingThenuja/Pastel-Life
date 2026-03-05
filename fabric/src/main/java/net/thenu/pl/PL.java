package net.thenu.pl;

import net.fabricmc.api.ModInitializer;
import net.thenu.pl.block.PLBlock;

public class PL implements ModInitializer {

    @Override
    public void onInitialize() {

        PLItemGroup.register();
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.
        PLBlock.registerPastelBlocks();
        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();


    }
}
