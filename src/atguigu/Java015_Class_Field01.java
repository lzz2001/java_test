package atguigu;

public class Java015_Class_Field01 {
    public static void main(String[] args) {
//        创建类的对象
        Person person = new Person();
//        调用属性和方法
        person.name = "Tom";
        person.age = 12 ;
        person.isMale = true;
        System.out.println(person.name);

        person.eat();
        person.sleep();

        Person person1 = new Person();
        System.out.println(person1.name);
        Person person2 = person;
        person2.age = 10;
        System.out.println(person2.age);

    }

}

class Person{
//    属性
    String name;
    int age;
    boolean isMale;

//    方法
    void eat(){
        System.out.println("吃饭");
    }
    void sleep(){
        System.out.println("睡觉");
    }
}



/*
    设计类的方法：
        属性 = 成员变量
        方法 = 函数

    落地使用：创建类，设计成员
            创建类对象
            通过 对象.属性，对象.方法-》调用对象的结构

     如果创建了一个类的（new）多个对象，每个对象都有一套单独的属性
     除static修饰以外的成员

 */