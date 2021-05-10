import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long[] arr=new long[10];
//        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=Math.round(Math.random()*100);
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
        Arrays.sort(arr);
        System.out.println("After sort:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
