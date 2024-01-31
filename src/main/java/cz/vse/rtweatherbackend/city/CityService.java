package cz.vse.rtweatherbackend.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getCities() {
        return cityRepository.findAll();
    }

    public Optional<City> getCityByCityName(String cityName) {
        return cityRepository.findCityByCityName(cityName);
    }

    public void addNewCity(City city) {
        Optional<City> cityOptional = cityRepository
                .findCityByCityName(city.getCityName());

        if (cityOptional.isPresent()) {
            throw new IllegalStateException("city already exists");
        }
        cityRepository.save(city);
    }
}
