package ss19_string_regex.bai_tap.validate_name_class;

public class Test {
    public static final String[] vailNameClass = new String[]{"C0223G", "A0323K", "M0318G", "P0323A"};

    public static void main(String[] args) {
        CheckNameClass checkNameClass = new CheckNameClass();
        for (String string : vailNameClass){
            System.out.println(string+": "+checkNameClass.isValidateNameClass(string));
        }
    }
}
