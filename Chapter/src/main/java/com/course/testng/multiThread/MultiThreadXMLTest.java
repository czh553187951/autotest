package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadXMLTest {
    @Test
    public void test1(){
        System.out.printf("线程ID是：%s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("线程ID是：%s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("线程ID是：%s%n",Thread.currentThread().getId());
    }
}
