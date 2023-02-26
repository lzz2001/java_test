package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/25 16:21
 */

public class Java037_Class_Extend02 {

}
//         (1)定义一个ManKind类，包括
//         成员变量int sex和int salary；
//         方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
//         方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
//         (2)定义类Kids继承ManKind，并包括
//         成员变量int yearsOld；
//         方法printAge()打印yearsOl d的值。
//         (3)定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问
//         其父类的成员变量及方法。

class ManKind{
    int sex;
    int salary;

    public void manOrWoman(){
        if(this.sex == 1){
            System.out.println("man");
        }else if(0 == this.sex){
            System.out.println("woman");
        }
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }
        if(salary != 0){
            System.out.println("job");
        }
    }


}

class Kids extends ManKind{
    int yearOld;
    public void printAge(){
        System.out.println(yearOld);
    }
}









