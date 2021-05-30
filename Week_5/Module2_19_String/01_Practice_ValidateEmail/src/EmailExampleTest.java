public class EmailExampleTest {
    private static EmailExcample emailExcample;
    public static final String[] validEmail={"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail={"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExcample=new EmailExcample();
        for (String email:validEmail) {
            boolean isvalid= emailExcample.validate(email);
            System.out.println("Email is "+email+" is valid: "+isvalid);
        }
        for (String email:invalidEmail) {
            boolean isvalid= emailExcample.validate(email);
            System.out.println("Email is "+email+" is valid: "+isvalid);
        }
    }
}
