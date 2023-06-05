package introduction;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;




public class driverManager {
	
	
	static ChromeDriver driver = new ChromeDriver();

	public static String extractHeader() {
	    WebElement headerElement = getSiblingsOnContainer(0);
	    return headerElement.getText();
	  }
  
	public static WebElement getSiblingsOnContainer(int position){

	    WebElement headerElement = driver.findElement(By.xpath("//div[@class='container']"));
	    List<WebElement> siblingsElements = headerElement.findElements(By.xpath("following-sibling::*"));
	    return siblingsElements.get(position);
	  }

	  
	public static void main(String[] args) {
		driver.get("file:///C:/Leo/index.html");
		System.out.println(extractHeader());
		


		//System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.gmail.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("identifier")).sendKeys("leobernasconi@gmail.com");
		//driver.findElement(By.id("identifierNext")).click();
		//identifier (name)
		
		
		
		
	}

}
