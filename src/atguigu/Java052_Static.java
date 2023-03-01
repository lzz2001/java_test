package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 12:47
 */

public class Java052_Static {
    public static void main(String[] args) {
        Account052 acc1 = new Account052();
        Account052 acc2 = new Account052("123",2000);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
//        编写一个类实现银行账户的概念，包含的属性有“帐号”、“密
//        码”、“存款余额”、“利率”、“最小余额”，定义封装这些
//        属性的方法。账号要自动生成。
//        编写主类，使用银行账户类，输入、输出3个储户的上述信息。
//        考虑：哪些属性可以设计成static属性。

class Account052{
    private String id;
    private String password;
    private double balance;
    private static double rate;
    private static double minBalance;

    private static int num = 1001;

    public Account052() {
        id = String.valueOf(num);
        num++;
    }
    public Account052( String password, double balance ) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account052.rate = rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account052.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account052{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}












/*
    某些特定的数据在内存中只有一份 static 进行修饰
    static 修饰的变量不归某一个对象所有----静态的
    主要修饰类的结构：属性，方法，代码块，内部类

    static 修饰属性 静态变量 ------加不加的区别
    不加 ： new出对象时 其属性是自己的，修改后不会影响其他对象的属性（非静态属性【实例变量】）
    加： 修改后所有的对象，该属性都会改变 【多个对象都共享同一个静态变量】（静态属性【类变量】）
        静态变量随着类的加载而加载
        静态变量的加载早于对象的加载（并且直接加载一次，意味着类变量也只存在一份）
        存在方法去的静态域中，，，可以使用   类.变量名  调用

    什么时候适合使用静态变量：
        举例：System.out     Math.PI
        通常工具类中的方法都是静态方法

    方法区：类加载的信息，静态域，常量池

        静态方法：
            使用static 修饰的方法
            随着类的加载而加载，  用 类名.方法名调用
            静态的方法中只能调用静态的方法和属性
            非静态方法中可以调用静态方法和非静态方法

     static   修饰的方法中：不能使用this super关键字
            静态的属性前，省略的是类名
            静态的方法和属性  从生命周期角度去理解

      常量一般也是static修饰








 */