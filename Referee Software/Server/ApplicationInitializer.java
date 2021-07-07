package server;

import Exceptions.DataNotFoundException;
import Exceptions.InvalidPasswordException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import server.Containers.AthleteListContainer;
import server.DataComparing.ComparingData;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ApplicationInitializer {

    public static void main(String[] args) throws IOException, DataNotFoundException, InvalidPasswordException {

        SpringApplication.run(ApplicationInitializer.class, args);
        /*
        AthleteListContainer ff = new AthleteListContainer();
        ff.readFile();
        List<String> data = ff.getDataFromTable();
        for (int i = 0; i<data.toArray().length;i++){
            System.out.println(data.get(i));
        }
*/
        //ComparingData.compareData("444","53");
        /*
        ComparingData comp = new ComparingData();
        comp.compareData("444","53");
        boolean temp = comp.returnRes();
        if (temp){
            System.out.println("goood");
        }
        else {
            System.out.println("fucking slaveS");
        }

         */
    }

}