package fr.enoxs.chakramod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;


@Mod(modid = ChakraMod.MODID, name = ChakraMod.NAME, version = ChakraMod.VERSION)
public class ChakraMod {
	public static final String MODID = "chakramod";
	public static final String NAME = "Chakra Control Mod";
	public static final String VERSION = "1.0";
	public static final net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper NETWORK =
			net.minecraftforge.fml.common.network.NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
	
	@SidedProxy(clientSide = "fr.enoxs.chakramod.ClientProxy", serverSide = "fr.enoxs.chakramod.CommonProxy")
	public static CommonProxy proxy;
	
	
	@Mod.Instance
	public static ChakraMod instance;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) { 
		MinecraftForge.EVENT_BUS.register(proxy);
		int id = 0;
		NETWORK.registerMessage(MessageToggleChakra.Handler.class, MessageToggleChakra.class, id++, Side.SERVER);
	}
	
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) { proxy.init(); }
}
