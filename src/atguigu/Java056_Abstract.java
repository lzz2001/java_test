package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 10:45
 */

public class Java056_Abstract {
}

abstract class Person056{
    String name;
    int age;

    public Person056(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
}
abstract class Student056 extends Person056{
    public Student056(String name, int age) {
        super(name, age);
    }
}
class Group056 extends Student056{

    public Group056(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {

    }
}
/*
    abstract 【抽象的】关键字的使用
        可以修饰类，方法

      抽象类不可以实例化，也是为了让他不能实例化，（但是构造器肯定有）
      构造器时子类实例化时调用（子类实例化的全过程）
      开发中都会提供抽象类的子类，让其子类实例化，使用其功能
      其中可以没有抽象方法


      抽象方法 一定在抽象类中

      使用的注意点：
        不能修饰属性，构造器，
        不能修饰私有方法，静态方法，final方法



 */