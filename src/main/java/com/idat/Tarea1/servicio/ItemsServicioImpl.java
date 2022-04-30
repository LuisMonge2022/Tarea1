package com.idat.Tarea1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Tarea1.modelo.Items;
import com.idat.Tarea1.repositorio.ItemsRepositorio;

@Service
public class ItemsServicioImpl implements ItemsServicio {
	
	@Autowired
	public ItemsRepositorio repositorio;
	
	
	@Override
	public void guardarItems(Items item) {
		// TODO Auto-generated method stub
		repositorio.guardarItems(item);

	}

	@Override
	public void editarItems(Items item) {
		// TODO Auto-generated method stub
		repositorio.editarItems(item);

	}

	@Override
	public void eliminarItems(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminarItems(id);

	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		return repositorio.listarItems();
	}

	@Override
	public Items obtenerItemsId(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtenerItemsId(id);
		
	}

}
