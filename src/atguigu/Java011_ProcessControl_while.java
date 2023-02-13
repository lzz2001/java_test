package atguigu;
import java.util.Scanner;
public class Java011_ProcessControl_while {
    public static void main(String[] args) {
        testForWhile08();
    }
    static void testForWhile(){}
    static void testForWhile08(){
//        3.一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。
//        编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
        int sum ,count = 0;
        boolean flag = false;
        for(int i = 1;i <= 1000;i++){
            sum = 0;
            for(int j = 1;j <= i/2;j++){
                if(i % j == 0){
                    //System.out.print(j);
                    sum += j;
                }
            }
            if(sum == i){
                System.out.print(sum + "\t");
                count++;
                flag = true;
            }
            if ((count % 6 == 0) && flag){
                System.out.println();
                flag = false;
            }

        }
    }
    static void testForWhile07(){
        //质数 100内重写-----懂与不懂,看了都是进步
        long start = System.currentTimeMillis();
        int count = 0;
        label:for (int i = 2;i < 100000;i++){
            for (int j = 2;j <= Math.sqrt(i);j++)
                if(i % j == 0){
                    continue label;
                }
            count ++;
        }
        System.out.println(count);
        System.out.println(System.currentTimeMillis()-start);


    }
    static void testForWhile06(){
//        100以内质数
        long start = System.currentTimeMillis();// 系统时间戳/ms
        int i,j,judge,count=0,flag=0;
        for (i = 2;i <= 100;i++){
            judge = (int)Math.sqrt(i) ;
            for (j = 2;j <= judge ;j++)
            {
                if (i % j == 0){
                    break;
                }
            }
            if(j > judge){
                //System.out.print(i+"\t");//输入输出影响算法效率
                count++;
                //flag = 1;
            }
//            if(count % 5 == 0 && flag == 1)
//                System.out.println();
//            flag = 0;
        }
        System.out.println("prime number count:"+count);
        System.out.println(System.currentTimeMillis()-start);
    }
    static void testForWhile05(){
//        九九乘法表
        int i,j;
        for (i = 1;i <= 9;i++ ){
            for (j = 1;j <= i;j++){
                System.out.print(i+" * "+j+" = "+i*j+"\t");
            }
            System.out.println();
        }
    }
    static void testForWhile04_(){
//        *
//        **
//        ***
//        ****
        int n = 5;
        for (int i = 1;i < n;i++){
            for (int j = 1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2;i < n ;i++){
            for (int j = 1; j <= n - i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//            *
//           ***
//          *****
//         *******
//        *********
//         *******
//          *****
//           ***
//            *
        for (int i = 1;i < n - 1;i ++){
            for(int j = 1;j <= n - i;j++){
                System.out.print("-");
            }
            for(int j = 1;j <= 2 * i;j++){
                System.out.print("*");
            }


            System.out.println();
        }

    }
    static void testForWhile03(){
//        从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
//                为0时结束程序
        Scanner sc = new Scanner(System.in);
        int positiveSum = 0;
        int negativeSum = 0;
        int num = 0;
        for (;(num = sc.nextInt()) != 0;) {
            if(num > 0){
                positiveSum++;
            }
            if(num < 0){
                negativeSum++;
            }
        }
        System.out.println("positive number sum "+positiveSum);
        System.out.println("negative number sum "+negativeSum);

//        int i = 0;
//        Scanner sc = new Scanner(System.in);
//        while((i = sc.nextInt()) != 0){
//            System.out.println("第"+i+"次输入");
//        }
    }
    static void testForWhile02(){
//        do_while练习
        int i = 0;
        do{
            if(0 == i % 2){
                System.out.println(i);
            }
            i++;
        }while (i <= 100);

    }
    static void testForWhile01(){
//        遍历100以内所有偶数
        int i = 0;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}


/*
while 循环：
    一定要避免死循环（迭代条件）
    while(1){
    2;
    3;
    }
    1 --> 2 --> 3 --> 2 --> 3 .......
    for和while可以相互转换


do_while  至少执行一次循环体
1
 do{
 2;
 3;
 }while(4)
 1,2,3,4,2,3,4,..........


 嵌套循环:
    将一个循环定义在另一个循环体中，（外循环，内循环）


long start = System.currentTimeMillis();// 系统时间戳/ms

    continue,默认跳过最靠近一层的单词循环
    break,默认结束最靠近的一层循环
    return 结束方法,顺便也能结束循环
    设置标签
    label:for(){
            for(){
                break label;//跳出双层循环
            }
        }

 */

