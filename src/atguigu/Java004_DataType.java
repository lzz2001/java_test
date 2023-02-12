package atguigu;

public class Java004_DataType {
    public static void main(String[] args) {
//        byte maxByte = Byte.MAX_VALUE;
//        byte minByte = Byte.MIN_VALUE;
//        short maxShort = Short.MAX_VALUE;
//        short minShort = Short.MIN_VALUE;
//        int maxInt = Integer.MAX_VALUE;
//        int minInt = Integer.MIN_VALUE;
//        long maxLong = Long.MAX_VALUE;
//        long minLong = Long.MIN_VALUE;
//
//        System.out.println("maxByte="+maxByte);
//        System.out.println("minByte="+minByte);
//        System.out.println("maxShort="+maxShort);
//        System.out.println("minShort="+minShort);
//        System.out.println("maxInt="+maxInt);
//        System.out.println("minInt="+minInt);
//        System.out.println("maxLong="+maxLong);
//        System.out.println("minLong="+minLong);
//
//        float maxFloat = Float.MAX_VALUE;
//        float minFloat = Float.MIN_VALUE;
//        double maxDouble = Double.MAX_VALUE;
//        double minDouble = Double.MIN_VALUE;
//
//        System.out.println("maxFloat="+maxFloat);
//        System.out.println("minFloat="+minFloat);
//        System.out.println("maxDouble="+maxDouble);
//        System.out.println("minDouble="+minDouble);
//
//        char maxChar = Character.MAX_VALUE;
//        char minChar = Character.MAX_VALUE;
//        boolean b1 = true;
//        boolean b2 = false;
//        System.out.println("minChar="+minChar);
//        System.out.println("maxChar="+maxChar);
//        System.out.println("b1="+b1);
//        System.out.println("b2="+b2);

          byte byte1 = 2;
          int int1 = 129;
          int int2 = byte1 + int1;
          long long1 = int2 + int1;
          float float1 = long1 + int2;
          System.out.println();


    }
}
/*
 * 按照数据类型来分类
 *  基本数据类型
 *     整形:   byte      1           -128~127            256
 *             short     2         -2^15~2^15-1
 *             int       4         -2^31~2^31-1        -21亿~21亿
 *           * long      8         -2^63~2^63-1
 *
 *     浮点型:* float     4            7位
 *             double    8            14位
 *
 *     字符型: char      1(1字符=2字节)   必须单引号，而且不能为空
 *
 *     布尔型: boolean   int      true false
 *
 *  引用数据类型：
 *      类（class）
 *      接口（interface）
 *      数组（array）
 *
 *
 * 字符集:   ASCII码  a=97 A=65
 *          Unicode
 *          ANSI(GBK)
 *          UTF-8
 *
 *
 *  数据之间的运算规则        (除了boolean)
 *      1.自动类型提升        表示数的范围增大，并不是字节数
 *          short -> int -> long -> float -> double
 *           byte -> int
 *           char -> int
 *           short正好比最大减一加了个byte = 超值报错
 *      2.强制类型转换
 *              float f = 1.0f;
 *              int i = (int)f;  // 截断，可能损失精度
 *
 *  情况 ：
 *        1.      long l = 123; 结尾没有写L,算是int自动类型提升,若超出int没有加L则报错
 *        2.      整型常量默认int 浮点型默认double
 *
 *
 */



