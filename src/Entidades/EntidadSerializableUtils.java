package Entidades;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class EntidadSerializableUtils {
    public String getXml(Object object){
        XStream xstream = new XStream(new StaxDriver());
        return xstream.toXML(object);
    }
    public Object getEntidadFromXml(String xml){
       XStream xstream = new XStream((new StaxDriver()));
       return xstream.fromXML(xml);
    }

}
