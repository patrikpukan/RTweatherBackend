package cz.vse.rtweatherbackend.weather;

import cz.vse.rtweatherbackend.city.City;
import cz.vse.rtweatherbackend.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/weather")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
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

    @GetMapping("forecast/{city}")
    public String getForecastWeather(@PathVariable String city) {
        List<City> cities = cityService.getCities();
        for (City c : cities) {
            if (c.getCityName().equalsIgnoreCase(city)) {
                return weatherService.getForecastWeather(c.getLatitude(), c.getLongitude());
            }
        }
        return String.format("%s not found", city);
    }
}
