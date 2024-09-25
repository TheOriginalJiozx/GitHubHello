package githubhello.githubhello.controller;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeControllerTest {

    @Test
    public void testWelcome() {
        WelcomeController welcomeController = new WelcomeController();
        String viewName = welcomeController.welcome();
        Assert.assertEquals("welcome", viewName);
    }
}