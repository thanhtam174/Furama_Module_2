package controllers.manager;

import commons.FileUtils;
import models.House;
import commons.regex.InputData;

import java.util.ArrayList;
import java.util.List;

public class HouseManager extends InputData {
    List<House> houseList;

    public House addNewHouse(){
        House house =new House(inputIdHouse(),inputServiceName(),inputAreaUsed(),inputRentalCost(),inputMaxNumberPeople(),inputRentalType(),inputStandard(),inputOtherAmenities(),inputNumberOfFloors());
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("house");
        fileUtils.writeFile(house.getInfo());
        return house;
    }

    public House addNewHouse(String[] data){
        House house = new House(data[0], data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),data[5],data[6],data[7],Integer.parseInt(data[8]));
        houseList.add(house);
        return house;
    }

    public List<House> getHouseToFile(){
        houseList = new ArrayList<>();
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("house");
        List<String> listInfo = FileUtils.readFile();
        for (String info:listInfo) {
            String[] data = info.split(",");
            addNewHouse(data);
        }
        return houseList;
    }

    public void showHouse(){
        int i =1;
        for (House house:getHouseToFile()) {
            System.out.println(i+". ");
            System.out.println(house);
            i++;
        }
    }
}
