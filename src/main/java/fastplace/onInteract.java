package fastplace;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class onInteract 
{
	
	@SubscribeEvent
    public void onRightClick(PlayerInteractEvent event) 
	{

        if(Main.fastplace)
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
