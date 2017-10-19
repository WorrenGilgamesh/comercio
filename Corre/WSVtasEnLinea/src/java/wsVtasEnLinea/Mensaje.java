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
public class Mensaje implements Serializable
{

    public boolean isBlnRes() {
        return blnRes;
    }

    public void setBlnRes(boolean blnRes) {
        this.blnRes = blnRes;
    }

    public int getIntRes() {
        return intRes;
    }

    public void setIntRes(int intRes) {
        this.intRes = intRes;
    }

    public String getStrMsg() {
        return strMsg;
    }

    public void setStrMsg(String strMsg) {
        this.strMsg = strMsg;
    }
   private boolean blnRes = false;
   private int     intRes = 0;
   private String  strMsg = null;
}
