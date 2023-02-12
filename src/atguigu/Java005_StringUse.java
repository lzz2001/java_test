package atguigu;

public class Java005_StringUse {
    public static void main(String[] args) {
        System.out.println(Float.MAX_VALUE/Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE/Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE/Integer.MAX_VALUE);

//        String s1="Hello world";
//        boolean b1 = true;
//        System.out.println(s1+b1);
//
//        //练习1
//        char c1 = 'a';
//        int num = 10;
//        String str = "hello";
//        System.out.println(c1+num+str);
//        System.out.println(c1+str+num);
//        System.out.println(c1+(num+str));
//
//        //练习2
//        // *    *
//        System.out.println("*   *");            //
//        System.out.println('*' + '\t' + '*');
//        System.out.println("*" + '\t' + '*');   //
//        System.out.println("*" + ('\t' + '*'));
//        System.out.println('*' + "\t" + '*');   //
//        System.out.println('*' + ("\t" + '*'));

          // 进制
        int bint = 0B111;
        int tint = 111;
        int oint = 0111;
        int xint = 0x111;
        System.out.println(bint);
        System.out.println(tint);
        System.out.println(oint);
        System.out.println(xint);

    }
}
/*
 *      String : 引用类型,双引号，可以为空
 *         可以和八种数据类型做运算，且运算只能是 +(连接运算)  结果仍然是String
 *
 *
 */

/*
进制转换
        二进制：    0b、0B开头
        十进制：
        八进制：    0开头
        十六进制：  0x，0X开头


        正数：原码反码补码
        负数：原 码 -- 除符号位，各位取反 --> 反 码 -- 末位加一 --> 补 码

        底层一定是补码
        十进制转二进制 除二取余的逆
        二进制转十进制

        二进制与八进制     分3位
        二进制与十六进制   分4位

 */

