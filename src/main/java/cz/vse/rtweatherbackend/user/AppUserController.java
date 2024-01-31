package cz.vse.rtweatherbackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/appUser")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAppUsers() {
        return appUserService.getAppUsers();
    }

    @PostMapping
    public void registerNewAppUser(@RequestBody AppUser appUser) {
        appUserService.addNewAppUser(appUser);
    }

    @PutMapping(path = "{appUserId}")
    public void updateAppUser(
            @PathVariable("appUserId") Long appUserId,
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) String favoriteCity
    ) {
        appUserService.updateAppUser(appUserId, username, password, favoriteCity);
    }
}
