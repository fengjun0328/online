package cn.bdqn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {

    private int count = 100;
    private int num = 0;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
                if (count == 0) {
                lock.unlock();
                    break;
                }
                count--;
                num++;
                try {
                    Thread.sleep(5);
                    System.out.println(Thread.currentThread().getName() + "抢到第" + num + "张票，还有" + count + "张票");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
        }
    }


}
