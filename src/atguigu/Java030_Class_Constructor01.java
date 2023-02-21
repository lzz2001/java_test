package atguigu;

public class Java030_Class_Constructor01 {
    public static void main(String[] args) {


    }
}
class Java30_Person{
    int age;
    String name;
    // 构造器
//    public Java30_Person(){
//    }
    public Java30_Person(){
        age = 18;

    }
    public Java30_Person(int age){
    }
    public void eat(){
        System.out.println("eat ...");
    }
}
/*
    任何一个类都有构造器（构造方法）constructor
    如果没有显式的定义一个构造器，则系统默认提供一个空参的构造器（权限与此类的权限相同）
    定义构造器的格式，权限修饰符 类名（形参列表）{}
    可以定义多个构造器（重载），
    定义构造器之后，系统将不会提供默认无参的构造器


    构造器的作用：
        创建对象
        初始化成员属性


 */