package ru.devteam.resume.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.resume.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
