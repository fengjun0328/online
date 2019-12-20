package cn.bdqn.test;

public enum Color implements Service {

    Red("红色",255),Black("黑色",0);
    private String name;
    private int number;

    private Color(String name,int number){
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  String getName(String name){
        return  "蓝色";
    }

    @Override
    public void show() {

    }
}
