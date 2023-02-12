package Day0128;

import java.util.Calendar;

public class JavaLongObject {
    public static void main(String[] args) {

//    Object obj2 = null;
//    obj2 = new Person();

//        Object obj1 = new Person();
//        String s = obj1.toString();
//        System.out.println(s);
//        Person person = new Person();
//        System.out.println(obj1.hashCode());
//        System.out.println(obj1.getClass());
//        System.out.println(obj1.getClass().getPackage());
        Person p1=new Person("");
        Person p2 = new Stu();
        Stu s1 = new Stu();
//        Stu s2 = new Person() ; 子类不能创建父类对象
//        int[][] a=new int[2][3];
//        System.out.println(a.length);
//        System.out.println(a[1].length);

//        Person[] person1 = {new Person("lisi"),new Person("wangwu"),new Person("zhaoliu")};
//        Stu[] stu1= {new Stu(),new Stu(),new Stu()};
//        for (Person stu : stu1) {
//            stu.test();

//        }
//        String a1 ="a";
//        String a = new String("a");
//        String b = new String("b");
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//        System.out.println(a.equals(a1));
//        System.out.println(a==a1);
        System.out.println(System.currentTimeMillis());
        Calendar instance = Calendar.getInstance();

    }
}
class Person{
    Person(String name){

    }

    public Person() {

    }

    void test(){
        System.out.println(1);
    }
}
class Stu extends Person{
    Stu()
    {
        super("");
    }
    void test(){
        System.out.println(2);
    }
}