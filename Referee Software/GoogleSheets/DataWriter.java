import java.io.*;
import java.util.List;

public class DataWriter {

  public static void writeFile(String filePath) throws IOException {

    List<List<Object>> data = GoogleSheetsWorker.getData();
    FileWriter writer = new FileWriter("dataFromTable.txt");
    writer.write("\n");
        for (List row : data) {

         String temp0 = (String) row.get(0);
         String temp1 = (String) row.get(1);
         String temp2 = (String) row.get(2);
         String temp3 = (String) row.get(3);
         String temp4 = (String) row.get(4);String temp5 = (String) row.get(5);

         String result =
          temp0 + " " + temp1 + " " + temp2 + " " + temp3 + " " + temp4 + " " + temp5 + "\n";

         writer.write(result);

        }

    writer.close();

    }
}

