package me.sassan.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import net.minecraft.client.Minecraft;

public class UsernameDisplay extends SingleTextHud {
    public UsernameDisplay() {
        super("Username", true);
    }

    @Override
    public String getText(boolean e) {
        return String.valueOf(Minecraft.getMinecraft().thePlayer.getName());
    }
}
