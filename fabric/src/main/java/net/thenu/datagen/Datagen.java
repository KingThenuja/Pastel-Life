package net.thenu.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Datagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(Advancement::new);
        pack.addProvider(Language::new);
        pack.addProvider(Model::new);
        pack.addProvider(LootTable::new);
        pack.addProvider(Recipe::new);
        pack.addProvider(Tag::new);

    }
}
