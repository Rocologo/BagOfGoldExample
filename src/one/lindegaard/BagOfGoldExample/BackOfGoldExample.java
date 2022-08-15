package one.lindegaard.BagOfGoldExample;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import one.lindegaard.BagOfGold.BagOfGold;
import one.lindegaard.BagOfGold.api.BagOfGoldAPI;

public class BackOfGoldExample extends JavaPlugin {

	private static BagOfGoldAPI bagOfGoldAPI;

	@Override
	public void onEnable() {
		Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("BagOfGold");
		if ((plugin != null) && (plugin.isEnabled())) {
			Bukkit.getConsoleSender()
					.sendMessage(ChatColor.GOLD + "[BagOfGoldExample] " + ChatColor.RESET + "Hooked into BagOfGold.");

			bagOfGoldAPI = BagOfGold.getAPI();
				
			// Now do something with bagOfGoldAPI
			// 
			// The API interface is here:  https://github.com/Rocologo/BagOfGold/tree/master/src/one/lindegaard/BagOfGold/api/BagOfGoldAPI.java

		}
	}

	@Override
	public void onDisable() {

	}

}
