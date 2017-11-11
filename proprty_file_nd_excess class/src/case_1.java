import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import based.d;



public class case_1 extends d
{
	@Test
	public void a()
	{
		ResourceBundle s= ResourceBundle.getBundle("Element");
		//String a=s.getString("login_username");	//	
		
		f.findElement(By.id("email")).sendKeys("chetan12321");
		/*f.findElementById(s.getString("login_username")).sendKeys("hello123");*/
		//f.findElementById("pass").sendKeys("hghjhhhjj");//
		Actions act=new Actions(f);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("21312323323").perform();
		//act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.RETURN).perform()
		//act.sendKeys(Keys.CONTROL).sendKeys(Keys.ALT).sendKeys(Keys.DELETE).build().perform();//
		
	}
}
