package atguigu;

import java.util.Scanner;

public class Java009_ProcessControl_switch {
    public static void main(String[] args) {
        TestSwitch07.answer();
    }
}
class TestSwitch10{
//
}
class TestSwitch07{
//编写程序：从键盘上输入"year" “month”和“day”，要求通过程序
//   输出输入的日期为year年的第几天。
    static void answer(){
        int year,month,day;
        Scanner sc = new Scanner(System.in);
        System.out.println("please input year");
        year = sc.nextInt();
        System.out.println("please input month");
        month = sc.nextInt();
        System.out.println("please input day");
        day = sc.nextInt();
        int dayOfYear = 0;
        int flag = 0;
        if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)){
            flag = 1;
        }
        switch (month-1){
            case 11:
                dayOfYear += 30;
            case 10:
                dayOfYear += 31;
            case 9:
                dayOfYear += 30;
            case 8:
                dayOfYear += 31;
            case 7:
                dayOfYear += 31;
            case 6:
                dayOfYear += 30;
            case 5:
                dayOfYear += 31;
            case 4:
                dayOfYear += 30;
            case 3:
                dayOfYear += 31;
            case 2:
                dayOfYear += 28;
                // 可以吧判断加在这里
//                if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)){
//                    dayOfYear += 29;
//                }else{ dayOfYear +=28 }
            case 1:
                dayOfYear += 31;
            case 0:
                dayOfYear += day;
        }
        if(flag == 1)dayOfYear++;
        System.out.println("This day is "+dayOfYear+" of "+year);
    }
}
class TestSwitch06{
//    编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序
//    输出输入的日期为2019年的第几天。
    static void answer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please inpt month:");
        int month = sc.nextInt();
        System.out.println("please inpt day:");
        int day = sc.nextInt();
        int dayOfYear = 0;
        switch (month-1){
            case 11:
                dayOfYear += 30;
            case 10:
                dayOfYear += 31;
            case 9:
                dayOfYear += 30;
            case 8:
                dayOfYear += 31;
            case 7:
                dayOfYear += 31;
            case 6:
                dayOfYear += 30;
            case 5:
                dayOfYear += 31;
            case 4:
                dayOfYear += 30;
            case 3:
                dayOfYear += 31;
            case 2:
                dayOfYear += 28;
            case 1:
                dayOfYear += 31;
            case 0:
                dayOfYear += day;
        }
        System.out.println(dayOfYear);
    }
}
class TestSwitch05{
//    根据用于指定月份，打印该月份所属的季节。
//    3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
    static void answer(){
        System.out.println("输入月份(1~12):");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("月份有错");

        }
    }
}
class TestSwitch04{
//     2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
    static void answer(){
        int score = 78;
        // 最优的解法是 score / 60

        switch (score / 10){
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("合格");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("不合格");
                break;
        }
//        int flag = 1;
//        if(score > 60){
//            flag = 1;
//        }else{
//            flag = 0;
//        }
//        switch (flag){
//            case 1:
//                System.out.println("合格");
//                break;
//            case 0:
//                System.out.println("不合格");
//                break;
//        }
    }
}
class TestSwitch03{
//    1.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输
//    出 “other”。
//    提示：String word = scan.next(); char c = word.charAt(0); switch(c){}
    static void answer(){
        System.out.println("请输入一个字符:");
        Scanner sc = new Scanner(System.in);
        String inputChar = sc.next();
        char judgeChar = inputChar.charAt(0);
        switch (judgeChar){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
class TestSwitch02{
    static void answer(){
        int i = 1;
        switch (i){

//                break;
            case 2:
                System.out.println(i+2);
            default:
                System.out.println(i+3);
            case 3:
                System.out.println(i+3);
            case 4:
                System.out.println(i+4);
            case 5:
                System.out.println(i+5);

        }
    }
}
class TestSwitch01{
    static void answer(){
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            default:
                System.out.println("-1");
        }
    }
}

/*
    switch-case
    switch(表达式){
    case 常量: {;}
    case 常量: {break;}
    ......
    default : {;}
    }

    switch 中的表达式的值只能是6种类型之一
        byte,short,char,int,枚举(JDK5.0新增),String(JDK7.0新增)
    case    中不能写范围
    default 位置是可以随意的,可以不写,但是最后执行
                放最后一个case后面只执行一次,
                放其他地方,会继续从default向下执行(没有遇到break)

    switch-case 取值不太多时,优先使用switch-case
            执行效率稍高
*/

