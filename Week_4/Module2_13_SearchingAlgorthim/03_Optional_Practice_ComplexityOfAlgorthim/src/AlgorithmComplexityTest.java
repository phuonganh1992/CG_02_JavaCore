import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String inputString=sc.nextLine();
        System.out.println(inputString);
        int[] frequentChar=new int[255];                        //{1}   O(1)
        for (int i = 0; i < inputString.length(); i++) {        //{2}   O((n)*1)=O(n) n là độ dài chuỗi ký tự
            int ascii=inputString.charAt(i);                    //{3}   O(1)
            frequentChar[ascii]+=1;                             //{4}   O(1)
        }
        int max=0;                                              //{5}   O(1)
        char character=(char) 255;                              //{6}   O(1)
        for (int i=0;i<255;i++){                                //{7}   O(255)
            if (max<frequentChar[i]) {                          //{8}   O(1)
                max=frequentChar[i];                            //{9}   O(1)
                character=(char) i;                             //{10}  O(1)
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
/*
Độ phức tạp thuật toán là thời gian thực hiện chuối lệnh 1,2,5,6,7 được tính băng thời gian lâu nhất của chuổi lệnh;
TH1: n<255 -->Độ phức tạp thuật toán là thời gian thực hiện lệnh 7 và bằng O(255);
TH2: n>255 --->Độ phức tạp thuật toán là thời gian thực hiện lệnh 2 và bằng O(n);



 */