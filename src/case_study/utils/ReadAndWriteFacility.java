package case_study.utils;

import case_study.models.Employee;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteFacility {
    public static void writeVilla(Map<Villa, Integer> villaIntegerMap, boolean append) {
        File file = new File("src/case_study/datas/villa.csv");

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa,Integer> map: villaIntegerMap.entrySet()){
                bufferedWriter.write(map.getKey().getInfoVillaToCSV() +","+ map.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Villa,Integer> readVilla() {
        Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("src/case_study/datas/villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Villa villa;
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7],temp[8]);
                villaIntegerMap.put(villa, Integer.parseInt(temp[8]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaIntegerMap;
    }

    public static void writeHouse(Map<House, Integer> houseIntegerMap, boolean append) {
        File file = new File("src/case_study/datas/house.csv");

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House,Integer> map: houseIntegerMap.entrySet()){
                bufferedWriter.write(map.getKey().getInfoHouseToCSV() +","+ map.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<House,Integer> readHouse() {
        Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("src/case_study/datas/house.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            House house;
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                houseIntegerMap.put(house, Integer.parseInt(temp[8]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseIntegerMap;
    }

    public static void writeRoom(Map<Room, Integer> roomIntegerMap, boolean append) {
        File file = new File("src/case_study/datas/room.csv");

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room,Integer> map: roomIntegerMap.entrySet()){
                bufferedWriter.write(map.getKey().getInfoRoomToCSV() +","+ map.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room,Integer> readRoom() {
        Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("src/case_study/datas/room.csv");
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            String temp[];
            Room room;
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                roomIntegerMap.put(room, Integer.parseInt(temp[7]));
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomIntegerMap;
    }
}
