package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/2 14:16
 */

public class Java064_InterfaceExer01 {
}
//定义一个接口用来实现两个对象的比较。
//        interface CompareObject{
//    public int compareTo(Object o); //若返回值是 0 , 代表相等; 若为正数，代表当
//    前对象大；负数代表当前对象小
//}
interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
    }
//        定义一个Circle类，声明radius属性，提供getter和setter方法
class Circle065 {
    private double radius;

    public Circle065(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
//        定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。
//        在ComparableCircle类中给出接口中方法compareTo的实现体，
//        用来比较两个圆的半径大小。
class ComparableCircle064 extends Circle065 implements CompareObject{

    public ComparableCircle064(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
        return 0;
        }
        if(o instanceof Circle065){
            Circle065 c = (Circle065) o;
            if(this.getRadius() > c.getRadius())
                return 1;
            else if (this.getRadius() < c.getRadius())
                return -1;
            else return 0;
        }
        else {
            return 0;
        }
    }
}
//        定义一个测试类InterfaceTest，创建两个ComparableCircle对象，
//        调用compareTo方法比较两个类的半径大小。
//        思 考 ： 参照上述做法定义矩形类 Rectangle 和 ComparableRectangle类，
//        在ComparableRectangle类中给出compareTo方法的实现，
//        比较两个矩形的面积大小。