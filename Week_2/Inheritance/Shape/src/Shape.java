public class Shape {
    private String color="green";
    private boolean filled=true;
    public Shape(){}
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

        public static void main(String[] args) {
        //test shape
            Shape shape = new Shape();
            System.out.println(shape);

            shape = new Shape("red", false);
            System.out.println(shape);

        //test circle
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(3.5);
            System.out.println(circle);

            circle = new Circle(3.5, "indigo", false);
            System.out.println(circle);

        //test rectangle
            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle);

            rectangle = new Rectangle(2.3, 5.8);
            System.out.println(rectangle);

            rectangle = new Rectangle(2.5, 3.8, "orange", true);
            System.out.println(rectangle);
        //test square
            Square square = new Square();
            System.out.println(square);
            square = new Square(2.3);
            System.out.println(square);

            square = new Square(5.8, "yellow", true);
            System.out.println(square);

        }

}


