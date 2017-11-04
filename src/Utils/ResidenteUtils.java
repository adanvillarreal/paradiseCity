package Utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import Entidades.Residente;

public class ResidenteUtils {

    public static void modifyResidente( Residente res ){ //nombre es primary key
        BDUtils db = new BDUtils("residentes.db");
        db.replaceObject(res.getNombre(), EntidadSerializableUtils.getXml(res));
        db.closeDB();
    }
}