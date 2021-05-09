
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        int[] arr=new int[100];
        int size=0;

        Scanner sc=new Scanner(System.in);
        do{
            menu();
            System.out.print("Nhập lựa chọn: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    size=inputSize();
                    inputArray(arr,size);
                    break;
                case 2:
                    displayArray(arr,size);
                    break;
                case 3:
                    System.out.println("Số chẵn lớn nhất trong mảng là: "+findMaxEven(arr,size));
                    break;
                case 4:
                    System.out.println("Danh sách các số chẵn trong mảng là : ");
                    displayEvenList(arr,size);
                    break;
                case 5:
                    System.out.println("Tổng các số chẵn trong mảng : "+sumEven(arr));
                    break;
                case 6:
                    insertValue(arr,size);
                    System.out.println("Mảng mới sau khi chèn là: ");
                    displayArray(arr,size+1);
                    break;
                case 7:
                    System.out.print("Nhập giá trị cần xóa: ");
                    int X=sc.nextInt();
                    int index=indexValue(arr,size,X);
                    int count=0;
                    while (index!=-1){
                        for (int i=index;i<size-count;i++){
                            arr[i]=arr[i+1];
                        }
                        count++;
                        index=indexValue(arr,size,X);
                    }
                    System.out.println("Mảng sau khi xóa "+count+" lần "+X+" là: ");
                    displayArray(arr,size-count);
                    break;
                case 8:
                    System.out.println("Mảng đảo ngược là: ");
                    reverseArray(arr,size);
                    displayArray(arr,size);
                    break;
                case 9:
                    System.out.println("Các số nguyên tố trong mảng là: ");
                    displayPrime(arr);
                    break;
                case 10:
                    System.out.println("Mảng theo thứ tự giảm dần là ");
                    sortArray(arr,size);
                    displayArray(arr,size);
                    break;
                case 11:
                    System.exit(0);
                    break;
            }

        }while(choice>=1&&choice<=11);
    }
    static void menu(){
        System.out.println("\n========MENU===========");
        System.out.println("1. Nhập mảng có kích thước N (0<N<100)");
        System.out.println("2. Hiển thị mảng vừa nhập");
        System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
        System.out.println("4. Liệt kê danh sách các số chẵn trong mảng");
        System.out.println("5. Tính tổng các số chẵn trong mảng");
        System.out.println("6. Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng, chèn giá trị đó vào mảng");
        System.out.println("7. Xóa tất cả các phần tử có giá trị bằng X khỏi mảng");
        System.out.println("8. Đảo ngược mảng ban đầu");
        System.out.println("9. Hiển thị danh sách các số nguyên tố trong mảng");
        System.out.println("10. Sắp xếp mảng theo thứ tự giảm dần");
        System.out.println("11. Thoát");
    }
    static int inputSize(){
        int N;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Nhap kich thuoc cua mang(0<N<100): ");
            N = sc.nextInt();
        }while(N<=0||N>=100);
        return N;
    }
    static void inputArray(int[] arr, int N){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap mang gom N phan tu: ");
        for(int i=0;i<N;i++){
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
    }
    static void displayArray(int[] arr, int N){
        System.out.println("Mang la: ");
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    static int findMaxEven(int[] arr,int N){
        int max=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0 && max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static void displayEvenList(int [] arr,int N){
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+"\t");
            }
        }
    }
    static int sumEven(int[]arr){
        int sum=0;
        for(int a:arr){
            if(a%2==0)
            sum+=a;
        }
        return sum;
    }
    static void insertValue(int[]arr,int N){
        Scanner sc=new Scanner(System.in);
        int X,vitri;
        System.out.print("Nhập giá trị X cần chèn: ");
        X = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        vitri = sc.nextInt();
        while (vitri>N || vitri<0){
            System.out.println("Nhập lại vị trí cần chèn: ");
            vitri = sc.nextInt();
        }
        for(int i=N;i>vitri;i--){
            arr[i]=arr[i-1];
        }
        arr[vitri]=X;

    }
    static int indexValue(int[]arr,int N,int X){
        int index=-1;
        for(int i=0;i<N;i++){
        if(X==arr[i]) {
            index=i;
            break;
        }
        }
        return index;
    }
    static void reverseArray(int[]arr,int N){
        int first=0;
        int last=N-1;
        while (first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    static boolean isPrime(int X){
        boolean isPrime=true;
        if(X<2) isPrime=false;
        else {
            for(int i=2;i<=Math.sqrt(X);i++){
                if(X%i==0) isPrime=false;
                break;
            }

        }
        return isPrime;
    }
    static void displayPrime(int[] arr){
        for (int a:arr) {
            if (isPrime(a)) {
                System.out.print(a + "\t");
            }
        }
    }
    static void sortArray(int[] arr, int N){
        for(int i=0;i<N;i++){
        int max=arr[i];
        int index=i;
        for(int j=i;j<N;j++){
            if(max<arr[j]){
                max=arr[j];
                index=j;
            }
        }
            arr[index]=arr[i];
        arr[i]=max;
        }
    }
}
