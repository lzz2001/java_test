package atguigu;

public class Java034_Class_ThisUseTest02 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCus(new Cus("li","bin")) ;
        Cus cus = bank.getCuses(0);
        cus.setAccount(new Account(1000,2000,0.0123));
        cus.getAccount().withdraw(200);
        cus.getAccount().deposit(1000);
        cus.showInfo();

        bank.addCus(new Cus("zhang","san"));


    }
}
class Acc{
    private double balance;

    public Acc(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
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

}
class Cus{
    private String firstName;//姓
    private String lastName;//名
    private Account account;//账户

    public void showInfo(){
        System.out.println("Customer ["+this.firstName+"," +this.lastName+
                "] has a account: id is "+this.account.getId()+
                ", annualInterestRate is "+this.getAccount().getAnnualInterestRate()*100+
                "%, balance is "+this.getAccount().getBalance()+"\n");
    }
    public Cus(String f,String l){
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
class Bank{
    private Cus[] cuses;
    private int numberOfCus = 0;

    public Bank(){
        cuses = new Cus[10];
    }

    public void addCus(Cus cus){

        cuses[numberOfCus++] = cus;
    }
    public int getNumberOfCus() {
        return numberOfCus;
    }

    public Cus getCuses(int index) {
        if(index <= this.numberOfCus){
        return cuses[index];
        }
        System.out.println("输入有误");
        return null;
    }
}