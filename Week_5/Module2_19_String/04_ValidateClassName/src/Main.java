public class Main {
    static final String[] validateName={"C0318G"};
    static final String[] invalidName={"M0318G","P0323A"};
    public static void main(String[] args) {
        ClassName className=new ClassName();
        for (String name:validateName) {
            boolean isValid= className.validate(name);
            System.out.println("Class name "+name+" is valid: "+isValid);
        }
        for (String name:invalidName) {
            boolean isValid= className.validate(name);
            System.out.println("Class name "+name+" is valid: "+isValid);
        }
    }
}
