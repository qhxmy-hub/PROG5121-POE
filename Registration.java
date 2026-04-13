/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author qhxme
 */

public class Registration {

    String userName;
    String password;
    String cellPhoneNumber;

    public Registration() {
        // clean constructor (no crashes)
    }

    // ================= VALIDATION =================

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasNumber && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String phone) {
        if (!phone.startsWith("+27")) return false;
        if (phone.length() != 12) return false;

        for (int i = 3; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // ================= REGISTER =================

    public boolean register(Scanner sc) {

        System.out.println("\n=== REGISTER ===");

        // Username
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (!checkUserName(username)) {
            System.out.println("Invalid username!");
            System.out.println("Must contain '_' and be max 5 characters.");
            return false;
        }

        // Password
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (!checkPassword(password)) {
            System.out.println("Invalid password!");
            System.out.println("Must be 8+ chars, include uppercase, number, special char.");
            return false;
        }

        // Phone
        System.out.print("Enter cell number (+27...): ");
        String phone = sc.nextLine();

        if (!checkCellPhoneNumber(phone)) {
            System.out.println("Invalid phone number!");
            return false;
        }

        // Save data
        this.userName = username;
        this.password = password;
        this.cellPhoneNumber = phone;

        System.out.println("Registration successful!\n");
        return true;
    }

    // ================= LOGIN =================

    public boolean login(Scanner sc) {

        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        return this.userName != null &&
               this.userName.equals(u) &&
               this.password.equals(p);
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Registration> users = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    Registration newUser = new Registration();

                    if (newUser.register(sc)) {
                        users.add(newUser);
                    }
                    break;

                case 2:
                    System.out.println("\n=== LOGIN  ===");

                    System.out.print("Enter username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    boolean found = false;

                    for (Registration user : users) {
                        if (user.userName.equals(username)
                                && user.password.equals(password)) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Login successful! Welcome back.");
                    } else {
                        System.out.println("Login failed: incorrect details.");
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 3);

        sc.close();
    }
}