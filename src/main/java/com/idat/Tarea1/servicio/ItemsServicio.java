package com.idat.Tarea1.servicio;

import java.util.List;

import com.idat.Tarea1.modelo.Items;

public interface ItemsServicio {
	
	public void guardarItems(Items item);
	public void editarItems(Items item);
	public void eliminarItems(Integer id);
	public List<Items> listarItems();
	public Items obtenerItemsId(Integer id);

}
