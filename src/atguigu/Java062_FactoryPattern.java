package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 22:31
 */

public class Java062_FactoryPattern {
}


class NetWorkTest{
    public static void main(String[] args) {
        Sever sever = new Sever();
        ProxySever proxySever = new ProxySever(sever);
        proxySever.browse();
    }
}
interface NetWork{
    void browse();
}
//被代理类
class Sever implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxySever implements NetWork{
    private NetWork work;

    public ProxySever(NetWork work) {
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查");
    }
    @Override
    public void browse() {
        check();
        work.browse();
    }
}
/*
        代理模式：
         安全代理
         远程代理
         延迟加载
         静态代理
         动态代理




 */