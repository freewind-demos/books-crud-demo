package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class User extends Model {

    public String email;

    public String name;

    public String address;

    public String password;

    public Boolean isAdmin = false;

    public User(String name, String password, String email, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.password = password;
    }
}
