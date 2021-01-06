package br.com.itau.backendchallenge;

import br.com.itau.backendchallenge.service.ValidaSenhaService;
import br.com.itau.backendchallenge.service.ValidaSenhaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidaSenhaTest {

    public ValidaSenhaService validaSenhaService;


    @BeforeEach
    public void init() {
        validaSenhaService = new ValidaSenhaServiceImpl();
    }
    @Test
    public void validaSenhaCorreta(){
        assertTrue(validaSenhaService.isValido("AbTp9-fok"));
    }

    @Test
    public void validaSenhaInCorreta(){
        assertFalse(validaSenhaService.isValido(""));
        assertFalse(validaSenhaService.isValido("aa"));
        assertFalse(validaSenhaService.isValido("ab"));
        assertFalse(validaSenhaService.isValido("AAAbbbCc"));
        assertFalse(validaSenhaService.isValido("AbTp9!foo"));
        assertFalse(validaSenhaService.isValido("AbTp9!foo"));
        assertFalse(validaSenhaService.isValido("AbTp9 fok"));
        assertFalse(validaSenhaService.isValido("AbTp9!foA"));
    }
}