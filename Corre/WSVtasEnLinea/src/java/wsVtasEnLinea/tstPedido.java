/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wsVtasEnLinea;

import java.util.Date;

/**
 *
 * @author rafael
 */
public class tstPedido 
{
   public static void main(String args[])
   {
       Pedido p = new Pedido();
       Item  item = null;
       p.setCveClte("ABC");
       p.setFecha(new Date());
       for( int i = 1; i <= 5; i++)
           p.agregaItem("CveProd_" + i, 11*i, 10.0*i);
       
       int nItems = p.getNumRegs();
       for( int i = 1 ; i <= nItems; i++)
       {
           item = p.obtenItem(i);
           System.out.println(item);
       }
   }
   
   
}
