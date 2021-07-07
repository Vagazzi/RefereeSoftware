package server.Containers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AthleteListContainer {
    private  List<String> dataFromTable = new ArrayList<>();
    private static final String filePath = "C:\\Users\\Boss of this gym\\IdeaProjects\\SportAcc\\dataFromTable.txt";

    public  List<String> readFile() throws IOException {
        FileReader fr = new FileReader(filePath);

        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) {

            line = reader.readLine();
            dataFromTable.add(line);
            //zaebis'
        }
        return dataFromTable;
    }

    public  List<String> getDataFromTable(){
        return dataFromTable;
    }
}
