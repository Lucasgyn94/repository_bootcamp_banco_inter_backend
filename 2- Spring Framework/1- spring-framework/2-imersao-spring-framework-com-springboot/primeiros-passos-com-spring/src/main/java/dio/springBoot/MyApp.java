package dio.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // componente do exteriotipo spring boot terá um outro componente, que sera a calculadora
public class MyApp implements CommandLineRunner {
    // componente recebendo calculadora como dependência
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        Calculadora calc1 = new Calculadora();
        System.out.println("Soma = " + calc1.somar(5,6));

    }
}
