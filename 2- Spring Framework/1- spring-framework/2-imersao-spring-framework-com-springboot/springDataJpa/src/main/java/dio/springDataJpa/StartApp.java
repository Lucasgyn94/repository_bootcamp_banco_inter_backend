package dio.springDataJpa;

import dio.springDataJpa.model.User;
import dio.springDataJpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User users = new User();
        users.setName("Lucas");
        users.setUsername("needlessness944");
        users.setPassword("Lucas123");


        repository.save(users);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
