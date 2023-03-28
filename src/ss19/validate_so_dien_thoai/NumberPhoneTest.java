package ss19.validate_so_dien_thoai;

public class NumberPhoneTest {
    private static NumberPhone numberPhone;
    public static final String[] validNumberPhone = new String[]{"84-0905451778", "12-0905647577"};
    public static final String[] invalidNumberPhone = new String[]{"1-0905324123", "74-901233210"};

    public static void main(String[] args) {
        numberPhone = new NumberPhone();
        for (String phone : validNumberPhone) {
            boolean isValid = numberPhone.validate(phone);
            System.out.println("Number Phone is: " + phone + "is Valid: " + isValid);
        }
        for (String phone : invalidNumberPhone) {
            boolean isValid = numberPhone.validate(phone);
            System.out.println("Number Phone is: " + phone + "is Valid: " + isValid);
        }
    }
}
