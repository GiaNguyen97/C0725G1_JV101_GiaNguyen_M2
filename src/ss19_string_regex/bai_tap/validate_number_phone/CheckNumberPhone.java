package ss19_string_regex.bai_tap.validate_number_phone;

public class CheckNumberPhone {
    public boolean isValidateNumberPhone(String numberPhone){
        final String NUMBER_PHONE = "^\\([\\d]{2}\\)-\\([0][\\d]{9}\\)$";
        return numberPhone.matches(NUMBER_PHONE);
    }
}
