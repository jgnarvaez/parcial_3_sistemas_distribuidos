package co.edu.unicauca.distribuidos.interface_usuarios.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import co.edu.unicauca.distribuidos.interface_usuarios.models.*;
import java.util.List;

public class ProductoServices {
    private String endPoint;
    private Client objProductoPeticiones;

    public ProductoServices() {
        this.endPoint = "http://localhost:6000/api";
        this.objProductoPeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public ProductoDTO registrarProducto(ProductoDTO objProductoRegistar) {
        ProductoDTO objProducto = null;

        WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/producto");

        Entity<ProductoDTO> data = Entity.entity(objProductoRegistar, MediaType.APPLICATION_JSON_TYPE);

        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.post(data, ProductoDTO.class);

        return objProducto;
    }
    
    public List<ProductoDTO> listarProductosAOfertar(){
        List<ProductoDTO> listaProductos=null;			
		
	WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/nosubastados");
		
	Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
	listaProductos = objPeticion.get(new GenericType<List<ProductoDTO>>() {});	
		
	return listaProductos;
    }
    
    public Boolean cambiarProductoASubastados(ProductoDTO objProducto, String codigoProducto){
        Boolean respuesta=null;	
		
	WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/productoSubastar/"+codigoProducto);	  
		
        Entity<ProductoDTO> data = Entity.entity(objProducto, MediaType.APPLICATION_JSON_TYPE);
        
        Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);
	    
	respuesta = objPeticion.put(data, Boolean.class);		
		
        return respuesta;
    }
    
    public Boolean cambiarProductoNOSubastados(ProductoDTO objProducto, String codigoProducto){
        Boolean respuesta=null;	
		
	WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/productoNoSubastar/"+codigoProducto);	  
		
        Entity<ProductoDTO> data = Entity.entity(objProducto, MediaType.APPLICATION_JSON_TYPE);
        
        Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);
	    
	respuesta = objPeticion.put(data, Boolean.class);		
		
        return respuesta;
    }
    
    public List<ProductoDTO> listarProductosSubastados(){
        List<ProductoDTO> listaProductos=null;			
		
	WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/subastados");
		
	Builder objPeticion=target.request(MediaType.APPLICATION_JSON);
		
	listaProductos = objPeticion.get(new GenericType<List<ProductoDTO>>() {});	
		
	return listaProductos;
    }
    
    public ProductoDTO consultarProducto(String codigo) {
        ProductoDTO objProducto = null;

        WebTarget target = this.objProductoPeticiones.target(this.endPoint + "/producto/" + codigo);

        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.get(ProductoDTO.class);

        return objProducto;
    }
    
    public Boolean ofrecerOferta(ProductoDTO objProducto, String codigo, Integer valor){
        Boolean respuesta=null;	
		
	WebTarget target = this.objProductoPeticiones.target(this.endPoint+"/ofertar/"+codigo+"/"+valor);	  
		
        Entity<ProductoDTO> data = Entity.entity(objProducto, MediaType.APPLICATION_JSON_TYPE);
        
        Builder objPeticion=target.request(MediaType.APPLICATION_JSON_TYPE);
	    
	respuesta = objPeticion.put(data, Boolean.class);		
		
        return respuesta;
    }
    
    public Integer consultarOfertaProducto(String codigo) {
        Integer ofertaActual = null;

        WebTarget target = this.objProductoPeticiones.target(this.endPoint + "/oferta/" + codigo);

        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        ofertaActual = objPeticion.get(Integer.class);

        return ofertaActual;
    }
    
    public ProductoDTO consultarProductoSubastado(String codigo) {
        ProductoDTO objProducto = null;

        WebTarget target = this.objProductoPeticiones.target(this.endPoint + "/subastados/" + codigo);

        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);

        objProducto = objPeticion.get(ProductoDTO.class);

        return objProducto;
    }
}
