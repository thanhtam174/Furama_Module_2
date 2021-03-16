package controllers.manager;

import commons.ReaderAndWriterFile;
import models.InputData;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager extends InputData {
    Scanner scanner =new Scanner(System.in);
    List<Villa> villaList;

    public Villa addNewVilla(){
        Villa villa = new Villa(inputIdVilla(),inputServiceName(),inputAreaUsed(),inputRentalCost(),inputMaxNumberPeople(),inputRentalType(),inputStandard(),inputOtherAmenities(),inputPoolArea(),inputNumberOfFloors());
        ReaderAndWriterFile readerAndWriterFile = new ReaderAndWriterFile();
        readerAndWriterFile.writer(villa, "F:\\Furama_Module_2\\src\\data\\villa.csv");
        return villa;
    }

    public Villa addNewVilla(String[] data){
        Villa villa = new Villa(data[0], data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),data[5],data[6],data[7],Double.parseDouble(data[8]),Integer.parseInt(data[9]));
        villaList.add(villa);
        return villa;
    }

    public List<Villa> getVillaToFile(){
        villaList = new ArrayList<>();
        ReaderAndWriterFile readerFile =new ReaderAndWriterFile();
        List<String[]> listData = readerFile.Reader("F:\\Furama_Module_2\\src\\data\\villa.csv");
        for (String[] data:listData) {
            addNewVilla(data);
        }
        return villaList;
    }

    public void showVilla(){
        for (Villa villa:getVillaToFile()) {
            System.out.println(villa);
        }
    }
}
