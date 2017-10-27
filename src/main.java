import Utils.EntidadSerializableUtils;
import Entidades.Recordatorio;

import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.mapdb.*;
import com.thoughtworks.xstream.XStream;
import org.mapdb.DBMaker;
import Utils.BDUtils;
import java.util.concurrent.ConcurrentMap;

public class main {
    public static void main(String[] args) {
        EntidadSerializableUtils entidadSerializableUtils = new EntidadSerializableUtils();
        BDUtils residente = new BDUtils("residentes.db");

       /* DB db = DBMaker.fileDB("file.db").make();
       // DB dbEventualidades = DBMaker.fileDB("Eventualidades.db").make();
        ConcurrentMap map = db.hashMap("map").createOrOpen();
        XStream xstream = new XStream(new StaxDriver());
        //Recordatorio rec = new Recordatorio(2, true, new Eventualidad("a", "b", "c"));
        //String xml = xstream.toXML(rec);
        //System.out.printf(xml);
        Recordatorio recordatorio = (Recordatorio)entidadSerializableUtils.getEntidadFromXml((String)map.get("test1"));
        System.out.println(entidadSerializableUtils.getXml(recordatorio));
        System.out.println(recordatorio.ev.getDescripcion());
        //map.put("test1", xml);
        db.close();
        /*SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new interfazPrincipal();
                // everything else here
            }
        });*/
    }
}
