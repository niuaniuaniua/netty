package InAndOutBoundHandler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class MyLongToByteEncoder extends MessageToByteEncoder<Long> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Long msg, ByteBuf byteBuf) throws Exception {
        System.out.println("Encoding...");
        System.out.println("msg = "+msg);
        byteBuf.writeLong(msg);
    }
}
