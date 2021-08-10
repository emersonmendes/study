package br.com.emersonmendes.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ao invés de @RestController pode ser usado como as anotações
 * @Controller + @ResponseBody
 * @RestController veio com o spring 4
 */

@RestController
public class HomeController {

    /**
     * Ao invés de @GetMapping pode ser usado como a anotação abaixo
     * @RequestMapping( value = "/", method = RequestMethod.GET)
     */
    @GetMapping("/")
    public String hello(){
        return "Welcome :)";
    }

}
