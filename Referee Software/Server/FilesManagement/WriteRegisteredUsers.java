package server.FilesManagement;

import server.DataProcessing.ProcessingDataFromRegisterPage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteRegisteredUsers {

    public static void writeRegisteredUserData() throws IOException {

        FileWriter writer = new FileWriter("registered_users.txt");
        List<List<String>> data = ProcessingDataFromRegisterPage.getData();

        writer.write("\n");
        for (List row : data) {

            String temp0 = (String) row.get(0);
            String temp1 = (String) row.get(1);
            String temp2 = (String) row.get(2);
            String temp3 = (String) row.get(3);
            String temp4 = (String) row.get(4);

            String result =
                    temp0 + " " + temp1 + " " + temp2 + " " + temp3 + " " + temp4 + "\n";

            writer.write(result);

        }

        writer.close();

    }

}
