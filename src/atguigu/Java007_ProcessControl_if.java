package atguigu;

import java.time.format.TextStyle;
import java.util.Scanner;

public class Java007_ProcessControl_if {
    public static void main(String[] args) {
//        关于if的使用------条件判断
//        三种

//        int heartBeats = 79;
////        1.
//        if ( heartBeats > 100 || heartBeats < 60 ) {
//            System.out.println(" check again ");
//        }
//
//        int age = 23;
////        2.
//        if ( age > 18 ) {
//            System.out.println("adult movies");
//        } else {
//            System.out.println(" cartoon ");
//        }
//
////        3.
//        if ( age < 0 ) {
//            System.out.println(" illegal data ");
//        } else if ( age < 18 ) {
//            System.out.println(" young bog ");
//        } else if ( age < 35 ){
//            System.out.println(" prime of life ");
//        } else if ( age < 60 ){
//            System.out.println(" mid-life ");
//        }else {
//            System.out.println(" old age ");
//        }

//          ---------------练习---------------------
//        定义三个int型变量并赋值，使用三元运算符或者if-else
//        获取这三个数中的较大数的实现

//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int max = (a > b) ? a : b;
//        max = (max > c) ? max : c;
//        System.out.println(max);
//
//        if(a > b && a > c){
//            max = a;
//        }else if( b > a && b > c){
//            max = b;
//        }else if( c > a && c > b){
//            max = c;
//        }
//        System.out.println(max);


//       编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，
//       且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。

//        double dou1 = 20.0;
//        double dou2 = 10.0;
//        if( dou1 > 10.0 && dou2 < 20.0){
//            System.out.println(dou1 + dou2);
//        }else {
//            System.out.println(dou1 * dou2);
//        }

//        交换两个变量值的代码的实现

//        1.输出结果   else与最近的一个未匹配的if配对
//        int m=0,n=3;
//        if(m>0)
//            if(n>2)
//                System.out.println("A");
//            else
//                System.out.println("B");


        TestIfTile0 t = new TestIfTile0();
        t.answer();
    }
}


