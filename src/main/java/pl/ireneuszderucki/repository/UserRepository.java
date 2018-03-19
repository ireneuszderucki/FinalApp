package pl.ireneuszderucki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ireneuszderucki.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);

}
