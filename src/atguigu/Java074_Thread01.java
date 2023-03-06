package atguigu;

import org.junit.Test;

import javax.sound.midi.Track;

/**
 * ClassName:Java074_Thread01
 * Package:atguigu
 * Description:
 *
 * @Author:
 * @Create:2023/3/4,22:43
 * @Version:
 */

public class Java074_Thread01 {
    @Test
    public void test01() {
        PrintNumber printNumber = new PrintNumber();
        printNumber.start();
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
    @Test
    public void test02(){
        //1.
        new Thread(new PrintDouble()).start();
        //2.
        new Thread(){
            @Override
            public void run() {
                System.out.println(1);
            }
        }.start();
        //2.
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
        //4.
        new PrintNumber().start();
    }


}
class MyThread{}
class PrintNumber extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}

class PrintDouble implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }
}


/**
 * 四种创建方式
 * <p>
 * 处理线程安全问题：同步代码，锁
 * <p>
 * 程序是一段静态的代码
 * 进程是执行是的动态的程序---操作系统调度和资源分配的基本单位
 * 线程：进程至少有一个线程，cpu调度和执行的最小单位----同一进程下多线程共享资源
 * <p>
 * 并行 parallel 同一时刻多个任务执行，多条指令在多个cpu上执行
 * <p>
 * 并发 concurrency 多个时间在同一时间段内执行
 * <p>
 * java.lang.Thread
 * JVM支持多线程
 * <p>
 * <p>
 * 常用两种方式：
 * 1.继承Thread类
 * 创建Thread子类，重写run方法（执行的操作）
 * 创建子类对象，使用对象调start方法[启动线程，调用run方法]
 *          单独调用run就是单线程
 *          每一个线程只能start一次否则报异常
 *
 *          创建匿名类的匿名对象
 *2.继承Runnable接口，重写造对象传入Thread构造器中
 *
 *
 * 共同点： 使用start启动线程
 *         new的都是Thread对象
 * 不同点： 一个是类的继承，一个属接口的实现
 *          避免了类的单继承性,方便共享数据，实现了代码和数据的分离--代理模式
 * 联系：  Thread 类 也是继承了Runnable 接口     ---代理模式
 *
 *          Thread内部有一个私有的Runnable对象
 *
 */