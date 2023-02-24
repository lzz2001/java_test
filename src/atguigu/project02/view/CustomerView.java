package atguigu.project02.view;

import atguigu.project02.bean.Customer;
import atguigu.project02.service.CustomerList;
import atguigu.project02.util.CMUtility;

/**
 * @author: 作者
 * @description:主方法
 * @date 2023/2/22 10:43
 */

public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        customerList.addCustomer(new Customer("li",'男',17,"1223324","3@q231"));

    }

    /**
     * @author: 作者
     * @description:显示主页面
     * @date 2023/2/24 10:33
     */
    public void enterMainMenu(){
        //customerList.addCustomer(new Customer("li",'男',17,"1223324","3@q231"));
        int flag = 1;
        while(flag == 1){
            System.out.println("\n------------------客户信息管理软件------------------\n");
            System.out.println("                  1.添加客户");
            System.out.println("                  2.修改收入");
            System.out.println("                  3.删除支出");
            System.out.println("                  4.客户列表");
            System.out.println("                  5.退出\n");
            System.out.print ("                 请选择(1-5):");
            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    if(exit()){
                        flag = 0;
                    }
            }
        }
    }
    /**
     * @author: 作者
     * @description:增加客户
     * @date 2023/2/24 10:33
     */
    private void addNewCustomer(){
        System.out.println("\n------------------添  加  客  户------------------\n");
        Customer customer = new Customer();
        System.out.println("please input name:");
        customer.setName(CMUtility.readString(5));
        System.out.println("please input age:");
        customer.setAge(CMUtility.readInt());
        System.out.println("please input gender:");
        customer.setGender(CMUtility.readChar());
        System.out.println("please input email:");
        customer.setEmail(CMUtility.readString(13));
        System.out.println("please input phone number:");
        customer.setPhone(CMUtility.readString(13));

        customerList.addCustomer(customer);


    }
    /**
     * @author: 作者
     * @description:修改客户信息
     * @date 2023/2/24 10:33
     */
    private void modifyCustomer(){

    }
    /**
     * @author: 作者
     * @description:删除客户信息
     * @date 2023/2/24 10:33
     */
    private void deleteCustomer(){

    }
    /**
     * @author: 作者
     * @description:展示所有客户
     * @date 2023/2/24 10:33
     */
    private void listAllCustomers(){
        System.out.println("\n------------------客  户  列  表------------------\n");
        int total = customerList.getTotal();
        if(total == 0){
            System.out.println("无客户记录");

        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱 ");
            Customer[] allCustomers = customerList.getAllCustomers();
            for (int i = 0 ; i < allCustomers.length;i++){
                System.out.println(i+1 +"\t"+allCustomers[i].getName()+"\t"+allCustomers[i].getGender()
                +"\t"+allCustomers[i].getAge()+"\t"+allCustomers[i].getPhone()+
                        "\t"+allCustomers[i].getEmail());
            }
        }
    }
    /**
     * @author: 作者
     * @description:退出软件
     * @date 2023/2/24 10:33
     */
    private boolean exit(){
        System.out.println("是否确认退出[y/n]：");
        if(CMUtility.readChar()=='Y')
        return true;
        return false;
    }
    public static void main(String[] args){
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();

    }


}


