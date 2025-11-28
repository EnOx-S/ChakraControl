package fr.enoxs.chakramod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;


public class DataChakraPlayer {
	public static final DataParameter<Boolean> CHAKRA_CONTROL = EntityDataManager.createKey(EntityPlayer.class, DataSerializers.BOOLEAN);
	
	public static void register(EntityPlayer p) {
		p.getDataManager().register(CHAKRA_CONTROL, false);
	}
	
	
	public static boolean get(EntityPlayer p) {
		return p.getDataManager().get(CHAKRA_CONTROL);
	}
	
	
	public static void toggle(EntityPlayer p) {
		boolean v = !get(p);
		p.getDataManager().set(CHAKRA_CONTROL, v);
	}
}