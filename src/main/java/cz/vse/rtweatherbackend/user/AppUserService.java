package cz.vse.rtweatherbackend.user;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public void addNewAppUser(AppUser appUser) {
        Optional<AppUser> appUserOptional = appUserRepository
                .findAppUserByUsername(appUser.getUsername());
        appUserRepository.findAppUserByUsername(appUser.getUsername());

        if (appUserOptional.isPresent()) {
            throw new IllegalStateException("username taken");
        }
        appUserRepository.save(appUser);
    }

    @Transactional
    public void updateAppUser(Long appUserId, String username, String password, String favoriteCity) {
        AppUser appUser = appUserRepository.findById(appUserId)
                .orElseThrow(() -> new IllegalStateException(
                        "appUser with id " + appUserId + " does not exist"
                ));
        if (username != null &&
                !username.isEmpty() &&
                !appUser.getUsername().equals(username)) {
            appUser.setUsername(username);
        }

        if (password != null &&
                !password.isEmpty() &&
                !appUser.getPassword().equals(password)) {
            appUser.setPassword(password);
        }

        if (favoriteCity != null &&
                !favoriteCity.isEmpty() &&
                !appUser.getFavoriteCity().equals(favoriteCity)) {
            appUser.setFavoriteCity(favoriteCity);
        }
    }
}
