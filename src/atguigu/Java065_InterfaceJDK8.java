package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/2 14:39
 */

public class Java065_InterfaceJDK8 {

}
interface CompareA {
    public static void method1(){
        // 静态方法只能用接口来调用

    }
    public default void method2(){
//        可以使用实例调用
    }
}
class SubClass065 implements CompareA{
    public void method(){
        CompareA.super.method2();
        // 调用实现接口的方法
    }
}
/*
        定义静态方法和默认方法
        接口中的静态方法只能通过接口名。方法名来调用
            实现类和对象无法调用

        如果实现类，继承的父类和实现的接口中声明了同名同参数的，
        那么子类在没有重写此方法的时候默认调用的父类中的该方法，类优先原则【方法】

        如果实现类实现了多个接口，其中含有定义了同名同参数的方法，没有重写时会报错
        接口冲突，，，，必须在实现类中重写该方法


 */