package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;
import case_study.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
    private static Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
    private static Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();

    public final String VILLA_CODE_REGEX ="^(SVVL)[-][0-9]{4}$";
    public final String HOUSE_CODE_REGEX ="^(SVHO)[-][0-9]{4}$";
    public final String ROOM_CODE_REGEX ="^(SVRO)[-][0-9]{4}$";
    public final String SERVICE_NAME_REGEX ="^[A-Z][a-z]+";
//    public final String SERVICE_AREA_USE_REGEX = ""

    static Scanner sc = new Scanner(System.in);

    static {
        villaIntegerMap.put((new Villa("1","Villa1","200",300000000,4,"Year","A",15,2)),0);
        villaIntegerMap.put((new Villa("2","Villa2","200",300000000,4,"Year","A",15,2)),0);
        houseIntegerMap.put((new House("1","House1","200",10000000,4,"Month","C",2)),0);
        roomIntegerMap.put((new Room("1","Room1","200",200000000,4,"Year","Drink")),0);
    }

    @Override
    public void displayFacilityMaintenance() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter service's code:");
        String serviceCode = sc.nextLine();
        System.out.println("Enter service's name:");
        String serviceName = sc.nextLine();
        System.out.println("Enter service's area use:");
        String useArea = sc.nextLine();
        System.out.println("Enter service's cost:");
        int cost = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's maximum quantity:");
        int maximumQuantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's rent type:");
        String rentType = sc.nextLine();
        System.out.println("Enter service's room standard:");
        String roomStandard = sc.nextLine();
        System.out.println("Enter service's pool area:");
        int poolArea = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's number floors:");
        int numberFloors = Integer.parseInt(sc.nextLine());

        Villa villa = new Villa(serviceCode,serviceName,useArea,cost,maximumQuantity,rentType,roomStandard,poolArea,numberFloors);
        villaIntegerMap.put(villa,0);
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter service's code:");
        String serviceCode = sc.nextLine();
        System.out.println("Enter service's name:");
        String serviceName = sc.nextLine();
        System.out.println("Enter service's area use:");
        String useArea = sc.nextLine();
        System.out.println("Enter service's cost:");
        int cost = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's maximum quantity:");
        int maximumQuantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's rent type:");
        String rentType = sc.nextLine();
        System.out.println("Enter service's room standard:");
        String roomStandard = sc.nextLine();
        System.out.println("Enter service's number floors:");
        int numberFloors = Integer.parseInt(sc.nextLine());

        House house = new House(serviceCode,serviceName,useArea,cost,maximumQuantity,rentType,roomStandard,numberFloors);
        houseIntegerMap.put(house,0);
    }

    private String inputVillaCode(){
        System.out.println("Enter service's code:");
        return RegexData.regexStr(sc.nextLine(),VILLA_CODE_REGEX,"Wrong service's code entered");
    }

    private String inputHouseCode(){
        System.out.println("Enter service's code:");
        return RegexData.regexStr(sc.nextLine(),HOUSE_CODE_REGEX,"Wrong service's code entered");
    }

    private String inputRoomCode(){
        System.out.println("Enter service's code:");
        return RegexData.regexStr(sc.nextLine(),ROOM_CODE_REGEX,"Wrong service's code entered");
    }

    private String inputServiceName(){
        System.out.println("Enter service's name:");
        return RegexData.regexStr(sc.nextLine(),SERVICE_NAME_REGEX,"Wrong service's name entered");
    }

    private String inputAreaUse(){
        System.out.println("Enter service's area used:");
        return RegexData.regexStr(sc.nextLine(),VILLA_CODE_REGEX,"Wrong service's area used entered");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter service's code:");
        String serviceCode = sc.nextLine();
        System.out.println("Enter service's name:");
        String serviceName = sc.nextLine();
        System.out.println("Enter service's area use:");
        String useArea = sc.nextLine();
        System.out.println("Enter service's cost:");
        int cost = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's maximum quantity:");
        int maximumQuantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter service's rent type:");
        String rentType = sc.nextLine();
        System.out.println("Enter service's free:");
        String serviceFree = sc.nextLine();

        Room room = new Room(serviceCode,serviceName,useArea,cost,maximumQuantity,rentType,serviceFree);
        roomIntegerMap.put(room,0);
    }

    @Override
    public void displayVilla() {
        System.out.println("----List of Villa facility----");
        for (Map.Entry<Villa,Integer> villaIntegerEntry : villaIntegerMap.entrySet()){
            System.out.println(villaIntegerEntry);
        }
    }

    @Override
    public void displayHouse() {
        System.out.println("----List of House facility----");
        for (Map.Entry<House,Integer> houseIntegerEntry : houseIntegerMap.entrySet()){
            System.out.println(houseIntegerEntry);
        }
    }

    @Override
    public void displayRoom() {
        System.out.println("----List of Room facility----");
        for (Map.Entry<Room,Integer> roomIntegerEntry : roomIntegerMap.entrySet()){
            System.out.println(roomIntegerEntry);
        }
    }


}
