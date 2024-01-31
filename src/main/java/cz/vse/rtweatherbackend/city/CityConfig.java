package cz.vse.rtweatherbackend.city;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CityConfig {

    @Bean
    CommandLineRunner commandLineRunnerCity(CityRepository repository) {
        return args -> {
            City city1 = new City(
                    "Prague",
                    50.075539,
                    14.437800
            );
            City city2 = new City(
                    "Brno",
                    49.195061,
                    16.606836
            );
            City city3 = new City(
                    "Ostrava",
                    49.840790,
                    18.284401
            );
            City city4 = new City(
                    "Pilsen",
                    49.747474,
                    13.377589

            );
            City city5 = new City(
                    "Liberec",
                    50.767110,
                    15.056200
            );
            City city6 = new City(
                    "Olomouc",
                    49.595760,
                    17.251740
            );
            City city7 = new City(
                    "Usti_nad_Labem",
                    50.660700,
                    14.032270
            );
            City city8 = new City(
                    "Hradec_Kralove",
                    50.209200,
                    15.832770
            );
            City city9 = new City(
                    "Ceske_Budejovice",
                    48.974468,
                    14.474624
            );
            City city10 = new City(
                    "Pardubice",
                    50.040000,
                    15.760000
            );
            City city11 = new City(
                    "Havirov",
                    49.779000,
                    18.436000
            );
            City city12 = new City(
                    "Zlin",
                    49.226000,
                    17.668000
            );
            City city13 = new City(
                    "Kladno",
                    50.147000,
                    14.106000
            );
            City city14 = new City(
                    "Most",
                    50.503000,
                    13.636000
            );
            City city15 = new City(
                    "Karvina",
                    49.854000,
                    18.541000
            );
            City city16 = new City(
                    "Paris",
                    48.856613,
                    2.352222

            );
            City city17 = new City(
                    "Opava",
                    49.938000,
                    17.902000
            );
            City city18 = new City(
                    "Frydek-Mistek",
                    49.685000,
                    18.348000
            );
            City city19 = new City(
                    "Decin",
                    50.782000,
                    14.214000
            );
            City city20 = new City(
                    "Karlovy_Vary",
                    50.232000,
                    12.871000
            );
            City city21 = new City(
                    "Teplice",
                    50.640000,
                    13.824000
            );
            City city22 = new City(
                    "Chomutov",
                    50.460000,
                    13.420000
            );
            City city23 = new City(
                    "Jihlava",
                    49.396000,
                    15.591000
            );
            City city24 = new City(
                    "Prostejov",
                    49.471000,
                    17.112000
            );
            City city25 = new City(
                    "Prerov",
                    49.455000,
                    17.450000
            );
            City city26 = new City(
                    "Jablonec_nad_Nisou",
                    50.724000,
                    15.171000
            );
            City city27 = new City(
                    "Mlada_Boleslav",
                    50.411000,
                    14.903000
            );
            City city28 = new City(
                    "Ceska_Lipa",
                    50.685000,
                    14.537000
            );
            City city29 = new City(
                    "Trebic",
                    49.214000,
                    15.881000
            );
            City city30 = new City(
                    "Bratislava",
                    48.148000,
                    17.107000
            );
            City city31 = new City(
                    "Kosice",
                    48.720000,
                    21.257000
            );
            City city32 = new City(
                    "Presov",
                    49.000000,
                    21.240000
            );
            City city33 = new City(
                    "New_York",
                    40.730610,
                    -73.935242
            );
            City city34 = new City(
                    "Los_Angeles",
                    34.052235,
                    -118.243683
            );
            City city35 = new City(
                    "London",
                    51.509865,
                    -0.118092
            );

            repository.saveAll(List.of(city1, city2, city3, city4, city5, city6, city7, city8, city9, city10,
                    city11, city12, city13, city14, city15, city16, city17, city18, city19, city20,
                    city21, city22, city23, city24, city25, city26, city27, city28, city29, city30,
                    city31, city32, city33, city34, city35)
            );
        };
    }
}
