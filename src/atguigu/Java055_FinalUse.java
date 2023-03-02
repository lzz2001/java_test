package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 9:20
 */

public class Java055_FinalUse {
    public static void main(String... args) {

    }
}
class Test055{
    final int a;
    {a = 1;}
    void fun(final int a){
        System.out.println(a);
    }
}
/*
    final 最终的
    可以修饰 类，属性，方法
    修饰类时：被修饰的类不能有子类----------不需要扩充其功能  String
    修饰方法时：最终的方法，表明此方法不能被重写  Object中的getClass()
    修饰变量时：视之为常量
            final 声明一个属性
                    必须显示初始化，
                    或者代码块中赋值，
                    或者构造器中初始化（每一个构造器都要赋值）
           final 修饰一个局部变量 ---常量
                    修饰形参时，表示调用方法时，赋一个常量实参，只能调用不能修改
                        （如果实参是对象，对象内的非final 修饰的属性可以改变）

           static final  同时使用------只能修饰属性和方法
           属性（全局常量）



*/