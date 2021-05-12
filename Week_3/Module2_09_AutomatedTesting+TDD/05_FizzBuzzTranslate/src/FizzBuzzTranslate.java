public class FizzBuzzTranslate {
    public static final String REINPUT = "Pls re-input: ";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";


    public static String translate(int number){
        boolean isFizz = includeDigit(number,3);
        boolean isBuzz = includeDigit(number,5);
        if(number<0) return REINPUT;
        else if(isFizz && isBuzz) return FIZZ_BUZZ;
            else if(isFizz && !isBuzz) return FIZZ;
                else if(!isFizz && isBuzz) return BUZZ;
                    else return convertNumberToWord(number);

    }
    public static String convertNumberToWord(int number){
        int ones=number%10;
        int tens=Math.round(number/10);
        return convertDigitToWord(tens)+" "+convertDigitToWord(ones);

    }
    public static boolean includeDigit(int number,int digit){
        int ones=number%10;
        int tens=Math.round(number/10);
        if(ones==digit || tens==digit) return true;
        return false;

    }
    public static String convertDigitToWord(int digit){
        int[] digitList={0,1,2,3,4,5,6,7,8,9};
        String[] wordList={"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        int index=-1;
        for (int i = 0; i < 10; i++) {
            if(digit==digitList[i]){
                index=i;
                break;
            }
        }
        return wordList[index];
    }
}
