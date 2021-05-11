public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(4);
        shapes[1]=new Rectangle(5,6);
        shapes[2]=new Square(7);
        System.out.println("Before resize: ");

        for(Shape shape:shapes){
            System.out.println(shape);
        }

        System.out.println("Afer resize: ");
        for(Shape shape:shapes){
            double percent=Math.round(Math.random()*100+1);

            if(shape instanceof Resizeable){
                System.out.print("Percent is: ");
                System.out.println(percent);
                ((Resizeable) shape).resize(percent);
                System.out.println(shape);
            }
        }

    }
}
