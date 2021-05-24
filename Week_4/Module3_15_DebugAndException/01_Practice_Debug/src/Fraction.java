import java.util.InputMismatchException;
import java.util.Scanner;

public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) throws Exception {
        if(denominator==0) throw new Exception("Lỗi toán học");
        this.numerator = numerator;
        this.denominator = denominator;
    }


}
