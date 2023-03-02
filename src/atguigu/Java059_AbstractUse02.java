package atguigu;

import javax.security.sasl.SaslServer;
import java.util.Scanner;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 15:58
 */

public class Java059_AbstractUse02 {

}


//        编写工资系统，实现不同类型员工(多态)的按月发放工资。如果当月出现某个
//        Employee对象的生日，则将该雇员的工资增加100元。
//        实验说明：
//        （1）定义一个Employee类，该类包含：
//        private成员变量name,number,birthday，
//        其中birthday 为MyDate类的对象；
//        abstract方法earnings()；
//        toString()方法输出对象的name,number和birthday。


abstract class Employee059{
    private String name;
    private int number;
    private MyDate059 birthday;

    public Employee059(String name, int number, MyDate059 birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate059 getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate059 birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString();
    }
}
//        （2）MyDate类包含:
//        private成员变量year,month,day ；
//        toDateString()方法返回日期对应的字符串：xxxx年xx月xx日
class MyDate059{
    private int day;
    private int month;
    private int year;

    public MyDate059(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toDateString() {
        return
                "day=" + day +
                "年" + month +
                "月=" + year +
                '日';
    }
}

//        （3）定义SalariedEmployee类继承Employee类，
//        实现按月计算工资的员工处
//        理。该类包括：private成员变量monthlySalary；
//        实现父类的抽象方法earnings(),
//        该方法返回monthlySalary值；
//        toString()方法输
//        出员工类型信息及员工的name，number,birthday
class SalariedEmployee extends Employee059{
    private double monthSalary;

    public SalariedEmployee(String name, int number, MyDate059 birthday) {
        super(name, number, birthday);
    }
    public SalariedEmployee(String name, int number, MyDate059 birthday,double monthSalary) {
        super(name, number, birthday);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double earnings() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                '}';
    }
}
//        （4）参照SalariedEmployee类定义HourlyEmployee类，
//        实现按小时计算工资的员工处理。
//        该类包括：
//            private成员变量wage和hour；
//            实现父类的抽象方法earnings(),该方法返回wage*hour值；
//            toString()方法输出员工类型信息及员工的name，number,birthday。
class HourlyEmployee059 extends Employee059{

    private int wage;
    private int hour;

    public HourlyEmployee059(String name, int number, MyDate059 birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee059(String name, int number, MyDate059 birthday,int wage, int hour) {
        this(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee059{" +
                super.toString() +
                '}';
    }
}

//        （5）定义 PayrollSystem 类 ，创建Employee变量数组并初始化，
//        该数组存放各类雇员对象的引用。
//        利用循环结构遍历数组元素，输出各个对象的类型,
//        name,number,birthday,以及该对象生日。
//        当键盘输入本月月份值时，如果本月是某个Employee对象的生日，
//        还要输出增加工资信息。
class PayrollSystem059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        Employee059[] emps = new Employee059[2];
        emps[0] = new SalariedEmployee("马森",1002,new MyDate059(28,2,1992),1000);
        emps[1] = new HourlyEmployee059("pan",2001,new MyDate059(6,5,1991),60,240);
        for (int i = 0 ; i < emps.length; i++){
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为："+salary);
            if(emps[i].getBirthday().getMonth() == month){
                System.out.println("生日快乐 奖励一百元");
            }
        }

    }
}

//        提示：
//        //定义People类型的数组People c1[]=new People[10];
////数组元素赋值
//        c1[0]=new People("John","0001",20);
//        c1[1]=new People("Bob","0002",19);
////若People有两个子类Student和Officer，则数组元素赋值时，可以使父类类型的数组元素指向子类。
//        c1[0]=new Student("John","0001",20,85.0);
//        c1[1]=new Officer("Bob","0002",19,90.5)