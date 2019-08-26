package com.hujia.WSServer;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

@Component
public class WebSocketTest {

    private static class SingletionServer {
        static final WebSocketTest instance = new WebSocketTest();
    }

    public static WebSocketTest getInstance() {
        return SingletionServer.instance;
    }

    private EventLoopGroup mainGroup;

    private EventLoopGroup subGroup;

    private ServerBootstrap serverBootstrap;

    private ChannelFuture future;

    public WebSocketTest(){
        mainGroup = new NioEventLoopGroup();
        subGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(mainGroup,subGroup).channel(NioServerSocketChannel.class)
                .childHandler(new WebSocketInitializerTest());
    }

    public void start(){
        this.future = serverBootstrap.bind(8888);
        System.out.println("netty websocket server 启动完毕.....");
        }

        }
