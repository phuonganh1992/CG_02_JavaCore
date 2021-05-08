public class TestStaticProperty {
    public static void main(String[] args) {
        Car car_1=new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car_2=new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        
    }
}
