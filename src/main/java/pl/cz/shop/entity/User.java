package pl.cz.shop.entity;


import pl.cz.shop.enums.UserPriviledgeEnum;
import pl.cz.shop.enums.UserStatus;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "shop_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    @NotNull
    @Size(min = 2, max = 30)
    private String password;
    @Email
    private String email;
    @Enumerated(EnumType.STRING)
    private UserStatus status;
    @Enumerated(EnumType.STRING)
    private UserPriviledgeEnum userPriviledge;//tak dla wiadomosci literowka, powinno byc privilege, szkoda czasu na przerobke kodu

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public UserPriviledgeEnum getUserPriviledge() {
        return userPriviledge;
    }

    public void setUserPriviledge(UserPriviledgeEnum userPriviledge) {
        this.userPriviledge = userPriviledge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
