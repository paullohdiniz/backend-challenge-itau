package br.com.itau.backendchallenge.repository;

import br.com.itau.backendchallenge.domain.Senha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidaSenhaRepository extends ValidaSenhaRepositoryCustom, JpaRepository<Senha, Long> {

    Senha findSenhaByDescricao(String descricao);

}
