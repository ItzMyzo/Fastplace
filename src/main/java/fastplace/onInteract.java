package fastplace;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class onInteract 
{
	Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
    public void onRightClick(PlayerInteractEvent event) 
	{

        if(Main.fastplace == true && (mc.thePlayer.inventory.getStackInSlot(mc.thePlayer.inventory.currentItem) != null && (mc.thePlayer.inventory.getStackInSlot(mc.thePlayer.inventory.currentItem).getItem() instanceof net.minecraft.item.ItemBlock)))
        {
            Minecraft mc = Minecraft.getMinecraft();
            try 
            {
                Main.fastField.set(mc, Main.delay);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
