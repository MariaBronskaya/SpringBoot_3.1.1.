package web.Spring_Boot_311.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.Spring_Boot_311.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
