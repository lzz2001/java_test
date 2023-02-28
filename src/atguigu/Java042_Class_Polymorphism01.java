package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/27 10:32
 */

public class Java042_Class_Polymorphism01 {
    public static void main(String[] args) {
        Java042_Class_Polymorphism01 j = new Java042_Class_Polymorphism01();
        j.func(new Dog042());
        j.func(new Cat042());
    }
    public void func(Animal042 animal){
        animal.eat();
        animal.shout();
    }
}
class Animal042{
    public void eat(){
        System.out.println("动物，吃");
    }
    public void shout(){
        System.out.println("动物，叫");
    }
}
class Dog042 extends Animal042{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }
}
class Cat042 extends Animal042{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵喵！");
    }
}


/*
    多态性
        一个事务的多种形态
        父类创造子类对象----子类对象的多态性【父类的引用指向子类的对象】
        方法调用的时子类重写方法【虚拟方法调用】，
        只能调用引用类型，声明过的方法。
        没用重写的方法就调用本类方法
    多态的使用：【虚拟方法调用】
            编译期，只能调用父类中声明的方法
            运行时，执行子类重写的方法
            编译看左边，执行看右边
     使用前提：必须有类的继承关系，
             子类通常是有方法的重写
     为什么要有多态性：避免大量的方法重载


     对象的多态性，适用于方法，不适用于属性

    多态时，父类中的被重写的方法是虚拟方法，运行时使用赋予的子类的重写方法
    多态是运行时行为
        ------动态绑定



 */




