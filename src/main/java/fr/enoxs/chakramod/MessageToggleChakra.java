package fr.enoxs.chakramod;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;

public class MessageToggleChakra implements IMessage {
	@Override
	public void fromBytes(ByteBuf buf) {}
	
	
	@Override
	public void toBytes(ByteBuf buf) {}
	
	
	public static class Handler implements IMessageHandler<MessageToggleChakra, IMessage> {
		@Override
		public IMessage onMessage(MessageToggleChakra msg, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
			player.getServerWorld().addScheduledTask(() -> {
				DataChakraPlayer.toggle(player);
				player.sendMessage(new TextComponentString(DataChakraPlayer.get(player) ? "§aVous venez d'active le chakra control " : "§cVous venez de desactiver le chakra control"));
			});
			return null;
		}
	}
}