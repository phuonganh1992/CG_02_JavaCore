public class RoomB extends Room {
    public RoomB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "RoomB{"+
                "category= "+super.getCategory() +
                ", price= "+super.getPrice()+
                "}";
    }
}
