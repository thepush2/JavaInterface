package testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试case1");

    }
    @Test
    public void testCase2(){
        System.out.println("这是case2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMerhod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是类之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass是类之后运行的");
    }
}
