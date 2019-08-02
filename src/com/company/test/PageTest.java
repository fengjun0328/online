package com.company.test;

import com.company.pojo.Customer;
import com.company.pojo.User;
import com.company.tool.Page;

import java.util.List;

public class PageTest {
    public static void main(String[] args) {
        Page<User> page=new Page<User>();
       List<User> users= page.arraylist;
        for ( User user : users) {
            
        }

        Page<Customer> page1= new Page<Customer>();
        List<Customer> customers= page1.arraylist;
        for ( Customer customer : customers) {

        }
    }
}
