package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import excelUtility.OpencartPage;

public class RegisterLogin_Page {

	static WebDriver driver;
	//Registering
	By account=By.xpath("//a[@class='dropdown-toggle']");
	By register=By.linkText("Register");
	By FirstName=By.id("input-firstname");
	By LastName=By.id("input-lastname");
	By email=By.id("input-email");
	By telephone=By.id("input-telephone");
	By pwd=By.id("input-password");
	By cpwd=By.id("input-confirm");
	By terms=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By cont=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

	//Log in
	By login=By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a");
	By emailid=By.xpath("//*[@id='input-email']");
	By password=By.xpath("//*[@id='input-password']");
	By button=By.xpath("//*[@id='content']/div/div[2]/div/form/input");

	// Url to launch the chrome
	public void Url() {                      
		System.setProperty("webdriver.chrome.driver","C:\\844888\\Opencart\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	//To get the url of the website
	public void HomePage() 
	{
		driver.get("http://opencart.abstracta.us/");
		System.out.println(driver.getTitle());
	}


	//Register page and Entering credentials
	public void Registeruser() throws InterruptedException {
		driver.findElement(account).click();
		WebElement e1 =driver.findElement(account); 
		WebElement e2=driver.findElement(register);
		Actions act = new Actions(driver);
		act.moveToElement(e1);
		act.moveToElement(e2).click().perform();
		driver.findElement(FirstName).sendKeys("Maneesh"); // passing the vaild mail
		driver.findElement(LastName).sendKeys("Erat");
		driver.findElement(email).sendKeys("maneesherat@gmail.com");
		driver.findElement(telephone).sendKeys("9876543210");
		driver.findElement(pwd).sendKeys("maneesh123");
		driver.findElement(cpwd).sendKeys("maneesh123");
		driver.findElement(terms).click();
	}
	// clicking to register
	public void Submit() throws InterruptedException
	{
		driver.findElement(cont).click();
		driver.close();
	}

	//Login page and Entering credentials
	public void LoginValid(int r) throws IOException, InterruptedException 
	{

		driver.findElement(account).click(); // move to to element
		Thread.sleep(3000);
		WebElement we1 =driver.findElement(account); 
		WebElement we2=driver.findElement(login);
		Actions act = new Actions(driver);
		act.moveToElement(we1);
		act.moveToElement(we2).click().perform();
		OpencartPage op= new OpencartPage();
		driver.findElement(email).sendKeys(op.Excel_Email(r));
		driver.findElement(password).sendKeys(op.Excel_Password(r));
		//clicking on log in button
		driver.findElement(button).click(); 
		Thread.sleep(3000);
		// close the  tab
		driver.close();
	}

	public void check() throws InterruptedException
	{

		String store=driver.findElement(By.linkText("Your Store")).getText();
		Assert.assertEquals("Your Store", store);
		Thread.sleep(1000);
		driver.close();
	}
	public void InvalidLogin()
	{
		driver.findElement(account).click();
		WebElement acnt =driver.findElement(account); 
		WebElement lg=driver.findElement(login);
		Actions act = new Actions(driver);
		act.moveToElement(acnt);
		act.moveToElement(lg).click().perform();
		driver.findElement(emailid).sendKeys("manhse123");
		driver.findElement(password).sendKeys("maneesh123");
	}
	
	public void clickLogin() throws InterruptedException
	{
		driver.findElement(button).click();
		driver.close();
	}
	
	public void MandatoryFields() throws IOException
	{
		driver.findElement(account).click();
		WebElement we1 =driver.findElement(account); // move to to element achiving by creating object
		WebElement we2=driver.findElement(register);
		Actions act= new Actions(driver);
		act.moveToElement(we1);
		act.moveToElement(we2).click().perform();
		driver.findElement(FirstName).sendKeys("Maneesh"); // passing the vaild mail
		driver.findElement(LastName).sendKeys("Erat");
		driver.findElement(email).sendKeys("maneesherat@gmail.com");
		//driver.findElement(telephone).sendKeys("9876543210");
		driver.findElement(pwd).sendKeys("maneesh123");
		driver.findElement(cpwd).sendKeys("maneesh123");
		driver.findElement(terms).click();
	}
	
	
	public void submit() throws InterruptedException
	{
		driver.findElement(cont).click();// logging button
		driver.close();
	}
	public void login()
	{
		driver.findElement(account).click();
		WebElement acnt =driver.findElement(account); 
		WebElement lg=driver.findElement(login);
		Actions act = new Actions(driver);
		act.moveToElement(acnt);
		act.moveToElement(lg).click().perform();
		driver.findElement(login).click();
	}
	//Take screenshot
	public void Screenshot() throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source,new File("C:\\844888\\Opencart\\src\\test\\resources\\Screenshot\\first.png"));
	}

}