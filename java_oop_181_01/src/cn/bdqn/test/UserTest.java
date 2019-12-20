package cn.bdqn.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserTest {
    public static void main(String[] args) throws  Exception{
        User user=new User();
        user.setColor(Color.Red);

        Color red=Color.Red;
        red.setName("绿色");
        System.out.println(red.getName());

        System.out.println(new Date());

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       Date date= sdf.parse("2012-12-12");
        System.out.println(sdf.format(date));
    }
}
