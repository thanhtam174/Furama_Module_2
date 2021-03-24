package controllers.manager;

import commons.FileUtils;
import models.Customer;

import java.util.Scanner;

public class BookingManager {
    public Customer customer;
    Scanner scanner = new Scanner(System.in);

    public Customer addNewBooking() {
        CustomerManager customerManager = new CustomerManager();
        customerManager.showInformationCustomer();
        System.out.print("Enter your choose: ");
        int chooseCustomer = Integer.parseInt(scanner.nextLine());
        customer = customerManager.customerList.get(chooseCustomer-1);
        System.out.println("1.\tBooking Villa");
        System.out.println("2.\tBooking House");
        System.out.println("3.\tBooking Room");
        System.out.print("Enter your choose: ");
        int chooseBooking = Integer.parseInt(scanner.nextLine());
        switch (chooseBooking) {
            case 1:
                VillaManager villaManager = new VillaManager();
                villaManager.showVilla();
                System.out.print("Enter your choose: ");
                int chooseVilla = Integer.parseInt(scanner.nextLine());
                customer.setServices(villaManager.villaList.get(chooseVilla-1));
                FileUtils fileUtilsVilla = new FileUtils();
                fileUtilsVilla.setFullPathFile("booking");
                fileUtilsVilla.writeFile(new String[]{customer.toString()});
                break;
            case 2:
                HouseManager houseManager = new HouseManager();
                houseManager.showHouse();
                System.out.print("Enter your choose: ");
                int chooseHouse = Integer.parseInt(scanner.nextLine());
                customer.setServices(houseManager.houseList.get(chooseHouse-1));
                FileUtils fileUtilsHouse = new FileUtils();
                fileUtilsHouse.setFullPathFile("booking");
                fileUtilsHouse.writeFile(new String[]{customer.toString()});
                break;
            case 3:
                RoomManager roomManager = new RoomManager();
                roomManager.showRoom();
                System.out.print("Enter your choose: ");
                int chooseRoom = Integer.parseInt(scanner.nextLine());
                customer.setServices(roomManager.roomList.get(chooseRoom-1));
                FileUtils fileUtilsRoom = new FileUtils();
                fileUtilsRoom.setFullPathFile("booking");
                fileUtilsRoom.writeFile(new String[]{customer.toString()});
        }
        return customer;
    }
}
