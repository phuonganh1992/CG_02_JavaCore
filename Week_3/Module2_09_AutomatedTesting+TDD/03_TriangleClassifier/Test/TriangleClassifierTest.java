import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
     void checkEquilateralTriangle() {
        int side1=2;
        int side2=2;
        int side3=2;
        String expectedResult="equilateral triangle";
        TriangleClassifier classifier=new TriangleClassifier(side1,side2,side3);
        String result=classifier.checkTriangle();
        assertEquals(expectedResult,result);
    }

    @Test
    void checkIsoscelesTriangle() {
        int side1=2;
        int side2=2;
        int side3=3;
        String expectedResult="isosceles triangle";
        TriangleClassifier classifier=new TriangleClassifier(side1,side2,side3);
        String result=classifier.checkTriangle();
        assertEquals(expectedResult,result);
    }
    @Test
    void checkTriangle() {
        int side1=3;
        int side2=4;
        int side3=5;
        String expectedResult="triangle";
        TriangleClassifier classifier=new TriangleClassifier(side1,side2,side3);
        String result=classifier.checkTriangle();
        assertEquals(expectedResult,result);
    }
    @Test
    void checkNotTriangle1() {
        int side1=8;
        int side2=2;
        int side3=3;
        String expectedResult="not triangle";
        TriangleClassifier classifier=new TriangleClassifier(side1,side2,side3);
        String result=classifier.checkTriangle();
        assertEquals(expectedResult,result);
    }
    @Test
    void checkNotTriangle2() {
        int side1=-1;
        int side2=2;
        int side3=1;
        String expectedResult="not triangle";
        TriangleClassifier classifier=new TriangleClassifier(side1,side2,side3);
        String result=classifier.checkTriangle();
        assertEquals(expectedResult,result);
    }
    @Test
    void checkNotTriangle3() {
        int side1=0;
        int side2=1;
        int side3=1;
        String expectedResult="not triangle";
        TriangleClassifier classifier=new TriangleClassifier(side1,side2,side3);
        String result=classifier.checkTriangle();
        assertEquals(expectedResult,result);
    }
}