package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/3 8:43
 */

public class Java068_Exception02 {

}

/*
        try{
        可能出现异常的代码
        }catch(异常一){
            处理异常方式
        }catch(异常二){
            处理异常方式
        }finally{
            一定会执行的代码
        }
        finally是可选的，不一定非要写
            finally 中的代码一定会被执行，即使catch中的代码又出现了异常，
                或者有return语句都会执行finally
                  数据库连接，数据输入输出流，网络变成Socket等资源
                  JVM时不能自动回收的需要，手动释放
        抓抛模型：
        1.抛：程序在正常执行过程中，一旦出现异常，会在异常代码处生成一个对应类的异常
                    并将此对象抛出，一旦抛出，其后面的代码不再执行
        2.抓：异常处理方式 try catch finally        throws

            一旦异常处理完成，跳出异常处理结构 （在没有写finally的情况下）
            继续执行之后的代码【编译时不报错，运行时可能报错】
            catch 可以多个，类型小的写上面，类型大的写下面
                异常类型存在子父类关系，子类在上


            常用异常处理方式 getMessage()   printStackTrace()

            try结构中声明的变量，出了该结构则不能再使用

 */

class ExceptionTest068{
    public static void main(String[] args) {

            String str = "123";
            str = "abc";
            try {
                int num = Integer.parseInt(str);
            }catch (NumberFormatException e){
                System.out.println("出现异常");
                System.out.println(e.getMessage());
                e.printStackTrace();

            }
            System.out.println("异常后的程序");
    }



}
