package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/2 20:06
 */

public class Java066_InterClass {
}

class InnerClassTest{

}

class Person066{
    String name;
    class Dog01{
        String name;
        public void display(String name){
            System.out.println(name);//形参
            System.out.println(this.name);//内部类属性
            System.out.println(Person066.this.name);//外部类属性

        }
        class bird{
            String name;
            public void display(){
                System.out.println(Person066.this.name);
                System.out.println(Person066.Dog01.this.name);
            }
        }
    }
    static class bird{

    }
    {
        class A{

        }
    }
    public Person066(){
        class  B{

        }
    }
    public void fun(){
        class C{

        }
    }
}

/*

        内部类：
               Java允许一个类A声明在一个类B中
               A为内部类，B为外部类
        成员内部类 和 局部内部类（方法内，代码块内，构造期内）

        成员内部类:
            1.作为外部类的成员
                调用外部类的结构
                可以被static修饰、
                可以被四种权限修饰符修饰



            2.作为一个类
                类内可以定义类的任何结构
                可以被继承，
                也可被final修饰


           如何实例化成员内部类
               静态的：        new 外部类.内部类
               非静态的  p = new 外部类，   p.new 内部类



           如何在成员内部类中区分调用外部类结构

           开发中内部类的使用


 */

//            局部内部类的使用场景
class InnerClass066{
    public void method(){
        class AA{

        }
    }

    public Comparable getComparable(){
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }
    class AA extends InnerClass066{

    }
}

class Inner{
    public int fun(){
        int num = 0;
        class A{
            public void method(){
//                num = 1;                默认  final 修饰，无法修改
                System.out.println(num);
            }
        }
        return 0;
    }
}