/*
 Para que el test funcione de forma correcta
 se deben revisar dos campos, valla a la parte
 de abajo donde dice "Primer Campo" y siga las
 instrucciones 
*/
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
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TCSearch {
	private WebDriver driver;
	
	By searchLocator = By.cssSelector("*[class = 'delta-input delta-input__primary delta-input__medium delta-input__rounded']");
	By notResultsLocator = By.cssSelector("img[src = '/static/tacoweb/no-listings.png']");
	By ResultLocator = By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]");
	By zptLocator = By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[2]/div[1]/ol/span");
	
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
	public void testSearchC1() {
		WebElement element = driver.findElement(searchLocator);
		element.click();
		element.clear();
		element.sendKeys("Zapatos");
		element.submit();
		
		@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
		Wait<WebDriver> fwait = new FluentWait(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement search = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(zptLocator);
			}
		});
		
		WebElement textResults = driver.findElement(ResultLocator);
		String ResultsProb = textResults.getText();
		
		//Primer campo:  ir a la pagina original de corotos y buscar "Zapatos"
		//mirar la cantitad de articulos encontrados y contar los digitos
		//por ejemplo salen 7845 articulos la cantidad de dijitos es 4
		//el cual se debe poner en substring como segundo parametro
		//el primer parametro no se debe modificar
		
		String articleProb = ResultsProb.substring(0,3);
		
		//Segundo campo: en esta parte solo debe poner la cantidad de articulos
		//tomando en cuenta el ejemplo anteriar se encontraron 7845 articulos
		//entonces se debe introducir esta cantidad dentro de las " " de 
		//assertEquals
		
		assertEquals("940", articleProb);
		
		System.out.println("Expected valid Pass: Zapatos");
	}
	
	@Test
	public void testSearchC2() {
		WebElement element = driver.findElement(searchLocator);
		element.click();
		element.clear();
		element.sendKeys("Z4p4tos");
		element.submit();
		
		@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
		Wait<WebDriver> fwait = new FluentWait(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement search = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(notResultsLocator);
			}
		});
		
		System.out.println("Expected valid Pass: Z4p4tos");
	}
	
	@Test
	public void testSearchC3() {
		WebElement element = driver.findElement(searchLocator);
		element.click();
		element.clear();
		element.sendKeys("Zap@tos");
		element.submit();
		
		@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
		Wait<WebDriver> fwait = new FluentWait(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement search = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(notResultsLocator);
			}
		});
		
		System.out.println("Expected valid Pass: Zap@tos");
	}
	
	@Test
	public void testSearchC4() {
		WebElement element = driver.findElement(searchLocator);
		element.click();
		element.clear();
		element.sendKeys("ZaPatOs");
		element.submit();
		
		@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
		Wait<WebDriver> fwait = new FluentWait(driver)
				.withTimeout(5, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement search = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(zptLocator);
			}
		});
		
		WebElement textResults = driver.findElement(ResultLocator);
		String ResultsProb = textResults.getText();
		String articleProb = ResultsProb.substring(0,3);
		
		assertEquals("940", articleProb);
		
		System.out.println("Expected valid Pass: ZaPatOs");
	}
}
