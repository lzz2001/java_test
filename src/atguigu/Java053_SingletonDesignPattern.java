package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 23:09
 */

public class Java053_SingletonDesignPattern {
}

/*
            实现一 ：饿汉式
 */
class Bank053_1{
    private Bank053_1(){
        // 私有化构造器
    }

    private static Bank053_1 instance = new Bank053_1();//    内部创建对象

    public static Bank053_1 getInstance() {
        //   静态方法调用该对象
        return instance;
    }
}
/*
            实现二 ：懒汉式
 */
class Order053 {
    private Order053(){

    }
    private static Order053 instance = null;
    private static Order053 getInstance(){
        if (instance == null){
            instance = new Order053();
        }
        return instance;
    }

}


/*
        单例模式：一个类只能由一个对象，构造器私有，静态生成该单例
                减少系统开销
                Runtime() 饿汉式
        应用场景：网站计数器，应用程序日志，数据库连接池，读取配置文件的类，Application
                任务管理器，回收站

        饿汉式和懒汉式：
            饿：一开始就造出对象，加载时间加长
                是一个线程安全的

            懒：延迟对象的创建
                目前是不安全的


            一共23种设计模式
 */