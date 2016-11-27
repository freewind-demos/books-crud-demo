package controllers;

import play.mvc.*;

import java.util.*;

import models.*;

public class Users extends Controller {

    public static void index() {
        List<User> users = User.all().fetch();
        render(users);
    }

    public static void createPage() {
        render();
    }

    public static void create(String email, String name, String address) {
        User user = new User(email, name, address);
        user.save();
        index();
    }

    public static void editPage(Long id) {
        User user = User.findById(id);
        render(user);
    }

    public static void update(Long id, String email, String name, String address) {
        User user = User.findById(id);
        user.email = email;
        user.name = name;
        user.address = address;
        user.save();
        index();
    }

    public static void delete(Long id) {
        User user = User.findById(id);
        user.delete();
        index();
    }

    public static void show(Long id) {
        User user = User.findById(id);
        render(user);
    }
}
