package cn.bdqn.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {
    public static void main(String[] args) {
        InputStream is=null;
        OutputStream os=null;
        try{
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
