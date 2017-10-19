/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utileriabd;

import Pedidos.Pedido;
import java.sql.*;
import java.util.*;

/**
 *
 * @author rafael
 */
public class ClteWS
{ 
    //############################NUEVO####################################
    public static String creaPedido(String idCliente, TreeMap<String, Integer> productos)
    {
        ClsGestorTienda gestor = new ClsGestorTienda();
        Pedido pedido = new Pedido(idCliente);
        pedido.setProductos(productos);
        boolean banderas[];
        banderas = gestor.agregarPedido(pedido);
        for (int i = 0; i < banderas.length; i++) {
            System.out.println(""+banderas[i]);
       }
        return "suficiente";
    }
    //#####################################################################
  public static void main( String args[])
  {
    //#########################NUEVO############################################
    long lngDeltaTMax = 0, lngDeltaTMin = 0;
    long lngNTot = 0;
    long lngSDeltaT = 0, lngSDeltaT2 = 0;
    boolean banCalc = false;
    double dblDeltaTMedia = 0, dblDeltaTDesvStd = 0;
    long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
    //#####################################################################
    ClsConexion c  = null;
    String[] arr_CvesCustomers = null;
    String[] arr_CvesProducts = null; 
    int numPedidos     =  100; //cambios
    int numMaxItems    = 10;   
    int numMaxUnidades = 20; 
    
    int numCltes   = 0;  // cantidad total de clientes en la BD
    int numProds   = 0;  // cantidad total de productos en la BD
    
    int kPedido    = 0;  // qué pedido es <= numPedidos
    int numItems   = 0;  // cantidad de items de un pedido <= numMaxItems
    int jItem      = 0;  // que item es
    int jProd      = 0;  // lugar de la clave del producto
    int jClte      = 0;  // lugar del cliente en el arreglo de claves
    int unidades   = 0;  // cantidad de unidades de cada item
    
    try
    {
      c = new ClsConexion("OnLineSales");
      c.conectate("rafa","rafa");
      if( c.conectado() )    
      {
        arr_CvesCustomers = c.cargaDatos(1, "Customers");
        numCltes = arr_CvesCustomers.length;
        //##########################CAMBIOS########################################
        //for(int k = 0; k < numCltes; k++ )
          //System.out.println("CveCustomers[" + k + "] = " + arr_CvesCustomers[k]);
        //#####################################################################
                       
        arr_CvesProducts = c.cargaDatos(1, "Products");
        //#########################CAMBIOS#######################################
        //numProds = arr_CvesProducts.length;
        //for(int k = 0; k < numProds; k++ )
          //System.out.println("CveProducts[" + k + "] = " + arr_CvesProducts[k]);
        //#####################################################################
        
        c.cierraCon();
      }
      else
      {
          System.out.println("No se pudo abrir la BD");
      }
    }
    catch( Exception e)
    {
        e.printStackTrace();
        System.exit(1);
    }
    
    // se generan numPedidos pedidos:
    //######################NUEVOS#########################################
    sumDeltaT  = 0;
     sumDeltaT2 = 0;
    //#####################################################################
    
    for( kPedido = 1; kPedido <= numPedidos; kPedido++ )
    {
        //######################NUEVOS#########################################
        long i,n,t0,t1,dt;
        String response;
        TreeMap<String, Integer> productos = new TreeMap<String,Integer>();
        //######################NUEVOS#########################################
        
        // selecciono el cliente
        jClte      = (int) ( Math.random() * numCltes + 0.5);
        System.out.println("pedido num." + kPedido + " clte: " + arr_CvesCustomers[jClte]);
        numItems = (int) ( Math.random() * numMaxItems + 0.5);
        for( jItem = 1; jItem <= numItems; jItem++)
        {
            unidades = (int)(1.0 + Math.random() * numMaxUnidades );
            //######################CAMBIOS#########################################
            //System.out.println("Item:" + jItem + "   CveProd:" + 
              //                  arr_CvesProducts[(int) ( Math.random() * numProds + 0.5)] +
                //                " con " + unidades + " unidades" );
            //######################################################################
            productos.put(arr_CvesProducts[(int) ( Math.random() * numProds + 0.5)], unidades);
        }
        //######################NUEVOS#########################################
        t0 = System.currentTimeMillis();  
               response = creaPedido(arr_CvesCustomers[jClte], productos);
               t1 = System.currentTimeMillis();
               dt = t1 - t0;
               sumDeltaT  += dt;
               sumDeltaT2 += dt * dt;
               if( kPedido == 1 )
               {
                   dtMin = dt;
                   dtMax = dt;
               }
               else
               {
                   if( dt < dtMin ) dtMin = dt;
                   if( dt > dtMax ) dtMax = dt;
               }
        //#####################################################################
    }
    //##########################NUEVO###########################################
    lngSDeltaT  += sumDeltaT;
               lngSDeltaT2 += sumDeltaT2;
                if( lngNTot > 0 ) // ya trae algo acumulado
                {
                    if( dtMax > lngDeltaTMax ) lngDeltaTMax = dtMax;
                    if( dtMin < lngDeltaTMin ) lngDeltaTMin = dtMin;
                }
                else  // primera vez de esta tanda de acumulación
                {
                    lngDeltaTMax = dtMax;
                    lngDeltaTMin = dtMin;
                }
                
                lngNTot += numPedidos;
    dblDeltaTMedia   = lngSDeltaT / lngNTot;
    dblDeltaTDesvStd = (1.0/(lngNTot-1)) * ( lngSDeltaT2 - lngNTot * dblDeltaTMedia * dblDeltaTMedia );
    
      System.out.println("DeltaMedia:" + dblDeltaTMedia);
      System.out.println("dblDeltaTDesvStd:" + dblDeltaTDesvStd);
    //##########################################################################  
      
  }
    
}
