package cz.vse.RTweatherBackend.weather;

import cz.vse.RTweatherBackend.city.City;
import cz.vse.RTweatherBackend.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/weather")
public class WeatherController {

    private final CityService cityService;
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(CityService cityService, WeatherService weatherService) {
        this.cityService = cityService;
        this.weatherService = weatherService;
    }


    @GetMapping("{city}")
    public String getCityWeather(@PathVariable String city) {
        List<City> cities = cityService.getCities();
        for (City c : cities) {
            if (c.getCityName().equalsIgnoreCase(city)) {
                return weatherService.getCurrentWeather(c.getLatitude(), c.getLongitude());
            }
        }
        return String.format("%s not found", city);
    }
}
