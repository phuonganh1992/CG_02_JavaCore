package model;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateStudent {
    public static final String DATEOFBIRTH_REGEX="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String CODE_REGEX="^[C][0-9]{4}[G|H|I|K][0-9]{1}$";
    public static final String EMAIL_REGEX="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String NAME_REGEX="^[\\p{L} .'-]+$";
    public static boolean valid(String str,String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);
        return matcher.matches();
    }
}
