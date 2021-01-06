package br.com.itau.backendchallenge.service;

public interface ValidaSenhaService {

    boolean isValido(String senha);

    String findByDescricao(String descricao);
}
