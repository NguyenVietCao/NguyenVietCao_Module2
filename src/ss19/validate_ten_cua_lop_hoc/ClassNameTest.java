package ss19.validate_ten_cua_lop_hoc;

public class ClassNameTest {
    private static ClassName className;
    public static  final String[] validClassName = new String[]{"C0123G","C0124G","C0122G"};
    public static final String[] invalidClassName = new String[]{"c0123g", "C0123g1", "C012G1"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String name: validClassName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class Name is: " + name + " is valid: " + isvalid );
        }
        for (String name: invalidClassName) {
            boolean isvalid  = className.validate(name);
            System.out.println("Class Name is: " + name + " is valid: " + isvalid );
        }
    }
}
