package step_definition;

import java.net.MalformedURLException;
import java.util.Collections;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver webdriver;

	@Before
	public void openBrowser() throws MalformedURLException {

		System.out.println("Called openBrowser");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-popup-blocking");
		chromeOptions.addArguments("--profile-directory=Profile 3");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--disable-plugins-discovery");

		chromeOptions.addArguments("user_agent=DN");
		chromeOptions.addArguments("user-data-dir=C:\\Users\\user\\AppData\\Local\\Google\\Chrome\\User Data\\");

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\lib\\driver\\chromedriver.exe");
		webdriver = new ChromeDriver(chromeOptions);
		webdriver.manage().deleteAllCookies();
		webdriver.manage().window().maximize();
		webdriver.get("https://staging.cicle.app/signin");
	}

	@After
	public void closeBrowser(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException noSupportScreenshot) {
				System.err.println(noSupportScreenshot.getMessage());
			}
		}
		
//		// Create object of Property file
//				Properties props = new Properties();
//		 
//				// this will set host of server- you can change based on your requirement 
//				props.put("mail.smtp.host", "smtp.gmail.com");
//		 
//				// set the port of socket factory 
//				props.put("mail.smtp.socketFactory.port", "465");
//		 
//				// set socket factory
//				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//		 
//				// set the authentication to true
//				props.put("mail.smtp.auth", "true");
//		 
//				// set the port of SMTP server
//				props.put("mail.smtp.port", "465");
//		 
//				// This will handle the complete authentication
//				Session session = Session.getDefaultInstance(props,
//		 
//						new javax.mail.Authenticator() {
//		 
//							protected PasswordAuthentication getPasswordAuthentication() {
//		 
//							return new PasswordAuthentication("add your email", "add your password");
//		 
//							}
//		 
//						});
//		 
//				try {
//		 
//					// Create object of MimeMessage class
//					Message message = new MimeMessage(session);
//		 
//					// Set the from address
//					message.setFrom(new InternetAddress("nandariidengen@gmail.com"));
//		 
//					// Set the recipient address
//					message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("nandariidengen@gmail.com"));
//		            
//		                        // Add the subject link
//					message.setSubject("Testing Subject");
//		 
//					// Create object to add multimedia type content
//					BodyPart messageBodyPart1 = new MimeBodyPart();
//		 
//					// Set the body of email
//					messageBodyPart1.setText("This is message body");
//		 
//					// Create another object to add another content
//					MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//		 
//					// Mention the file which you want to send
//					String filename = "G:\\a.xlsx";
//		 
//					// Create data source and pass the filename
//					DataSource source = new FileDataSource(filename);
//		 
//					// set the handler
//					messageBodyPart2.setDataHandler(new DataHandler(source));
//		 
//					// set the file
//					messageBodyPart2.setFileName(filename);
//		 
//					// Create object of MimeMultipart class
//					Multipart multipart = new MimeMultipart();
//		 
//					// add body part 1
//					multipart.addBodyPart(messageBodyPart2);
//		 
//					// add body part 2
//					multipart.addBodyPart(messageBodyPart1);
//		 
//					// set the content
//					message.setContent(multipart);
//		 
//					// finally send the email
//					Transport.send(message);
//		 
//					System.out.println("=====Email Sent=====");
//		 
//				} catch (MessagingException e) {
//		 
//					throw new RuntimeException(e);
//		 
//				}
		 
		webdriver.quit();
	}
}
