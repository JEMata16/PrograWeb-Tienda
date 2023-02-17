
package com.tienda_v1.service;

import com.tienda_v1.domain.Cliente;
import java.util.List;

public interface ClienteService {
    //Obtiene la lista de registros de la tabla cliente y
    //lo coloca en una lista de objetos cliente.
    public List<Cliente> getClientes();
    
    //Obtiene el registro de la tabla cliente que tiene el
    //id cliente pasado por el objeto cliente.
    public Cliente getCliente(Cliente cliente);
    
    //Elimina el registro de la tabla cliente que tiene el
    //id cliente pasado por el objeto.
    public void deleteCliente(Cliente cliente);
    
    //Si el idcliente pasado no existe o es nulo se crea un registro nuevo
    //en la tabla cliente
    //Si el idcliente existe, se actualiza la informacion.
    public void saveCliente(Cliente cliente);
}
