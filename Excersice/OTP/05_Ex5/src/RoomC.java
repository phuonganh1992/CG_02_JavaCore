public class RoomC extends Room {
    public RoomC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "RoomC{"+
                "category= "+super.getCategory() +
                ", price= "+super.getPrice()+
                "}";
    }
}
