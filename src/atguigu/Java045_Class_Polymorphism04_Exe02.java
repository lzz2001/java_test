package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/27 12:07
 */

public class Java045_Class_Polymorphism04_Exe02 {
//    建立InstanceTest 类，在类中定义方法
//    method(Person e);
//    在method中:
//            (1)根据e的类型调用相应类的getInfo()方法。
//            (2)根据e的类型执行：
//    如果e为Person类的对象，输出：
//            “a person”;
//    如果e为Student类的对象，输出：
//            “a student”
//            “a person ”
//    如果e为Graduate类的对象，输出：
//            “a graduated student”
//            “a student”
//            “a person”
public static void main(String[] args) {
    Graduate045 g = new Graduate045();
    Java045_Class_Polymorphism04_Exe02 j = new Java045_Class_Polymorphism04_Exe02();
    j.method01( new Graduate045() );
}

    public void method(Person045 p){
        System.out.println(p.getInfo());
    }
    public void method01(Person045 p){
        if(p instanceof Graduate045){
//            System.out.println(p.getInfo());
            System.out.println("a graduate student");
        }
        if(p instanceof Student045){
//            System.out.println(p.getInfo());
            System.out.println("a student");
        }
        if(p instanceof Person045){
//            System.out.println(p.getInfo());
            System.out.println("a person");
        }
    }
}

class Person045 {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student045 extends Person045 {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate045 extends Student045 {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}