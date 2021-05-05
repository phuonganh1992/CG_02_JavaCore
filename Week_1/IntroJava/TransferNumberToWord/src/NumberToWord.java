import java.util.Scanner;

public class NumberToWord {
    public static String readOnes(int num) {
        String ones = "";
        switch (num) {
            case 1:
                ones = "one";
                break;
            case 2:
                ones = "two";
                break;
            case 3:
                ones = "three";
                break;
            case 4:
                ones = "four";
                break;
            case 5:
                ones = "five";
                break;
            case 6:
                ones = "six";
                break;
            case 7:
                ones = "seven";
                break;
            case 8:
                ones = "eight";
                break;
            case 9:
                ones = "nine";
                break;
        }
        return ones;
    }

    public static String readTens(int num) {
        String tens = "";
        switch (num) {
            case 2:
                tens = "twenty";
                break;
            case 3:
                tens = "thirty";
                break;
            case 4:
                tens = "forty";
                break;
            case 5:
                tens = "fifty";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                  tens=readOnes(num)+"ty";
                  break;
        }
        return tens;
    }

    public static String readHundreds(int num) {
        return readOnes(num) + " hundred";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        int digit_ones=number%10;
        int digit_hundreds=Math.round(number/100);
        int digit_tens=(number-digit_ones-digit_hundreds*100)/10;
        String ones;
        String tens = "";
        String hundreds;
        
        if (number < 10 && number > 0) {
            ones = readOnes(digit_ones);
            System.out.println(ones);
        } else if(number>=10 && number<20) {
                   switch (number) {
                       case 10:
                           tens="ten";
                           break;
                       case 11:
                           tens="eleven";
                           break;
                       case 12:
                           tens="twelve";
                           break;
                       case 13:
                           tens="thirteen";
                           break;
                       case 14:
                           tens="fourteen";
                           break;
                       case 15:
                           tens="fifteen";
                           break;
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                           tens=readOnes(digit_ones)+"teen";
                           break;
                   }
            System.out.println(tens);
        } else if (number >= 20 && number < 100) {
            ones=readOnes(digit_ones);
            tens=readTens(digit_tens);
            System.out.println(tens+"-"+ones);
        } else if(number>=100 && number<1000) {
            ones=readOnes(digit_ones);
            tens=readTens(digit_tens);
            hundreds=readHundreds(digit_hundreds);
            System.out.println(hundreds+" and "+tens+"-"+ones);
        } else {
            System.out.println("out of ability");
        }
    }
}


