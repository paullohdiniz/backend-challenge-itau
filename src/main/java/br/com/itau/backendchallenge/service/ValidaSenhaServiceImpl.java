package br.com.itau.backendchallenge.service;

import br.com.itau.backendchallenge.repository.ValidaSenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidaSenhaServiceImpl implements ValidaSenhaService {

    private static final String REGEX = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[!@#$%^&*()+-])"
            + "(?=\\S+$).{9}$";

    @Autowired
    public ValidaSenhaRepository validaSenhaRepository;

    @Override
    public boolean isValido(final String senha) {
        Pattern p = Pattern.compile(REGEX);
        char[] senhaArray = senha.toCharArray();

        if (senha == null || hasRepeticao(senhaArray)) {
            return false;
        }

        Matcher m = p.matcher(senha);
        return m.matches();
    }

    static boolean hasRepeticao(char str[])
    {
        HashSet<Character> h = new HashSet<>();

        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];

            if (h.contains(c))
                return true;
            else
                h.add(c);
        }

        return false;
    }

    @Override
    public String findByDescricao(String descricao) {
        return validaSenhaRepository.findByDescricao(descricao);
    }
}
