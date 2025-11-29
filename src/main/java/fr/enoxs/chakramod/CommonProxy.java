package fr.enoxs.chakramod;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy {
	
	public void init() {}
	
	@SubscribeEvent
	public void onJoin(EntityJoinWorldEvent e) {
	    if (e.getEntity() instanceof EntityPlayer) {
	        EntityPlayer p = (EntityPlayer) e.getEntity();
	        DataChakraPlayer.register(p);
	    }
	}

	@SubscribeEvent
	public void onLivingUpdate(LivingUpdateEvent event) {
	    if (!(event.getEntityLiving() instanceof EntityPlayer)) return;
	    EntityPlayer player = (EntityPlayer) event.getEntityLiving();
        
        World world = player.world;
        if (DataChakraPlayer.get(player)) {  	

	        BlockPos blockUnder = new BlockPos(player.posX, player.posY - 0.1d, player.posZ);
	
	        if (world.getBlockState(blockUnder).getMaterial() == Material.WATER && !player.isSneaking()) {
	            player.motionY = 0.01d;
	            player.onGround = true;
	        }
	                
	                // Poussée contre un mur -> wall jump
	       if (player.collidedHorizontally) {
	           player.motionY = 0.2d;
	           player.fallDistance = 0.0f;
	        }
        }
	}
}