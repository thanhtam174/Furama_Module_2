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
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    public String [] getInfo(){
        String[] info = {super.getId(),super.getNameService(), String.valueOf(super.getAreaUsed()), String.valueOf(super.getRentalCosts()), String.valueOf(super.getMaxNumberOfPeople()),super.getRentalType(),getFreeService()};
        return info;
    }
}
