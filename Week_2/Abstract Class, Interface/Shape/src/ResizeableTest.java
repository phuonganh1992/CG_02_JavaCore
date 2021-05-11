public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(4);
        shapes[1]=new Rectangle(5,6);
        shapes[2]=new Square(7);
        for(Shape shape:shapes){
            System.out.println(shape);
            if(shape instanceof Square){
                Resizeable rs=(Square)shape;
                rs.resize(3);
                System.out.println(shape);
            }
        }

    }
}
