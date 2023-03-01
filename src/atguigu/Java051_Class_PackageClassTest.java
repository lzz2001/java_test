package atguigu;

import java.util.Scanner;
import java.util.Vector;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/28 12:18
 */

public class Java051_Class_PackageClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int max = 0;
        char level = 0 ;
        Vector v = new Vector();
        System.out.println("请输入分数（以负数为结尾）：");
        while ((score = sc.nextInt())>0){
            //jdk 5,0 之前
//            Integer integer = new Integer(score);
//            v.addElement(integer);

            if(score > 100){
                System.out.println("输入的分数大于100，请重新输入：");
            }else{
            v.addElement(score);//自动装箱
            }
            System.out.println("请输入分数（以负数为结尾）：");
        }
        for (Object o : v){
            score = (Integer) o;
            if(score > max){
                max = score;
            }
        }
        System.out.println("最高分："+max);
        for(int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);
            score = (Integer) obj;
            if( max - score <= 10 ){
                level = 'A';
            }else if( max - score <= 20 ){
                level = 'B';
            }else if( max - score <= 30 ){
                level = 'C';
            }else {
                level = 'D';
            }
            System.out.println("第"+(i+1)+"个学生，分数为："+ score + "的学生，等级为："+level);
        }

    }
}
//        利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出
//        最高分，并输出学生成绩等级。

//        提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的
//        长度。而向量类java.util.Vector可以根据需要动态伸缩。

//        创建Vector对象：Vector v=new Vector();

//        给向量添加元素：v.addElement(Object obj); //obj必须是对象

//        取出向量中的元素：Object obj=v.elementAt(0);

//        注意第一个元素的下标是0，返回值是Object类型的。

//        计算向量的长度：v.size();

//        若与最高分相差10分内：A等；20分内：B等；
//        30分内：C等；其它：D等
