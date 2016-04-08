import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationRule {
    public Boolean execute(String email) {
        boolean isValidUserName = false;
        String emailMatcher =   "^[A-Za-z0-9.!#$%&'*+/=?^_`{|}~-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailMatcher);
        Matcher matcher = pattern.matcher(email);
        isValidUserName = matcher.matches();
        return isValidUserName;

    }
}
