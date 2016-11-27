package controllers;

public class Application extends BaseController {

    public static void index() {
        if (isLoggedIn()) {
            Books.index();
        } else {
            loginPage();
        }
    }

    public static void loginPage() {
        render();
    }

    public static void login(String name, String password) {
        boolean loginOk = name.equals("demo") && password.equals("123456");
        if (loginOk) {
            putUsernameInSession(name);
            flash.success("Login successful");
            index();
        } else {
            flash.error("Invalid name or password");
            loginPage();
        }
    }

    public static void logout() {
        removeUserFromSession();
        flash.success("Logged out successfully");
        index();
    }

}
