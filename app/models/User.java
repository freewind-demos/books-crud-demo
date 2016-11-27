package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class User extends Model {

    public String email;

    public String name;

    public String address;

    public User(String email, String name, String address) {
        this.email = email;
        this.name = name;
        this.address = address;
    }
}
