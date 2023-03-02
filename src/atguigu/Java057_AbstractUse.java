package atguigu;

import com.sun.xml.internal.ws.server.ServerRtException;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 11:12
 */

public class Java057_AbstractUse {
    public static void main(String[] args) {
//        抽象类的匿名子类
        method(new Manager057("li",101,200,300){
            @Override
            public void work() {
                System.out.println("匿名对象");
            }
        });

        Employee057 e = new Employee057("li",101,200) {
            @Override
            public void work() {
                System.out.println("匿名子类");
            }
        };


    }
    public static void method(Employee057 e){
        e.work();
    }

}
//        编写一个Employee类，声明为抽象类，
//        包含如下三个属性：name，id，salary。
abstract class Employee057{
    private String name;
    private int id;
    private double salary;

    public Employee057(String name,int id,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
    //        提供必要的构造器和抽象方法：work()。
    public abstract void work();
}


//        对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
class Manager057 extends Employee057{
    private double bonus;

    public Manager057(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行效率");
    }
}
//        请使用继承的思想，设计 CommonEmployee 类和Manager类，要求类
class CommonEmployee057 extends Employee057{

    public CommonEmployee057(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {

    }
}
//        中提供必要的方法进行属性访问