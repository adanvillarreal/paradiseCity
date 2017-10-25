import Entidades.Recordatorio;
import Interfaz.interfazPrincipal;

import javax.swing.*;

import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.mapdb.*;
import com.thoughtworks.xstream.XStream;
import org.mapdb.DBMaker;

import java.util.concurrent.ConcurrentMap;

public class main {
    public static void main(String[] args) {

        DB db = DBMaker.fileDB("file.db").make();
        ConcurrentMap map = db.hashMap("map").createOrOpen();
        System.out.println(map.get("123"));
        XStream xstream = new XStream(new StaxDriver());
        Recordatorio rec = new Recordatorio(5, false);
        String xml = xstream.toXML(rec);
        System.out.printf(xml);
        map.put("123", xml);
        db.close();
        /*SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new interfazPrincipal();
                // everything else here
            }
        });*/
    }
}
