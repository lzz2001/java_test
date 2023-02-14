
package atguigu;

import org.omg.CORBA.MARSHAL;

public class Java021_Class_Function04_Array {
    public static void main(String[] args) {
//        创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
        Student stu[] = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = i + 1;
            stu[i].state = (int) (Math.random() * 6 + 1);
            stu[i].score = (int) (Math.random() * 101);
        }
//        问题一：打印出3年级(state值为3）的学生信息。
        for (Student s : stu) {
            if (s.state == 3) {
                System.out.println("student number is " + s.number
                        + " \tstudent state is " + s.state
                        + "\tstudent score is " + s.score);
            }
        }
        System.out.println("---------------------------------------------------------");
//        问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < stu.length - 1; i++) {
            for (int j = 0; j < stu.length - i - 1; j++) {
                if (stu[j].score < stu[j + 1].score) {
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }
        for (Student s : stu) {
            System.out.println("student number is " + s.number
                    + " \tstudent state is " + s.state
                    + "\tstudent score is " + s.score);
        }
    }
//        提示：
//        1) 生成随机数：Math.random()，返回值类型double;
//        2) 四舍五入取整：Math.round(double d)，返回值类型long。
//
    }
class Student{
    //        4. 对象数组题目：
//        定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
    int number;
    int state;
    int score;

}


//        5.声明一个日期类型MyDate：有属性：年year,月month，日day。创建2个日期
//        对象，分别赋值为：你的出生日期，你对象的出生日期，并显示信息。