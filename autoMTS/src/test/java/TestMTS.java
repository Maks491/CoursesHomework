import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class TestMTS {
    WebDriver driver;
    Forma forma;

    @BeforeEach
    public void SetUP() {
        driver = new ChromeDriver();
        forma = new Forma(driver);
        driver.get("https://www.mts.by/");
    }

    @Test
    void one() {
        Assertions.assertTrue(forma.title().contains("Онлайн пополнение"));
    }

    @Test
    void two() {
        List<WebElement> logo = forma.getLogo();
        for (WebElement s : logo) {
            String src = s.getDomAttribute("src");
            // Assertions.assertNotNull(src,"не ноль");

            Assertions.assertTrue(src.contains(".svg"));

        }

    }
    @Test
    void checkPlace(){
        Assertions.assertEquals("Номер телефона",forma.checkPlace());
    }
}
