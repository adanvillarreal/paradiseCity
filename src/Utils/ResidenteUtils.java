package Utils;
import Entidades.Residente;
import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ResidenteUtils {
    public void altaMasiva(String file) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(file), ',', '"', 1);
        List<String[]> allRows = reader.readAll();
        for(String[] row : allRows){
            Date date = new Date(Integer.parseInt(row[1]), Integer.parseInt(row[2]), Integer.parseInt(row[3]));
            Residente temp = new Residente(row[0], date, Integer.parseInt(row[4]), Integer.parseInt(row[5]), null, row[6], row[7], 1 );
            List<String> contactos = new ArrayList<>(Arrays.asList(row[8].split(" , ")));
            List<String> numeros = new ArrayList<>(Arrays.asList(row[9].split(" , ")));
            for(int i = 0; i < contactos.size(); i++){
                temp.addContacto(contactos.get(i), numeros.get(i));
            }
            modifyResidente(temp);
        }
    }
}
