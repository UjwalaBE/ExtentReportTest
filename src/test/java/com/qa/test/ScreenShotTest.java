package com.qa.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest {

	WebDriver driver;

	@BeforeMethod

	public void Setup() {

		System.setProperty("webdriver.chrome.driver","C:\\C\\admin\\eclipse\\eclipse-java-2021-06-R-win32-x86_64\\chromedriver(2).exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");

	}

	@Test()

	public void getScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver; // typecasting webdriver instance into TakeScreenShot interface
														// instance so we can use its methods

		File file = ts.getScreenshotAs(OutputType.FILE); // actually taking screenshot and saving it is in file format
															// type

		// copying taken screen shot in desired folder
		FileUtils.copyFile(file,
				new File("C:\\Users\\DELL\\eclipse-workspace\\java-Selenium\\HackerRankTest\\screenSHot\\image.png"));

		System.out.println(driver.getTitle());

	}

}
