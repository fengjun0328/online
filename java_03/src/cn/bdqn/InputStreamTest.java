package cn.bdqn;

import java.io.*;

public class InputStreamTest {
    /**
     * 复制的方法
     */
    public static  void copyFile(File oldFile,File newFile){
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(oldFile);//输入流
            os=new FileOutputStream(newFile);//输出流
            byte[] bytes=new byte[1024];//
            int length=is.read(bytes);//读取文件实际长度
            while (length!=-1){
                os.write(bytes,0,length);//写出去
                length=is.read(bytes);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(is!=null)is.close();
                if(os!=null)os.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static  void copyFile_Read(File oldFile,File newFile){
        Reader reader=null;
        Writer writer=null;
        try {
            reader=new FileReader(oldFile);
            writer=new FileWriter(newFile);
            char[] chars=new char[1024];
            int length=reader.read(chars);
            while (length!=-1){
                writer.write(chars,0,length);
                length=reader.read(chars);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(reader!=null)reader.close();
                if(writer!=null)writer.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static  void copyFile(File oldFile){
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(oldFile);//输入流
//            String str=new String();
           char ch= ((char) (is.read()));

            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(is!=null)is.close();
                if(os!=null)os.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {
//        copyFile(new File("d:/12.txt"));
//        copyFile_Read(new File("e:\\hello.txt"),new File("D:\\TP02.txt"));
//        System.out.println("复制成功");

    /*    BufferedReader br=new BufferedReader(new FileReader(""));
        BufferedWriter bw=new BufferedWriter(new FileWriter(""));*/
        DataInputStream dis=new DataInputStream(new FileInputStream("d:\\demo.txt"));
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("d:\\demo.txt"));
        dos.writeDouble(125.0);
        dos.writeInt(12);
        dos.writeUTF("刘程鹏");

        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF()


        );

    }
}
