package miscellaneousproblems;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * The password must be at least eight characters long, contain an uppercase letter,
 * contain a special character,
 * not contain the username and not be the same as the old password.
 */

public class PasswordValidator {

    String name;
    String password;
    private static boolean valid;
    private static String errorMessage;


    public PasswordValidator(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean isValid(){
        return valid;
    }

    public String isErrorMessage(){
        return errorMessage;
    }



    private static Scanner scanner = new Scanner(System.in);


    public static  void main(String[] args) {
        PasswordValidator validator= login();
        validator.printPasswordRules();

        do {
           String proposedPassword  =validator.getProposedPassword();
           validator.changePassword(proposedPassword);
            if(!validator.isValid()){
                System.out.println(validator.isErrorMessage());
            }
        }while (!validator.isValid());

        System.out.println("The proposed password is valid");

    }





    public static PasswordValidator login(){
        System.out.println("Enter your username");
        String username = scanner.nextLine();

        System.out.println("Enter your password");
        String password = scanner.nextLine();


        return new PasswordValidator(username,password);


    }
    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");

        System.out.println();
    }

    public String getProposedPassword(){
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }


    public  void changePassword(String text) {
        valid = true;
        errorMessage = "";


        if (text.length() < 8) {
            valid = false;
                errorMessage+= "Your password must be at least 8 characters." ;
            }
            if (text.equals(text.toLowerCase())){
                valid = false;
                errorMessage+="Your password must include an uppercase letter.";
            }
            if(text.matches("[a-zA-Z0-9 ]*")){
                valid = true;
                System.out.println("Your password must include a special character (e.g. %,$[:). ");
            }
        }
    }

