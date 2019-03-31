package ankitaG;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Init;


public class SProgram2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Init.initChromeDriver();
		rowCount(driver);
		// dragAndDropScenario(driver);
	}

	public static void rowCount(WebDriver driver) throws InterruptedException
	{
		driver.get("http://automationbykrishna.com/index.html#");
		driver.findElement(By.xpath("//a[text()='Demo Tables']")).click();
		Thread.sleep(2000);

		HashMap <String, Integer> hm= new HashMap<String, Integer>();
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		for(int i=1; i<=list.size();i++)
		{
			WebElement ele=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+i+"]/td[4]"));
			if(hm.containsKey(ele.getText()))
			{
				hm.put(ele.getText(),hm.get(ele.getText())+1);
			}
			else
			{
				hm.put(ele.getText(), 1);
			}
			
	
		}
		System.out.println(hm);
		
		Set<String> s=hm.keySet();
		int maxemp=0;
		String Manager="";
		for(String str:s)
		{
			System.out.println(str + " :"+hm.get(str));
			int value=hm.get(str);
			if(value>maxemp)
			{
				maxemp=value;
				Manager=str;
			}
			
			
		}
		System.out.println(maxemp+" for manager"+ Manager );

	}

}
