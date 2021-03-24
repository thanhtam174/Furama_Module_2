package controllers.manager;

import commons.FileUtils;
import commons.regex.InputData;
import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManager extends InputData {
    List<Room> roomList;

    public Room addNewRoom() {
        Room room = new Room(inputIdRoom(), inputServiceName(), inputAreaUsed(), inputRentalCost(), inputMaxNumberPeople(), inputRentalType(), inputFreeService());
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("room");
        fileUtils.writeFile(room.getInfo());
        return room;
    }

    public Room addNewRoom(String[] data){
        Room room = new Room(data[0], data[1],Double.parseDouble(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),data[5],data[6]);
        roomList.add(room);
        return room;
    }

    public List<Room> getRoomToFile(){
        roomList = new ArrayList<>();
        FileUtils fileUtils = new FileUtils();
        fileUtils.setFullPathFile("room");
        List<String> listInfo = FileUtils.readFile();
        for (String info:listInfo) {
            String[] data = info.split(",");
            addNewRoom(data);
        }
        return roomList;
    }

    public void showRoom(){
        int i =1;
        for (Room room:getRoomToFile()) {
            System.out.println(i+". ");
            System.out.println(room);
            i++;
        }
    }
}
