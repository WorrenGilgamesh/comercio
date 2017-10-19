/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import wsVtasEnLinea.Mensaje;
import wsVtasEnLinea.Pedido;

/**
 *
 * @author rafael
 */
@WebService(serviceName = "WSAP")
public class WSAP {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param cadena
     */
    @WebMethod(operationName = "alta")
    public Mensaje alta(@WebParam(name = "cadena") String cadena) {
        Mensaje m = new Mensaje();
        m.setBlnRes(true);
        m.setIntRes(1);
        m.setStrMsg("OK");
        return m;
    }

    /**
     * Web service operation
     * @param parameter
     * @return 
     */
    @WebMethod(operationName = "ap")
    public Mensaje ap(@WebParam(name = "parameter") Pedido parameter) {
         Mensaje m = new Mensaje();
        m.setBlnRes(true);
        m.setIntRes(1);
        m.setStrMsg("OK");
        return m;
    }
}
