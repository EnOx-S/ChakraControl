package fr.enoxs.chakramod;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class ClientProxy extends CommonProxy {
	
	public static KeyBinding chakraKey;
	
	@Override
	public void init() {
		chakraKey = new KeyBinding("Chakra Control", Keyboard.KEY_NONE, "ChakraMod");
		ClientRegistry.registerKeyBinding(chakraKey);
	}
	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if(chakraKey.isKeyDown()) {
			ChakraMod.NETWORK.sendToServer(new MessageToggleChakra());
		}
		
	}
}