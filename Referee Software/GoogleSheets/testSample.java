import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class testSample {

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        GoogleSheetsWorker test = new GoogleSheetsWorker();
        GoogleSheetsWorker.writeData();
        List<List<Object>> data = test.getData();
        for (List row : data) {

            System.out.printf("%s, %s, %s, %s,%s\n", row.get(0), row.get(1), row.get(2), row.get(3), row.get(4), row.get(5));
        }

        DataWriter.writeFile(Constant.getFilePath());
    }

}
