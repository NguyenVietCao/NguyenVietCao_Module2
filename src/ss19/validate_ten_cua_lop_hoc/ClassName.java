package ss19.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ClassName_RegEx = "^[CAP]\\w{4}[GHIK]$";
    public ClassName(){
        pattern = Pattern.compile(ClassName_RegEx);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
