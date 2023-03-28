package ss19.validate_so_dien_thoai;

import ss17.quan_ly_san_pham.model.Product;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NumberPhone_REGEX = "^[0-9]{2}\\-\\w{10}$";

    public NumberPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NumberPhone_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
