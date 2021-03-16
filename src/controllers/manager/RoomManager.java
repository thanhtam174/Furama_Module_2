package controllers.manager;

import commons.ReaderAndWriterFile;
import models.InputData;
import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManager extends InputData {
    List<Room> roomList;

    public Room addNewRoom() {
        Room room = new Room(inputIdRoom(), inputServiceName(), inputAreaUsed(), inputRentalCost(), inputMaxNumberPeople(), inputRentalType(), inputFreeService());
        ReaderAndWriterFile readerAndWriterFile = new ReaderAndWriterFile();
        readerAndWriterFile.writer(room,"F:\\Furama_Module_2\\src\\data\\room.csv");
        return room;
    }

    public Room addNewRoom(String[] data){
        Room room = new Room(data[0], data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),data[5],data[6]);
        roomList.add(room);
        return room;
    }

    public List<Room> getRoomToFile(){
        roomList = new ArrayList<>();
        ReaderAndWriterFile readerFile =new ReaderAndWriterFile();
        List<String[]> listData = readerFile.Reader("F:\\Furama_Module_2\\src\\data\\villa.csv");
        for (String[] data:listData) {
            addNewRoom(data);
        }
        return roomList;
    }
}
