package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Book extends Model {

    public String title;

    public String description;

    public Book(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
