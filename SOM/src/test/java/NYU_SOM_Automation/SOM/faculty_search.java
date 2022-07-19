package NYU_SOM_Automation.SOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class faculty_search {
somelements som = new somelements();	

@BeforeClass
public void intilize()
{
	
	som.intilizedriver();
}

@Test(priority = 1,enabled = false)
public void loadfacultysearch()
{
	
	som.somloadfacultyurl();
	
	
}

@Test(priority = 2)
public void filterfacultysearch() throws InterruptedException
{
	
	som.somfiltercheck();
	
	
}

}
