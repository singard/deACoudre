package pluginTest;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import utils.commands.Command;
import utils.commands.CommandArgs;
import utils.commands.ICommand;

public class SpigotBlankPlugin extends ICommand{
	
	 @Override
	    @Command(name = "yolo")
	    public void onCommand(CommandArgs args) {

	        Player player = args.getPlayer();
	        PotionEffect PotionEffect  = new PotionEffect(PotionEffectType.WITHER,2000 , 2);
	        player.addPotionEffect(PotionEffect);
	        Bukkit.getServer().getConsoleSender().sendMessage("WITHER");
	        player.sendMessage("WITHER");

	    }
	}


