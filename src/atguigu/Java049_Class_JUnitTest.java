package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 11:02
 */

public class Java049_Class_JUnitTest {
    @org.junit.Test
    public void fun(){
        System.out.println("hello world");
    }


}
/*
    eclipse:
    1.选中当前工程---右键 build path - add libraries - JUnit 4 -下一步
    2.创建Java类进行单元测试
    3.此类是public 默认空参构造器
         声明单元测试方法   权限是public 无返回值 无形参
    4.方法上声明一个注解 @Test 并在单元测试类中导入 import org.junit.Test
    5.声明号测试方法后可以在方法体内测试相关代码
    6.左键双击方法名， run as - junitTest

    说明： 绿条是没有任何异常，红条出现异常

    idea:
    project Stricture -- Libraries -- + -- idea安装目录 -- lib下的junit4 添加
 */