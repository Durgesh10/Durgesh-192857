package Assignment_01_06_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

    static WebDriver driver;

    public static void main(String[] args) {
        // Setup EdgeDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        try {
            driver = new EdgeDriver();
            driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");

            // Maximize the browser window
            driver.manage().window().maximize();

            Thread.sleep(3000);

            // Enter username and password
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("testuser");

            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Password@123");

            // Confirm password (required for this form)
            WebElement confirmPassword = driver.findElement(By.id("confirm_password"));
            confirmPassword.sendKeys("Password@123");

            // Click on the Register (submit) button
            WebElement registerButton = driver.findElement(By.id("submit"));
            registerButton.click();

            Thread.sleep(4000);

            // Fetch the title of the web page and print it on the console
            String title = driver.getTitle();
            System.out.println("Page Title after submission: " + title);

            // Simple validation
            if (title.contains("Register")) {
                System.out.println("Form submitted successfully!");
            } else {
                System.out.println("Form submission may have failed.");
            }

            // Close browser
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
