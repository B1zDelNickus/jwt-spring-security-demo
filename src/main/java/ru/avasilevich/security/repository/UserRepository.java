package ru.avasilevich.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.avasilevich.model.security.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
