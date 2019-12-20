package cn.bdqn;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws  Exception {
        //创建socket并指定ip地址和端口号
        Socket socket=new Socket("localhost",8888);
        Scanner input=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            System.out.println("客户端说：");
            String str=input.next();
            pw.println(str);
            String info = bf.readLine();
            System.out.println("服务端说：" + info);
            if("bye".equals(str))break;
        }
        pw.close();
        bf.close();
    }
}
