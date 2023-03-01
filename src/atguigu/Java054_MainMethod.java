package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 8:08
 */

public class Java054_MainMethod {
    public static void main(String[] args) {

    }
}
class Main054{
    public static void main(String[] args) {
        for(int i = 0 ; i < args.length ;i++){
            System.out.println("888"+args[i]);
        }
    }
}

/*
        main方法作为程序的入口

        也可以作为一个普通的静态方法

        main方法的形参， 可以作为跟控制台交互的一种方式
        java Main054 88 89 89    参数()

        可以在多个类中都声明main函数

 */