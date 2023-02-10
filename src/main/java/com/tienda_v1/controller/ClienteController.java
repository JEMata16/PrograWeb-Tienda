package com.tienda_v1.controller;

import com.tienda_v1.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @GetMapping("/")
    public String inicio(Model model){
        var saludo = "Saludos desde el back end";
        model.addAttribute("mensaje", saludo);
        
        Cliente cliente1 = new Cliente("Jose","Mata","jmata@sasas.com","88888");
        Cliente cliente2 = new Cliente("Juan","Mata","jmata@sasas.com","88888");
        Cliente cliente3 = new Cliente("Julio","Mata","jmata@sasas.com","88888");
        
        var clientes = Arrays.asList(cliente1,cliente2,cliente3);
        
        model.addAttribute("clientes",clientes);
        return "index";
    }
}
