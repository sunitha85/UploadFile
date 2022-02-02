package SelinieumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sunitha/Downloads/chromedriver" );
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/");
        driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")).click();
        driver.findElement(By.id("Username")).sendKeys("sunitha123");
        driver.findElement(By.id("Password")).sendKeys("Suni123");
        driver.findElement(By.name("login")).click();

	}

}
