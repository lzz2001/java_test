package atguigu;
/**
 * ClassName:Java078_Thread_HappyNewYear
 * Package:atguigu
 * Description:
 *
 * @Author:
 * @Create:2023/3/5,18:56
 * @Version:
 */

/**
 * @description:
 * @author: 27614
 * @time: 2023/3/5 18:56
 */

public class Java078_Thread_HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i >= 0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        if (i == 0){
            System.out.println("HappyNewYear");
        }
        if(i > 0){
            System.out.println(i);
        }
        }
    }
}
