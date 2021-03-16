package controllers;

import controllers.manager.CustomerManager;
import controllers.manager.ServiceManager;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(ServiceManager serviceManager, CustomerManager customerManager){
        int chosse;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("------------MAIN MENU-------------");
            System.out.println("1. Add New Services");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer");
            System.out.println("4. Show Information of Customer");
            System.out.println("5. Add New Booking");
            System.out.println("6. Show Information of Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your chosse: ");
            chosse=Integer.parseInt(scanner.nextLine());

            switch (chosse){
                case 1:
                    serviceManager.addNewServices();
                    break;
                case 2:
                    serviceManager.showService();
                    break;
                case 3:
                    customerManager.addNewCustomer();
            }
        }while (chosse!=7);
    }

    public static void main(String[] args) {
        ServiceManager serviceManager =new ServiceManager();
        CustomerManager customerManager=new CustomerManager();
        displayMainMenu(serviceManager,customerManager);
    }
}
