import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTesting {

    public static void main(String[] args) {
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // Creating object of Firefox driver
        driver.get(baseURL);   // onpe browse
        driver.manage().window().maximize();  // Maximize a window
        // String title = driver.getTitle(); //13 and 14 line are  for conform a site title name
        // System.out.println(title);

        //driver.close(); //close browser
    }

}
