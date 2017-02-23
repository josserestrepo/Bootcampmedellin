package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTubeResultsPage {
	
	public WebDriver driver;
	
	public YouTubeResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='results']/ol/li[2]/ol/li/div/div/div[2]/h3/a")
	public WebElement videoTwo;
	
    public boolean isVideoTwoDisplayed(){
    	return videoTwo.isDisplayed();
    }
  

}
