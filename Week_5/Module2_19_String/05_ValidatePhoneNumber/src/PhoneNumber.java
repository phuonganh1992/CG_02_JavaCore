import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private Pattern pattern;
    private Matcher matcher;
    private final String PHONE_NUMBER_REGEX="[(0-9)]{4}+[-(0]+[0-9)]{10}";

    public PhoneNumber() {
        this.pattern =Pattern.compile(PHONE_NUMBER_REGEX);
    }
    public boolean validate(String phoneNumber){
        matcher= pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
