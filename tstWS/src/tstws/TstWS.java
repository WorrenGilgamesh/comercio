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
        long n,i;
        int x,y,z;
        long t0,t1,deltaT;
        n=1000;
        t0=System.nanoTime();
        for(i=0; i<n; i++){
            x=(int) (10000.0*Math.random());
            y=(int) (10000.0*Math.random());
            z=operacionSuma(a,b);
        }
        t1=System.nanoTime();
        deltaT=t1-t0;
        System.out.println("Ha tardado "+ deltaT + " nanoSeg");
                
        System.out.println("la suma de "+ a + " + " + b + " = " + c );
    }

    private static int operacionSuma(int a, int b) {
        wz.Sumador_Service service = new wz.Sumador_Service();
        wz.Sumador port = service.getSumadorPort();
        return port.operacionSuma(a, b);
    }
    
}
