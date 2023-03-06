package atguigu;
/**
 * ClassName:Java076_ThreadSafe01
 * Package:atguigu
 * Description:
 *
 * @Author:
 * @Create:2023/3/5,15:50
 * @Version:
 */

import org.junit.Test;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/5 15:50
 */

public class Java076_ThreadSafe01 {
    @Test
    public void test01(){
     SaleTicket s = new SaleTicket();
     new Thread(s).start();
     new Thread(s).start();
     new Thread(s).start();
     
    }
    @Test
    public void test02(){
        new SaleTicker().start();
        new SaleTicker().start();
        new SaleTicker().start();
    }
}
class SaleTicket implements Runnable{
    int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {

            while (true) {

                    if(ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "售票号：" + ticket);
                        ticket--;
                    }else break;

            }

    }
}
class SaleTicker extends Thread{
    public static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if(ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "售票号：" + ticket);
                ticket--;
            }else break;
        }
    }
}
/**
 *      多线程执行时：只出现读的行为则不存在安全问题
 *                  出现写的时候就会出现安全问题
 *
 *      线程a的操作未结束，线程b就开始访问共享资源同时操作---就会导致不安全情况发生
 *
 *      如何保证安全： 在一个线程a执行访问共享数据时，其他线程无法访问，直到线程a结束执行
 *          使用同步代码块 synchronized(同步监视器){
 *                              需要被同步的代码，
 *                              操作共享数据的代码
 *                          }
 *           同步监视器，锁-----哪个线程获得了锁，就会执行同步代码
 *           同步监视器，可以使用任一个累充当，但是只能有一个
 *                  Object   this    new 任何一个对象    Window.class
 *      实现接口的类中同步监视器使用this
 *      实现继承的类中同步监视器使用   类名.class
 *
 *
 *      同步方法。如果操作共享数据的方法完整的放在了一个方法内，
 *                  那么直接将该方法声明为同步方法即可
 */