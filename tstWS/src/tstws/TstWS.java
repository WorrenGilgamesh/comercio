/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstws;

/**
 *
 * @author sdist
 */
public class TstWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        a=50;
        b=27;
        c=operacionSuma(a,b);
        System.out.println("la suma de "+ a + " + " + b + " = " + c );
    }

    private static int operacionSuma(int a, int b) {
        wz.Sumador_Service service = new wz.Sumador_Service();
        wz.Sumador port = service.getSumadorPort();
        return port.operacionSuma(a, b);
    }
    
}
