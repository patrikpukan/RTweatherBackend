package cz.vse.rtweatherbackend.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${openweathermap.apikey}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public String getCurrentWeather(double lat, double lon) {
        String url = String.format(
                "http://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s&units=metric",
                lat, lon, apiKey);

        return restTemplate.getForObject(url, String.class);
    }

    public String getForecastWeather(double lat, double lon) {
        String url = String.format(
                "http://api.openweathermap.org/data/2.5/forecast?lat=%s&lon=%s&appid=%s&units=metric",
                lat, lon, apiKey);

        return restTemplate.getForObject(url, String.class);
    }
}