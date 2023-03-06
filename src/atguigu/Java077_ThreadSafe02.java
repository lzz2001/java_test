package atguigu;
/**
 * ClassName:Java077_ThreadSafe02
 * Package:atguigu
 * Description:
 *
 * @Author:
 * @Create:2023/3/5,17:19
 * @Version:
 */
public class Java077_ThreadSafe02 {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("一");
        t2.setName("二");
        t3.setName("三");
        t1.start();
        t2.start();
        t3.start();
        //java.lang.IllegalMonitorStateException
    }

}
class Window implements Runnable{
    boolean isFlag = true;
    int ticket = 100;

    @Override
    public void run() {
        while (isFlag){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            show();
        }
    }

    private synchronized void show() {//默认 监视器是this
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName()+"  "+ ticket);
            ticket -- ;
        }else {
            isFlag = false;
        }
    }

}

/**
 * 使用实现接口时，synchronized修饰的方法默认同步监视器时 this
 * 使用继承类时，synchronized  修饰的方法需要是静态，才提供唯一的同步监视器  .class对象
 *
 *
 * synchronized 的好处：
 *              解决了现成的安全问题
 *
 *              弊端：操作共享数据时候，串行执行代码，浪费资源
 */
