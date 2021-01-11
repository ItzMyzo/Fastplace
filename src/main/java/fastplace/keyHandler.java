package fastplace;


import java.lang.reflect.Field;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;


public class keyHandler 
{
	
	@SubscribeEvent
	public void onKeyPressed(KeyInputEvent event) 
	{
		if(Main.Fastplace.isKeyDown() && Main.fastplace == false)
		{
			Main.fastField = ReflectionHelper.findField(Minecraft.class, "rightClickDelayTimer", "field_71467_ac", "ap");
			Main.fastplace = true;
			Minecraft mc = Minecraft.getMinecraft();
			mc.thePlayer.addChatComponentMessage(new ChatComponentText("[" + EnumChatFormatting.GREEN + "Fastplace" + EnumChatFormatting.WHITE + "]: Fastplace enabled"));
			
		} else if (Main.Fastplace.isKeyDown() && Main.fastplace == true)
			
		{
			Main.fastplace = false;
			Minecraft mc = Minecraft.getMinecraft();
			mc.thePlayer.addChatComponentMessage(new ChatComponentText("[" + EnumChatFormatting.RED + "Fastplace" + EnumChatFormatting.WHITE + "]: Fastplace disabled"));
		}
	}

}
