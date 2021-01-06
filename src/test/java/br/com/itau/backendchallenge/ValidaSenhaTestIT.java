package br.com.itau.backendchallenge;

import br.com.itau.backendchallenge.domain.Senha;
import br.com.itau.backendchallenge.service.ValidaSenhaService;
import br.com.itau.backendchallenge.service.ValidaSenhaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidaSenhaTestIT {

    public ValidaSenhaService validaSenhaService;

    @BeforeEach
    public void init() {
        validaSenhaService = new ValidaSenhaServiceImpl();
    }

    @Test
    public void validaSenhaCorreta(){
        Senha senha = new Senha(null, "AbTp9-fok");
        String senhaFound = validaSenhaService.findByDescricao(senha.getDescricao());

        assertThat(senha.getDescricao())
                .isEqualTo(senhaFound);
    }
}