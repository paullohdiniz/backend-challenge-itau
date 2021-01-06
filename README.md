# PROJETO BACKEND-CHALLENGE-ITAU

DESAFIO TESTE ITAU-UNIBANCO

Este código tem como objetivo responder ao desafio enviado pelo [Itaú-Unibanco](https://github.com/itidigital/backend-challenge).

--------------------------------------------------------------------------------------------------------------------------------

1º) Criação de API que valida senha

--- Linguagem JAVA
--- Framework Spring

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.1.RELEASE)

```

2º) Criação de Teste Unitário

2º) Criação de Teste Integrado
	
### Requisitos

```
JAVA JDK_1.8

Baixar o projeto Spring Boot + JPA + WEB + H2 - [GitHub](https://github.com/paullohdiniz/backend-challenge-itau.git)	

Roda o mvn clean install

Subi a aplicação através do comando mvn spring-boot:run

```
### Solução

```
   ### Arquitetura Hexagonal
   
   - Criação de RestController utilizando springframework para expor a API
   	--- EndPoiter - GET http://localhost:8080/validasenha/{senha} 
	--- Ex: http://localhost:8080/validasenha/AbTp9!fok
   
   - Chamada a partir do REST para serviço ValidaSenhaService, que foi instaciado utilizando a injeção de dependência do spring;
   
   - Serviço como domínio do negócio, realiza as regras de negócio;
   	--- Utilização da biblioteca REGEX para regras de validação da string. Ia utilizar o @Value com propriedade, mas não achei tão necessário.
	--- Criação de método para validar repetição (utilizado HashSet para melhor custo computacional O(n)).
   
   - Criação do Repository, RepositoryImpl e RepositoryCustom para apoiar a dinâmica do Teste Integrado;
   	--- O pattern utilizado na relação das 3 classes conforme sugerido pelo framework.
	
   - Criação de Teste Unitário para teste das regras de negócio;
   
   - Criação de uma simulação de Teste Integrado, mocando o acesso ao banco que não se fez necessário para este exemplo.
```
