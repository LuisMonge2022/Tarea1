package com.idat.Tarea1.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Tarea1.modelo.Items;
import com.idat.Tarea1.servicio.ItemsServicio;

@RestController
@RequestMapping("/item/v1")
public class ItemsControlador {
	
	@Autowired
	private ItemsServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)	
	//public  List<Items> listarItems(){
	//	return servicio.listarItems();
	//para darle una respuesta hacemos lo siguiente
	
	public ResponseEntity<List<Items>> listarItems(){
		
		return new ResponseEntity<List<Items>>(servicio.listarItems(), HttpStatus.OK);
		
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Items item){
		
		
		
		servicio.guardarItems(item);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Items> listarPorId(@PathVariable Integer id) {
		
		Items i = servicio.obtenerItemsId(id);
		if(i != null)
			return new ResponseEntity<Items>(i, HttpStatus.OK);
					
		return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);		
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Items item) {
		
		Items i = servicio.obtenerItemsId(item.getIdItem());
		
		if(i != null) {
			servicio.editarItems(item);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}	
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		Items i = servicio.obtenerItemsId(id);
		if(i != null) {
			servicio.eliminarItems(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

}











