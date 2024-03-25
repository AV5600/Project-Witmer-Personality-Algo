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
import java.util.concurrent.TimeUnit;

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


public class Openness_Workstyle_high {
	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
		
		//WebDriverManager.edgedriver().setup();

		WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();

		//WebDriver driver = new EdgeDriver();

		driver.get("https://staging.mindn.ai/#/login");

		driver.manage().window().maximize();

		// Clear cookies

		driver.manage().deleteAllCookies();

		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arunachalam@energetics.ai");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mail@123");

		driver.findElement(By.id("loginButton")).click();

		Duration timeout = Duration.ofSeconds(40);
        
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Personality')]")));
        
        WebElement personalityelement = driver.findElement(By.xpath("//a[contains(text(),'Personality')]"));
        
        Actions actions = new Actions(driver);
        
        actions.moveToElement(personalityelement).perform();
        
        personalityelement.click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Start')]")));
        
        driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		/*List<WebElement> element = driver.findElements(By.xpath("(//button[contains(text(),'CONTINUE')])[2]"));

		if (!element.isEmpty()) {

			driver.findElement(By.xpath("(//button[contains(text(),'CONTINUE')])[2]")).click();

		}*/

		for (int i = 1; i<=120 ; i++) {

			 String question01 = Personality_Question_Option.question01; String question02 = Personality_Question_Option.question02; 
			 String question03 = Personality_Question_Option.question03; String question04 = Personality_Question_Option.question04; 
			 String question05 = Personality_Question_Option.question05; String question06 = Personality_Question_Option.question06; 
			 String question07 = Personality_Question_Option.question07; String question08 = Personality_Question_Option.question08; 
			 String question09 = Personality_Question_Option.question09; String question10 = Personality_Question_Option.question10; 
			 String question11 = Personality_Question_Option.question11; String question12 = Personality_Question_Option.question12; 
			 String question13 = Personality_Question_Option.question13; String question14 = Personality_Question_Option.question14; 
			 String question15 = Personality_Question_Option.question15; String question16 = Personality_Question_Option.question16; 
			 String question17 = Personality_Question_Option.question17; String question18 = Personality_Question_Option.question18; 
			 String question19 = Personality_Question_Option.question19; String question20 = Personality_Question_Option.question20; 
			 String question21 = Personality_Question_Option.question21; String question22 = Personality_Question_Option.question22; 
			 String question23 = Personality_Question_Option.question23; String question24 = Personality_Question_Option.question24; 
			 String question25 = Personality_Question_Option.question25; String question26 = Personality_Question_Option.question26; 
			 String question27 = Personality_Question_Option.question27; String question28 = Personality_Question_Option.question28; 
			 String question29 = Personality_Question_Option.question29; String question30 = Personality_Question_Option.question30; 
			 String question31 = Personality_Question_Option.question31; String question32 = Personality_Question_Option.question32; 
			 String question33 = Personality_Question_Option.question33; String question34 = Personality_Question_Option.question34; 
			 String question35 = Personality_Question_Option.question35; String question36 = Personality_Question_Option.question36; 
			 String question37 = Personality_Question_Option.question37; String question38 = Personality_Question_Option.question38; 
			 String question39 = Personality_Question_Option.question39; String question40 = Personality_Question_Option.question40; 
			 String question41 = Personality_Question_Option.question41; String question42 = Personality_Question_Option.question42; 
			 String question43 = Personality_Question_Option.question43; String question44 = Personality_Question_Option.question44; 
			 String question45 = Personality_Question_Option.question45; String question46 = Personality_Question_Option.question46; 
			 String question47 = Personality_Question_Option.question47; String question48 = Personality_Question_Option.question48; 
			 String question49 = Personality_Question_Option.question49; String question50 = Personality_Question_Option.question50; 
			 String question51 = Personality_Question_Option.question51; String question52 = Personality_Question_Option.question52; 
			 String question53 = Personality_Question_Option.question53; String question54 = Personality_Question_Option.question54; 
			 String question55 = Personality_Question_Option.question55; String question56 = Personality_Question_Option.question56; 
			 String question57 = Personality_Question_Option.question57; String question58 = Personality_Question_Option.question58; 
			 String question59 = Personality_Question_Option.question59; String question60 = Personality_Question_Option.question60; 
			 String question61 = Personality_Question_Option.question61; String question62 = Personality_Question_Option.question62; 
			 String question63 = Personality_Question_Option.question63; String question64 = Personality_Question_Option.question64; 
			 String question65 = Personality_Question_Option.question65; String question66 = Personality_Question_Option.question66; 
			 String question67 = Personality_Question_Option.question67; String question68 = Personality_Question_Option.question68; 
			 String question69 = Personality_Question_Option.question69; String question70 = Personality_Question_Option.question70; 
			 String question71 = Personality_Question_Option.question71; String question72 = Personality_Question_Option.question72; 
			 String question73 = Personality_Question_Option.question73; String question74 = Personality_Question_Option.question74; 
			 String question75 = Personality_Question_Option.question75; String question76 = Personality_Question_Option.question76; 
			 String question77 = Personality_Question_Option.question77; String question78 = Personality_Question_Option.question78; 
			 String question79 = Personality_Question_Option.question79; String question80 = Personality_Question_Option.question80; 
			 String question81 = Personality_Question_Option.question81; String question82 = Personality_Question_Option.question82; 
			 String question83 = Personality_Question_Option.question83; String question84 = Personality_Question_Option.question84; 
			 String question85 = Personality_Question_Option.question85; String question86 = Personality_Question_Option.question86; 
			 String question87 = Personality_Question_Option.question87; String question88 = Personality_Question_Option.question88; 
			 String question89 = Personality_Question_Option.question89; String question90 = Personality_Question_Option.question90; 
			 String question91 = Personality_Question_Option.question91; String question92 = Personality_Question_Option.question92; 
			 String question93 = Personality_Question_Option.question93; String question94 = Personality_Question_Option.question94; 
			 String question95 = Personality_Question_Option.question95; String question96 = Personality_Question_Option.question96; 
			 String question97 = Personality_Question_Option.question97; String question98 = Personality_Question_Option.question98; 
			 String question99 = Personality_Question_Option.question99; String question100 = Personality_Question_Option.question100; 
			 String question101 = Personality_Question_Option.question101; String question102 = Personality_Question_Option.question102; 
			 String question103 = Personality_Question_Option.question103; String question104 = Personality_Question_Option.question104; 
			 String question105 = Personality_Question_Option.question105; String question106 = Personality_Question_Option.question106; 
			 String question107 = Personality_Question_Option.question107; String question108 = Personality_Question_Option.question108; 
			 String question109 = Personality_Question_Option.question109; String question110 = Personality_Question_Option.question110; 
			 String question111 = Personality_Question_Option.question111; String question112 = Personality_Question_Option.question112; 
			 String question113 = Personality_Question_Option.question113; String question114 = Personality_Question_Option.question114; 
			 String question115 = Personality_Question_Option.question115; String question116 = Personality_Question_Option.question116; 
			 String question117 = Personality_Question_Option.question117; String question118 = Personality_Question_Option.question118; 
			 String question119 = Personality_Question_Option.question119; String question120 = Personality_Question_Option.question120;
			 
			 WebElement option1 = Personality_Question_Option.option1(driver); WebElement option3 = Personality_Question_Option.option3(driver); 
			 WebElement option5 = Personality_Question_Option.option5(driver);
			 
			 WebElement questionclass = driver.findElement(By.xpath("//span[@class='ass-intro-title ass-questions']"));

			 String questionText = questionclass.getText();
			 
			 if (questionText.contains(question03) || questionText.contains(question08) || 
				 questionText.contains(question13) || questionText.contains(question18) ||
				 questionText.contains(question23) || questionText.contains(question28) ||
				 questionText.contains(question33) || questionText.contains(question38) ||
				 questionText.contains(question43) || questionText.contains(question58) ||
				 questionText.contains(question63) || questionText.contains(question93)) {

						option5.click(); Thread.sleep(500);

			 } else if (questionText.contains(question48) || questionText.contains(question53) ||
					    questionText.contains(question68) || questionText.contains(question73) || 
					    questionText.contains(question78) || questionText.contains(question83) || 
					    questionText.contains(question88) || questionText.contains(question98) ||
						questionText.contains(question103) || questionText.contains(question108) ||
						questionText.contains(question113) || questionText.contains(question115) ||
						questionText.contains(question118)) {
				 
				        option1.click(); Thread.sleep(500);
				 
			 } else if (questionText.contains(question01) || questionText.contains(question02) ||
					    questionText.contains(question04) || questionText.contains(question05) ||
					    questionText.contains(question06) || questionText.contains(question07) ||
					    questionText.contains(question09) || questionText.contains(question10) ||
					    questionText.contains(question11) || questionText.contains(question12) ||
					    questionText.contains(question14) || questionText.contains(question15) ||
					    questionText.contains(question16) || questionText.contains(question17) ||
					    questionText.contains(question19) || questionText.contains(question20) ||
					    questionText.contains(question21) || questionText.contains(question22) ||
					    questionText.contains(question24) || questionText.contains(question25) ||
					    questionText.contains(question26) || questionText.contains(question27) ||
					    questionText.contains(question29) || questionText.contains(question30) ||
					    questionText.contains(question31) || questionText.contains(question32) ||
					    questionText.contains(question34) || questionText.contains(question35) ||
					    questionText.contains(question36) || questionText.contains(question37) ||
					    questionText.contains(question39) || questionText.contains(question40) ||
					    questionText.contains(question41) || questionText.contains(question42) ||
					    questionText.contains(question44) || questionText.contains(question45) ||
					    questionText.contains(question46) || questionText.contains(question47) ||
					    questionText.contains(question49) || questionText.contains(question50) ||
					    questionText.contains(question51) || questionText.contains(question52) ||
					    questionText.contains(question54) || questionText.contains(question55) ||
					    questionText.contains(question56) || questionText.contains(question57) ||
					    questionText.contains(question59) || questionText.contains(question60) ||
					    questionText.contains(question61) || questionText.contains(question62) ||
					    questionText.contains(question64) || questionText.contains(question65) ||
					    questionText.contains(question66) || questionText.contains(question67) ||
					    questionText.contains(question69) || questionText.contains(question70) ||
					    questionText.contains(question71) || questionText.contains(question72) ||
					    questionText.contains(question74) || questionText.contains(question75) ||
					    questionText.contains(question76) || questionText.contains(question77) ||
					    questionText.contains(question79) || questionText.contains(question80) ||
					    questionText.contains(question81) || questionText.contains(question82) ||
					    questionText.contains(question84) || questionText.contains(question85) ||
					    questionText.contains(question86) || questionText.contains(question87) ||
					    questionText.contains(question89) || questionText.contains(question90) ||
					    questionText.contains(question91) || questionText.contains(question92) ||
					    questionText.contains(question94) || questionText.contains(question95) ||
					    questionText.contains(question96) || questionText.contains(question97) ||
					    questionText.contains(question99) || questionText.contains(question100) ||
					    questionText.contains(question101) || questionText.contains(question102) ||
					    questionText.contains(question104) || questionText.contains(question105) ||
					    questionText.contains(question106) || questionText.contains(question107) ||
					    questionText.contains(question109) || questionText.contains(question110) ||
					    questionText.contains(question111) || questionText.contains(question112) ||
					    questionText.contains(question114) || questionText.contains(question115) ||
					    questionText.contains(question116) || questionText.contains(question117) ||
					    questionText.contains(question119) || questionText.contains(question120)) {
				 
				        option3.click(); Thread.sleep(500);
				 
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
        
        Thread.sleep(11000);
        
        driver.findElement(By.xpath("//button[contains(text(),' ')]")).click();
        
        driver.findElement(By.xpath("//button[contains(text(),'Back')]")).click();
        
        System.out.println("=========================PDF TESTING===============================");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the URL of the PDF file:");
        
        String pdfUrl = scanner.nextLine();
        
        URL pdfurl = new URL(pdfUrl);
        
        InputStream ip = pdfurl.openStream();
		
		BufferedInputStream bf = new BufferedInputStream(ip);
		
		Thread.sleep(1000);
		
		PDDocument PDDoc = PDDocument.load(bf, "062000");
		
		PDFTextStripper pdfstr = new PDFTextStripper();
		
		//Page Count
		
		System.out.println("=========================TOTAL PDF PAGES===============================");
		
		int pagecount = PDDoc.getNumberOfPages();
		
		System.out.println("Pdf Total Page Count: " + pagecount);
		
		Assert.assertEquals(pagecount, 28);
		
		System.out.println("=========================TOTAL PDF PAGES===============================");
		
		/*System.out.println("=========================FULL PDF CONTENT===============================");
		
		//Full Page Content
		
		String fullpdf = pdfstr.getText(PDDoc);
				
		System.out.println(fullpdf);
		
		System.out.println("=========================FULL PDF CONTENT===============================");*/
		
		System.out.println("=========================PAGE CONTENT-10===============================");
		
		pdfstr.setStartPage(10);
		
		pdfstr.setEndPage(10);
		
		String pagecontent10 = pdfstr.getText(PDDoc);
		
		String trait = "Openness\r\n"
				+ "YOUR SCORE: 99.53\r\n"
				+ "Very High Openness";
		
		if (pagecontent10.contains(trait)) {
			
			System.out.println("'Trait Score and Domain name' are Correct");
			
		} else {
			
			System.out.println("'Trait Score and Domain name' are InCorrect");
		}
		
		String your_workstyle = "Highly creative and innovative\r\n"
				+ "Highly adaptable\r\n"
				+ "Interest in diverse perspectives\r\n"
				+ "High preference for independence\r\n"
				+ "Comfortable with ambiguity\r\n"
				+ "High enthusiasm for challenges";
		
		if (pagecontent10.contains(your_workstyle)) {
			
			System.out.println("'Workstyle' contents are Correct");
			
		} else {
			
			System.out.println("'Workstyle' contents are Incorrect");
		}
		
		String what_could_stress_you = "Routine and predictability\r\n"
				+ "Rigid work environments\r\n"
				+ "Poor receptivity for creative ideas\r\n"
				+ "A lack of intellectual stimulation\r\n"
				+ "Expectations to conform to norms";
		
		if (pagecontent10.contains(what_could_stress_you)) {
			
			System.out.println("'What could stress you' contents are Correct");
			
		} else {
			
			System.out.println("'What could stress you' contents are Incorrect");
		}
		
		String for_higher_productivity = "Very high openness may sometimes lead to perfectionism, indecisiveness and a lack of focus.\r\n"
				+ "Visit the Perfectionism and Attention pages on the mind-n to work on these areas.";
		
		if (pagecontent10.contains(for_higher_productivity)) {
			
			System.out.println("'For Higher Productivity' contents are Correct");
			
		} else {
			
			System.out.println("'For Higher Productivity' contents are Incorrect");
		}
		
		System.out.println("=========================PAGE CONTENT-10===============================");

		
		
	}
}
