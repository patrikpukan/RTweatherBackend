package cz.vse.rtweatherbackend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    @Query("SELECT a FROM AppUser a WHERE a.username = ?1")
    Optional<AppUser> findAppUserByUsername(String username);
}
