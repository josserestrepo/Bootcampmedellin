package Chains;

import org.openqa.selenium.WebDriver;

import Pages.YouTubeHomePage;
import Pages.YouTubeResultsPage;

public class SearchsChain {
	
	
//	public WebDriver driver;
	
	public YouTubeHomePage youTubeHomePage;
	public YouTubeResultsPage youTubeResultsPage;
	
	public SearchsChain(WebDriver driver){
		youTubeHomePage = new YouTubeHomePage(driver);
		youTubeResultsPage = new YouTubeResultsPage(driver);
	}
	
	public void searchAndSelectVideo(String nameOfArtist, String nameOfVideo) throws InterruptedException{
		searchVideo(nameOfArtist);
		Thread.sleep(3000);
		youTubeResultsPage.videoTwo.click();
	}
	
	public void searchVideo(String nameOfArtist){
		youTubeHomePage.searchBox.sendKeys(nameOfArtist);
		youTubeHomePage.searchButton.click();
	}

}
