import java.util.Scanner;

public class RealNumber {
    private final char DECIMAL_POINT=',';
    private double integerNumber;
    private double decimalNumber;

    public RealNumber() {
    }

    public RealNumber(double integerNumber, double decimalNumber) {
        this.integerNumber = integerNumber;
        this.decimalNumber = decimalNumber;
    }

    public double getIntegerNumber() {
        return integerNumber;
    }

    public void setIntegerNumber(double integerNumber) {
        this.integerNumber = integerNumber;
    }

    public double getDecimalNumber() {
        return decimalNumber;
    }

    public void setDecimalNumber(double decimalNumber) {
        this.decimalNumber = decimalNumber;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        integerNumber=sc.nextDouble();
        System.out.println("Enter a decimal number: ");
        decimalNumber=sc.nextDouble();
    }
    public double sum(RealNumber realNumber_1,RealNumber realNumber_2){
        return 0;
    }
    @Override
    public String toString() {
        return "RealNumber{" +
                integerNumber +
                DECIMAL_POINT +
                decimalNumber +
                '}';
    }
}
