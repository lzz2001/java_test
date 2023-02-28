package atguigu;

import java.util.Objects;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 8:59
 */

public class Java047_Class_ObjectUse {

}

//1.编写Order类，有int型的orderId，String型的orderName，相应的
//        getter()和setter()方法，两个参数的构造器，重写父类的equals()方法：
//public boolean equals(Object obj)，并判断测试类中创建的两个对象是否
//        相等。
class Order047{
    private int orderId;
    private String orderName;

    public Order047(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order047 order047 = (Order047) o;
        return orderId == order047.orderId && orderName.equals(order047.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}


//    2.请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖
//    equals方法，使其判断当两个MyDate类型对象的年月日都相同时，结果
//    为true，否则为false。 public boolean equals(Object o)
class MyDate047{
    private int day;
    private int month;
    private int year;

    public MyDate047(int day, int month, int year) {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyDate myDate = (MyDate) o;
//        return day == myDate.day && month == myDate.month && year == myDate.year;
//    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj instanceof MyDate047){
            MyDate047 my = (MyDate047) obj;
            return my.day == this.day && my.month == this.month && my.year == this.year;
        }
        return false;

    }
}

// 通常情况下，自定义的类要使用equals方法时，通长是比较两个对象的实体内容是否一样
//    我们就需要重写equals方法 ----仿照String的equals（）方法进行重写




/*
        Object 类是所有类的根父类
        如果声明未使用extends显式指明父类，则默认父类为java.lang.Object
        Object类中方法具有通用性，没有属性

        Object 只具有一个空参构造器
        clone 复制
        equals
        finalize 垃圾回收，通常不主动去调用，对象被回收之前，该对象调用的
        getClass()获得类名
        hashcode
        toString

        notify
        notifyAll
        wait



        面试题  final/finally/finalize()

        equals 比较两个对象是否相等
        == 和 equals的区别
        == 的使用： 是一个运算符，可以使用在基本数据类型变量和引用数据类型变量
                  如果比较的是基本数据类型的变量，，变量保存的数值相等返回true
                  如果比较的是引用数据类型的变量，比较的是两个对象的地址值是否相等
                                              两个引用是否指向同一个对象
        .equals(): 是一个方法，不是运算符 不能使用在基本数据类型之中
                Object类中定义 equals方法与==的作用一模一样


                String Date File 包装类 都重写了equals方法
                        都比较的是对象内部的属性是否相当

 */