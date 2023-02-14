package controller;

import model.*;

public class Controller {

    public static Fulltime createUserFulltime() {
        Fulltime user = new Fulltime();
        user.setInfo();
        return user;
    }

    public static Partime createUserParttime() {
        Partime user = new Partime();
        user.setInfo();
        return user;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
