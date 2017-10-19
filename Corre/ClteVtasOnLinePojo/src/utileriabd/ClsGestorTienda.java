/*############################################################################
                                NUEVO
 ##############################################################################*/
package utileriabd;

import Pedidos.Pedido;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ClsGestorTienda {
    ClsConexion conexion;
// ---------------------------------------------------------------------------    
    public ClsGestorTienda ()
    {
       conexion = new ClsConexion("OnLineSales");
    }
// ---------------------------------------------------------------------------        
    public boolean conectaBD(String strUsuario, String strContrasenha )
    {
        return conexion.conectate (strUsuario, strContrasenha );
    }
// ---------------------------------------------------------------------------        
    public boolean conectado() 
    {
        return conexion.conectado();
    } 
// --------------------------------------------------------------------------- 
   public void desconecta()
   {
     conexion.cierraCon();  
   }
   
   public boolean[] agregarPedido(Pedido pedido)
  {
       conexion.conectate("rafa", "rafa");
      
       int j = 0;
       pedido = conexion.updateSumaCantidad(pedido);
        boolean[] flag = new boolean[pedido.getTamArbol()+1];
       String arr_nomCampos[] = {"CustomerID","InvoiceNo","InvDate","InvAmount","InvRecordNumber","InvTotalQty"}; 
       String arr_datos[] = new String[arr_nomCampos.length];
       int i,n;
       String clave;
       arr_datos = agregaDatos(pedido, arr_datos.length);
        
      // se obtiene la colección de campos de la tabla 
      java.util.TreeMap<String,ClsCampoBD> colCampos = conexion.obtenMapaCampos(conexion.obtenRS("Invoice_Headers"));
      
      n = arr_nomCampos.length;
      
      // se rellena el valor para cada campo
      for( i = 0; i < n; i++ )
       ((ClsCampoBD) colCampos.get(arr_nomCampos[i])).valor = arr_datos[i];
      
      // se solicita al objeto conexión que inserte el registro y se espera el resultado
         flag[j] = conexion.insertaReg("Invoice_Headers", colCampos);
         j++;
         String arr_nomCampos2[] = {"InvoiceNo","StockCode","Description","Quantity","UnitPrice"}; 
         String arr_datos2[] = new String[arr_nomCampos2.length];
           Set set =pedido.getProductos().entrySet();
            Iterator iterator =set.iterator();
            while(iterator.hasNext()){
                pedido.sumaTam();
                Map.Entry mentry = (Map.Entry)iterator.next();
                clave = mentry.getKey().toString();
                arr_datos2 = agregaDatos2(pedido, arr_datos.length,clave);
                java.util.TreeMap<String,ClsCampoBD> colCampos2 = conexion.obtenMapaCampos(conexion.obtenRS("Invoice_Items"));
                n = arr_nomCampos2.length;
                for( i = 0; i < n; i++ )
                    ((ClsCampoBD) colCampos2.get(arr_nomCampos2[i])).valor = arr_datos2[i];
                flag[j] = conexion.insertaReg("Invoice_Items", colCampos2);
                j++;
            }
         
      return flag;
       
   }
   
   
   
   public String[] agregaDatos(Pedido pedido,int n ){
       String[] datos = new String[n];
       datos[0] = pedido.getCliente();
       datos[1] = pedido.getInvoiceNumber();
       datos[2] = "#"+pedido.getFecha()+"#";
       datos[3] = ""+pedido.getTotal();
       datos[4] = ""+pedido.getTamArbol();
       datos[5] = ""+pedido.getCantidadProductos();
        return datos;
   }
   
    public String[] agregaDatos2(Pedido pedido,int n,String stockCode){
       String[] datos = new String[n];
      
       datos[0] = pedido.getInvoiceNumber();
       datos[1] = stockCode;
       datos[2] = pedido.getDesc();
       datos[3] = ""+pedido.getCantidades();
       datos[4] = ""+pedido.getPrecios();
        return datos;
   }
   
   public static void main(String args[]){
       ClsGestorTienda gestor = new ClsGestorTienda();
        Pedido pedido = new Pedido("12348");
        TreeMap<String, Integer> productos = new TreeMap<String,Integer>();
        productos.put("10002", 2017);
        productos.put("10080", 3);
        productos.put("10120", 1);
        productos.put("10123C", 2);
        pedido.setProductos(productos);
        boolean banderas[];
        banderas = gestor.agregarPedido(pedido);
        for (int i = 0; i < banderas.length; i++) {
            System.out.println(""+banderas[i]);
       }
   }
}
/*############################################################################
                                NUEVO
 ##############################################################################*/
