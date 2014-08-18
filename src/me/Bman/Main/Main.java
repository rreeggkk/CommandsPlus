package me.Bman.Main;

import me.Bman.Commands.Command_Heal;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable(){
	    getCommand("heal").setExecutor(new Command_Heal());
		getLogger().info("Plugin has been enabled!");
	}
	
	public void onDisable(){
		getLogger().info("Plugin has been disabled!");
	}

}
