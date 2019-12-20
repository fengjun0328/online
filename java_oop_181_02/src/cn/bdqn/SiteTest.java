package cn.bdqn;

public class SiteTest {
    public static void main(String[] args) {
        Site site=new Site();
        Thread th_01=new Thread(site,"抢票党");
        th_01.setPriority(10);
        Thread th_02=new Thread(site,"学生");
        th_02.setPriority(9);
        Thread th_03=new Thread(site,"农民工");
        th_01.start();
        th_02.start();
        th_03.start();
    }
}
