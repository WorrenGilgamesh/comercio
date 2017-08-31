/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstmiclase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdist
 */
public class TstMiClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class cl = null;
            Class cArgs[]=new Class[1];
            cArgs[0]=String[].class;
            if(args.length==0)
                cl = Class.forName("tstmiclase.miClasesita");
            else
                cl=Class.forName(args[0]);
            Method m;
            try {
                m = cl.getMethod("main", cArgs);
                try {
                    m.invoke(cl,(Object)args);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TstMiClase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(TstMiClase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(TstMiClase.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("ok");
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(TstMiClase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(TstMiClase.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TstMiClase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
