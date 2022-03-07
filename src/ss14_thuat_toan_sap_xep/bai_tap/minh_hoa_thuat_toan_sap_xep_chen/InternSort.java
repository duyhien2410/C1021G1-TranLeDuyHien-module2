package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InternSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {99, 16, -7, 5, 14, 2, -168, 168};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}