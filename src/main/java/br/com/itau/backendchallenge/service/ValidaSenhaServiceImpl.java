package br.com.itau.backendchallenge.service;

import org.springframework.stereotype.Service;

@Service
public class ValidaSenhaServiceImpl implements ValidaSenhaService {

    @Override
    public Boolean isValid(String senha) {
        return Boolean.TRUE;
    }
}
