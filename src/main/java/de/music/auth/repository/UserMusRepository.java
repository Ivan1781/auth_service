package de.music.auth.repository;

import de.music.auth.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserMusRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);

}
