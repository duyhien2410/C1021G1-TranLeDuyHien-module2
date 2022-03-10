package ss11_dsa_stack_queue.bai_tap.dem_so_lan_cua_moi_tu_trong_chuoi_use_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountTimes {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Map<String,Integer> treeMap = new TreeMap<>();

                System.out.print("Nhập một chuỗi:");
                String string = sc.nextLine();

                for (int i = 0 ; i < string.length();i++){
                        String character = String.valueOf(string.charAt(i));
                        if( treeMap.containsKey(character)){
                                int presentValue = treeMap.get(character);
                                treeMap.replace(character,presentValue+1);
                        }else{
                                treeMap.put(character,1);
                        }
                }
                System.out.println(treeMap);
        }
}
