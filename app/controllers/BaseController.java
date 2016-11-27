package controllers;

import play.mvc.Controller;

public abstract class BaseController extends Controller {

    public static final String USERNAME = "username";

    static boolean isLoggedIn() {
        return session.contains(USERNAME);
    }

    static void putUsernameInSession(String username) {
        session.put(USERNAME, username);
    }

    static String getUsernameFromSession() {
        return session.get(USERNAME);
    }

    static void removeUserFromSession() {
        session.remove(USERNAME);
    }

}
