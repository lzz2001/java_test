package atguigu;

public class Java031_Class_Constructor02 {
}
//    3.编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底
//    边长base和高height，同时声明公共方法访问私有变量。此外，提供类
//    必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。


class Java31_TriAngle{
    private int base;
    private int height;

    public Java31_TriAngle(){

    }
    public Java31_TriAngle(int base){
        this.base = base;
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

//        (1)定义Student类,有4个属性：
//        String name;
//        int age;
//        String school;
//        String major;
//        (2)定义Student类的3个构造器:
//        第一个构造器Student(String n, int a)设置类的name和age属性；
//        第二个构造器Student(String n, int a, String s)设置类的name, age 和school属性；
//        第三个构造器Student(String n, int a, String s, String m)设置类的name, age ,school和major属性；
//        (3)在main方法中分别调用不同的构造器创建的对象，并输出其属性值。
class Java31_Student{
    String name;
    int age;
    String school;
    String major;
    Java31_Student(){
    }
    Java31_Student(String name,int age){

    }
    Java31_Student(String name,int age,String school){

    }


}



/*
 总结属性赋值的过程；
        1.默认初始化值
        2.显式初始化
        3.构造器赋值
                        以上叫初始化，只执行一次
        4.对象.方法
        先后顺序是： 1 - 2 - 3 - 4
 */









