package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";

    public AccountExample() {
    }
    public boolean validateAccount(String account){
        Pattern pattern=Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher=pattern.matcher(account);
        return matcher.matches();
    }
}
