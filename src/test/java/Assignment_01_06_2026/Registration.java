package Assignment_01_06_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

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

            // Fill in registration form fields
            driver.findElement(By.id("firstname")).sendKeys("John");
            driver.findElement(By.id("lastname")).sendKeys("Doe");
            driver.findElement(By.id("username")).sendKeys("johndoe123");
            driver.findElement(By.id("password")).sendKeys("Password@123");
            driver.findElement(By.id("confirm_password")).sendKeys("Password@123");
            driver.findElement(By.id("email")).sendKeys("johndoe@example.com");
            driver.findElement(By.id("phone")).sendKeys("9876543210");

            // Select gender (radio button)
            WebElement maleRadio = driver.findElement(By.id("male"));
            maleRadio.click();

            // Select hobbies (checkboxes)
            driver.findElement(By.id("reading")).click();
            driver.findElement(By.id("travelling")).click();

            // Select country (dropdown)
            driver.findElement(By.id("country")).sendKeys("India");

            // Upload file (profile picture)
            driver.findElement(By.id("file")).sendKeys("C:/path/to/file.jpg");

            // Click Register button
            driver.findElement(By.id("submit")).click();

            Thread.sleep(4000);

            // Fetch the title of the web page and print it on the console
            String title = driver.getTitle();
            System.out.println("Page Title after registration: " + title);

            // Simple validation
            if (title.contains("Register")) {
                System.out.println("Registration form submitted successfully!");
            } else {
                System.out.println("Registration may have failed.");
            }

            // Close browser
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

