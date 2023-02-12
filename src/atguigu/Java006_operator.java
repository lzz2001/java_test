package atguigu;

import java.io.Serializable;

public class Java006_operator {
    public static void main(String[] args) {
//        -------------- 算数运算符 --------------//        -------------- 比较运算符 --------------

//        int int1 = 5;
//        int int2 = 8;
//        int int3 = int2 / int1;
//        int int4 = int2 / int1 * int1;
//        // 整除
//        System.out.println(int3);
//        System.out.println(int4);

        //--------- 练习 ------------
        // 随意给出一个正数，输出个位，十位，百位上的数字
//        int num = 123;
//        int bitsNum = 0;
//        int decadeNum = 0;
//        int hundredNum = 0;
//        bitsNum = num % 10;
//        decadeNum = num / 10 % 10;
//        hundredNum = num / 100;
//        System.out.println("个位 = "+bitsNum+" ,十位 = "+decadeNum +" , 百位 = "+hundredNum);

//        -------------- 赋值运算符 --------------//        -------------- 赋值运算符 --------------
//        short 短整形1 = 2;
//        short 短整型2 =3;
//        short s3 = 4;
//        短整型2 += 短整形1;
//        System.out.println(短整型2);
//        s3 *= 0.4; // 计算完毕后强制类型转化为左边变量类型，可能损失精度
//        System.out.println(s3);

//        --------- 练习2 ------------
//        自增
//        int n1 = 10;
//        n1 += n1 + (n1++) + (++n1);
//        System.out.println("n1 = "+n1);

//        -------------- 比较运算符 -------------- //        -------------- 比较运算符 --------------


//        -------------- 逻辑运算符 --------------//        -------------- 逻辑运算符 --------------

//        boolean boolean1 = false;
//        int int1 = 2;
//        if(boolean1 & (int1++ > 1)){
//
//        }
//        System.out.println("& 实现前 int1 = 2，之后int1 = "+ int1);
//
//        boolean boolean2 = false;
//        int int2 = 2;
//        if(boolean2 && (int2++ > 1)){
//            //  短路与
//        }
//        System.out.println("&& 实现前 int2 = 2，之后int2 = "+ int2);


//        --------- 练习 ------------
            boolean x = true;
            boolean y = false;
            short z = 42;
            //if(y == true)
            if((z++ == 42)&&(y = true))z++;
            if((x = false) || (++z == 45)) z++;
            System. out.println("z="+z);




//        -------------- 位运算符 --------------//        -------------- 位运算符 --------------
//                  交换两个int数的值

//        //1.多开辟空间
//        int num1 = 1;
//        int num2 = 2;
//        System.out.println("num1 = "+num1+" ,num2 = "+num2);
//        int temp = 0;
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println("num1 = "+num1+" ,num2 = "+num2+"\n");
//
//        //2.越界, 非数值型不可用
//        int num3 = 3;
//        int num4 = 4;
//        System.out.println("num3 = "+num3+" ,num4 = "+num4);
//        num3 += num4;
//        num4 = num3 - num4;
//        num3 = num3 - num4;
//        System.out.println("num3 = "+num3+" ,num4 = "+num4+"\n");
//
//        //3.位运算符，效率高 ，范围不超
//        int num5 = 5;
//        int num6 = 6;
//        System.out.println("num5 = "+num5+" ,num6 = "+num6);
//        num5 = num5 ^ num6;
//        num6 = num5 ^ num6;
//        num5 = num5 ^ num6;
//        System.out.println("num5 = "+num5+" ,num6 = "+num6+"\n");


//        -------------- 三元运算符 --------------//        -------------- 三元运算符 --------------
        int num7 = 7;
        int num8 = 8;
        System.out.println("max = "+ (num7 > num8 ? num7 :num8));

        Serializable serializable = num7 > num8 ? 2 : "string";
        System.out.println(serializable);
        // 返回的类型必须一致，否则报错
    }
}

/*
    运算符：
        算术运算符
             + - * / % ++ -- 字符串+
             % 余数的符合与被模数的符号一样
             ++前置   自增1 先自增
             后置++   自增1 后自增   --同理
             short s=1;  s++ 和 s + 1 不一样，前者数据类型不变，后者数据类型自动提升

             byte b=127; b++ -128

        赋值运算符 : 可以连续赋值，连续定义
             =
             += -= *= /= %=  不会改变，左边变量的数据类型（与++一样）

        比较运算符（关系）
            <  >  !=  ==  <=  >=  instanceof  .equals()

        逻辑运算符
            &     |     !     ^     &&     ||

        位运算符：效率最快，全是用二进制计算
            <<   >>   >>>   ^   &   |   ~
            左移（<<）高位是0 左移变大（*2）,超过一定范围（高位是1），就是负数了
            右移 正式补0 负数补1
            无符号右移 无论正负数 高位都补0
            取反 包括符号位   ~6 = -7       ~(-7) = 6

        三元运算符
             比 if 语句 效率高一些
            () ? () : ()

        优先级问题-------------------------------
        T M D  B A T J
        头条 美团 抖音 百度 阿里 腾讯 京东


 */

