import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Integer[] arr=new Integer[100];
        Random rd=new Random();
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rd.nextInt();
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr=arrayExample.createRandom();
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("Vui lòng nhập chỉ số của phần tử bất kỳ: ");
        try {
            int x = sc.nextInt();
            System.out.println("Giá trị của phần từ " + x + " là " + arr[x]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}
