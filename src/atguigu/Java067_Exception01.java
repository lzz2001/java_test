package atguigu;

import java.io.File;
import java.io.FileInputStream;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/3 7:56
 */

public class Java067_Exception01 {

}
/*
       异常不是错误（父类：Throwable）
       java.lang.Error: Jvm无法解决的严重问题 --------------不需要被处理
                举例：JVM系统内部错误，资源耗尽等
                栈溢出，堆溢出
                StackOverflow OOM

       java.lang.Exception:可以使用代码进行处理
            编译时异常(checked)，运行时异常(unchecked)
            IOException,ClassNotFond    空指针，角标越界

        面试题：常见的异常
            NullPointException 空指针异常
            ArrayIndexOutOfBoundsException 数组下标越界
            StringIndexOutOfBoundsException 字符串下标越界
            ClassCastException      类型转换
            NumberFormatException
            InputMismatchException  输入格式异常
            ArithmeticException 算数异常


 */

class ExceptionTest {
    // 编译时异常
    @org.junit.Test
    public void test() throws Exception{
        File file = new File("");
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while (data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();//关闭流
    }
    // 运行时异常
    @org.junit.Test
    public void test01(){
        int a = 0;
        int b = 0;
        System.out.println(a / b);
    }
}



