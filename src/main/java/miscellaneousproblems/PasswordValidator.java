package miscellaneousproblems;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * The password must be at least eight characters long, contain an uppercase letter,
 * contain a special character,
 * not contain the username and not be the same as the old password.
 */

public class PasswordValidator {

    private static boolean valid;
    private static String errorMessage;
    private static Scanner scanner = new Scanner(System.in);
    String name;
    String password;

    public PasswordValidator(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordValidator validator = login();
        validator.printPasswordRules();

        do {
            String proposedPassword = validator.getProposedPassword();
            validator.changePassword(proposedPassword);

            if (!validator.isValid()) {
                System.out.println(validator.isErrorMessage());
            }

        } while (!validator.isValid());

        System.out.println("The proposed password is valid");

        validator.closeScanner();
    }

    public static PasswordValidator login() {
        System.out.println("Enter your username");
        String username = scanner.nextLine();

        System.out.println("Enter your password");
        String password = scanner.nextLine();


        return new PasswordValidator(username, password);


    }

    public boolean isValid() {
        return valid;
    }

    public String isErrorMessage() {
        return errorMessage;
    }

    public void closeScanner() {
        scanner.close();
    }

    public void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");

        System.out.println();
    }

    public String getProposedPassword() {
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }


    public void changePassword(String newPassword) {

        valid = true;
        errorMessage = "";

        if (newPassword.length() < 8) {
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters.";
        }

        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errorMessage += "\n Your password must include an uppercase letter.";
        }

        if (newPassword.matches("[a-zA-Z0-9 ]*")) {
            valid = false;
            errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
        }
        if (newPassword.equals(password)) {
            valid = false;
            errorMessage += "\n Your password must be different from your current password.";
        }
    }
}


