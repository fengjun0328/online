package cn.bdqn.test;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) {
        DataInputStream is=null;
        DataOutputStream os=null;
        try{
            os=new DataOutputStream(new FileOutputStream("D:/hello.txt"));
            os.writeDouble(2.7);
            os.writeInt(25);
            os.writeUTF("你好");

            is=new DataInputStream(new FileInputStream("D:/hello.txt"));
            System.out.println(is.readDouble());
            System.out.println(is.readDouble());
            System.out.println(is.readUTF());

           System.out.println("写入成功");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(is!=null)is.close();
                if(os!=null)os.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }

        }
    }
}
