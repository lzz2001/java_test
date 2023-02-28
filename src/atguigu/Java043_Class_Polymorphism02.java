package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/27 11:25
 */

public class Java043_Class_Polymorphism02 {
    public static void main(String[] args) {
        Person043 p = new Man043();
        Man043 m = (Man043) p; //向下转型
        Person043 p1 = (Person043) p;
    }
}

class Person043{
    String name;
}
class Man043 extends Person043{

}
class Woman043 extends Person043{

}
/*

        没有多态性，抽象类和接口就没有意义
        多态性时：不能调用子类所特有的属性和方法
        有了对象的多态性以后，内存中实际是有子类对象的属性和方法，但是由于变量声明时
        是父类的类型，就只能调用父类的方法与属性

        那么如何调用子类的属性和方法
        向下转型：强制类型转换----之后可以调用子类特有属性和方法【更改了地址类型】
        强转型是有风险的 --- 数据精度损失----会出现运行时异常 【ClassCastException】



        instanceof的使用
            避免运行时类型转换异常。
           a instanceof A（父类也行）   是 true  不是false



        问题：
            编译通过，运行时不通过
            Person p = new Womam();
            Man m = (Man) p ;

            Person p = new Person();
            Man m = (Man) p ;

            编译通过运行也通过
            Object obj = new Women();
            Person p = (Person) obj;

            编译不过
            Man m = new Woman()



        向上转型：
        继承时避免属的同名
 */




























