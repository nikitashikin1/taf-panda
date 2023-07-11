import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

    private String baseUrl = "https://www.panda.by/";
    private String emailLocator = "//a[@href='mailto:market@panda.by']";
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailText() {
        WebElement emailText = driver.findElement(By.xpath(emailLocator));
        return emailText.getText();
    }

    public void openHomePage(){
        driver.get(baseUrl);
    }
}
