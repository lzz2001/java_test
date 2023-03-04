package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/3 13:46
 */

public class Java069_Exception03 {
    public static void main(String[] args) {
        Student69 s = new Student69();
        s.reg(-1);
    }
}

/*
    throws + 异常类型   写在方法声明处，可能会抛出的异常类型
                一旦方法体执行时出现异常，仍会生成一个异常对象，此对象满足throws
                后面的异常时，抛出异常，此后的代码将不再执行

           体会 try-catch-finally 真正的处理掉异常
           throws ---将异常抛给方法的调用者
        系统自动的生成一个异常对象

            方法重写时：抛出的异常，小于父类被重写方法抛出的异常【多态】
                    父类的方法没有抛出异常，子类不能抛异常


               如果父类中被重写的方法没有throws异常
                    那么子类也不能使用throws抛出异常，只能用try-catch处理

                连续使用的方法都有可能抛异常---让其全部throws，在实现类try-catch


                手动抛出异常：throw

 */

// 自定义异常  继承 RuntimeException  Exception
class MyException extends RuntimeException{
    static final long serialVersionUID =-7034897190745766939L;
    public MyException(){

    }
    public MyException(String message){
        super(message);
    }
}

class Student69{
    private int id;
    public void reg(int id){
        if(id > 0){
            this.id = id;

        }
        else {
            throw new MyException("不能输入负数");
        }
    }
}
