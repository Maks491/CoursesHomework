import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import static com.google.common.collect.Streams.stream;

public class Forma {
    @FindBy(xpath = "//section[@class='pay']")
    private WebElement header;
    @FindBy(xpath = "//div[@class='pay__partners']/ul/li/img")
    private WebElement logo;
    @FindBy(xpath = "//input[@id='connection-phone']")
            private WebElement phonePlace;

    WebDriver driver;
    WebDriverWait wait;

    public Forma(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);

    }

    public String title() {
        return wait.until(ExpectedConditions.visibilityOf(header)).getText();

    }
    public List<WebElement> getLogo(){
        return wait.until(ExpectedConditions.visibilityOfAllElements(logo));

    }
    public String checkPlace(){
        wait.until(ExpectedConditions.visibilityOf(phonePlace));
        return phonePlace.getDomAttribute("placeh older");
    }

}
