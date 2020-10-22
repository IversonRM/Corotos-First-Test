package Corotos;

import static org.junit.Assert.assertEquals;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TCregisterMarketBuyPass {
	private WebDriver driver;
	
	By LoginLocator = By.id("cta-signin");
	By imgLocator = By.cssSelector("img[src='/static/tacoweb/corotos/login/edit.png']");
	By emailLocator = By.id("login-corotos-email");
	
	By firstPassLocator = By.id("login_signup_password");
	By secondPassLocator = By.id("login_signup_repeat_password");
	By emailProbLocator = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/form/p[1]/b");
	By successLocator = By.cssSelector("*[class='success']");
	By errorLocator = By.cssSelector("*[class='error']");
	
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
	public void RegisterPasswordC1() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("xocor1216");
		System.out.println("Expected valid");
		if(driver.findElement(successLocator).isDisplayed()) {
			System.out.println("Password is valid");
		}
	}
	
	@Test
	public void RegisterPasswordC2() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("xocor");
		System.out.println("Expected invalid");
		if(driver.findElement(errorLocator).isDisplayed()) {
			System.out.println("Password is invalid");
		}
	}
	
	@Test
	public void RegisterPasswordC3() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("12345678");
		System.out.println("Expected invalid");
		if(driver.findElement(errorLocator).isDisplayed()) {
			System.out.println("Password is invalid");
		}
	}
	
	@Test
	public void RegisterPasswordC4() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("x@cor1216");
		System.out.println("Expected invalid");
		if(driver.findElement(errorLocator).isDisplayed()) {
			System.out.println("Password is invalid");
		}
	}
	
	@Test
	public void RegisterPasswordC5() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("@%$#&/(*");
		System.out.println("Expected invalid");
		if(driver.findElement(errorLocator).isDisplayed()) {
			System.out.println("Password is invalid");
		}
	}
	
	@Test
	public void RegisterPasswordC6() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("@%$#&/(*123");
		System.out.println("Expected invalid");
		if(driver.findElement(errorLocator).isDisplayed()) {
			System.out.println("Password is invalid");
		}
	}
	
	@Test
	public void RegisterPasswordC7() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("XOCOR1216");
		System.out.println("Expected valid");
		if(driver.findElement(successLocator).isDisplayed()) {
			System.out.println("Password is valid");
		}
	}
	
	@Test
	public void RegisterPasswordC8() {
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
		element.submit();
		
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.presenceOfElementLocated(emailProbLocator));
		WebElement emailProb = driver.findElement(emailProbLocator);
		
		assertEquals("xocor30243@glenwoodave.com", emailProb.getText());
		
		WebElement password = driver.findElement(firstPassLocator);
		password.click();
		password.clear();
		password.sendKeys("1216xocor");
		System.out.println("Expected invalid");
		if(driver.findElement(errorLocator).isDisplayed()) {
			System.out.println("Password is invalid");
		}
	}

}
