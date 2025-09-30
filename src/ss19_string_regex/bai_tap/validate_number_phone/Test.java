package ss19_string_regex.bai_tap.validate_number_phone;

public class Test {
    public static final String[] vailNumberPhone = new String[]{"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        CheckNumberPhone checkNumberPhone = new CheckNumberPhone();
        for (String numberPhone : vailNumberPhone){
            System.out.println(numberPhone+": "+checkNumberPhone.isValidateNumberPhone(numberPhone));
        }
    }
}
