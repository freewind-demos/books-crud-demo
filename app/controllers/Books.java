package controllers;

import models.Book;
import play.mvc.Before;

import java.util.List;

public class Books extends BaseController {

    @Before
    static void checkAuthentification() {
        if (!isLoggedIn()) {
            Application.loginPage();
        }
    }

    public static void index() {
        List<Book> books = Book.all().fetch();
        render(books);
    }

    public static void createPage() {
        render();
    }

    public static void create(String title, String description) {
        Book book = new Book(title, description);
        book.save();
        index();
    }

    public static void editPage(Long id) {
        Book book = Book.findById(id);
        render(book);
    }

    public static void update(Long id, String title, String description) {
        Book book = Book.findById(id);
        book.title = title;
        book.description = description;
        book.save();
        flash.success("Updated");
        index();
    }

    public static void delete(Long id) {
        Book book = Book.findById(id);
        book.delete();
        flash.success("Delete successful!");
        index();
    }

    public static void show(Long id) {
        Book book = Book.findById(id);
        render(book);
    }

}
