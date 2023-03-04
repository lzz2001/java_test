package atguigu;

/**
 * ClassName:Java071_EnumUse
 * Package:atguigu
 * Description:
 *
 * @Author:
 * @Create:2023/3/4,15:25
 * @Version:
 */

public class Java071_EnumUse {
    @org.junit.Test
    public void jdk5Front() {
        System.out.println(Season.SPRING.toString());
    }

    @org.junit.Test
    public void behindJdk5() {
        System.out.println(Season1.SPRING.getClass());
        System.out.println(Season1.SPRING.getClass().getSuperclass());
//        Enum下的方法
//        1.toString
        System.out.println(Season1.WINTER.toString());
        System.out.println();
//        2.name
        System.out.println(Season1.WINTER.name());
        System.out.println();
//        3.values
        Season1[] values = Season1.values();
        System.out.println(values);
        int i = 0;
        for (; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println();
//        4.valueOf------------返回名称为 name的对象，没有则报错
        System.out.println(Season1.valueOf("SPRING"));
        System.out.println();
//        5.ordinal  -------  返回 声明的对象 在数组中的索引
        System.out.println(Season1.AUTUMN.ordinal());

    }
}

/**
 * @description:jdk5.0之前的定义枚举类方法
 */
class Season {
    //    声明当前类的实例变量
    private final String SEASONNAME;
    private final String SEASONDESC;

    //        私有化类的构造器
    private Season(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }

    public String getSeasonName() {
        return SEASONNAME;
    }

    public String getSeasonDesc() {

        return SEASONDESC;
    }

    //    创建当前实例对象
    public static final Season SPRING = new Season("Spring", "春暖花开");
    public static final Season SUMMER = new Season("Summer", "夏日炎炎");
    public static final Season AUTUMN = new Season("Autumn", "秋高气爽");
    public static final Season WINTER = new Season("Winter", "冬日凉凉");

    @Override
    public String toString() {
        return "Season{" +
                "SEASONNAME='" + SEASONNAME + '\'' +
                ", SEASONDESC='" + SEASONDESC + '\'' +
                '}';
    }
}

interface Info071{
    void show();
}
/**
 * @description:jdk 5.0 之后的声明方式
 * 只能默认继承java.lang.Enum类不能显示定义其父类
 */
enum Season1 implements Info071{
    //  枚举名字 （参数） 逗号隔开
    SPRING("Spring", "春暖花开"){
        public void show(){
            System.out.println("春天好");
        }
    },
    SUMMER("Summer", "夏日炎炎"){
        public void show(){
            System.out.println("夏天好");
        }
    },
    AUTUMN("Autumn", "秋高气爽"){
        public void show(){
            System.out.println("秋天好");
        }
    },
    WINTER("Winter", "冬日凉凉");

    private final String SEASONNAME;
    private final String SEASONDESC;

    //        私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }

    public String getSeasonName() {
        return SEASONNAME;
    }

    public String getSeasonDesc() {

        return SEASONDESC;
    }
    public void show(){
        System.out.println("季节好");
    }
}







/*
        枚举类型：   jdk5之前如何实现
                    jdk5 之后如何实现
            继承的父类的方法

            可以继承接口
                1.枚举类中重写：每个枚举对象的重写方法一样

                2.每个对象相应的重写：每个枚举对象实现的接口方法不一样
 */

