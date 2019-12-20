package com.company;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrintTest {

    private static final Logger logger=Logger.getLogger(PrintTest.class);
    public static void main(String[] args) {
        List list=new ArrayList(100);
        Class cls=PrintTest.class;
        logger.info("==========>"+cls.getName());
       List names= Arrays.asList(new String[]{"",""});
       names.contains("admin");
        List linkList=new LinkedList();

    }
}
