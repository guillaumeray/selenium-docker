package com.newtours.tests;

import org.testng.annotations.Test;

import com.newtours.pages.RegistrationPage;


public class BookFlightTest extends BaseTest {

    @Test
    public void registrationPageTest() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.goTo();
        registrationPage.enterUserInfo("Paul");
    }

}
