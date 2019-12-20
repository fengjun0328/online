package cn.bdqn.test;

public class StringUtil {
    //在一个字符串中查找一个字出现的次数

    public int search(String ch,String str){
        int count=0;
        String[] strings=str.split("");//
        for (int i = 0; i <str.length() ; i++) {
            strings[i]=str.substring(i,i+1);
        }

        for (int i = 0; i <strings.length ; i++) {
            if(ch.equals(strings[i])){
                count++;
            }
        }
        return  count;
    }
}
