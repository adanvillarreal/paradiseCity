import Entidades.Eventualidad;
import Entidades.Residente;
import Utils.EntidadSerializableUtils;
import Entidades.Recordatorio;

import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.mapdb.*;
import com.thoughtworks.xstream.XStream;
import org.mapdb.DBMaker;
import Utils.BDUtils;

import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.ConcurrentMap;

public class main {
    public static void main(String[] args) throws IOException {
        BDUtils db = new BDUtils("residente.db");
        System.out.println((String)db.getObject("1"));
        db.closeDB();
    }
}
