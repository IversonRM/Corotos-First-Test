/*
  Para entender el codigo solo hay que 
  comparar los resultados mostrados en 
  la consola y los resultados que no sean
  acorde con Expected estos fallaron
*/
package Corotos;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TCRegisterM {

private WebDriver driver;
	
	By LoginLocator = By.id("cta-signin");
	By imgLocator = By.cssSelector("img[src='/static/tacoweb/corotos/login/edit.png']");
	By emailLocator = By.id("login-corotos-email");
	By EnterEmailLocator = By.id("login-corotos-email-submit");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.corotos.com.do/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void RegisterMTestC1() {
		driver.findElement(LoginLocator).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement image = fwait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(imgLocator);
			}
		});
		
		WebElement element = driver.findElement(emailLocator);
		element.click();
		element.clear();
		element.sendKeys("xocor30243@glenwoodave.com");
		
		if(driver.findElement(EnterEmailLocator).isEnabled()) {
			element = driver.findElement(EnterEmailLocator);
			element.click();
			System.out.println("This Case is valid");
		}else {
			System.out.println("This Case is invalid");
		}	
		System.out.println("Expected: valid");
	}
	
	@Test
	public void RegisterMTestC2() {
		driver.findElement(LoginLocator).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement image = fwait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(imgLocator);
			}
		});
		
		WebElement element = driver.findElement(emailLocator);
		element.click();
		element.clear();
		element.sendKeys("xocor30243@g.com");
		
		if(driver.findElement(EnterEmailLocator).isEnabled()) {
			element = driver.findElement(EnterEmailLocator);
			element.click();
			System.out.println("This Case is valid");
		}else {
			System.out.println("This Case is invalid");
		}	
		System.out.println("Expected: invalid");
	}
	
	@Test
	public void RegisterMTestC3() {
		driver.findElement(LoginLocator).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement image = fwait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(imgLocator);
			}
		});
		
		WebElement element = driver.findElement(emailLocator);
		element.click();
		element.clear();
		element.sendKeys("xocor30243@glenwoodave");
		
		if(driver.findElement(EnterEmailLocator).isEnabled()) {
			element = driver.findElement(EnterEmailLocator);
			element.click();
			System.out.println("This Case is valid");
		}else {
			System.out.println("This Case is invalid");
		}
		System.out.println("Expected: invalid");
	}
	
	@Test
	public void RegisterMTestC4() {
		driver.findElement(LoginLocator).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement image = fwait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(imgLocator);
			}
		});
		
		WebElement element = driver.findElement(emailLocator);
		element.click();
		element.clear();
		element.sendKeys("xocor30243glenwoodave.com");
		
		if(driver.findElement(EnterEmailLocator).isEnabled()) {
			element = driver.findElement(EnterEmailLocator);
			element.click();
			System.out.println("This Case is valid");
		}else {
			System.out.println("This Case is invalid");
		}	
		System.out.println("Expected: invalid");
	}

}
