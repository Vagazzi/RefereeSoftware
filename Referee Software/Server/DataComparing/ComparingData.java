package server.DataComparing;

import Exceptions.DataNotFoundException;
import Exceptions.InvalidPasswordException;
import server.Containers.LoginPageContainer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class ComparingData {
    private static List<String> lines = new ArrayList();
    private boolean result;
    private static ArrayList<Integer> resultReading = new ArrayList();
    public  void compareData(String inputLogin, String inputPassword) throws IOException {
        readData();

        for (int i = 0; i<lines.size();i++)
        {
            if (lines.get(i).contains(inputLogin)) {
                if (lines.get(i).contains(inputPassword))
                {
                    System.out.println("vse zaebis'");
                    resultReading.add(1);
                } else {
                    System.out.println("sosi");
                    resultReading.add(-1);
                }
            }
            else{
                System.out.println("sosy");
                resultReading.add(0);
            }
        }
        returnResult();
    }
    private  void readData() throws IOException {
        {
            Path file = Paths.get("registered_users.txt");
            lines = Files.readAllLines(file);
            for (int i = 0 ; i<lines.size();i++)
            {
                System.out.println(lines.get(i));
            }
        }
    }

    public ArrayList<Integer> getResult(){
        return resultReading;
    }

    public  void returnResult(){
        for (int i = 0; i<resultReading.size();i++){
            if(resultReading.get(i)==1){
                System.out.println("good");
                result = true;
            }
        }
    }

    public  boolean returnRes(){
        return result;
    }
}
