package atguigu;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 8:22
 */

public class Java055_CodeBlock {
}

class Person055{
    private String name;
    private int age;
    public static String desc = " 我是一个人 ";

    public Person055(){

    }
    public Person055(String name,int age){
        this.name = name;
        this.age = age;
    }

//    代码块
    static {
    System.out.println("Hello static block");
    }

    {
        System.out.println("Hello no static block");
    }

    public void eat(){
        System.out.println("吃饭。。。。");
    }

    @Override
    public String toString() {
        return "Person055{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
        代码块
            作用：{}----------举例；数据库连接池
                通常是用来初始化类和代码块
                定义了多个代码块，按照声明顺序执行


            static 修饰的代码块
                随着类的加载而执行（只执行一次）
                可以调用静态结构（属性和方法）

            非静态代码块
                随着对象的创建而执行，
                每次创造一个对象都会执行一次
                作用：可以创建对象时，把对象初始化


            由父及子，先静态后非
            类先加载---再main函数
        默认初始化
        显式初始化、代码块初始化（谁后写，显示谁）
        构造器初始化
        对象.初始化
*/