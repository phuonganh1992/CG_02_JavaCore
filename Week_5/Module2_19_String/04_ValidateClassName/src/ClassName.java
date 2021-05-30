import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX="^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]$";

    public ClassName() {
        this.pattern =Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String name){
        matcher= pattern.matcher(name);
        return matcher.matches();
    }
}
