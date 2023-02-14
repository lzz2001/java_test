
package atguigu;

public class Java020_Class_Function03_Test {
    public static void main(String[] args) {
        Java020_Class_Function03_Test j =new Java020_Class_Function03_Test();
        j.method();
        int area1 = j.method2();
        System.out.println(area1);
        System.out.println(j.method3(8,10));
    }
//        3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，
//        在main方法中调用该方法。
    public void method(){
        for(int i = 0;i < 8;i++){
            for(int j = 0;j < 10;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
//        3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再
//        计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，
//        接收返回的面积值并打印。
    public int method2(){
        for(int i = 0;i < 8;i++){
            System.out.println("**********");
        }
        return 10 * 8;
    }
//        3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个
//        m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法
//        中调用该方法，接收返回的面积值并打印。
    public int method3(int row,int line){
        for(int i = 0;i < row;i++){
            for (int j = 0;j < line;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        return row * line;
    }
}
