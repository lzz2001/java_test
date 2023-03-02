package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 15:44
 */

public class Java058_DesignPattern {

}
abstract class Template058{
    public final void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end - start));
    }
    public abstract void code();
}
class SubTemplate058 extends Template058{
    @Override
    public void code() {

    }
}
/*
    抽象类的应用：
        模板方法的设计模式
            实现一个算法的时候，整体步骤固定通用
            但某些部分易变，易变的部分可以抽象出来，共不同的子类实现
         常见模板：数据库的访问封装
                 Junit单元测试
                 JavaWeb中的Servlet
                 Hibernate中的模板
                 Spring中的JDBCTemlate

 */













