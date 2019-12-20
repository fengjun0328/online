package com.company.demo;

public enum Color implements MyInterface{
    Red("红色",1),Yellow("黄色",2);
    private String name;
    private Integer index;

    private  Color(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public void show() {
        System.out.println(this.getName());
    }
}
