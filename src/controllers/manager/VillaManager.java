package controllers.manager;

import commons.FileUtils;
import commons.regex.InputData;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager extends InputData {
    Scanner scanner =new Scanner(System.in);
    List<Villa> villaList;

    public Villa addNewVilla(){
        Villa villa = new Villa(inputIdVilla(),inputServiceName(),inputAreaUsed(),inputRentalCost(),inputMaxNumberPeople(),inputRentalType(),inputStandard(),inputOtherAmenities(),inputPoolArea(),inputNumberOfFloors());
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("villa");
        FileUtils.writeFile(villa.getInfo());
        return villa;
    }

    public Villa addNewVilla(String[] data){
        Villa villa = new Villa(data[0], data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),data[5],data[6],data[7],Double.parseDouble(data[8]),Integer.parseInt(data[9]));
        villaList.add(villa);
        return villa;
    }

    public List<Villa> getVillaToFile(){
        villaList = new ArrayList<>();
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("villa");
        List<String> listInfo = fileUtils.readFile();
        for (String info:listInfo) {
            String[] data =info.split(",");
            addNewVilla(data);
        }
        return villaList;
    }

    public void showVilla(){
        int i =1;
        for (Villa villa:getVillaToFile()) {
            System.out.println(i+". ");
            System.out.println(villa);
            i++;
        }
    }
}
