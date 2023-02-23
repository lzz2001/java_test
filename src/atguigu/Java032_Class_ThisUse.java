package atguigu;

public class Java032_Class_ThisUse {
}
class Java32_Boy{
//    Boy
//-name:String
//-age:int
//+setName(i: String)
//+getName(): String
//+setAge(i: int)
//+getAge(): int
//+marry(girl:Girl)
//+shout():void
    private String name;
    private int age;

    public Java32_Boy(){

    }
    public Java32_Boy(String name){
        this();
        this.name = name;
    }
    public Java32_Boy(int age){
        this();
        this.age = age;
    }
    public Java32_Boy(String name,int age){
        this(name);
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void marry(Java32_Girl girl){
        System.out.println("marry with "+ girl.getName());
    }
    public void shout(){

    }


}
class Java32_Girl{
//    Girl
//-name:String
//-age:int
//+setName(i: String)
//+getName(): String
//+marry(boy:Boy)
//+compare(girl:Girl)
    private String name;
    private int age;

    public Java32_Girl(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Java32_Boy boy){
        System.out.println("marry with "+boy.getName());
        boy.marry(this);
    }


    public int compare(Java32_Girl girl){
//        比较两个对象的大小
//        返回的是正数表示当前对象大，返回的是负数表示当前对象小
//        返回的为0表示两个对象相等

        return this.age - girl.getAge();

    }
}
/*
        添加必要的构造器，综合应用构造器的重载，this关键字。
        Boy
-name:String
-age:int
+setName(i: String)
+getName(): String
+setAge(i: int)
+getAge(): int
+marry(girl:Girl)
+shout():void

Girl
-name:String
-age:int
+setName(i: String)
+getName(): String
+marry(boy:Boy)
+compare(girl:Girl)
 */