package cn.bdqn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

public class Receive {
    public static void main(String[] args) throws  Exception {
        byte [] bytes=new byte[1024];
        System.out.println("接受方。。。。。。。。。。。。。。");
        DatagramSocket ds=new DatagramSocket(8888);
             DatagramPacket dp=new DatagramPacket(bytes,0,bytes.length);

        ds.receive(dp);

        System.out.println(new String(bytes,0,dp.getLength()));
        SocketAddress sa=dp.getSocketAddress();

        String info="你好，有什么事？";

        DatagramPacket drp=new DatagramPacket(info.getBytes("utf-8"),
                0, info.getBytes("utf-8").length,sa);
        ds.send(drp);
        System.out.println("回复l");

    }
}
