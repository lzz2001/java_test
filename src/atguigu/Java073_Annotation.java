package atguigu;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * ClassName:Java073_Annotation
 * Package:atguigu
 * Description:注解的使用
 *
 * @Author:
 * @Create:2023/3/4,17:43
 * @Version:
 */

public class Java073_Annotation {
    @Test
    public void test1(){
        Person073.walk();
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);


    }
}
class Person073{
    String name;
    @SuppressWarnings("unused") int age;//加上之后显示使用（抑制编译器警告）
    Date date = new Date();
    @Deprecated  //过时的，不推荐使用----但是可以用
                 //   调用时会在方法上有一个横线
    public static void walk(){
        System.out.println("walk");
    }
    public void eat(){
        System.out.println(" people eating");
    }

}
class Student073 extends Person073{
    @Override       //只能修饰方法，若没有重写就会报错
    public void eat(){
        System.out.println(" student eating ");
    }

}
/**
 *          注解可以对代码进行修饰
 *              文档注释时的@Author。。。
 *              jdk内置的三个基本注释
 *              跟踪代码依赖性，实现替代配置文件的功能
 *
 *
 *              Java是常用的三个注解
 *
 *
 *              自定义注解
 *              以@SuppressWarings为参照
 *              框架 = 注解 + 反射 + 设计模式
 *
 *
 *
 *
 *              元注解的理解
 *                      对现有注解进行解释说明的注解
 *                      Target用于描述注解的使用范围
 *                            可以通过枚举类型【ElementType】的十个常量对象指定
 *                            TYPE,METHOD,CONSTRUCTOR,PACKAGE。。
 *                            作用：自定义注解可以修饰的内容。
 *                      Retention用于描述生命周期
 *                          【RetentionPolicy】的三个枚举对象指定
 *                          SOURCE(源代码),CLASS(字节码),RUNTIME(运行时)
 *                          唯有RUNTIME阶段才能被反射读取到
 *
 *
 *                      Documented 表明这个注解应该被javadoc工具记录
 *                              在生成的API文件中可以看到该注解
 *                      Inherited   允许子类继承父类的注解
 *
 *
 *
 *
 */

//      自定义注解
@interface MyAnnotation{
    String value() default "hello";
    //不加反射就是单一个标识
}

