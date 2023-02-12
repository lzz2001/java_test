package atguigu;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Java008_ScannerUse {
    public static void main(String[] args) {
        // 如何从键盘获取不同的数据类型的变量
        // 导包 Java.util.Scanner
//        Scanner sc = new Scanner(System.in);
//
//        byte byte1 = sc.nextByte();
//        System.out.println(byte1);
//
//        short short1 = sc.nextShort();
//        System.out.println(short1);
//
//        int int1 = sc.nextInt();
//        System.out.println(int1);
//
//        long long1 = sc.nextLong();
//        System.out.println(long1);
//
//        // char 只能用字符串 scanner没有对应的方法
//        String gStr = sc.next();
//        char gStrChar = gStr.charAt(0);// 获取索引为0的字符
//        System.out.println(gStrChar);
//
//        float float1 = sc.nextFloat();
//        System.out.println(float1);
//
//        double double1 = sc.nextDouble();
//        System.out.println(double1);
//
//        boolean bool1 = sc.nextBoolean();
//        System.out.println(bool1);
//
//        String str1 = sc.next();
//        System.out.println(str1);
//      如果输入的类型与要求数据类型不匹配时,
//      抛出异常            java.util.InputMismatchException


//        Scanner sc1 = new Scanner(System.in);
//        String s = sc.next();
//        System.out.println(s);
//        sc.close();// 一旦关闭,无法重新创建对象
//                      再次使用抛出异常 java.lang.IllegalStateException

        Java008_TestOnClass02 java = new Java008_TestOnClass02();
        java.answer();


    }
}

class Java008_TestOnClass01{
    void answer(){
//        岳小鹏参加Java考试，他和父亲岳不群达成承诺：
//        如果：
//        成绩为100分时，奖励一辆BMW；
//        成绩为(80，99]时，奖励一台iphone xs max；
//        当成绩为[60,80]时，奖励一个 iPad；
//        其它时，什么奖励也没有。
//        请从键盘输入岳小鹏的期末成绩，并加以判断
        Scanner sc = new Scanner(System.in);
        double scoreForJava = sc.nextDouble();
        if(scoreForJava == 100 ){
            System.out.println("奖励BMW一辆"); // BMW <--> MSN
        }else if(scoreForJava > 80 && scoreForJava <= 99) {
            System.out.println("奖励一台iphone xs max");
        } else if(scoreForJava <= 80 && scoreForJava >= 60){
            System.out.println("奖励一个 iPad");
        }else {
            System.out.println("noting");
        }
    }
}
class Java008_TestOnClass02 {
    void answer() {
//       编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
//              对它们进行排序(使用 if-else if-else),并且从小到大输出。
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("请输入第一个整数");
        num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        num3 = sc.nextInt();
        int max = 0, mid = 0, min = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    max = num1;mid = num2;min = num3;
                } else {
                    max = num1;mid = num3;min = num2;
                }
            }else{
                max = num3;mid = num1; min = num2;
            }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    max = num2;mid = num1;min = num3;
                } else {
                    max = num2;mid = num3;min = num1;
                }
            }else{
                max = num3;mid = num2;min = num1;
            }
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);



    }
}




/*


 */

