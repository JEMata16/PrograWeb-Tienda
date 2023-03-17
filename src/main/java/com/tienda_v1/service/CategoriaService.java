
package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Obtiene la lista de registros de la tabla categoria y
    //lo coloca en una lista de objetos categoria.
    public List<Categoria> getCategorias(boolean activos);
    
    //Obtiene el registro de la tabla categoria que tiene el
    //id categoria pasado por el objeto categoria.
    public Categoria getCategoria(Categoria categoria);
    
    //Elimina el registro de la tabla categoria que tiene el
    //id categoria pasado por el objeto.
    public void deleteCategoria(Categoria categoria);
    
    //Si el idcategoria pasado no existe o es nulo se crea un registro nuevo
    //en la tabla categoria
    //Si el idcategoria existe, se actualiza la informacion.
    public void saveCategoria(Categoria categoria);
}
