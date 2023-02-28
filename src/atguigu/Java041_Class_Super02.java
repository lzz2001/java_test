package atguigu;

/**
 * @description:
 * @author: 27614
 * @time: 2023/2/27 9:31
 */

public class Java041_Class_Super02 {
    public static void main(String[] args) {
//        写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
//        年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
//        再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额和月利
//        率。



//        要求：写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
//        额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。
//        使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额。
//        再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。
//        再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。
    }
}
//        写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
//        账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
//        setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
//        deposit()。

class Account041{
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account041(){

    }

    public Account041(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }
    public void withdraw (double amount){
        if(amount < balance){
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }
    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}


//    创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
//        overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：

//如果（取款金额<账户余额），
//        可直接取款
//        如果（取款金额>账户余额），
//        计算需要透支的额度
//        判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
//        将账户余额修改为 0，冲减可透支金额
//        如果不可以
//        提示用户超过可透支额的限额

class CheckAccount extends Account041{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.getBalance()){
            this.setBalance(this.getBalance() - amount);
        }else{
            if(amount > this.getBalance() + overdraft){
                System.out.println("超过可透支限额");
                return;
            }
            amount -= this.getBalance();
            this.setBalance(0);
            overdraft -= amount;

        }

    }
}