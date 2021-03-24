package models;

public class House extends Services {
    private String standardOfRoom;
    private String otherAmenities;
    private int numberOfFloors;

    public House(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String rentalType, String standardOfRoom, String otherAmenities, int numberOfFloors) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, rentalType);
        this.standardOfRoom = standardOfRoom;
        this.otherAmenities = otherAmenities;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardOfRoom='" + standardOfRoom + '\'' +
                ", otherAmenities='" + otherAmenities + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}'+super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }

    public String[] getInfo(){
        String[] info = {super.getId(),super.getNameService(), String.valueOf(super.getAreaUsed()), String.valueOf(super.getRentalCosts()), String.valueOf(super.getMaxNumberOfPeople()),super.getRentalType(),getStandardOfRoom(),getOtherAmenities(), String.valueOf(getNumberOfFloors())};
        return info;
    }
}
