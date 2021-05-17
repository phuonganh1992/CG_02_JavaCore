public class Main {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        hotel.input();
        hotel.display();
//        hotel.add();
//        hotel.display();
        System.out.println(hotel.find("m"));

//        hotel.delete("abc");
        System.out.println(hotel.calculateRent("m"));


    }


}
