package atguigu;

import java.util.Scanner;

public class Java010_ProcessControl_for {
    public static void main(String[] args) {
        testForUse05();
    }

    static void testForUse(){}
    static void testForUse06(){
//        3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
//        字立方和等于其本身。
//        例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

    }
    static void testForUse05(){
//        题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
//        比如：12和20的最大公约数是4，最小公倍数是60。
        Scanner sc = new Scanner(System.in);
        int m,n,min,i;
        System.out.println("please input first number:");
        m = sc.nextInt();
        System.out.println("please input second number:");
        n = sc.nextInt();
        min = (m > n)?n:m;
        for (i =min;i>=1;i--){
            if(m % i == 0 && n % i ==0 ){
                System.out.println("the greatest common divisor is "+ i);
                break;
            }
        }
        System.out.println("lowest common multiple is "+(m*n/i));
        int max = (m > n) ? m : n;
        for (i = max;i <= m*n;i++){
            if(i % m == 0 && i % n == 0){
                System.out.println("lowest common multiple is "+ i);
                break;
            }
        }
        // 辗转相除
        // 更相减损术
    }
    static void testForUse04(){

        int a=0,b=0,c=0;
        if(a != b){
            c = a;
        }else{
            c = b;
        }
        // c = a
    }
    static void testForUse03(){
//        编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行
//        上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印
//        输出“baz”
        for (int i = 1;i <= 150;i++ ){
            System.out.print(i + "\t");
            if(i % 3 == 0){
                System.out.print("foo\t");
            }
            if(i % 5 == 0){
                System.out.print("biz\t");
            }
            if(i % 7 == 0){
                System.out.print("baz\t");
            }
            System.out.println();
        }
    }
    static void testForUse02(){
//        遍历一百以内所有偶数
        int sum=0;
        for (int i = 2;i<=100;i+=2){
            System.out.print(i+"\t");
            sum += i;
            if(i%10==0) System.out.println();
        }
        System.out.println(sum);
    }
    static void testForUse01(){
//        for(int i = 0;i<5;i++){
//            System.out.println(i+1);
//        }

        int num=1;
        for(System.out.print("a");num<=3; System.out.print("c"),num++){
            System.out.print("b");
        }
    }

}



/*
        循环结构:
                for while do_while
          4要素 1初始化----2循环条件(boolean)----3循环体----4迭代部分
                for(1;2;4){
                    3
                }
                1->2->3->4->2->3->4->2->3->4.....

                退出循环：不满足循环条件
                    break;
 */

