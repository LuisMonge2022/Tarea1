package com.idat.Tarea1.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.Tarea1.modelo.Items;

@Repository
public class ItemsRepositorioImpl implements ItemsRepositorio {
	
	public List<Items> listar = new ArrayList<Items>(); 

	@Override
	public void guardarItems(Items item) {
		
		listar.add(item);

	}

	@Override
	public void editarItems(Items item) {
		
		listar.remove(obtenerItemsId(item.getIdItem()));
		listar.add(item);

	}

	@Override
	public void eliminarItems(Integer id) {
		
		listar.remove(obtenerItemsId(id));

	}

	@Override
	public List<Items> listarItems() {
		
		return listar;
	}

	@Override
	public Items obtenerItemsId(Integer id) {
		
//		if(id !=null) {
//			for (Items items : listar) {
//				
//				if(items.getIdItem() == id)
//					return items;
//				else
//					return null;
//			}
//		}else {
//			return null;
//		}	
		
		return listar.stream().filter( item -> item.getIdItem() == id).findFirst().orElse(null);
		
	}

}









