package deleteFromWishlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteFromWishlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabir\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
				driver.get("http://localhost/Book/wishlist.php?action=add&idd=1");
				
				driver.manage().window().maximize();
				
		      
		       driver.findElement(By.id("f")).click();
			
		    String at = driver.getTitle();
			String et = "Wishlist";
			
				
				if(at.equalsIgnoreCase(et))
				{
					System.out.println(" Test Successful");
					
				}
				
				else
				{
					System.out.println(" Failed");
					
				}

	}

}
