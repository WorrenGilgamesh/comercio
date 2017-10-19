/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wsVtasEnLinea;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author rafael
 */
public class Pedido implements Serializable
{
  private String cveClte     = null;
  private Date   fecha;
  private double monto       = 0.0;
  private int    numRegs    = 0;  // cantidad de renglones de la factura
  private int    totUnidades = 0;
  //public java.util.TreeMap<Integer,Item> items;

    public Pedido() 
    {
        //this.items = new java.util.TreeMap<>();
    }


    public String getCveClte() {
        return cveClte;
    }

    public void setCveClte(String cveClte) {
        this.cveClte = cveClte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumRegs() {
        return numRegs;
    }

    public void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public int getTotUnidades() {
        return totUnidades;
    }

    public void setTotUnidades(int totUnidades) {
        this.totUnidades = totUnidades;
    }
/*
    public TreeMap<Integer, Item> getItems() {
        return items;
    }
*/
/*    
    public void setItems(TreeMap<Integer, Item> items) {
        this.items = items;
    }
 */
  
    public void agregaItem( String cveProd, int Unids, double PU )
    {
         Item item = new Item();
         item.setCveProd( cveProd );
         item.setUnidades(Unids);
         item.setPU(PU);
        
         numRegs++;
         //items.put(numRegs,item);
    }
    public Item obtenItem(int k)
    {
        return null; //items.get(k);  // del 1 al numRegs
    }
    public int cuantosItems()
    {
        return 0; //items.size();
    }
    
}
