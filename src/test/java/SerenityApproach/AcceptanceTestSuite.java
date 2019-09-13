package SerenityApproach;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AcceptanceTestSuite extends SerenityStories {

    @Managed
    WebDriver driver;

//    private Configuration configuration;
//
//    public  AcceptanceTestSuite(){
//        configuration = super.getSystemConfiguration();
//        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(),"provided");
//        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
//        configuration.setIfUndefined("webdriver.provided.mydriver", "SerenityApproach.driver.DriverManager");
//    }
}
