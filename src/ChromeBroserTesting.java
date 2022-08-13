import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroserTesting {

    public static void main(String[] args) {
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Creating object of chrome driver
        driver.get(baseURL);   // onpe browse
        driver.manage().window().maximize();  // Maximize a window
        // String title = driver.getTitle(); //13 and 14 line are  for conform a site title name
        // System.out.println(title);

        //driver.close(); //close browser
    }

}
