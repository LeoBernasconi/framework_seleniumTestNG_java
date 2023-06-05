package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selintroduction {

	static ChromeDriver driver = new ChromeDriver();
	static int implicitWait = 10;

	public static void main(String[] args) {
		
		driver.get("file:///C:/Leo/second_index.html");

	    WebElement ele_dropdownCars = driver.findElement(By.id("dropdown-main"));
	    List<WebElement> values = ele_dropdownCars.findElements(By.tagName("option"));
	    System.out.println(values);
	    for (WebElement option : values) {
	        if (option.isSelected()) {
	            String selectedValue = option.getText();
	            System.out.println("Selected value: " + selectedValue);
	        }
	    }
	    
	    setInput("Leopa");
	    

	    
		
		
		//driver.get("file:///C:/Leo/second_index.html");
		//System.out.println(getHeader());
		//extractParagraph();
	}
	
  static public void setInput(String input) {
	    //Get all inputs into a list
	    List<WebElement> list_inputs = driver.findElements(By.xpath("//input[@class='container text-box']"));
	    //Write the string "input" into all inputs (as requested)
	    for (int i = 0;i < list_inputs.size(); i++){
	      list_inputs.get(i).sendKeys(input);
	    }
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static public String getHeader() {
		WebElement ele_container = driver.findElement(By.xpath("//div[@class='container']"));
		WebElement ele_header = ele_container.findElement(By.xpath("child::*[1]"));
		return ele_header.getText();
	}
	
	static public String clickTheButtonAndExtractLink() {
		WebElement ele_buttonClickMe = driver.findElement(By.xpath("//button[@onclick='generateLink()']"));
		ele_buttonClickMe.click();
		WebElement ele_newLink = driver.findElement(By.tagName("a"));
		return ele_newLink.getAttribute("href");
	}
	
	private static Object WebDriverWait(ChromeDriver driver2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	static public void createElement(String elementName) {
		String script = "var pElement = document.createElement('p');" +
                "pElement.textContent = '" + elementName + "';" +
                "document.body.appendChild(pElement);";
		((JavascriptExecutor) driver).executeScript(script);
	}
	
	static public void extractParagraph() {
		WebElement ele_container = driver.findElement(By.xpath("//div[@class='container']"));
		WebElement ele_div = ele_container.findElement(By.xpath("child::*[3]"));
		WebElement ele_paragraph = ele_div.findElement(By.xpath("child::*[1]"));
		String text_paragraph = ele_paragraph.getAttribute("textContent");
		createElement(text_paragraph.replace("'", ""));
	}


}
