package com.company;

public class MyDoorTest implements MyDoor {
    @Override
    public void open() {
        System.out.println("这个测试");

    }

    @Override
    public void lock() {

    }

    public void show(){

    }

    public static void main(String[] args) {
        MyDoor myDoorTest=new MyDoorTest();
        myDoorTest.lock();
        System.out.println(MyDoorTest.name);
        ((MyDoorTest) myDoorTest).show();

    }
}
