package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public static void main(String[] args) throws IOException {
		File newdir = new File("./[S]Shikibetsu");
		File newfile = new File("./[S]Shikibetsu/Shikibetsuname.txt");
		newdir.mkdir();
		try {
			newfile.createNewFile();
		} catch (IOException e) {
			}
		}
	public static void read(String[] args) throws IOException {
		try{
			File file = new File("./[S]Shikibetsu/Shikibetsuname.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = br.readLine();
			str = br.readLine();}
		catch (IOException e) {
			System.out.println("エラー「" + e + "」が発生しました");
		}
	}

	public void onEnable() {
		System.out.println("ShikibetsuPluginが稼働しました");
	}
	public void onDisable() {
		System.out.println("ShikibetsuPluginが停止しました");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(label.equalsIgnoreCase("Whos")) {
			System.out.println("このサーバーの識別名は" + br.readLine() + "です。");
		}
		return true;
	}
}