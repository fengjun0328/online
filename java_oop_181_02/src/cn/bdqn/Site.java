package cn.bdqn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Site implements  Runnable{
    private Integer count=100;
    private Integer index=0;

    private Lock lock=new ReentrantLock();


    @Override
    public void run() {
        while (true){
            lock.lock();
            if(count==0){
                lock.unlock();
                break;
            }
            count--;
            index++;

            try{
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"抢到第"+index+"还剩下"+count+"张票");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
