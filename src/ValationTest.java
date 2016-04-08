public class ValationTest {

    public static void main(String[] args) {

        EmailValidationRule emailValidationRule = new EmailValidationRule();

        EmailInput emailInput = new EmailInput("valid@email.com");
        Boolean result = emailInput.validate(emailValidationRule);
        showValidationResult(result);

        emailInput = new EmailInput("invalid#email.com");
        result = emailInput.validate(emailValidationRule);
        showValidationResult(result);

    }

    private static void showValidationResult(Boolean result) {
        if (result) {
            System.out.println("Valid email");
        } else {
            System.out.println("Wrong email");
        }
    }
}
