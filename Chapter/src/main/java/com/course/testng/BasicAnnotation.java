package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
      System.out.print("测试用例!");
    }
    @Test
    public void testCase2(){
        System.out.print("测试用例2!");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("先打印！");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("后打印！");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.print("类之前打印！");
    }
    @AfterClass
    public  void afterClass(){
        System.out.print("类之后打印！");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.print("套件前！");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.print("套件后！");
    }

}
