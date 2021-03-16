package controllers.manager;

import commons.ReaderAndWriterFile;
import models.House;
import models.InputData;

import java.util.ArrayList;
import java.util.List;

public class HouseManager extends InputData {
    List<House> houseList;

    public House addNewHouse(){
        House house =new House(inputIdHouse(),inputServiceName(),inputAreaUsed(),inputRentalCost(),inputMaxNumberPeople(),inputRentalType(),inputStandard(),inputOtherAmenities(),inputNumberOfFloors());
        ReaderAndWriterFile readerAndWriterFile = new ReaderAndWriterFile();
        readerAndWriterFile.writer(house,"F:\\Furama_Module_2\\src\\data\\house.csv");
        return house;
    }

    public House addNewHouse(String[] data){
        House house = new House(data[0], data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),data[5],data[6],data[7],Integer.parseInt(data[8]));
        houseList.add(house);
        return house;
    }

    public List<House> getHouseToFile(){
        houseList = new ArrayList<>();
        ReaderAndWriterFile readerFile =new ReaderAndWriterFile();
        List<String[]> listData = readerFile.Reader("F:\\Furama_Module_2\\src\\data\\villa.csv");
        for (String[] data:listData) {
            addNewHouse(data);
        }
        return houseList;
    }
}
