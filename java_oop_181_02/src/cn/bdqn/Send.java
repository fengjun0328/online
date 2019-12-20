package cn.bdqn;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class Send {
    public static void main(String[] args) throws  Exception {
        byte [] bytes=new byte[1024];
        DatagramSocket ds=new DatagramSocket();//用于发送数据报

        InetAddress sa=InetAddress.getByName("localhost");
        DatagramPacket dp=new DatagramPacket("你好".getBytes("utf-8"),
                0, "你好".getBytes("utf-8").length, sa, 8888);
        ds.send(dp);
        System.out.println("发送成功");

        DatagramPacket drp=new DatagramPacket(bytes,0,bytes.length);

        ds.receive(drp);

        System.out.println(new String(bytes,0,drp.getLength()));
    }
}
