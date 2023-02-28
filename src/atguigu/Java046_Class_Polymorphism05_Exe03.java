package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/27 12:35
 */

public class Java046_Class_Polymorphism05_Exe03 {

    public static void main(String[] args) {
        Java046_Class_Polymorphism05_Exe03 j = new Java046_Class_Polymorphism05_Exe03();
        j.displayGeometricObject(
                new Circle046(
                        "hong",12,3));

    }
    public void displayGeometricObject(GeometricObject046 g){
        System.out.println("面积："+g.findArea());
    }
    public boolean equalsArea(GeometricObject046 g1,GeometricObject046 g2){
        return  g1.findArea() == g2.findArea();
    }
}
//        定义三个类，父类GeometricObject代表几何形状，
//        子类Circle代表圆形，MyRectangle代表矩形。
//        定义一个测试类GeometricTest，
//        编写equalsArea方法测试两个对象的面积是否相等
//              （注意方法的参数类型，利用动态绑定技术），
//        编写displayGeometricObject方法显示对象的面积
//              （注意方法的参数类型，利用动态绑定技术）

class GeometricObject046 {
    protected String color;
    protected double weight;

    public GeometricObject046() {
    }

    protected GeometricObject046(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }

}

class Circle046 extends GeometricObject046 {
    private double radius;

    public Circle046(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }
}

class MyRectangle046 extends GeometricObject046 {
    private double width;
    private double height;

    public MyRectangle046(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}


/*
面试题：多态是运行时行为还是编译时行为？
Person p = new Student()
class Student extends Person{}
 */