public class Tes {
    public static void main(String[] args) {
        System.out.println(OrderStatus.values()[0].giatri);
//        OrderStatus.WAITING.value;


    }
    public enum OrderStatus{
        WAITING(0),CANCEL(1),ACCEPTED(2),PAID(3);
        int giatri;
        OrderStatus(int giatri){
            this.giatri =giatri;
        }
    }
}
