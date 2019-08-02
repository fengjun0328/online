package com.company;

/**
 * 递归算法
 * 满足2个条件  1.自己调用自己 2.必须跳出
 */
public class Demo {

    /**
     * 斐波拉数列  1 1 2 3 5 8.....
     */

    public static int sum_(int n){
        if(n==1||n==2){
            System.out.print(1+"\t");
            return  1;
        }else{
            return sum_(n-2)+sum_(n-1);
        }
    }

    public  static  int cheng(int n){
        if(n==1){
            return  1;
        }else{
            return  n*cheng(n-1);
        }
    }

    /**
     *
     * @return
     */
    public static int sum(int n){
        if(n%2==0){
            return -1;
        }
        if(n==1){
            return  1;
        }else{
            System.out.print(n+"\t");
            return sum(n-2)+n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum_(8));
        System.out.println(sum(99));
        System.out.println(cheng(6));
    }
}
