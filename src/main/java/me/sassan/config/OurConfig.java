package me.sassan.config;

import cc.polyfrost.oneconfig.config.annotations.HUD;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.Config;
import me.sassan.hud.UsernameDisplay;

public class OurConfig extends Config {
    @HUD(
            name = "Username Display",
            category = "HUD"
    )
    public UsernameDisplay hud = new UsernameDisplay();
    public OurConfig() {
        super(new Mod("Username Display", ModType.UTIL_QOL), "usrname_display.json");
        initialize();
    }
}
