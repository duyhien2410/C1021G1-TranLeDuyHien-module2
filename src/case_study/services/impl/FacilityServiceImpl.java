package case_study.services.impl;

import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;
import case_study.utils.ReadAndWriteFacility;
import case_study.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();
    private static Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
    private static Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();

    public final String VILLA_CODE_REGEX ="^(SVVL)-\\d{4}$";
    public final String HOUSE_CODE_REGEX ="^(SVHO)[-][0-9]{4}$";
    public final String ROOM_CODE_REGEX ="^(SVRO)[-][0-9]{4}$";
    public final String SERVICE_TYPE_NAME_STANDARD_REGEX ="^[A-Z][a-z]+";       //general use name, service type, standard.
    public final String SERVICE_AREA_USE_AND_POOL_AREA_REGEX = "^([3-9]\\d+)|([1-9]\\d{2,})$";   //general use area use, area pool.
    public final String SERVICE_COST_REGEX = "^[1-9][0-9]*$";
    public final String SERVICE_MAXIMUM_QUANTITY_REGEX = "^[1-9]|[1]\\d$";
    public final String SERVICE_FLOORS_REGEX = "^[1-9][0-9]*$";
    public final String SERVICE_FREE_REGEX ="^[A-Z][a-z]+";

    static Scanner sc = new Scanner(System.in);

    static {
        villaIntegerMap.put((new Villa("1","Villa1","200","300000000","4","Year","A","15","2")),0);
        villaIntegerMap.put((new Villa("2","Villa2","200","300000000","4","Year","A","15","2")),0);
        houseIntegerMap.put((new House("1","House1","200","10000000","4","Month","C","2")),0);
        roomIntegerMap.put((new Room("1","Room1","200","200000000","4","Year","Drink")),0);
    }

    @Override
    public void displayFacilityMaintenance() {

    }

    @Override
    public void addNewVilla() {
        String serviceCode = inputVillaCode();
        String serviceName = inputServiceName();
        String useArea = inputAreaUse();
        String cost = inputCost();
        String maximumQuantity = inputMaximumQuantity();
        String rentType = inputRentType();
        String roomStandard = inputStandard();
        String poolArea = inputAreaPool();
        String numberFloors = inputNumberFloors();


        Villa villa = new Villa(serviceCode,serviceName,useArea,cost,maximumQuantity,rentType,roomStandard,poolArea,numberFloors);
        villaIntegerMap.put(villa,0);
        ReadAndWriteFacility.writeVilla(villaIntegerMap,true);
    }

    @Override
    public void addNewHouse() {
        String serviceCode = inputHouseCode();
        String serviceName = inputServiceName();
        String useArea = inputAreaUse();
        String cost = inputCost();
        String maximumQuantity = inputMaximumQuantity();
        String rentType = inputRentType();
        String roomStandard = inputStandard();
        String numberFloors = inputNumberFloors();

        House house = new House(serviceCode,serviceName,useArea,cost,maximumQuantity,rentType,roomStandard,numberFloors);
        houseIntegerMap.put(house,0);
        ReadAndWriteFacility.writeHouse(houseIntegerMap,true);
    }

    @Override
    public void addNewRoom() {
        String serviceCode = inputRoomCode();
        String serviceName = inputServiceName();
        String useArea = inputAreaUse();
        String cost = inputCost();
        String maximumQuantity = inputMaximumQuantity();
        String rentType = inputRentType();
        String serviceFree = inputServiceFree();

        Room room = new Room(serviceCode,serviceName,useArea,cost,maximumQuantity,rentType,serviceFree);
        roomIntegerMap.put(room,0);
        ReadAndWriteFacility.writeRoom(roomIntegerMap,true);
    }

    private String inputVillaCode(){
        System.out.print("Enter service's code:");
        return RegexData.regexStr(sc.nextLine(),VILLA_CODE_REGEX,"Wrong service's code entered");
    }

    private String inputHouseCode(){
        System.out.print("Enter service's code:");
        return RegexData.regexStr(sc.nextLine(),HOUSE_CODE_REGEX,"Wrong service's code entered");
    }

    private String inputRoomCode(){
        System.out.print("Enter service's code:");
        return RegexData.regexStr(sc.nextLine(),ROOM_CODE_REGEX,"Wrong service's code entered");
    }

    private String inputServiceName(){
        System.out.print("Enter service's name:");
        return RegexData.regexStr(sc.nextLine(), SERVICE_TYPE_NAME_STANDARD_REGEX,"Wrong service's name entered");
    }

    private String inputAreaUse(){
        System.out.print("Enter service's area used:");
        return RegexData.regexStr(sc.nextLine(), SERVICE_AREA_USE_AND_POOL_AREA_REGEX,"Wrong service's area used entered");
    }

    private String inputCost(){
        System.out.print("Enter service's cost:");
        return RegexData.regexStr(sc.nextLine(), SERVICE_COST_REGEX,"Wrong service's cost entered");
    }

    private String inputMaximumQuantity(){
        System.out.print("Enter service's maximum quantity:");
        return RegexData.regexStr(sc.nextLine(),SERVICE_MAXIMUM_QUANTITY_REGEX,"Wrong service's maximum quantity entered");
    }

    private String inputNumberFloors(){
        System.out.print("Enter service's number floors used:");
        return RegexData.regexStr(sc.nextLine(),SERVICE_FLOORS_REGEX,"Wrong service's number floors entered");
    }

    private String inputStandard(){
        System.out.print("Enter service's standard:");
        return RegexData.regexStr(sc.nextLine(),SERVICE_TYPE_NAME_STANDARD_REGEX,"Wrong service's standard entered");
    }

    private String inputRentType(){
        System.out.print("Enter service's rent type used:");
        return RegexData.regexStr(sc.nextLine(),SERVICE_TYPE_NAME_STANDARD_REGEX,"Wrong service's rent type entered");
    }

    private String inputAreaPool(){
        System.out.print("Enter service's area pool:");
        return RegexData.regexStr(sc.nextLine(), SERVICE_AREA_USE_AND_POOL_AREA_REGEX,"Wrong service's area pool entered");
    }

    private String inputServiceFree(){
        System.out.print("Enter service free:");
        return RegexData.regexStr(sc.nextLine(), SERVICE_FREE_REGEX,"Wrong service free entered");
    }

    @Override
    public void displayVilla() {
        System.out.println("----List of Villa facility----");
        Map<Villa,Integer> villaIntegerMap1 = ReadAndWriteFacility.readVilla();
        for (Map.Entry<Villa,Integer> villaIntegerEntry : villaIntegerMap1.entrySet()){
            System.out.println(villaIntegerEntry);
        }
    }

    @Override
    public void displayHouse() {
        System.out.println("----List of House facility----");
        Map<House,Integer> houseIntegerMap1 = ReadAndWriteFacility.readHouse();
        for (Map.Entry<House,Integer> houseIntegerEntry : houseIntegerMap1.entrySet()){
            System.out.println(houseIntegerEntry);
        }
    }

    @Override
    public void displayRoom() {
        System.out.println("----List of Room facility----");
        Map<Room,Integer> roomIntegerMap1 = ReadAndWriteFacility.readRoom();
        for (Map.Entry<Room,Integer> roomIntegerEntry : roomIntegerMap1.entrySet()){
            System.out.println(roomIntegerEntry);
        }
    }
}
