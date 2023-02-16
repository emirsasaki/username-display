package me.sassan;

import me.sassan.config.OurConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = UserNameDisplay.ID, version = UserNameDisplay.VERSION)
public class UserNameDisplay {
    public static final String ID = "username-display";
    public static final String VERSION = "1.0";
    public static OurConfig config;
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        config = new OurConfig();
    }
}
