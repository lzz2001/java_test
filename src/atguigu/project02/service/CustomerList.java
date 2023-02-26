package atguigu.project02.service;

import atguigu.project02.bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     *
     * @param totalNumber:设置数组大小
     */
    public CustomerList(int totalNumber) {
        customers = new Customer[totalNumber];
    }
    /**
     * @author: 作者
     * @description:将指定客户添加到数组中
     * @param customer
     * @date 2023/2/24 9:49
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){

            return false;
        }
        customers[total++] = customer;
        return true;
    }
    /**
     * @author: 作者
     * @description:修改指定索引位置顾客信息
     * @param index
     * @param cust
     * @date 2023/2/24 9:50
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index > total - 1 || index < 0){
            System.out.println("replace fail");
            return false;
        }
        customers[index] = cust;
        return true;
    }
    public boolean deleteCustomer(int index){
        if(index > total - 1 || index < 0){
            System.out.println("delete fail");
            return false;
        }
        for(int i = index;i<total - 1;i++){
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }
    public Customer[] getAllCustomers(){
        Customer customer[] = new Customer[total];
        for (int i = 0;i < customer.length;i++){
            customer[i] = customers[i];
        }
        return customer;
    }
    public Customer getCustomer(int index){
        if(index > total - 1 || index < 0){
            System.out.println("no exist");
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return total;
    }
}
