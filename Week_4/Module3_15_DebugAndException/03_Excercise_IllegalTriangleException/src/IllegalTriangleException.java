public class IllegalTriangleException extends Exception {

    @Override
    public String getMessage() {
        return "3 sides are not sides of triangle";
    }
}
