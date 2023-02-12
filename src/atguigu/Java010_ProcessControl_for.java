package atguigu;

public class Java010_ProcessControl_for {
    public static void main(String[] args) {
        testForUse03();
    }

    static void testForUse(){}
    static void testForUse05(){

    }
    static void testForUse04(){
        int a=0,b=0,c=0;
        if(a != b){
            c = a;
        }else{
            c = b;
        }
        // c = a
    }
    static void testForUse03(){
//        编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行
//        上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印
//        输出“baz”
        for (int i = 1;i <= 150;i++ ){
            System.out.print(i + "\t");
            if(i % 3 == 0){
                System.out.print("foo\t");
            }
            if(i % 5 == 0){
                System.out.print("biz\t");
            }
            if(i % 7 == 0){
                System.out.print("baz\t");
            }
            System.out.println();
        }
    }
    static void testForUse02(){
//        遍历一百以内所有偶数
        int sum=0;
        for (int i = 2;i<=100;i+=2){
            System.out.print(i+"\t");
            sum += i;
            if(i%10==0) System.out.println();
        }
        System.out.println(sum);
    }
    static void testForUse01(){
//        for(int i = 0;i<5;i++){
//            System.out.println(i+1);
//        }

        int num=1;
        for(System.out.print("a");num<=3; System.out.print("c"),num++){
            System.out.print("b");
        }
    }

}



/*
        循环结构:
                for while do_while
          4要素 1初始化----2循环条件(boolean)----3循环体----4迭代部分
                for(1;2;4){
                    3
                }
                1->2->3->4->2->3->4->2->3->4.....
 */

