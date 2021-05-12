public class TriangleClassifier {
    public static final String EQUILATERAL_TRIANGLE = "equilateral triangle";
    public static final String TRIANGLE = "triangle";
    public static final String ISOSCELES_TRIANGLE = "isosceles triangle";
    public static final String NOT_TRIANGLE = "not triangle";
    private int side1;
    private int side2;
    private int side3;

    public TriangleClassifier(int side1, int side2, int side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public String checkTriangle(){
        boolean equalSide12=side1==side2;
        boolean equalSide13=side1==side3;
        boolean equalSide23=side2==side3;
        boolean positiveSide1 = side1 > 0;
        boolean positiveSide2 = side2 > 0;
        boolean positiveSide3 = side3 > 0;
        boolean biggerThanSide3 = side1 + side2 > side3;
        boolean biggerThanSide1 = side3 + side2 > side1;
        boolean biggerThanSide2 = side1 + side3 > side2;
        if(positiveSide1 && positiveSide2 && positiveSide3 && biggerThanSide3 && biggerThanSide1 && biggerThanSide2){
            if(equalSide12 && equalSide23) return EQUILATERAL_TRIANGLE;
            if((equalSide12 && !equalSide23) || (equalSide13 && !equalSide12) ||(equalSide23 && !equalSide12)) return ISOSCELES_TRIANGLE;
            return TRIANGLE;
        } else return NOT_TRIANGLE;

    }

}
