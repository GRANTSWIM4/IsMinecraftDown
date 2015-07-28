import com.github.Gamecube762.IsMinecraftDown.isminecraftdown;

public class Message implements PluginMessageListener {
	
	
	  public void onPluginMessageReceived(String channel, Player player, byte[] message) {
		    if (!channel.equals("BungeeCord")) {
		      return;
		    }
		    }
		  
		

	if(s.contains("+"))
		 ByteArrayDataOutput out = ByteStreams.newDataOutput();
	  out.writeUTF("Subchannel");
	  out.writeUTF("Argument");
	  for (Player player : Bukkit.getOnlinePlayers) {
		  
		  player.sendmessage(updown);
		  
		}
	  
	  player.sendPluginMessage(this, "BungeeCord", out.toByteArray());
	
	
	
	
		

}
