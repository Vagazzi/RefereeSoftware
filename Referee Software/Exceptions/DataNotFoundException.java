package Exceptions;

public class DataNotFoundException extends Exception {
    private final static String DataNotFound = "Data not found";
    public DataNotFoundException(){
        super(DataNotFound);
    }
}
