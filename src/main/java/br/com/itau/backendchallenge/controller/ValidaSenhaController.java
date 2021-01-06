package br.com.itau.backendchallenge.controller;

import br.com.itau.backendchallenge.service.ValidaSenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/validasenha")
public class ValidaSenhaController {

    @Autowired
    private ValidaSenhaService validaSenhaService;

    @GetMapping(value = "/{senha}")
    public boolean validaSenha(@PathVariable final String senha){
        return validaSenhaService.isValido(senha);
    }
}
