package hello.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
	List<Users> findByUsername(String username);
}
