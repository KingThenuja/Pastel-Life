package net.thenu.pl.mixin;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.thenu.pl.Constants;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {

        Constants.LOG.info("This line is printed by an example mod mixin from Forge!");
        Constants.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}