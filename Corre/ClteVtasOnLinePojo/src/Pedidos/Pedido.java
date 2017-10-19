/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

import java.sql.Timestamp;
import java.util.TreeMap;

/**
 *
 * @author CABURTOP
 */
public class Pedido {
    private String cliente;
    private String invoiceNumber;
    private Timestamp fecha;
    private TreeMap<String, Integer> productos; //Contiene la clave del producto y la cantidad que se quiere.
    private double total;
    private int cantidadProductos, tamArbol;
    private int[] cantidades;
    private double[] precios;
    private String[] descripciones;
    private int i,j, k, l;

    public Pedido(String cliente) {
        this.cliente = cliente;
        fecha = new Timestamp(System.currentTimeMillis());
        invoiceNumber = ""+cliente+"-"+fecha.toString();
        tamArbol = 0;
        precios = new double[10300];
        descripciones = new String[10300];
        cantidades = new int[10300];
        i=0;
        j=-1;
        k=-1;
        l=-1;
        
    }
    
    public void agregarArreglos(int cantidad, double precio, String descripcion){
        cantidades[i] = cantidad;
        precios[i] = precio;
        descripciones[i] = descripcion;
        i++;
    }
      public Pedido(String cliente, TreeMap<String, Integer> productos) {
        this.cliente = cliente;
        this.productos = productos;
        fecha=new Timestamp(System.currentTimeMillis());
        invoiceNumber=""+cliente+fecha.toString();
        tamArbol = 0;
    }
    
    public String getDesc(){
        j++;
    return descripciones[j];
        
    }
    public int getCantidades(){
        k++;
    return cantidades[k];
        
    }
    public double getPrecios(){
        l++;
    return precios[l];
        
    }
    public void sumaTam(){
        tamArbol++;
    }

    public int getTamArbol() {
        return tamArbol;
    }
    
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getFecha() {
        return fecha.toString().substring(0, fecha.toString().length()-4);
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public TreeMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(TreeMap<String, Integer> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void sumarTotal(double precio, int cantidad)
    {
        this.total = this.total + (precio*cantidad);
    }
    
    public void sumarCantidad(int cantidad)
    {
        this.cantidadProductos = this.cantidadProductos + cantidad;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
    
    
}
