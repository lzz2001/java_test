package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/25 20:40
 */

public class Java038_Class_Extend03 {
    public static void main(String[] args) {
        Cylinder038 cylin = new Cylinder038();
        cylin.setRadius(2.1);
        cylin.setLength(2);
        System.out.println(cylin.findVolume());

    }

}
// 根据下图实现类。在CylinderTest类中创建Cylinder类的对象，设置圆
//         柱的底面半径和高，并输出圆柱的体积。
class Circle038{
    private double radius;
    public Circle038(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }
}

class Cylinder038 extends Circle038{
    private double length;
    public Cylinder038 (){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * length;
    }
}

//        Cylinder (圆柱)
//        -length:double
//        Cylinder(): 构造器,将length属性初始化为1
//        +setLength(double length):void
//        +getLength():double
//        +findVolume() :double 计算圆柱体积