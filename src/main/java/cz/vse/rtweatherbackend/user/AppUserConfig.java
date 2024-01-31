package cz.vse.rtweatherbackend.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppUserConfig {

    @Bean
    CommandLineRunner commandLineRunnerAppUser(AppUserRepository repository) {
        return args -> {
            AppUser user1 = new AppUser(
                    "user1",
                    "password1",
                    "Prague"
            );
            AppUser user2 = new AppUser(
                    "user2",
                    "password2",
                    "Brno"
            );

            repository.saveAll(List.of(user1, user2)
            );
        };
    }
}
