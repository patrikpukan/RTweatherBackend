package cz.vse.rtweatherbackend.user;


import jakarta.persistence.*;

@Entity
@Table
public class AppUser {
    @Id
    @SequenceGenerator(
            name = "appUser_sequence",
            sequenceName = "appUser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.SEQUENCE,
            generator = "appUser_sequence"
    )
    private Long id;
    private String username;
    private String password;
    private String favoriteCity;

    public AppUser() {
    }

    public AppUser(Long id, String username, String password, String favoriteCity) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.favoriteCity = favoriteCity;
    }

    public AppUser(String username, String password, String favoriteCity) {
        this.username = username;
        this.password = password;
        this.favoriteCity = favoriteCity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavoriteCity() {
        return favoriteCity;
    }

    public void setFavoriteCity(String favoriteCity) {
        this.favoriteCity = favoriteCity;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", favoriteCity='" + favoriteCity + '\'' +
                '}';
    }
}
