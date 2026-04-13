/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author qhxme
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }

    /**
     * Test of checkUserName method, of class Registration.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class Registration.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Registration.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phone = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(phone);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class Registration.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Scanner sc = null;
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.register(sc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class Registration.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Scanner sc = null;
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.login(sc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
