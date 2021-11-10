package br.com.devin.avengers.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AvengerRest {
    @GetMapping("/list")
    public List<String> listOldAvengers(){
        System.out.println("Entrou nos vingadores antigos");
        return null;
    }
}
