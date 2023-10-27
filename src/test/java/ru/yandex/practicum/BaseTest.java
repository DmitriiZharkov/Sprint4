package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @Before
    // Инициализируем драйвер и указываем, какой использовать: ChromeDriver() или FirefoxDriver()
    public void setUp() {
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();

    }

    @After
    // Закрываем сессию драйвера
    public void closeSession() {
        driver.quit();
    }

    // Неявное ожидание заданное количество секунд
    public void implicitlyWait(long numberOfSeconds) {
        driver.manage().timeouts().implicitlyWait(numberOfSeconds, TimeUnit.SECONDS);
    }
}
