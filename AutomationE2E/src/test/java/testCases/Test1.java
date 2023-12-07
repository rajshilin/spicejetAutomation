package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test1 extends BaseTest {

	@Test
	public void verifyURL() {
		String expUrl = "https://www.spicejet.com/";
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		Assert.assertEquals(actUrl, expUrl, "URL Verification failed!");
		System.out.println("URL Verification Passed!    " + actUrl);
	}

	@Test
	public void verifyTitle() {
		String expTxt = "Welcome aboard";
		String actTxt = driver
				.findElement(By.xpath("//div[@class=\"css-76zvg2 r-qsz3a2 r-2t9rge r-adyw6z r-1kfrs79\"]")).getText();
		System.out.println(actTxt);
		Assert.assertEquals(actTxt, expTxt, "Text not Matching");
		System.out.println("Verification of Text is Passed!   " + actTxt);
	}
}
