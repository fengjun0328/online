package cn.bdqn;

public class MyThread  {
    public static void main(String[] args) throws  Exception {
        Tickets tickets=new Tickets();
        Thread thread=new Thread(tickets,"抢票党");
        Thread thread_1=new Thread(tickets,"刘程鹏");
        Thread thread_2=new Thread(tickets,"李林星");
        thread_1.setPriority(10);
        thread_2.setPriority(1);
        thread.start();
        thread_1.start();
        thread_2.start();
    }
}
