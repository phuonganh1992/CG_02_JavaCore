public class Main {
    static final String[] validatePhoneNumber={"(84)-(0978489648)"};
    static final String[] invalidPhoneNumber={"(a8)-(22222222)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber=new PhoneNumber();
        for (String phone:validatePhoneNumber) {
            Boolean isValid=phoneNumber.validate(phone);
            System.out.println("The phone number "+phone+" is valid: "+isValid);
        }
        for (String phone:invalidPhoneNumber) {
            Boolean isValid=phoneNumber.validate(phone);
            System.out.println("The phone number "+phone+" is valid: "+isValid);
        }

    }
}
