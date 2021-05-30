package model;

public class Main {
    public static final String[] validateAccount={"123abc_","_abc123","______","123456","abcdefg"};
    public static final String[] invalidAccount={".@","12345","1234_","abcde"};

    public static void main(String[] args) {
        AccountExample accountExample=new AccountExample();
        for (String account:validateAccount) {
            boolean isValid=accountExample.validateAccount(account);
            System.out.println("Account is "+account+" is valid: "+isValid);
        }
        for (String account:invalidAccount) {
            boolean isValid=accountExample.validateAccount(account);
            System.out.println("Account is "+account+" is valid: "+isValid);
        }

    }
}
