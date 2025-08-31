package com.example.demo.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Personagem;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ms-contatos")
public class ContatoController {

    @GetMapping("/contatos")
    public List<Personagem> getPersonagens() {
        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new Personagem("Bob Esponja Calça Quadrada", "Esponja Marinha", "Cozinheiro"));
        personagens.add(new Personagem("Patrick Estrela", "Estrela do Mar", "Desempregado"));
        personagens.add(new Personagem("Lula Molusco", "Polvo", "Caixa"));
        personagens.add(new Personagem("Sr. Siriguejo", "Caranguejo", "Dono do Siri Cascudo"));
        personagens.add(new Personagem("Sandy Bochechas", "Esquilo", "Cientista"));
        
        return personagens;
    }
}