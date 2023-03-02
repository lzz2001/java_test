package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/1 20:48
 */

public class Java061_Interface02 {
    public static void main(String[] args) {
        Computer061 com = new Computer061();
        com.transferData(new Flash061());

        com.transferData(new USB061() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }
}

interface USB061{
    void start();
    void stop();
}
class Computer061{
    public void transferData(USB061 usb){
        usb.start();
        System.out.println("传送数据");
        usb.stop();
    }
}
class Flash061 implements USB061{

    @Override
    public void start() {
        System.out.println("u盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("u盘关闭");
    }
}










/*
        抽象类和接口有那些异同
        同：
        异：


*/