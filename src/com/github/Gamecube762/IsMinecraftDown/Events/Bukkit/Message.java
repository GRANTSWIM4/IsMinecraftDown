
public class Message {
	
	  if (args.length >= 1)
      {
          String updown = "";

          for (String messages : args)
          {
              msg = msg + messages + " ";
          }

          for(ProxiedPlayer p : ProxyServer.getInstance().getPlayers())
          {
              p.sendMessage(new TextComponent(ChatColor.translateAlternateColorCodes('&', plugin.prefix + " " + ChatColor.translateAlternateColorCodes('&', msg))));
          }

}
