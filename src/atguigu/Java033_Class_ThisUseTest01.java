package atguigu;

public class Java033_Class_ThisUseTest01 {
    public static void main(String[] args) {
//        1.创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
//        年利率为 1.23％ 的账户。
//        2. 对 Jane Smith 操作。
//        存入 100 元，再取出 960 元。再取出 2000 元。
//        打印出 Jane Smith 的基本信息
        Customer customer = new Customer("Jane","Smith");
        customer.setAccount(new Account(1000,2000,0.0123));
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(2000);
        customer.showInfo();

    }
}

class Account{
//        1、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
//        账号 id，余额 balance，年利率 annualInterestRate；
//        包含的方法：访问器方法（getter 和 setter方法），
//        取款方法 withdraw()，存款方法 deposit()。
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account (int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance =balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double money){
        //存钱
        balance += money;
        System.out.println("成功存入："+money);
    }

    public void withdraw(double money){
        //取钱
        if (money > balance){
            System.out.println("余额不足，无法取出");
        }else{
            balance -= money;
            System.out.println("成功取出："+money);
        }

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Customer{
    private String firstName;//姓
    private String lastName;//名
    private Account account;//账户

    public void showInfo(){
        System.out.println("Customer ["+this.firstName+"," +this.lastName+
                "] has a account: id is "+this.account.getId()+
                ", annualInterestRate is "+this.getAccount().getAnnualInterestRate()*100+
                "%, balance is "+this.getAccount().getBalance()+"\n");
    }
    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;

    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Account getAccount(){
        return this.account;
    }
    public void setAccount(Account account){
        this.account = account;
    }


}



