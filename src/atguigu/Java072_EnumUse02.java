package atguigu;

import org.junit.Test;

/**
 * ClassName:Java072_EnumUse02
 * Package:atguigu
 * Description:枚举类的应用
 * @Author:
 * @Create:2023/3/4,16:44
 * @Version:
 */
public class Java072_EnumUse02 {
    @Test
    public void test01() {

    }
    @Test
    public void test02(){

    }
    @Test
    public void test03(){
        System.out.println(Color.BLACK);
    }
}
enum Status{
    // 在职状态
    BUSY,FREE,DISMISSION,VACATION;
}
enum Bank072{
    //单例模式
    BANK_072;
}
enum Color{
    RED(255,0,0,"红色"),
    ORANGE(255,128,0,"橘色"),
    YELLOW(255,255,0,"黄色"),
    GREEN(0,255,0,"绿色"),
    CYAN(0,255,255,"青色"),
    BLUE(0,255,255,"蓝色"),
    PURPLE(128,0,255,"紫色"),
    BLACK(0,0,0,"黑色"),
    WHITE(255,255,255,"白色");


    public final int red;
    public final int green;
    public final int blue;
    public final String desc;

    Color(int red, int green, int blue,String desc) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.desc = desc;

    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return name()+"("+red+","+green+","+blue+")-->"+desc;
    }
}