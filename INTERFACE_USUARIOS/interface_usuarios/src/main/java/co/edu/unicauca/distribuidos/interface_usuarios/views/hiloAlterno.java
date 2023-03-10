package co.edu.unicauca.distribuidos.interface_usuarios.views;

import co.edu.unicauca.distribuidos.interface_usuarios.models.ProductoDTO;
import co.edu.unicauca.distribuidos.interface_usuarios.services.ProductoServices;
import static co.edu.unicauca.distribuidos.interface_usuarios.views.servicio8.jTextAreaPublicaProductos;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class hiloAlterno extends Thread {
    public void run(){
        while(true){
            try {
                ProductoServices objProductoServices = new ProductoServices();
                List<ProductoDTO> objProductos = null;

                objProductos = objProductoServices.listarProductosSubastados();
                String cadenaProductos2 = "";
                for (ProductoDTO producto : objProductos) {
                    int ofertaActual=objProductoServices.consultarOfertaProducto(producto.getCodigo());
                    
                    cadenaProductos2 = cadenaProductos2 + "Codigo: "+ producto.getCodigo() +", Nombre: " +producto.getNombre() +
                            ", Valor Inicial: "+ producto.getValorInicial() + " --> OFERTA = $"+ofertaActual+"\n";
                }
                jTextAreaPublicaProductos.setText(cadenaProductos2);
                if (cadenaProductos2.equals("")) {
                    jTextAreaPublicaProductos.setText("NO EXISTEN SUBASTAS ABIERTAS...");
                }
                Thread.sleep(4000);
            } catch (Exception NullException) {
               jTextAreaPublicaProductos.setText(jTextAreaPublicaProductos.getText()+"No se ha podido consultar el servidor\n");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(hiloAlterno.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }
        }
    }
}
