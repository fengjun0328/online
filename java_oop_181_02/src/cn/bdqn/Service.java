package cn.bdqn;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Service {

    public static void main(String[] args) throws  Exception {
        Scanner input=new Scanner(System.in);
        ServerSocket serverSocket=new ServerSocket(8888);
        System.out.println("服务器开启。。。。。。。。。。。。。。。。");
        Socket socket=serverSocket.accept();//接受客服端来连接

        InputStream inputStream=socket.getInputStream();
        BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter pw=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        while (true) {

            String info = bf.readLine();
            System.out.println("客服端说：" + info);

            System.out.print("服务器回复：");
            String str=input.next();
            pw.println(str);
            if("bye".equals(str))break;;
        }
        bf.close();
        pw.close();
    }
}
