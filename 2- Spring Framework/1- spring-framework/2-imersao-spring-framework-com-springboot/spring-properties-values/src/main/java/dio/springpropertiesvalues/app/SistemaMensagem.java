package dio.springpropertiesvalues.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{62991029876L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\nMensagem enviada por: " + this.nome
                        + "\nE-mail: " + this.email
                        + "\nTelefones de contato: " + this.telefones
        );
        System.out.println("Seu cadastro foi aprovado!");
    }
}
