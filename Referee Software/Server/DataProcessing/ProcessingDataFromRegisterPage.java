package server.DataProcessing;

import java.util.ArrayList;
import java.util.List;

public class ProcessingDataFromRegisterPage {
    private  static List<List<String>> dataFromRegisterPage = new ArrayList<>();
    private  static int size;
    public static void pushData(String name, String surname, String fn, String email,String password){

        List<String> temporaryData = new ArrayList<>();
        temporaryData.add(name);
        temporaryData.add(surname);
        temporaryData.add(fn);
        temporaryData.add(email);
        temporaryData.add(password);

        dataFromRegisterPage.add(temporaryData);
        size++;

    }

    public static List<List<String>> getData(){
        return dataFromRegisterPage;
    }

    public static int getSize(){
        return size;
    }
}
