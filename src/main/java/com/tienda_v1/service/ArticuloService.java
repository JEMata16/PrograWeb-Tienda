
package com.tienda_v1.service;

import com.tienda_v1.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    //Obtiene la lista de registros de la tabla articulo y
    //lo coloca en una lista de objetos articulo.
    public List<Articulo> getArticulos(boolean activos);
    
    //Obtiene el registro de la tabla articulo que tiene el
    //id articulo pasado por el objeto articulo.
    public Articulo getArticulo(Articulo articulo);
    
    //Elimina el registro de la tabla articulo que tiene el
    //id articulo pasado por el objeto.
    public void deleteArticulo(Articulo articulo);
    
    //Si el idarticulo pasado no existe o es nulo se crea un registro nuevo
    //en la tabla articulo
    //Si el idarticulo existe, se actualiza la informacion.
    public void saveArticulo(Articulo articulo);
}
