/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_v1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public UserDetailsService users(){
        UserDetails admin = User.builder().username("juan")
                .password("{noop}123")
                .roles("USER","VENDEDOR","ADMIN")
                .build();
        
        UserDetails vendedor = User.builder().username("rebeca")
                .password("{noop}456")
                .roles("USER","VENDEDOR")
                .build();
        
        UserDetails usuario = User.builder().username("pedro")
                .password("{noop}789")
                .roles("USER")
                .build();
        
        return new InMemoryUserDetailsManager(admin, vendedor,usuario);
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/","/index","/errores/**","/webjars/**").permitAll()
                .requestMatchers("/articulo/nuevo","/articulo/guardar","/articulo/modificar/**","/articulo/eliminar/**").hasRole("ADMIN")
                );
        return http.build();
    }
}
