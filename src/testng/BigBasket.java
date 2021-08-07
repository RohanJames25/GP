package testng;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {
	
	public static void ArrLst() throws InterruptedException {
		int i;
		int j;

		System.setProperty("webdriver.chrome.driver", "D:/Softwares/Eclipse Jars/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:/Softwares/Eclipse Jars/geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		WebElement dropdown = driver.findElement(By.cssSelector("a.dropdown-toggle.meganav-shop"));
		Actions act = new Actions(driver);
		act.click(dropdown).build().perform();

		/*
		  // For each with list<WebElement>
		List<WebElement> al =driver.findElements(By.xpath("//ul[@id='navBarMegaNav']/li")); 
		for (WebElement product : al)
		 {
		   if (product.getText().contains("Bakery"))
		   {
		  //product.click(); 
			   act.moveToElement(product).build().perform();
		   
		 */
		 	
			   // ArrayList with for loop
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ArrayList<WebElement> options = (ArrayList<WebElement>) driver.findElements(By.xpath("//ul[@id='navBarMegaNav']/li"));
			for (i = 0; i < options.size(); i++)
				{
					if (options.get(i).getText().contains("Bakery"))
						{
							act.moveToElement(options.get(i)).build().perform();
						
					
		//List<WebElement> all = driver.findElements(By.cssSelector("ul.nav.nav-pills.nav-stacked>li"));
			List<WebElement> all = driver.findElements(By.xpath("//*[@qa='catL2']"));
			for (WebElement products : all)
				{
					if (products.getText().contains("Rusk"))
						{
							act.moveToElement(products).build().perform();
		
		List<WebElement> alll = driver.findElements(By.xpath("//a[@qa = 'catL3']"));
			for (WebElement products1 : alll) 
					{
					if (products1.getText().contains("Premium")) 
						{
							//act.click(products1).build().perform();
							act.click(products1).build().perform();
						}
					}
				}
			}
		}
	}}

	public static void main(String[] args) throws InterruptedException {
		BigBasket.ArrLst();

	}

}
