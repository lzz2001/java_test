package atguigu;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 11:26
 */

public class Java050_Class_PackageClass {

    @org.junit.Test
    public void test7(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true  -128 - 127 常用数字
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

    }

    //面试题
    @org.junit.Test
    public void test6(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);// 1.0

        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);// 1
    }

//    String类型转化到（包装类或者基本数据类型）
//    调用包装类的Parsexxx方法
    @org.junit.Test
    public void test5(){
        String s = "123";
        // 1.
        int i = new Integer(s);
        // 2.
        int i1 = Integer.parseInt(s);

    }

//    基本数据类型和包装类如何转化成String类型
    @org.junit.Test
    public void test4(){
        int num = 2;
        // 1.
        String s1 = num + "";
        // 2.
        String s2 = String.valueOf(num);
    }

//jdk 5.0 自动装箱与拆箱
    @org.junit.Test
    public void test3(){
        int i = 1;
        method(i);//自动装箱

        Integer i1 = new Integer(12);
        int i2 = i1; // 自动拆箱
    }
    public void method(Object obj){
        System.out.println(obj);
    }
//    包装类转化为基本数据类型
    @org.junit.Test
    public void test2(){
        Integer integer = new Integer(12);
        int i = integer.intValue();
        System.out.println(i + 1);

        Float aFloat = new Float(12.2F);
        float v = aFloat.floatValue();
        System.out.println(v + 1);
    }
//    基本数据类型转化为包装类
    @org.junit.Test
    public void test1(){
        int num = 10;
        Integer integer = new Integer(num);
        System.out.println(integer);

        Integer integer1 = new Integer("123");
        System.out.println(integer1.toString());
//        Integer integer2 = new Integer("123abc");
//        System.out.println(integer2.toString());

        Boolean true123abc = new Boolean("true123abc");
        System.out.println(true123abc);//false,不报错

    }
}

/*
    Wrapper
        包装类：为了让基本数据类型更好的具有类的特征，完善面向对象
        Byte Short Integer Long Float Double Boolean Character
        byte short int     long float double boolean char
        数值型的 继承于 Number类

        如何相互转换 基本数据类型 - 包装类 - String


        注意：包装类作为属性是默认值是null

        自动装箱与自动拆箱，不需要手动的new包装类

        包装类中定义了 Integer 内部定义了IntegerCache 缓存保存了从 -128 ~ 127
        范围的整数，如果使用自动装箱的方式，创建包装类，该范围中的元素不会再new了，并且不会销毁
        提高效率


 */










