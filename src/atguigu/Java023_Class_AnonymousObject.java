
package atguigu;
import java.util.Date;

import static java.lang.Thread.sleep;

//  匿名对象
/*
       创建的匿名对象，没有显式的赋值给一个变量
       特征：只能调用一次，
       使用场景：一般都是作为形参
 */
public class Java023_Class_AnonymousObject {
    public static void main(String[] args) throws InterruptedException {
        new PhoneJava023().playGame();
        new PhoneJava023().sendEmail();
        sleep(200);
        new PhoneJava023().sendEmail();
        // 每一个匿名类都是一个新的对象，没有任何联系


        sleep(20);

        //一般匿名类的使用，作为方法的形参
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.showPhone(new PhoneJava023());

    }
}
class PhoneFactory{
    public void showPhone(PhoneJava023 p){
        p.sendEmail();
        p.playGame();
    }
}
class PhoneJava023{
    int price;
    public void sendEmail(){
        System.out.println("发邮件"+new Date().getTime());
    }
    public void playGame(){
        System.out.println("play game");
    }

}
/*
万事万物皆对象：
       理解： 1.java语言范畴中，都将功能结构等封装到类中
                    通过类的实例化，来调用具体的功能机构
             2.与其它语言交互的时【前端语言html css js】
                    后端数据库交互时，都将其他语言的结构
                    视为类与对象的关系
             3.例子 Scanner，File，Url【网络】
 */