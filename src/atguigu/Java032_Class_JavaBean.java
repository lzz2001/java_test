package atguigu;

public class Java032_Class_JavaBean {
}
/*
    JavaBean 是一种Java语言写成的可重用组件
        类是公共的
        有一个无参的构造函数
        有属性，且存在属性对应的get，set方法

       方便行为交互


       UML类图

       this的使用
           可以修饰属性，方法，构造器
            指向当前对象。或者当前正在创建的对象
            形参与成员属性同名时，显式使用，一般默认不写（胜略）

            this调用构造器， this()  this(a,b),
            构造器中调用构造器，（用this 显式调用指定其他构造器）
            能连续调用，但不能闭环调用
            this()调用语句必须在首行，并且只能调用一个

 */

