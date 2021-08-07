package testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrayTest {

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
				/*
				 * ArrayList<WebElement> options1 = (ArrayList<WebElement>)
				 * driver.findElements(By.xpath("//ul[@class = 'list-unstyled']/li/a"));
				 * ArrayList<WebElement> options1 = (ArrayList<WebElement>)
				 * driver.findElements(By.xpath("//a[@qa = 'catL3']")); { for (j = 0; j <
				 * options1.size(); j++){ if (options1.get(j).getText().contains("Bakery")) {
				 * act.moveToElement(options.get(j)).click().build().perform(); } }
				 */
					
					

	/*
	 * ArrayList<WebElement> options = (ArrayList<WebElement>) driver
	 * .findElements(By.xpath("//ul[@id='navBarMegaNav']/li")); for (i = 0; i <
	 * options.size(); i++) { if (options.get(i).getText().contains("Bakery")) { //
	 * options.get(i).click(); act.moveToElement(options.get(i)).build().perform();
	 * 
	 * List<WebElement> all = driver.findElements(By.xpath("//*[@qa='catL2']")); //
	 * List<WebElement> all = //
	 * driver.findElements(By.cssSelector("ul.nav.nav-pills.nav-stacked>li"));
	 * 
	 * for (WebElement products : all) {
	 * 
	 * if (products.getText().contains("Bakery")) { // if
	 * (products.getText().equals("Non Dairy")) {
	 * act.moveToElement(products).build().perform(); } } List<WebElement> alll =
	 * driver.findElements(By.xpath("//*[@qa='catL3']")); for (WebElement
	 * subproducts : alll) { // System.out.println(subproducts.getText());
	 * 
	 * if (subproducts.getText().contains("Puffs")) {
	 * act.moveToElement(subproducts).build().perform(); } }
	 * 
	 * } } }
	 */
	// List<String> as = new ArrayList<String>();
	/*
	 * for (WebElement product : al) { //System.out.println(product.getText());
	 * String products= product.getText(); String[] productlist = {products};
	 * if(productlist.equals("Bakery")) { al. }
	 * 
	 */

	/*
	 * int listsize= al.size(); System.out.println(listsize);
	 * for(i=0;i<listsize-1;i++) { as.add(al.get(i).getText()); }
	 * System.out.println(as.get(3));
	 */

	// for (WebElement product : al) {
	// if (as.get(i).contains("Bakery")) {
	// System.out.println("paagal");
	// WebElement cakes =
	// driver.findElement(By.xpath("//*[contains(@data-submenu-id,'bakery')]"));
	// WebElement cakes =
	// driver.findElement(By.cssSelector(".nav.nav-tabs.nav-stacked.col-md-3.bdr-viewall>li>a:nth-of-type(2)"));
	// al.get(i).click();

	/*
	 * for (i = 0; i < al.size(); i++) { String[] text =
	 * al.get(i).getText().split("\n"); String edited = text[i].toString();
	 * System.out.println(edited); }
	 */
	// for (i = 0; i < al.size(); i++) {

	// List itemsList = Arrays.asList(text);
	/*
	 * ArrayList <String> arrlst = new ArrayList<String>(); arrlst.add(text);
	 */
	// System.out.println(edited);
	// System.out.println(arrlst);
	// System.out.println(al.size());

	// if (product == "Bakery, Cakes & Dairy") {
	// System.out.println("paagal");
	// WebElement cakes =
	// driver.findElement(By.xpath("//*[contains(@data-submenu-id,'bakery')][1]"));
	// act.moveToElement(al.get(i)).build().perform();

	public static void main(String[] args) throws InterruptedException {
		ArrayTest.ArrLst();

	}

}
