package ss19_string_regex.bai_tap.validate_name_class;

public class CheckNameClass {
    public boolean isValidateNameClass(String name_class) {
        final String NAME_CLASS_REGEX = "^[ACP][0-9]{4}[GHIK]$";
        return name_class.matches(NAME_CLASS_REGEX);
    }
}
