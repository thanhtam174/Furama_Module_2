package controllers.manager;

import models.House;
import models.Room;
import models.Villa;

import java.util.List;
import java.util.Scanner;

public class ServiceManager {
    Scanner scanner = new Scanner(System.in);
    VillaManager villaManager;
    RoomManager roomManager;
    HouseManager houseManager;

    public ServiceManager() {
        villaManager = new VillaManager();
        roomManager = new RoomManager();
        houseManager = new HouseManager();
    }

    public void addNewServices() {
        int chosse;
        do {
            System.out.println("-------------ADD NEW SERVICE MENU------------");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.println("5. Exit");
            System.out.print("Enter your choose: ");
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse) {
                case 1:
                    Villa newVilla=villaManager.addNewVilla();
                    newVilla.showInfo();
                    break;
                case 2:
                    House newHouse=houseManager.addNewHouse();
                    newHouse.showInfo();
                    break;
                case 3:
                    Room newRoom=roomManager.addNewRoom();
                    newRoom.showInfo();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (chosse != 5);

    }

    public void showService(){
        int choose;
        do {
            System.out.println("-----------SHOW SERVICE MENU----------");
            System.out.println("1. Show all Villa");
            System.out.println("2. Show all House");
            System.out.println("3. Show all Room");
            System.out.println("4. Show All Name Villa Not Duplicate");
            System.out.println("5. Show All Name House Not Duplicate");
            System.out.println("6. Show All Name Name Not Duplicate");
            System.out.println("7.Back to menu");
            System.out.println("8. Exit");
            System.out.print("Enter your choose: ");
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("---------VILLA LIST---------");
                    List<Villa> listVilla = villaManager.getVillaToFile();
                    for (Villa villa : villaManager.getVillaToFile()){
                        villa.showInfo();
                    }
                    break;
                case 2:
                    System.out.println("----------HOUSE LIST---------");
                    for (House house:houseManager.getHouseToFile()) {
                        house.showInfo();
                    }
                    break;
                case 3:
                    System.out.println("----------ROOM LIST---------");
                    for (Room room:roomManager.getRoomToFile()) {
                        room.showInfo();
                    }
                    break;
            }
        }while (choose != 8);
    }
}
