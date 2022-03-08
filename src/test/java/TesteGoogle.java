import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {
    WebDriver driver;

    @Before
    public void preCondicao() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\isabellaSzrajbman\\Documents\\MeusProjetos\\SeleniumWebdriver_Udemy_PageObjects\\drivers\\chromedriver97\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.manage().window().maximize(); // maximiza a janela do navegador.
    }

    @Test
    public void testeTitulo() {
        Assert.assertEquals("Google", driver.getTitle());
    }

    @After
    public void posCondicao() {
        driver.quit();
    }
}
