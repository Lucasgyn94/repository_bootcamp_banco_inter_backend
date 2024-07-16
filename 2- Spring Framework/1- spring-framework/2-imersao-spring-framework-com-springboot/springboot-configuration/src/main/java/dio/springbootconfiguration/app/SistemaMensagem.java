package dio.springbootconfiguration.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n================================");
        System.out.println("\nMensagem enviada por: " + remetente.getNome()
                + "\nE-mail:" + remetente.getEmail() + "\nCom telefones para contato: "
                + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado!");
        System.out.println("\n===============================");
    }
}
