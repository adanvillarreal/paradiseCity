package Utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import Entidades.Residente;

public class ResidenteUtils {

    private Residente res;

    public ResidenteUtils(Residente residente){
        res = residente;
    }
    
    public void modifyResidente( String nombre ){ //nombre es primary key
        BDUtils db = new BDUtils("residentes.db");
        Residente res;

        String xml = (String) db.getObject(nombre);
        //System.out.println(xml);
        res = (Residente) EntidadSerializableUtils.getEntidadFromXml(xml);




        /*
        db.replaceObject(nombre, EntidadSerializableUtils.getXml(res));
        db.closeDB();
        */

    }

}
