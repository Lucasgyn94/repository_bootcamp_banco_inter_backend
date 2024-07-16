package dio.springDataJpaRepository;

import dio.springDataJpaRepository.model.Users;
import dio.springDataJpaRepository.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //List<Users> users = repository.findByNameContaining("LUCAS");
        List<Users> users = repository.findAll();
        for (Users u : users) {
            System.out.println(u);
        }
        insertUser();
    }
    private void insertUser() {
        Users user2 = new Users();
        user2.setName("Gabriel Nunes");
        user2.setUserName("gabriel");
        user2.setPassword("578965");

        repository.save(user2);

        for (Users u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
