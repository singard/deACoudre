package pluginTest;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import utils.commands.CommandFramework;

public class Main extends JavaPlugin {
	
	 private CommandFramework framework;

	    @Override
	    public void onEnable() {

	        this.framework = new CommandFramework(this);

	        this.framework.registerCommands(new SpigotBlankPlugin());

	        Bukkit.getServer().getConsoleSender().sendMessage("Le plugin s'est bien démarré !");
	    }

	    @Override
	    public void onDisable() {
	        Bukkit.getServer().getConsoleSender().sendMessage("Le plugin s'est bien arrêté !");
	    }

}
