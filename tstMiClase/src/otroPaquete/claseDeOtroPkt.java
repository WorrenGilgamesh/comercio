/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroPaquete;

/**
 *
 * @author sdist
 */
public class claseDeOtroPkt {
     public static void main(String[] args) {
        System.out.println("Soy claseDeOtroPkt.main");
        if(args.length>0){
            System.out.println("Argumentos");
            for (int i = 0; i < args.length; i++) {
                System.out.println("args["+i+"]: " + args[i]);
            }
        }
    }
}
