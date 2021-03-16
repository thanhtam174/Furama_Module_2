package controllers.manager;

import commons.ReaderAndWriterFile;
import models.Customer;
import models.InputData;

import java.util.List;
import java.util.Scanner;

public class CustomerManager extends InputData {
    Scanner scanner=new Scanner(System.in);
    List<Customer> customerList;
    public Customer addNewCustomer(){
        Customer customer = new Customer(inputName(),inputDateOfBirth(),inputGender(),inputIdentityCard(),inputPhoneNumber(),inputEmail(),inputTypeCustomer(),inputAddress());
        ReaderAndWriterFile readerAndWriterFile = new ReaderAndWriterFile();
        readerAndWriterFile.writer(customer, "F:\\Furama_Module_2\\src\\data\\Customer.csv");
        return customer;
    }
}
