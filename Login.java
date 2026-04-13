/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

import java.util.Scanner;

class Login {

    private String userName;
    private String password;
    private String cellPhoneNumber;

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

    public void register(Scanner sc) {

        System.out.println("\n=== REGISTER ===");

        // USERNAME
        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            if (checkUserName(username)) {
                userName = username;
                System.out.println("Username captured.");
                break;
            } else {
                System.out.println("Invalid username!");
                System.out.println("- Must contain '_' ");
                System.out.println("- Must be max 5 characters");
            }
        }

        // PASSWORD
        while (true) {
            System.out.print("Enter password: ");
            String passwordInput = sc.nextLine();

            if (checkPassword(passwordInput)) {
                password = passwordInput;
                System.out.println("Password captured.");
                break;
            } else {
                System.out.println("Invalid password!");
                System.out.println("- At least 8 characters");
                System.out.println("- Must include uppercase letter");
                System.out.println("- Must include number");
                System.out.println("- Must include special character");
            }
        }

        // PHONE
        while (true) {
            System.out.print("Enter phone (+27...): ");
            String phone = sc.nextLine();

            if (checkCellPhoneNumber(phone)) {
                cellPhoneNumber = phone;
                System.out.println("Phone number captured.");
                break;
            } else {
                System.out.println("Invalid phone number!");
                System.out.println("- Must start with +27");
                System.out.println("- Must be 12 characters long");
            }
        }

        System.out.println("Registration Successful!\n");
    }

    // ================= LOGIN =================

    public void login(Scanner sc) {

        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String usernameInput = sc.nextLine();

        System.out.print("Enter password: ");
        String passwordInput = sc.nextLine();

        if (usernameInput.equals(userName) && passwordInput.equals(password)) {
            System.out.println("Login successful! Welcome back.");
        } else {
            System.out.println("Login failed: incorrect username or password.");
        }
    }
}
