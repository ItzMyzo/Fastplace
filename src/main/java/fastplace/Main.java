package fastplace;

import java.lang.reflect.Field;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;


@Mod(modid = "fp", name = "Fastplace", version = "1.1.1")
public class Main 
{
	public static boolean fastplace = false;
	
	public static KeyBinding Fastplace = new KeyBinding("Toggle Fastplace", Keyboard.KEY_G, "Fastplace");
	
	public static Field fastField;
	
	public static int delay = 4;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ClientCommandHandler.instance.registerCommand((ICommand) new setDelay());
	}
	
	@EventHandler 
	public void init(FMLInitializationEvent event) 
	{

		ClientRegistry.registerKeyBinding(Fastplace);
		
	    MinecraftForge.EVENT_BUS.register(new keyHandler());
		MinecraftForge.EVENT_BUS.register(new onInteract());
		
		System.out.println("Successfully initialized Fastplace 1.1.1 by Myzo");
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {}
}
	

    
