import java.util.Scanner;

public class Room {
    private final String ROOM_A="A";
    private final String ROOM_B="B";
    private final String ROOM_C="C";
    private final int PRICE_A=500;
    private final int PRICE_B=300;
    private final int PRICE_C=100;
    private String category;
    private int price;

    public Room() {

    }

    public Room(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("A. Room A with price $500");
        System.out.println("B. Room B with price $300");
        System.out.println("C. Room C with price $100");
        System.out.print("Enter category: ");
        this.category=sc.nextLine();
        switch (category){
            case "A":
                this.category=ROOM_A;
                this.price=PRICE_A;
                break;
            case "B":
                this.category=ROOM_B;
                this.price=PRICE_B;
                break;
            case "C":
                this.category=ROOM_C;
                this.price=PRICE_C;
                break;
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "category= " + category + '\'' +
                ", price= " + price +
                '}';
    }
}



