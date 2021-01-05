package br.com.itau.backendchallenge;

import br.com.itau.backendchallenge.service.ValidaSenhaService;
import br.com.itau.backendchallenge.service.ValidaSenhaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidaSenhaTest {

    public ValidaSenhaService validaSenhaService;


    @BeforeEach
    public void init() {
        validaSenhaService = new ValidaSenhaServiceImpl();
    }
    @Test
    public void validaSenhaCorreta(){
        assertTrue(validaSenhaService.isValid("teste"));
    }
}
