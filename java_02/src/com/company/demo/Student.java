package com.company.demo;

public class Student {
    private Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Student student=new Student();
        Gender gender=Gender.Man;
        student.setGender(Gender.Man);
    }
}
