package atguigu;
import java.lang.ref.SoftReference;
import java.util.Scanner;
public class Java012_Object01_HomeBookkeepingSoftware {
    public static void main(String[] args) {
        FamilyAccount.run();
    }

}


/*
方法类
 */
class FamilyAccount{
    private static int money;
    private static String detail="";

    public static void run(){
        FamilyAccount.menu();

    }
    private static void detail(){
        System.out.println("****************** 当前收支明细 *******************");
        System.out.println("收  支\t\t账户金额\t\t收支金额\t\t说  明 ");
        System.out.println(detail);
        System.out.println("*************************************************");
        System.out.println("\n\n");
    }
    private static void income(){
        System.out.print("请输入收入金额:");
        int income = Utility.readNumber();
        money += income;
        detail = detail + "\n" +"收  入\t\t"+ money + "\t\t\t" +income;
        System.out.println();
        System.out.print("请输入详细信息:");
        String detailScan = Utility.readString();
        detail = detail + "\t\t\t" + detailScan;
        System.out.println("******************  操作完成  *******************\n");
    }
    private static void expense(){
        System.out.print("请输入支出金额:");
        int expense = 0;
        while ((expense = Utility.readNumber()) > money ){
            System.out.print("重新输入 支出金额:");
        }
        detail = detail + "\n" +"支  出\t\t"+ money + "\t\t\t" +expense;
        System.out.println();
        System.out.print("请输入详细信息:");
        String detailScan = Utility.readString();
        detail = detail + "\t\t\t" + detailScan;
        System.out.println("******************  操作完成  *******************\n");
    }
    private static boolean exit(){
        System.out.print("是否确认退出(Y/N):");
        char selection = Utility.readConfirmSelection();
        if(selection == 'Y'){
            return true;
        }else {
            return false;
        }
    }
    // 输出界面
    private static void menu(){
        label:while(true){
            System.out.println("------------------家庭收支记账软件------------------\n");
            System.out.println("                  1.收支明细");
            System.out.println("                  2.登记收入");
            System.out.println("                  3.登记支出");
            System.out.println("                  4.退出\n");
            System.out.print ("                 请选择(1-4):");
            char selectionMenuNum = Utility.readMenuSelection();
            switch (selectionMenuNum){
                case '1':
                    detail();
                    break;
                case '2':
                    income();
                    break;
                case '3':
                    expense();
                    break;
                case '4':
                    boolean j = exit();
                    if(j){
                        break label;
                    }
            }

        }
    }


}




/**
 Utility工具类：
 将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节。
 */
class Utility {
    private static Scanner scanner = new Scanner(System.in);
    /**
     用于界面菜单的选择。该方法读取键盘，如果用户键入’1’-’4’中的任意字符，则方法返回。返回值为用户键入字符。
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }
    /**
     用于收入和支出金额的输入。该方法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值。
     */
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }
    /**
     用于收入和支出说明的输入。该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值。
     */
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    /**
     用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }


    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
