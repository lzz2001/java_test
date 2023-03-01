package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 10:35
 */

public class Java048_Class_ObjectUse02_ToString {

}


/*
        当直接输出对象的引用时，实际上是调用当前对象的toString（）方法
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

        String Date File 包装类都是重写了 toString方法，使得调用该方法时，返回实体信息
        自定义类重写toString方法

 */