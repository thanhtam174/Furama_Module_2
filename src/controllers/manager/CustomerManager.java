package controllers.manager;

import commons.FileUtils;
import models.Customer;
import commons.regex.InputData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerManager extends InputData {
    Scanner scanner=new Scanner(System.in);
    List<Customer> customerList;
    public Customer addNewCustomer(){
        Customer customer = new Customer(inputName(),inputDateOfBirth(),inputGender(),inputIdentityCard(),inputPhoneNumber(),inputEmail(),inputTypeCustomer(),inputAddress());
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("customer");
        fileUtils.writeFile(customer.getInfo());
        return customer;
    }

    public Customer addNewCustomer(String[] data){
        Customer newCustomer = new Customer(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
        customerList.add(newCustomer);
        return newCustomer;
    }

    public List<Customer> getCustomerToFile(){
        customerList = new ArrayList<Customer>();
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("customer");
        List<String> listInfo = FileUtils.readFile();
        for (String info:listInfo) {
            String[] data =info.split(",");
            addNewCustomer(data);
        }
        Collections.sort(customerList);
        return customerList;
    }

    public void showInformationCustomer(){
        int i =1;
        for (Customer customer: getCustomerToFile()) {
            System.out.println(i+". ");
            System.out.println(customer.toString());
            i++;
        }
    }
}
