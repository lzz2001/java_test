package atguigu.project02.bean;

public class Customer {
    private String name;
    private char gender ;
    private int age ;
    private String phone;
    private String email ;
    public Customer(){

    }
    public Customer(String name,char gender,int age,String phone,String email){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, char gender, int age, String phone) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
