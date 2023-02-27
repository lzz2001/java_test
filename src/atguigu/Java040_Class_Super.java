package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/26 20:46
 */

public class Java040_Class_Super {

}
/*

 */
class Person040{
    public int max(int a){
        return a;
    }
}

class Student040 extends Person040{
    @Override
    public int max(int a) {
        return super.max(a);
    }
    public int max(int a,int b){
        return a;
    }

}


/*
        super 一般是父类与子类出现相同属性名是显式调用
                被重写的父类方法需要显式调用
              一个构造器中this形参列表和super形参列表
              ：所有的构造方法，都没有显式的调用时，默认的是super（）
              通过子类的构造器创建子类对象时，会一直调用父类的构造器，直到
              Object类为止，但是只有一个对象被创建---为new的子类对象
 */
