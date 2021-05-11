public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[5];
        shapes[0]=new Circle(3);
        shapes[1]=new Rectangle(4,5);
        shapes[2]=new Square(6);
        shapes[3]=new Circle(7);
        shapes[4]=new Square(8);

//        for(Shape shape:shapes){
//            switch (shape.getClass()){
//                case Square:
//                    System.out.println(1);
//                    break;
//            }
//        }
        System.out.println(shapes[4].getClass());
        for (Shape shape:shapes){
            System.out.println(shape);
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }

    }


}
