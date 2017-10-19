/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wsVtasEnLinea;

import java.io.Serializable;

/**
 *
 * @author rafael
 */
public class Item implements Serializable
{
  public String cveProd  = null;
  public int unidades    =   0;

    public double getPU() {
        return PU;
    }

    public void setPU(double PU) {
        this.PU = PU;
    }
  public double PU       = 0.0;

    public String getCveProd() {
        return cveProd;
    }

    public void setCveProd(String cveProd) {
        this.cveProd = cveProd;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
  @Override
    public String toString()
    {
        return "Item: CveProd = " + cveProd + " , unids = " + unidades + ", PU = " + PU;
    }
  
}
