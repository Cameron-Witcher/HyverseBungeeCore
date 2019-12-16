package me.quickscythe.hyverse.bungee.core;

import me.quickscythe.hyverse.bungee.core.listeners.ChannelListener;
import me.quickscythe.hyverse.bungee.core.listeners.EventListener;
import me.quickscythe.hyverse.bungee.core.utils.Utils;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
	
	static Plugin plugin;
	
	@Override
    public void onEnable(){
		plugin = this;
        BungeeCord.getInstance().getPluginManager().registerListener(this, new ChannelListener());
        BungeeCord.getInstance().getPluginManager().registerListener(this, new EventListener());
        BungeeCord.getInstance().getConsole().sendMessage("Enabled");
        BungeeCord.getInstance().registerChannel("hyverse:hyverse");
        Utils.start();
        
    }
	
	public static Plugin getPlugin() {
		return plugin;
	}

}
