package view;

import java.util.Scanner;

import controller.*;
import model.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void main(String[] args) {
        List<Partime> ptEmployee = new ArrayList<Partime>();
        List<Fulltime> ftEmployee = new ArrayList<Fulltime>();

        // Test
        // for (int id = 0; id < 5; id++) {
        // Partime puser = new Partime();
        // ptEmployee.add(puser);
        // puser.setId(id);
        // }

        // for (int id = 0; id < 5; id++) {
        // Fulltime fuser = new Fulltime();
        // ftEmployee.add(fuser);
        // fuser.setId(id);
        // }

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.Create new user\n" +
                    "2.Sreach user\n" +
                    "3.Exit");
            switch (sc.nextInt()) {
                case 1:
                    Controller.clearScreen();
                    System.out.println("1.Create new user\n\ta.Fulltime\n\tb.Parttime");
                    switch (sc.next()) {
                        case "a":
                            ftEmployee.add(Controller.createUserFulltime());
                            break;
                        case "b":
                            ptEmployee.add(Controller.createUserParttime());
                            break;
                    }
                    break;
                case 2:
                    Controller.clearScreen();
                    System.out.println("2.Search user\n\ta.Fulltime\n\tb.Parttime");
                    switch (sc.next()) {
                        case "a":
                            try {
                                System.out.print("ID: ");
                                System.out.println(ftEmployee.get(sc.nextInt()).toString());
                            } catch (Exception e) {
                                System.out.println("Invalid number");
                            }
                            break;
                        case "b":
                            try {
                                System.out.print("ID: ");
                                System.out.println(ptEmployee.get(sc.nextInt()).toString());
                            } catch (Exception e) {
                                System.out.println("Invalid number");
                            }
                            break;
                    }
                    break;
                case 3:
                    run = false;
            }
        }
        sc.close();
    }
}
