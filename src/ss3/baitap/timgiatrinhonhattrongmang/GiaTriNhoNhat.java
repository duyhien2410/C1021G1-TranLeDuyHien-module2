package ss3.baitap.timgiatrinhonhattrongmang;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        int num[]=new int[] {5, 2, 3, 1, 5, 19, 7, 9};

        int min = num[0];
        int max = num[0];

        for (int i=0; i<num.length; i++){
            if (num[i]<min){
                min=num[i];
            }
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: "+min);
        System.out.println("Giá trị lớn nhất là: "+max);
    }
}
