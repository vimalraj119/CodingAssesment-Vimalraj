package assesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CodingAssesment {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.cartify.pk/");
		driver.findElement(By.xpath("//span[text()='Shop By Categories']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Cloth Rack')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'grid-view-item__link')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'cart-popup__cta-link btn')]")).click();
		String text = driver.findElement(By.xpath("//span[@class='cart-subtotal__price']")).getText();
		System.out.println(text);
		driver.close();

	}

}
