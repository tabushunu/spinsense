package com.spinsense.trackpadrotate;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class SpinSenseMod implements ClientModInitializer {
    private static final KeyBinding spinKey = KeyBindingHelper.registerKeyBinding(
            new KeyBinding("key.spinsense.spin", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_V, "key.categories.spinsense")
    );

    @Override
    public void onInitializeClient() {
        // No need for any initialization code in this example
    }

    public static KeyBinding getSpinKeyBinding() {
        return spinKey;
    }
}
