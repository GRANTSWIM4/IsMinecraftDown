
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

	  // If you don't care about the player
	  // Player player = Iterables.getFirst(Bukkit.getOnlinePlayers(), null);
	  // Else, specify them
	  Player player = Bukkit.getPlayerExact(updown);

	  player.sendPluginMessage(this, "BungeeCord", out.toByteArray());
	
	
	
	
		

}
