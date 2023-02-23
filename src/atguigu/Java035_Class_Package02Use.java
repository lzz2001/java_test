package atguigu;

public class Java035_Class_Package02Use {

}
/*
        package:
            为了更好地管理项目中的类，提供包的概念
            package 声明类或者接口所在的包，声明在源文件的首行
            包名属于标识符，需要符合规范和规则
            . 的结构， 每点一次都代表一层目录

            补充；同一个包下，不能有同名接口和同名类

        MVC的设计模式：
            不同于后23种设计模式，将整个程序分为三个层次：
                    视图模型层，控制器层，数据模型层
            model controller view 降低程序耦合性

        import:
            Scanner
            作用： 导入
            1.在源文件中使用import，显式的指定需要导入的指定包下的类和接口
            2.声明在包与类之间
            3.多个import语句并列向下写
            4. * 代表导入xxx包下所有结构
            5.java核心包都定义在lang包下，则不需要import
                当前包下定义的类可以不使用import
            6.实际开发当中的问题：重名类-----必须补全全类名 xxx.yyy.zzz
            7.xxx.*表示导入xxx包下的所有结构，但是需要其子包下的结构则还需要导入
                    * 不含有子包
            8.import static 表示导入类或者接口中的静态结构，
                        要到类中的结构 包名.类名.*






 */