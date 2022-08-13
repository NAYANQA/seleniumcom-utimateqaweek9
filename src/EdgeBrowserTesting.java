import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public static void main(String[] args) {
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver(); // Creating object of Edge driver
        driver.get(baseURL);   // onpe browse
        driver.manage().window().maximize();  // Maximize a window
        // String title = driver.getTitle(); //13 and 14 line are  for conform a site title name
        // System.out.println(title);

        //driver.close(); //close browser
    }


}
