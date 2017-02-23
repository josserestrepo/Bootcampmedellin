package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Chains.SearchsChain;
import Pages.YouTubeHomePage;
import Pages.YouTubeResultsPage;

public class LaunchDriver {
	
	public WebDriver driver;
	private YouTubeHomePage youTubeHomePage;
	private YouTubeResultsPage youTubeResultsPage;
	private SearchsChain searchsChain;

	
	public LaunchDriver(){
		System.setProperty("webdriver.gecko.driver", "/Users/mac/selenium3/geckodriver");
		driver = new FirefoxDriver();
		youTubeHomePage = new YouTubeHomePage(driver);
		youTubeResultsPage = new YouTubeResultsPage(driver);
		searchsChain = new SearchsChain(driver);
	}
	
	@Test
	public void launchDriverA() throws InterruptedException{
		//System.out.println("Caso 1");
		driver.get("https://www.youtube.com/");
		youTubeHomePage.setSearchVideo("Rodolfo Aicardi");
        youTubeHomePage.clickOnSearch();
        Thread.sleep(3000);
        Assert.assertTrue(youTubeResultsPage.isVideoTwoDisplayed());
		//videos = driver.findElements(By.xpath(".//*[@id='results']/ol/li[2]/ol/li/div/div/div/h3"));
		//String name = videos.get(2).getText();
	
		
	}
	
	@Test
	public void launchDriverB() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		youTubeHomePage.setSearchVideoB("Rodolfo Aicardi");

	}
	
	@Test
	public void launchDriverC() throws InterruptedException{

		driver.get("https://www.youtube.com/");
		youTubeHomePage.setSearchVideoC("Rodolfo Aicardi");

	}
	
	@Test
	public void launchDriverD() throws InterruptedException{

		driver.get("https://www.youtube.com/");
		youTubeHomePage = youTubeHomePage.setSearchVideoD("Rodolfo Aicardi").clickOnSearchD();


	}
	
	@Test
	public void launchDriverChain() throws InterruptedException{
		
		driver.get("https://www.youtube.com/");
		searchsChain.searchAndSelectVideo("rodolfo aicardi", "adonay");

	}

}
