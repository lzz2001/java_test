package atguigu;
/**
 * ClassName:Java075_Thread02
 * Package:atguigu
 * Description:
 *
 * @Author:
 * @Create:2023/3/5,12:39
 * @Version:
 */

public class Java075_Thread02 {
    public static void main(String[] args) {
        Thread t = null;
    }
}
/**
 *  构造器可以设置线程的名字
 *       public Thread()
 *       public Thread(Runnable target)
 *       public Thread(String name)
 *       public Thread(Runnable target,String name)
 *
 *      start()
 *      run()
 *      currentThread() //获取当前线程 静态
 *      getName()
 *      setName()
 *      sleep() 静态    参数是毫秒为单位     睡眠指定毫秒数
 *      yield() 静态方法      主动释放CPU执行权
 *      join()    在线程A中通过线程b调用join ，意味着a进入阻塞状态
 *                直到线程b执行结束后，线程a才继续执行
 *      isAlive()  判断线程是否存活
 *
 *      过时方法
 *      stop()  强行结束一个线程
 *      suspend() / resume()   暂停和回复，   可能在成死锁
 *
 *
 *      线程的优先级：
 *      getPriority()
 *         默认优先级---三个优先级常量，MAX_PRIORITY(10),MIN_PRIORITY(1),NORM_PRIORITY(5)
 *         Thread中的三个常量
 *      setPriority()       -----------优先级大小，执行依然是交互执行
 *
 *      生命周期：
 *          1.5之前：      5种状态
 *                 （join，sleep，失去同步锁，wait）【时间到了】或者notify，notifyAll,resume
 *                                阻塞()                阻塞  join，sleep，失去同步锁，wait,suspend
 *                                 |                     |
 *              新建  --start->  就绪  --获取CPU->        运行 --run执行结束-> 死亡(最终状态)
 *                                   <-失去CPU--             --stop      ->
 *                                   <-yield--         --出现了未被处理的异常->
 *
 *
 *          jdk5 之后     Status(内部类)----NEW,RUNNABLE,
 *                      BLOCKED,WAITING,TIMED_WAITING,
 *                      TERMINAL
 *
 *
 *
 */