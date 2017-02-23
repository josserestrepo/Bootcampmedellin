package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchDriverOld {
	
	public WebDriver driver;
	public WebElement searchBox;
	public WebElement searchButton;
	public WebElement video;
	public List<WebElement> videos;
	
	public LaunchDriverOld(){
		System.setProperty("webdriver.gecko.driver", "/Users/mac/selenium3/geckodriver");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void launchDriver() throws InterruptedException{
		//System.out.println("Caso 1");
		driver.get("https://www.youtube.com/");
		searchBox = driver.findElement(By.id("masthead-search-term"));
		searchBox.sendKeys("Rodolfo aicardi");
		
		searchButton = driver.findElement(By.id("search-btn"));
		searchButton.click();
		
		Thread.sleep(3000);
		//video = driver.findElement(By.xpath(".//*[@id='results']/ol/li[2]/ol/li/div/div/div[2]/h3/a"));
		//video.click();
		//.//*[@id='item-section-282174']/li[1]/div/div/div[2]/h3/a
		//.//*[@id='item-section-282174']/li[2]/div/div/div[2]/h3/a

		//videos = driver.findElements(By.xpath(".//*[@id='results']/ol/li[2]/ol/li/div/div/div/h3"));
		//String name = videos.get(2).getText();
	
		
	}

}
