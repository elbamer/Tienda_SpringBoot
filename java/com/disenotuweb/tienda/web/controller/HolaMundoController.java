package com.disenotuweb.tienda.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** url-->http://localhost:8080/saludar/hola
 * saludar es la clase y el metodo  es saludar
 *
 * **/



@RestController
@RequestMapping("/saludar")
public class HolaMundoController {
    @GetMapping("hola")
    public String saludar(){

        return "NUnca pares de aprender";
        /**Anotaciones
         * JPA
         * @Entity
         * @table
         * @Column
         * @id calve primaria sencilla &&Embebedll--> clave primai ¡a compuesta
         * @GeneratedValue
         * @OneToMany && ManyToOne
         *
         * **/


        /**Spring Data **/
    }
}
