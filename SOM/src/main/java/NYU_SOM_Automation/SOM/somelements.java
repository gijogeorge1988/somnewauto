package NYU_SOM_Automation.SOM;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class somelements {

public static WebDriver driver;
public void intilizedriver() 

{
	System.setProperty("webdriver.firefox.driver","C:\\Users\\Qbuser\\eclipse-workspace\\SOM\\geckodriver.exe");
	driver= new FirefoxDriver();
	
}

public void somloadfacultyurl()
{
	driver.get("https://med.nyu.edu/faculty/");
	driver.findElement(By.id("edit-query")).sendKeys("Dafna");
	driver.findElement(By.cssSelector("[value='Search']")).click();
	String str=driver.findElement(By.xpath("//a[@class='search-result__title-link'][contains(text(),'Dafna')]")).getText();
	Assert.assertEquals("Dafna Bar-Sagi, PhD",str);
	
	
}

public void somfiltercheck() throws InterruptedException
{
	somloadfacultyurl();
	driver.findElement(By.xpath("//a[normalize-space()='Medicine (4)']")).click();
	Thread.sleep(2000);
	String searchtext=driver.findElement(By.xpath("//div[contains(@class,'search-bar__summary')]//span[contains(@class,'mobile-hidden')]")).getText();
	Assert.assertEquals("44 Results for Faculty Named “Dafna”", searchtext);
}

}
