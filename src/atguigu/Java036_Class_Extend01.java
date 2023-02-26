package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/25 9:50
 */

public class Java036_Class_Extend01 {
    public static void main(String[] args) {

    }
}

class Creature036{

}
class Person036 extends Creature036{

}
class Student036 extends Person036{

}

/*
    继承性【extends】：
        好处：
            减少代码冗余，提高代码复用性
            便于功能的扩展
            为多态性提供前提

        格式： class A extends B
        A子类（派生类）subclass
        B（父类，超类，基类）superclass
        体现：
            一旦子类继承父类之后，A就获得了B中所有的属性和方法
        特别的，父类中private修饰的属性和方法也被继承，只是不可见，不能直接调用而已（间接调用可以）
        子类继承父类以后，还可以定义自己特有的属性和方法【实现功能拓展】
        Java中关于继承的规定
            只能有一个父类，有关系才继承，类的单继承性
            一个类可以被多个子类继承，
            子父类是相对的关系
            没有爷爷类，只有直接父类和间接父类
            子类继承了直接父类和所有间接父类的方法
        Object类
            没有显式的声明父类，则默认继承于Object类
            所有的类都直接或者间接继承于Object类




 */