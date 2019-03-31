package ankitaG;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Init;


public class SProgram1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Init.initChromeDriver();
		rowCount(driver);
		// dragAndDropScenario(driver);
	}

	public static void rowCount(WebDriver driver) throws InterruptedException {
		driver.get("http://automationbykrishna.com/index.html#");
		driver.findElement(By.xpath("//a[text()='Demo Tables']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		// gives a map with key value pairing of deparyment and number of
		// employees
		for (int i = 1; i <= list.size(); i++) {
			WebElement ele = driver
					.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[" + i + "]/td[5]"));
			if (hm.containsKey(ele.getText())) {
				hm.put(ele.getText(), hm.get(ele.getText()) + 1);
			} else {
				hm.put(ele.getText(), 1);
			}

		}
		System.out.println(hm);
		Set<String> s = hm.keySet();// gives set of all keys of hashmap
		int maxvalue = 0;
		String department = "";
		for (String str : s)// enhanced for loop iterating hashmap and printing
							// all keys with values
		{
			System.out.println(str + " :" + hm.get(str));
			int value = hm.get(str);
			if (value > maxvalue)// finding max employees in department
			{
				maxvalue = value;
				department = str;
			}

		}
		System.out.println(maxvalue + " for department" + department);

	}

}
