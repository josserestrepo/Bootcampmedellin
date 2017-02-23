package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YouTubeHomePage {
	//id="masthead-search-term"
//    @FindBy(how=How.ID,using="searchBox")
//    private WebElement searchBox;
	
//  public WebElement algo(){
//	return searchBox.findElement(By)
//}
	public WebDriver driver;
	
	public YouTubeHomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="masthead-search-term")
    public WebElement searchBox;
    
    @FindBy(id="search-btn")
    public WebElement searchButton;

    
    public void setSearchVideo(String videoName){
    	searchBox.sendKeys(videoName);
    }
    
    public void clickOnSearch(){
    	searchButton.click();
    }
    
 
    public void setSearchVideoB(String videoName){
    	searchBox.sendKeys(videoName);
    	clickOnSearchB();
    }
    
    private void clickOnSearchB(){
    	searchButton.click();
    }
    
    
    public void setSearchVideoC(String videoName){
    	searchBox.sendKeys(videoName);
    	searchButton.click();
    }
    
    public YouTubeHomePage setSearchVideoD(String videoName){
    	searchBox.sendKeys(videoName);
    	return this;
    }
    
    public YouTubeHomePage clickOnSearchD(){
    	searchButton.click();
    	return this;
    }
    


}
