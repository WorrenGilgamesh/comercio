/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sdist
 */
@WebService(serviceName = "altaAlum")
public class altaAlum {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public boolean operation(@WebParam(name = "Clave") String Clave, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "PrimerApellido") String PrimerApellido, @WebParam(name = "SegundoApellido") String SegundoApellido) {
        
        boolean res = true;
        return res;
                
    }
}
