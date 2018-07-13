package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadTest {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println("a");
        System.out.printf("线程ID是：%s%n",Thread.currentThread().getId());

    }

}
