/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author qhxme
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    //Test of checkUserName method, of the Login class.
    Login login = new Login(); //Object of the login class
    
    @Test
    public void testCheckUserName_Valid() {
      assertEquals(true,login.checkUserName("kyl_1"));
    }

    @Test
    public void testCheckUserName_Invalid() {
      assertEquals(false,login.checkUserName("kyle!!!!!!!"));
    }
    
    @Test
    public void testCheckUserName_NoUnderscore() {
      assertEquals(false,login.checkUserName("kyle1"));
    }
   
    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity_Valid() { 
      assertEquals(true,login.checkPasswordComplexity("Ch&&sec@ke99!")); 
    }

    @Test
    public void testCheckPasswordComplexity_Invalid() { 
      assertEquals(false,login.checkPasswordComplexity("password")); 
    }
    
    //Test of checkCellPhoneNumber
    @Test
    public void testCheckCellPhoneNumber_Valid() {
      assertTrue(login.checkCellPhoneNumber(+27659874564));
    }
    
    @Test
    public void testCheckCellPhoneNumber_Invalid() {
      assertFalse(login.checkCellPhoneNumber(08966553));
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUserSuccessful() {
        login.registerUser("kyl_1, pass@123");
        assertTrue(login.loginUser("kyl_1, pass@123"));
    }

    @Test
    public void testLoginUserFailed() {
        login.registerUser("kyl_1, pass@123");
        assertFalse(login.loginUser("kyl_1, WrongPass"));
    }
    
    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
   
        assertEquals(expResult, result);
        
    }
    
}