class TestIfTile0{
//    大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出
//    一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
//             如果这三个条件同时满足，则：“我一定要嫁给他!!!”
//             如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
//             如果三个条件都不满足，则：“不嫁！”
//    Sysout(“身高: (cm))
//            scanner.nextInt();
//    Sysout(“财富: (千万))
//            scanner.nextDouble();
//    Sysout(“帅否: (true/false)) (是/否)
//            scanner.nextBoolean(); scanner.next(); “是”.equals(str)
    void answer(){
        Scanner sc = new Scanner(System.in);
        int height = 0;
        double fortune = 0;
        boolean handsome = false;
        System.out.println("身高: (cm)");
        height = sc.nextInt();
        System.out.println("财富: (千万)");
        fortune = sc.nextDouble();
        System.out.println("帅否: (true/false)");
        handsome = sc.nextBoolean();

        if(height > 180 && fortune >= 1 && handsome){
            System.out.println("我一定要嫁给他!!!");
        }else if(height > 180 || fortune > 1 || handsome){
            System.out.println("嫁吧，比上不足，比下有余");
        }else {
            System.out.println("不嫁！");
        }

//        System.out.println("是否帅?(是/否)");
//        String isHandsome = "";
//        isHandsome = sc.next();
//        if(isHandsome.equals("是")){
//            handsome = true;
//        }

    }
}
class TestIfTile00{
//    假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
//    一个两位数，然后按照下面的规则判定用户是否能赢。
//         1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//         2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//         3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//         4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//         5)如果用户输入的数字没有匹配任何一个数字，则彩票作废
//    提示：使用(int)(Math.random() * 90 + 10)产生随机数。
//        Math.random() : [0,1) * 90 [0,90) + 10 [10,100)  [10,99]
    void answer(){
        int targetNum = (int)(Math.random() * 90 +10);

        System.out.println(targetNum);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个两位整数");
        int userNum = sc.nextInt();
        int userNumDecade = userNum/10;
        int userNumByte = userNum%10;
        int targetNumDecade = targetNum/10;
        int targetNumByte = targetNum%10;
        if(userNum == targetNum){
            System.out.println("奖金10 000美元");
        }else if(userNumDecade == targetNumByte && userNumByte == targetNumByte){
            System.out.println("奖金 3 000美元。");
        }else if(userNumDecade == targetNumDecade || userNumByte == targetNumByte){
            System.out.println("奖金1 000美元");
        }else if(userNumDecade == targetNumByte || userNumByte == targetNumDecade){
            System.out.println("奖金500美元");
        } else{
            System.out.println("彩票作废");
        }
    }
}
class TestIfTile01{

//    3) 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
//    一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
//    相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
//    编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人
//    类的年龄。如果用户输入负数，请显示一个提示信息。
    void answer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入狗的年龄");
        int ageForDog = sc.nextInt();
        int peopleAge = 0;
        if(ageForDog < 0){
            System.out.println("您输入的年龄不合法");
        }else if(ageForDog <= 2){
            peopleAge = (int)(ageForDog * 10.5);
        }else {
            peopleAge = (int)(2*10.5+(ageForDog-2)*4);
        }
        System.out.println("狗"+ageForDog+"岁,相当于人"+peopleAge+"岁");

    }

}
class TestIfTile02{
//     2.实现对三个整数进行排序，输出时按照从小到大的顺序输出。
    void answer(){
        int num1 = 3;
        int num2 = 2;
        int num3 = 1;
        if(num1 > num2){
            if(num3 > num1){
                System.out.println(num2+" < "+num1+" < "+num3);
            }else if(num3 < num2){
                System.out.println(num3+" < "+num2+" < "+num1);
            }else {
                System.out.println(num2+" < "+num3+" < "+num1);
            }
        }else {
            if(num3 > num2){
                System.out.println(num1+" < "+num2+" < "+num3);
            }else if(num3 < num1){
                System.out.println(num3+" < "+num1+" < "+num2);
            }else {
                System.out.println(num1+" < "+num3+" < "+num2);
            }
        }
    }
}
class TestIfTile03{
    void answer(){
//        3.编写程序，从键盘接收整数参数。如果该数为 1~7，
//        打印对应的星期值，否则打印“非法参数”
    }
}
class TestIfTile04{
    //        4.从键盘分别输入年、月、日，判断这一天是当年的第几天
    void answer(){

    }
}
class testIfTile05{
    void answer(){
//        05.编写程序，判断给定的某个年份是否是闰年
//        闰年的判断规则如下：
//      （1）若某个年份能被4整除但不能被100整除，则是闰年。
//      （2）若某个年份能被400整除，则也是闰年。
    }
}
class testIfTile06{
    void answer(){
//        要求用户输入两个数a和b，如果a能被b整除或者a加b大于1000，
//        则输出a；否则输出b。
    }
}
class testIfTile07{
    void answer(){
//        使用条件结构实现，如果用户名等于字符‘青’，
//        密码等于数字‘123’，就输出“欢迎你，青”，
//        否则就输出“对不起，你不是青”。
    }
}
class testIfTile08{
    void answer(){
//        编写程序：从键盘上读入一个学生成绩，存放在变量score中，
//        根据score的值输出其对应的成绩等级：
//        score>=90           等级：A
//        70=<score<90        等级：B
//        60=<score<70        等级：C
//        score<60            等级：D
//
        }
}
class testIfTile09{
    void answer(){
//        根据指定月份，打印该月份所属的季节。
        }
}
class testIfTile10{
    void answer(){
//        求ax2+bx+c=0方程的根。
//        求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，
//        如果a≠0，那么：
//       （1）当b2-4ac>0，则有两个解；
//       （2）当b2-4ac=0，则有一个解；
//       （3）当b2-4ac<0，则无解；
//           如果a=0,b≠0，那么，x=-(c/b)
//        提示1：Math.sqrt(num);  sqrt指平方根
//          求x2-4x+1=0方程的根
//           求x2-2x+1=0方程的根

        }
}
class testIfTile11{
    void answer(){
//        彩票游戏
//        假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，
//        然后按照下面的规则判定用户是否能赢。
//
//        1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
//
//        提示：使用Math.random() 产生随机数
//        Math.random() 产生[0,1)范围的随机值
//        Math.random() * 90：[0,90)
//        Math.random() * 90 + 10：[10,100) 即得到  [10,99]
//        使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数。

        }
}
class testIfTile12{
    void answer(){
//        赌数游戏
//        提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
//        如果三个骰子点数和，小于或等于9，则为“小”。
//        如果三个骰子点数和，大于9，则为“大”。
//        用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
        }
}
class testIfTile13{
    void answer(){
//        生肖问题
//        编写一个程序，为一个给定的年份找出其对应的中国生肖。
//        中国的生肖基于12年一个周期，每年用一个动物代表：
//        rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、
//        horse（马）、sheep（羊）、monkey（候）、rooster（鸡）、dog（狗）、pig（猪）。
//        提示：2019年：猪   2019 % 12 == 3

    }
}
class testIfTile14{
    void answer() {
//        下面程序片段的输出结果是？
        int a = 3;
        int b = 1;
        if (a == b) {// if(a = b)
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");

        }
    }
}
class testIfTile15{
    void answer(){
//        What is the result when you compile and run the following code?


                for(int i = 0; i < 3; i++) {
                    System.out.print(i);
                }
                // System.out.print(i); // 报错了,局部变量问题
            }
}





class testIfTile16{
    void answer(){

        }
}
class testIfTile17___{
    void answer(){

        }
}
class testIfTile18{
    void answer(){

        }
}
class testIfTile19{
    void answer(){

        }
}


/*
   流程控制
        顺序
        分支
            if () {}
            if () {} else {}
            if () {} else if () {} else

        循环

 */

/*
    获取随机数
         Math.random()  ---> 获取一个double  [0,1)
         配范围  [m,n]    Math.random() * (n+1-m) + m
 */