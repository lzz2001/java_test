package atguigu;
/*
    根据面向对象编程方法，设计类Circle
        计算圆面积

 */
public class Java019_Class_Function03_Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3);
        System.out.println(c1.getRadius());
        System.out.println(c1.getAcreage());
    }
}
class Circle{
    private double radius;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getAcreage(){
        return radius * radius * Math.PI;
    }
}