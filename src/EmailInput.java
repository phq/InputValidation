
public class EmailInput {
    public static final int ERROR_CODE = 216;
    private final String email;
    private Boolean isValid;
    private int errorCode;

    public EmailInput(String email) {
        this.email = email;
    }

    public Boolean validate(EmailValidationRule emailValidationRule) {
        isValid = emailValidationRule.execute(this.email);
        return isValid;
    }
}
