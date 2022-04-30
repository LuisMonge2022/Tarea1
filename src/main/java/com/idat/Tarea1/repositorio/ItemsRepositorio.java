package com.idat.Tarea1.repositorio;

import java.util.List;

import com.idat.Tarea1.modelo.Items;

public interface ItemsRepositorio {
	
	public void guardarItems(Items item);
	public void editarItems(Items item);
	public void eliminarItems(Integer id);
	public List<Items> listarItems();
	public Items obtenerItemsId(Integer id);
	

}
