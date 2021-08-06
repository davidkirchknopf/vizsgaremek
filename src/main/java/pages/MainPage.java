package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By whomCouldIKnow = By.xpath("//li[1]//span[@class='symbollink-text']");
    private final By logoutButton = By.xpath("//span[@class='menu-item-logout-inner menu-link-text']\n");

    public WhomCouldIKnowPage clickWhomCouldIKnow() {
        try { driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]\n")).click();
        } catch(Exception e){
        }
        driver.findElement(whomCouldIKnow).click();
        return new WhomCouldIKnowPage(driver);
        }

    public void clickOnLogoutButton(){ driver.findElement(logoutButton).click();}

}

