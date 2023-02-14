package atguigu;

public class Java017_Class_Function01 {

}
class PersonJava017{
    String name;
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(int hour){
        System.out.println("sleep "+hour+" hours");
    }
    public String getName(){
        return name;
    }
    public String getNation(String nation){
        return nation;
    }
}
/*
        方法使用和声明：
            比如 Math.sqrt()/random()
                System.out.println()
                Arrays.sort()/binarySearch()/toString()/equals()
         声明 权限修饰符 返回值类型 方法名（形参列表）{
                    方法体；
                }
              （static，final，abstract）

         返回值类型，有返回值和无返回值
            如何理解：如果方法有返回值，必须在声明时指定返回值数据类型，方法体中必须return一个符合声明时数据类型的变量或者数值
                     若无返回值声明时使用void表示，通常不用return
                     return后不能写语句

            是否要返回值：1.看题目   2.凭经验


          方法名： 看名知意，符合规范

          形参列表：可以没有或多个
                   要不要形参：看需求

          return关键字的使用：
                使用范围，在方法体中
                作用：结束方法 ，针对于有返回值类型的方法，返回需求的数据
                return后不能有执行语句

          方法的使用：
                   方法使用中可以调用当前类的属性和方法
                   递归方法----异常-栈溢出
                   方法中不能定义方法



 */


