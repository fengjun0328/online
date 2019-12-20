package cn.bdqn;

public class MyThread_01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
//                Thread.sleep(1);
                System.out.println(Thread.currentThread().getName()+":"+i);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
