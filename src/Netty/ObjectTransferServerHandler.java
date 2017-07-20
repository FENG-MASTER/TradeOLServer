package Netty;

import Message.BaseMessage;
import Message.impl.MessageHandler;
import Message.interf.IMessageHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by admin on 2017/7/19.
 */
public class ObjectTransferServerHandler extends ChannelInboundHandlerAdapter {

    private IMessageHandler handler=new MessageHandler();

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //信息接收

        if (msg instanceof BaseMessage){
            BaseMessage baseMessage= (BaseMessage) msg;
            handler.handlerMessage(baseMessage);//处理消息
            System.out.println(baseMessage);
        }else {

            System.out.println("??");
        }
        //ctx.writeAndFlush(msg);//回复

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        System.out.println("!!!!");
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
