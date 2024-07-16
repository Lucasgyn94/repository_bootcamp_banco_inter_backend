package dio.springDataJpaRepository.repository;

import dio.springDataJpaRepository.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
    // metodo de procura query
    List<Users> findByNameContaining(String name);

    // substituindo query override
    @Query("SELECT u FROM Users u WHERE u.name LIKE %:name%")
    List<Users> filtrarPorNome(@Param("name") String name);

}
