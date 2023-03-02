package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 20:28
 */

public class Java060_Interface {
    public static void main(String[] args) {
        System.out.println(Flyable060.MAX_SPEED);
        System.out.println(Flyable060.MIN_SPEED);
    }
}
interface Attackable{
    void Attak();
}
interface Flyable060 {

    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;

    public abstract void fly();

    void stop();

}
class Plane extends Object implements Flyable060,Attackable{
    @Override
    public void fly() {
        System.out.println("通过引擎飞行");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }

    @Override
    public void Attak() {

    }
}
/*
        接口（interface）：一定程度上解决了类的单继承性，弥补了java类的单继承性
            仅仅只是具有相同的行为而已
            类可以实现多个接口的继承

         jdk7,0     只能够定义常量和抽象方法
                全局常量， public static final  书写时可以省略
                抽象方法   public abstract

         jdk8.0  除了以上两个以外可以定义
                static方法，默认方法

         接口中不能有构造器，不能实例化
         开发中，让类实现（implement）接口

         实现类：实现了接口中所有的抽象方法，才可以实例化对象
         否则只能是抽象类


         接口和接口之间 可以多继承

         接口的使用体现了多态性，
         接口就是规范，

 */

interface AA{}
interface BB{}
interface CC extends AA,BB{}