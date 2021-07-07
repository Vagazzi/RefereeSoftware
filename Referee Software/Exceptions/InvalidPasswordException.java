package Exceptions;

public class InvalidPasswordException extends Exception {
    private static final String InvalidPassword = "Invalid password";
    public InvalidPasswordException(){
        super(InvalidPassword);
    }
}
