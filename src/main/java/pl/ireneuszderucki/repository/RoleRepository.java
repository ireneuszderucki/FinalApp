package pl.ireneuszderucki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ireneuszderucki.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
