package FW.Manager;

import FW.Enums.DriverType;
import FW.Enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    private WebDriver driver;
    private DriverType driverType;
    private EnvironmentType environmentType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
    private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
    private static final String EDGE_DRIVER_PROPERTY = "webdriver.edge.driver";
    private String driverPath = "C:\\selenium\\drivers\\";

    public WebDriverManager()
    {
        driverType = DriverType.CHROME;
        environmentType = EnvironmentType.LOCAL;
        System.out.println("111111111111111");
    }

    public WebDriver getDriver()
    {
        if (driver == null){
            driver = createDriver();
        }
        return driver;
    }

    private WebDriver createDriver()
    {
        switch (environmentType)
        {
            case LOCAL:
            {
                driver = createLocalDriver();
                break;
            }
            case REMOTE:
            {
                driver = createRemoteDriver();
                break;
            }
        }
        return driver;
    }

    private WebDriver createLocalDriver()
    {
        switch (driverType)
        {
            case CHROME:
                driverPath += "chromedriver.exe";
                System.setProperty(CHROME_DRIVER_PROPERTY, driverPath);
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driverPath += "geckodriver.exe";
                System.setProperty(FIREFOX_DRIVER_PROPERTY, driverPath);
                driver = new FirefoxDriver();
                break;
        }
        return driver;
    }

    private WebDriver createRemoteDriver()
    {
        throw new RuntimeException("RemoteWebDriver is not implemented");
    }
}
