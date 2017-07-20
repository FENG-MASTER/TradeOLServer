package Netty;

import Message.BaseMessage;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by admin on 2017/7/19.
 */
public class TradeOLServer {
    private static final int PORT=7766;

    public static void main(String args[]){
        BaseMessage baseMessage=new BaseMessage();

        EventLoopGroup bossGroup=new NioEventLoopGroup();
        EventLoopGroup workerGroup=new NioEventLoopGroup();
        try {

            ServerBootstrap bootstrap=new ServerBootstrap();
            bootstrap.group(bossGroup,workerGroup);
            bootstrap.channel(NioServerSocketChannel.class);
            bootstrap.childHandler(new ServerInitializer());
            bootstrap.option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);
            ChannelFuture future=null;


            future=bootstrap.bind(PORT).sync();
            future.channel().closeFuture().sync();

        } catch (InterruptedException e) {

            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
            e.printStackTrace();

        }




    }


}
