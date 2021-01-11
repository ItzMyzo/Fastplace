package fastplace;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.*;

public class setDelay extends CommandBase 
{
	Minecraft mc = Minecraft.getMinecraft();
	
	@Override
	public String getCommandName() 
	{
		return "setdelay";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) 
	{
		return "/setdelay <delay>";
	}
	
	@Override
	public List getCommandAliases() 
	{
		List<String> commandAliases = new ArrayList();
		commandAliases.add("delay");
		commandAliases.add("delayset");
		return commandAliases;
		
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] strings) 
	{
		if ( icommandsender instanceof EntityPlayer ) 
		{
		EntityPlayer player = (EntityPlayer) icommandsender;
		    if (strings == null || strings.length == 0) 
		    {
		        mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Error: Input must contain something!"));
		        return;
		    } else 
		    {
			    try 
			    {
		    	    Integer.parseInt(strings[0]);
		    	    Main.delay = Integer.parseInt(strings[0]);
		            mc.thePlayer.addChatComponentMessage(new ChatComponentText("[" + EnumChatFormatting.GREEN + "Fastplace" + EnumChatFormatting.WHITE + "]: Delay set to " + strings[0] + "!"));
			    } catch (NumberFormatException e) 
			    {
		    	mc.thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Error: Input must be Integer!"));
		    	return;
		        }
		    }
	    }
	}
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender) 
	{
		return true;
	}
}
