package me.Bman.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_Heal implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		if(cmd.getLabel().equalsIgnoreCase("heal")){
			if(!(sender instanceof Player)){
				sender.sendMessage("You must be a player to use this command!");
				return false;
			}
			
			Player player = (Player) sender;
			
			if(args.length == 1){
				player.setHealth(20.0);
				player.setFoodLevel(20);
				player.setFireTicks(0);
				player.sendMessage(ChatColor.GREEN + "You have been healed!");
			}else if(args.length == 2){
				@SuppressWarnings("deprecation")
				Player target = Bukkit.getPlayer(args[0]);
				if(target != null){
					target.setHealth(20.0);
					target.setFoodLevel(20);
					target.setFireTicks(0);
					target.sendMessage(ChatColor.GREEN + "You have been healed!");
					player.sendMessage(ChatColor.GREEN + "You have healed " + ChatColor.BLUE + target.getName());
				}
			}
		}
		return false;
	}

}
