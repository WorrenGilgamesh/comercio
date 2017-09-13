/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsescbaile;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;


/**
 *
 * @author sdist
 */
public class WSEscBaile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operation("3131",  "FGDF",  "sfsf",  "sdfsdf");
    }

    private static boolean operation(String num, String nom, String APP, String APM) {
        produc.AltaAlum_Service service = new produc.AltaAlum_Service();
        QName portQName = new QName("http://CRUD/", "altaAlumPort");
        String req = "<operation  xmlns=\"http://CRUD/\"><clave>ENTER VALUE</clave><nombre>ENTER VALUE</nombre><primerApellido>ENTER VALUE</primerApellido><segundoApellido>ENTER VALUE</segundoApellido></operation>";
        try {
            // Call Web Service Operation
            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
            return true;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return false;
    }

    
    
}
