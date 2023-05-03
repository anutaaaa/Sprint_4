package ru.praktikum_services.sprint4.cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import ru.praktikum_services.sprint4.data.OrderData;

@RunWith(Parameterized.class)
public class FirefoxOrderTest extends AbstractOrderTest {

    public FirefoxOrderTest(OrderData data) {
        super(data);
    }

    @Before
    public void init() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new FirefoxDriver(firefoxOptions);
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
