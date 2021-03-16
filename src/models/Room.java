package models;

public class Room extends Services{
    private String freeService;

    public Room(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String rentalType, String freeService) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.getId() + ", " + super.getNameService() + ", " + super.getAreaUsed() + ", " + super.getRentalCosts() + ", " +
                super.getMaxNumberOfPeople() + ", " + super.getRentalType() + ", " + getFreeService();
    }

    @Override
    public void showInfo() {
        System.out.println("Room{" +
                "id='" + super.getId() + '\'' +
                ", nameService='" + super.getNameService() + '\'' +
                ", areaUsed=" + super.getAreaUsed() +
                ", rentalCosts=" + super.getRentalCosts() +
                ", maxNumberOfPeople=" + super.getMaxNumberOfPeople() +
                ", rentalType='" + super.getRentalType() + '\'' +
                "freeService='" + freeService + '\'' +
                '}');
    }
}
