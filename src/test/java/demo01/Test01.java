package demo01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test01 {

	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//li[@class='menu_Hotels']")).click();
	
	driver.findElement(By.xpath("//input[@id='city']")).click();
	
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")));
	String city="Dubai";
	
	driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/div/input")).sendKeys(city);

	//driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div/div/div/p/span/b[contains(text(),'Dubai')]")).click();
	
	driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/descendant::b")).click();
	
	String tst = driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div/div[contains(text(),'August')]")).getText();
	System.out.println(tst);
}
}