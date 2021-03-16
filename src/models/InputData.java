package models;

import commons.InvalidException;
import commons.regex.*;

import java.util.Scanner;

public abstract class InputData {
    Scanner scanner = new Scanner(System.in);

    public String inputIdVilla() {
        while (true) {
            try {
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                NameExample nameExample = new NameExample();
                nameExample.validate(id);
                return id;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputIdHouse() {
        while (true) {
            try {
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                NameExample nameExample = new NameExample();
                nameExample.validate(id);
                return id;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputIdRoom() {
        while (true) {
            try {
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                NameExample nameExample = new NameExample();
                nameExample.validate(id);
                return id;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputServiceName() {
        while (true) {
            try {
                System.out.print("Enter sevice's name: ");
                String name = scanner.nextLine();
                NameExample nameExample = new NameExample();
                nameExample.validate(name);
                return name;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double inputAreaUsed() {
        while (true) {
            try {
                System.out.print("Enter area used: ");
                AreaExample areaExample = new AreaExample();
                double area = Double.parseDouble(scanner.nextLine());
                areaExample.validate(area);
                return area;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double inputRentalCost() {
        while (true) {
            try {
                System.out.print("Enter rental costs: ");
                double rentalCost = Double.parseDouble(scanner.nextLine());
                PositiveIntegerExample positiveIntegerExample = new PositiveIntegerExample();
                positiveIntegerExample.validate(rentalCost);
                return rentalCost;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int inputMaxNumberPeople() {
        while (true) {
            try {
                System.out.print("Enter maximum number of people: ");
                int numberPeople = Integer.parseInt(scanner.nextLine());
                MaxNumberPeopleExample maxPeople = new MaxNumberPeopleExample();
                maxPeople.validate(numberPeople);
                return numberPeople;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputRentalType() {
        while (true) {
            try {
                System.out.print("Enter rental type: ");
                String rentalType = scanner.nextLine();
                NameExample nameExample = new NameExample();
                nameExample.validate(rentalType);
                return rentalType;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputStandard() {
        while (true) {
            try {
                System.out.print("Enter standard of room: ");
                String standard = scanner.nextLine();
                NameExample nameExample = new NameExample();
                nameExample.validate(standard);
                return standard;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputOtherAmenities() {
        System.out.print("Enter other amenities: ");
        String otherAmenities = scanner.nextLine();
        return otherAmenities;
    }

    public double inputPoolArea() {
        while (true) {
            try {
                System.out.print("Enter area of pool: ");
                double poolArea = Double.parseDouble(scanner.nextLine());
                AreaExample areaExample = new AreaExample();
                areaExample.validate(poolArea);
                return poolArea;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public int inputNumberOfFloors() {
        while (true) {
            try {
                System.out.print("Enter number of floors: ");
                int numberFloor = Integer.parseInt(scanner.nextLine());
                PositiveIntegerExample positiveIntegerExample = new PositiveIntegerExample();
                positiveIntegerExample.validate(numberFloor);
                return numberFloor;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputFreeService() {
        while (true) {
            try {
                System.out.print("Enter free services: ");
                String freeService = scanner.nextLine();
                FreeServiceExample freeServiceExample = new FreeServiceExample();
                freeServiceExample.validate(freeService);
                return freeService;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputName() {
        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();
        return name;
    }

    public String inputDateOfBirth() {
        while (true) {
            try {
                System.out.print("Enter date of birth: ");
                String date = scanner.nextLine();
                DateExample dateExample = new DateExample();
                dateExample.validate(date);
                return date;
            } catch (InvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputGender() {
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        return gender;
    }

    public String inputIdentityCard() {
        System.out.print("Enter identity card number: ");
        String cardNumber = scanner.nextLine();
        return cardNumber;
    }

    public String inputPhoneNumber(){
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        return phoneNumber;
    }

    public String inputEmail(){
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        return email;
    }

    public String inputTypeCustomer(){
        System.out.print("Enter customer type: ");
        String type = scanner.nextLine();
        return type;
    }

    public String inputAddress(){
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        return address;
    }
}
