package cn.bdqn;

import java.io.File;

public class FileUtil {

    /**
     * 递归  满足2个条件   1.自己调用自己 2.一定要跳出
     * @param file
     */
    public static void listFile(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files=file.listFiles();
            for (int i = 0; i <files.length ; i++) {
                listFile(files[i]);
            }
        }
    }

    public static int sum(int num){
        if(num==1){
            return 1;
        }else{
           return num+sum(num-1);
        }
    }

    /**
     * 斐波拉数列 1 1 2 3 5 8 13 ........
     * @return
     */
    public static int list(int n){
        if(n==1||n==2){
            return  1;
        }else {
            return list(n-1)+list(n-2);
        }
    }

    public static void main(String[] args) {
//        listFile(new File("E:"));
//        File file=new File("E:/file1/aa");
//        if(!file.exists()){
//            file.mkdir();
//        }
//        System.out.println("====");
        System.out.println(sum(50));
        System.out.println(list(7));
    }

}
