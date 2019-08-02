package com.company;

import org.junit.Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        System.out.println("输入行数：");
        int row=new Scanner(System.in).nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = row-1-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                if (j==0||j==2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <row-1 ; i++) {
            for (int j =0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = 2*(row-1-i)-1; j >0 ; j--) {
                if (j==2*(row-1-i)-1||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public  static int findNunber(int number,int num ){

        int start=0,end=number,middle=0,count=0;
        while(true){
            count++;
            middle=(end+start)/2;
            if(num==middle){
                return count;
            }else if(num>middle){
                start=middle+1;
            }else {
                end=middle-1;
            }
        }
    }

    @Test
    public  void test(){
        System.out.println(findNunber(100,24));
    }
}
