package com.witmerpersonalityalgorithm;

import static org.junit.Assert.assertArrayEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Nor_male_01 {

	//Male 10-20 - normset
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.edgedriver().setup();

		WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();

		//WebDriver driver = new EdgeDriver();

		driver.get("https://dev0.witmer.ai/#/login");

		driver.manage().window().maximize();

		// Clear cookies

		driver.manage().deleteAllCookies();

		driver.navigate().refresh();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("robinson@energetics.ai");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Witmer@123");

		driver.findElement(By.id("loginButton")).click();
		
		Duration timeout = Duration.ofSeconds(10);
        
        WebDriverWait wait = new WebDriverWait(driver, timeout);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Personality')]")));

		WebElement personalityelement = driver.findElement(By.xpath("//a[contains(text(),'Personality')]"));
        
        Actions actions = new Actions(driver);
        
        actions.moveToElement(personalityelement).perform();
        
        personalityelement.click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Start')]")));
        
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
        
        String formattedDateTime = now.format(formatter);
        
        System.out.println("Current date and time: " + formattedDateTime);

		/*List<WebElement> element = driver.findElements(By.xpath("(//button[contains(text(),'CONTINUE')])[2]"));

		if (!element.isEmpty()) {

			driver.findElement(By.xpath("(//button[contains(text(),'CONTINUE')])[2]")).click();

		}*/

		for (int i = 1; i<=120 ; i++) {

			WebElement option = driver.findElement(By.xpath("//label[contains(text(),'Very Inaccurate')]"));

			List<WebElement> submitButtons = driver.findElements(By.xpath("//button[contains(text(),'Submit')]"));

			if (!submitButtons.isEmpty()) {

				option.click();

			} else {

				option.click(); Thread.sleep(500);

			}

		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
        WebElement topicname01 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[1]"));
        
        String text01 = topicname01.getText();
        
        WebElement scorevalue01 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-score'])[1]"));
        
        String num01 = scorevalue01.getText();
        
        System.out.println(text01+": "+ num01);
        
        WebElement topicname02 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[2]"));
        
        String text02 = topicname02.getText();
        
        WebElement scorevalue02 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-score'])[2]"));
        
        String num02 = scorevalue02.getText();
        
        System.out.println(text02+": "+ num02);
        
        WebElement topicname03 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[3]"));
        
        String text03 = topicname03.getText();
        
        WebElement scorevalue03 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-score'])[3]"));
        
        String num03 = scorevalue03.getText();
        
        System.out.println(text03+": "+ num03);
        
        WebElement topicname04 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[4]"));
        
        String text04 = topicname04.getText();
        
        WebElement scorevalue04 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-score'])[4]"));
        
        String num04 = scorevalue04.getText();
        
        System.out.println(text04+": "+ num04);
        
        WebElement topicname05 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-title'])[5]"));
        
        String text05 = topicname05.getText();
        
        WebElement scorevalue05 = driver.findElement(By.xpath("(//p[@class='wit-result-progress-score'])[5]"));
        
        String num05 = scorevalue05.getText();
        
        System.out.println(text05+": "+ num05);
        
        Thread.sleep(12000);
        
        driver.findElement(By.xpath("//button[contains(text(),' ')]")).click();
        
        LocalDateTime gen = LocalDateTime.now();
        
        DateTimeFormatter formattergen = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
        
        String formattedDateTimegen = gen.format(formattergen);
        
        System.out.println("Current date and time: " + formattedDateTimegen);
        
        driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='profileDropdown']")));
        
        driver.findElement(By.xpath("//a[@id='profileDropdown']")).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'SETTINGS')]")));
		
		driver.findElement(By.xpath("//div[contains(text(),'SETTINGS')]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='firstName']")));
		
		WebElement firstnameelement= driver.findElement(By.xpath("//input[@id='firstName']"));
		
		String firstname = firstnameelement.getAttribute("value");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='lastName']")));
		
		WebElement lastnameelement = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		String lastname = lastnameelement.getAttribute("value");
		
		System.out.println("Username: "+firstname+" "+lastname);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@class='genderselect']")));
		
		WebElement genderelement = driver.findElement(By.xpath("//select[@class='genderselect']"));
		
		String gender = genderelement.getAttribute("defaults");
		
		System.out.println("User Gender: "+gender);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='DOB']")));
		
		WebElement dobElement = driver.findElement(By.xpath("//input[@id='DOB']"));
		
		String dobText = dobElement.getAttribute("value");
		
		LocalDate dob = LocalDate.parse(dobText);
		
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(dob, currentDate);
        
        int age = period.getYears();
        
        System.out.println("User Age: "+age+" years");
        
        System.out.println("=========================PDF TESTING===============================");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the URL of the PDF file:");
        
        String pdfUrl = scanner.nextLine();
        
        URL pdfurl = new URL(pdfUrl);
        
        InputStream ip = pdfurl.openStream();
		
		BufferedInputStream bf = new BufferedInputStream(ip);
		
		Thread.sleep(1000);
		
		PDDocument PDDoc = PDDocument.load(bf, "062005");
		
		//Page Count
		
		System.out.println("=========================TOTAL PDF PAGES===============================");
		
		int pagecount = PDDoc.getNumberOfPages();
		
		System.out.println("Pdf Total Page Count: " + pagecount);
		
		Assert.assertEquals(pagecount, 28);
		
		System.out.println("=========================TOTAL PDF PAGES===============================");
		
		System.out.println("=========================FULL PDF CONTENT===============================");
		
		//Full Page Content
		
		/*PDFTextStripper pdfstr = new PDFTextStripper();
				
		String fullpdf = pdfstr.getText(PDDoc);
				
		System.out.println(fullpdf);
		
		System.out.println("=========================FULL PDF CONTENT===============================");*/

		System.out.println("=========================PAGE CONTENT - 01===============================");
		
		PDFTextStripper pdfstr = new PDFTextStripper();
						
		pdfstr.setStartPage(1);
		
		pdfstr.setEndPage(1);
		
		String pagecontent01 = pdfstr.getText(PDDoc);
		
		if(pagecontent01.contains(firstname+" "+lastname)) {
			
			System.out.println("Username is Corrert");
			
		} else {
			
			System.out.println("Username is Incorrert");
		}
		
		boolean ageresult = pagecontent01.contains("Age: "+age+" years");
		
		if (ageresult) {
			
		    System.out.println("User Age is Correct");
		    
		} else {
			
		    System.out.println("User Age is Incorrect");
		}

		if(pagecontent01.contains(gender)) {
			
			System.out.println("User Gender is Corrert");
			
		} else {
			
			System.out.println("User Gender is Incorrert");
		}
						
		if(pagecontent01.contains(formattedDateTime)) {
			
			System.out.println("Screener Test Taken Date and Time is Corrert");
			
		} else {
			
			System.out.println("Screener Test Taken Date and Time is Incorrert");
		}
				
		if(pagecontent01.contains(formattedDateTimegen)) {
			
			System.out.println("Screener Report Generated Date and Time is Corrert");
			
		} else {
			
			System.out.println("Screener Report Generated Date and Time is Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 01===============================");
		
		System.out.println("=========================PAGE CONTENT - 04===============================");
		
		pdfstr.setStartPage(4);
		
		pdfstr.setEndPage(4);
		
		String pagecontent04 = pdfstr.getText(PDDoc);
		
		//Very Inaccurate                                o          c        e        a         n
		
		boolean DomainResult = pagecontent04.contains("14\r\n"+ "38\r\n"+ "2\r\n"+ "76\r\n"+ "16");
		
		//Neither Accurate nor Inaccurate
		
		//boolean DomainResult = pagecontent04.contains("12\r\n"+ "16\r\n"+ "31\r\n"+ "18\r\n"+ "62");
		
		//Moderately Inaccurate
		
		//boolean DomainResult = pagecontent04.contains("12\r\n"+ "21\r\n"+ "12\r\n"+ "42\r\n"+ "38");
		
		//Moderately Accurate
		
		//boolean DomainResult = pagecontent04.contains("12\r\n"+ "14\r\n"+ "62\r\n"+ "5\r\n"+ "82");
		
		//Very Accurate
		
		//boolean DomainResult = pagecontent04.contains("12\r\n"+ "12\r\n"+ "86\r\n"+ "1\r\n"+ "93");
		
		if (DomainResult) {
			
		    System.out.println("Domain Result are Correct");
		    
		} else {
			
		    System.out.println("Domain Result are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT - 04===============================");
		
		System.out.println("=========================PAGE CONTENT - 05===============================");
		
		pdfstr.setStartPage(5);
		
		pdfstr.setEndPage(5);
		
		String pagecontent05 = pdfstr.getText(PDDoc);
		
		//Very Inaccurate
		
		boolean OpennessResult = pagecontent05.contains("0\r\n"+ "27\r\n"+ "24\r\n"+ "84\r\n"+ "58\r\n"+ "50");
		
		//Neither Accurate nor Inaccurate
		
		//boolean OpennessResult = pagecontent05.contains("10\r\n" + "21\r\n" + "21\r\n" + "34\r\n" + "10\r\n" + "54");
		
		//Moderately Inaccurate
		
		//boolean OpennessResult = pagecontent05.contains("1\r\n" + "21\r\n" + "21\r\n" + "58\r\n" + "24\r\n" + "54");
		
		//Moderately Accurate
		
		//boolean OpennessResult = pagecontent05.contains("50\r\n" + "21\r\n" + "21\r\n" + "18\r\n" + "3\r\n" + "54");
		
		//Very Accurate
		
		//boolean OpennessResult = pagecontent05.contains("90\r\n" + "21\r\n" + "21\r\n" + "7\r\n" + "1\r\n" + "54");
		
		if (OpennessResult) {
			
		    System.out.println("Openness Topic Result are Correct");
		} else {
			
		    System.out.println("Openness Topic Result are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT - 05===============================");
		
		System.out.println("=========================PAGE CONTENT - 06===============================");
		
		pdfstr.setStartPage(6);
		
		pdfstr.setEndPage(6);
		
		String pagecontent06 = pdfstr.getText(PDDoc);
		
		//Very Inaccurate
		
		boolean ConscientiousnessResult = pagecontent06.contains("0\r\n"+ "88\r\n"+ "14\r\n"+ "31\r\n"+ "46\r\n"+ "97");
		
		//Neither Accurate nor Inaccurate
		
		//boolean ConscientiousnessResult = pagecontent06.contains("5\r\n" + "50\r\n" + "10\r\n" + "16\r\n" + "34\r\n" + "38");
		
		//Moderately Inaccurate
		
		//boolean ConscientiousnessResult = pagecontent06.contains("0.07\r\n" + "69\r\n" + "10\r\n" + "16\r\n" + "34\r\n" + "76");
		
		//Moderately Accurate
		
		//boolean ConscientiousnessResult = pagecontent06.contains("54\r\n" + "31\r\n" + "10\r\n" + "16\r\n" + "34\r\n" + "10");
		
		//Very Accurate
		
		//boolean ConscientiousnessResult = pagecontent06.contains("96\r\n" + "18\r\n" + "10\r\n" + "16\r\n" + "34\r\n" + "1");
		
		if (ConscientiousnessResult) {
			
		    System.out.println("Conscientiousness Topic Result are Correct");
		} else {
			
		    System.out.println("Conscientiousness Topic Result are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT - 06===============================");
		
		System.out.println("=========================PAGE CONTENT - 07===============================");
		
		pdfstr.setStartPage(7);
		
		pdfstr.setEndPage(7);
		
		String pagecontent07 = pdfstr.getText(PDDoc);
		
		//Very Inaccurate
		
		boolean ExtraversionResult = pagecontent07.contains("31\r\n"+ "46\r\n"+ "5\r\n"+ "12\r\n"+ "0.1\r\n"+ "0.26");
		
		//Neither Accurate nor Inaccurate
		
		//boolean ExtraversionResult = pagecontent07.contains("31\r\n" + "46\r\n" + "27\r\n" + "54\r\n" + "21\r\n" + "27");
		
		//Moderately Inaccurate
		
		//boolean ExtraversionResult = pagecontent07.contains("31\r\n" + "46\r\n" + "14\r\n" + "31\r\n" + "3\r\n" + "4");
		
		//Moderately Accurate
		
		//boolean ExtraversionResult = pagecontent07.contains("31\r\n" + "46\r\n" + "50\r\n" + "79\r\n" + "66\r\n" + "69");
		
		//Very Accurate
		
		//boolean ExtraversionResult = pagecontent07.contains("31\r\n" + "46\r\n" + "69\r\n" + "92\r\n" + "95\r\n" + "93");
		
		if (ExtraversionResult) {
			
		    System.out.println("Extraversion Topic Result are Correct");
		} else {
			
		    System.out.println("Extraversion Topic Result are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT - 07===============================");
		
		System.out.println("=========================PAGE CONTENT - 08===============================");
		
		pdfstr.setStartPage(8);
		
		pdfstr.setEndPage(8);
		
		String pagecontent08 = pdfstr.getText(PDDoc);
		
		//Very Inaccurate
		
		boolean AgreeablenessResult = pagecontent08.contains("8\r\n"+ "93\r\n"+ "14\r\n"+ "96\r\n"+ "98\r\n"+ "27");
		
		//Neither Accurate nor Inaccurate
		
		//boolean AgreeablenessResult = pagecontent08.contains("42\r\n" + "12\r\n" + "14\r\n" + "24\r\n" + "58\r\n" + "31");
		
		//Moderately Inaccurate
		
		//boolean AgreeablenessResult = pagecontent08.contains("24\r\n" + "50\r\n" + "14\r\n" + "66\r\n" + "90\r\n" + "31");
		
		//Moderately Accurate
		
		//boolean AgreeablenessResult = pagecontent08.contains("62\r\n" + "1\r\n" + "14\r\n" + "4\r\n" + "18\r\n" + "31");
		
		//Very Accurate
		
		//boolean AgreeablenessResult = pagecontent08.contains("82\r\n" + "0.01\r\n" + "14\r\n" + "0.26\r\n" + "2\r\n" + "31");
		
		if (AgreeablenessResult) {
			
		    System.out.println("Agreeableness Topic Result are Correct");
		} else {
			
		    System.out.println("Agreeableness Topic Result are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT - 08===============================");
		
		System.out.println("=========================PAGE CONTENT - 09===============================");
		
		pdfstr.setStartPage(9);
		
		pdfstr.setEndPage(9);
		
		String pagecontent09 = pdfstr.getText(PDDoc);
		
		//Very Inaccurate
		
		boolean NeuroticismResult = pagecontent09.contains("2\r\n"+ "18\r\n"+ "27\r\n"+ "14\r\n"+ "90\r\n"+ "31");
		
		//Neither Accurate nor Inaccurate
		
		//boolean NeuroticismResult = pagecontent09.contains("54\r\n" + "50\r\n" + "66\r\n" + "46\r\n" + "54\r\n" + "76");
		
		//Moderately Inaccurate
		
		//boolean NeuroticismResult = pagecontent09.contains("16\r\n" + "34\r\n" + "46\r\n" + "27\r\n" + "76\r\n" + "54");
		
		//Moderately Accurate
		
		//boolean NeuroticismResult = pagecontent09.contains("88\r\n" + "69\r\n" + "79\r\n" + "66\r\n" + "31\r\n" + "90");
		
		//Very Accurate
		
		//boolean NeuroticismResult = pagecontent09.contains("99\r\n" + "82\r\n" + "90\r\n" + "84\r\n" + "14\r\n" + "97");
		
		if (NeuroticismResult) {
			
		    System.out.println("Neuroticism Topic Result are Correct");
		} else {
			
		    System.out.println("Neuroticism Topic Result are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT - 09===============================");
		

	}
}
