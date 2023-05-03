package ru.praktikum_services.sprint4.cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.praktikum_services.sprint4.data.OrderData;

@RunWith(Parameterized.class)
public class ChromeOrderTest extends AbstractOrderTest {

    public ChromeOrderTest(OrderData data) {
        super(data);
    }

    @Before
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void makeOrderByTopButton() {
        super.makeOrderByTopButton();
    }


    @Test
    public void makeOrderByBottomButton() {
        super.makeOrderByBottomButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
