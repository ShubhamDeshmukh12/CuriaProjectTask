package ShubhamDeshmukh.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class FlashScreenValidate {
	
	@Test
	public void start() throws MalformedURLException, InterruptedException
	{
		System.out.println("Hi");
		DesiredCapabilities desi=new DesiredCapabilities();
		desi.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		desi.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		desi.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desi.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desi.setCapability("appPackage", "com.innoplexus.patientapp");
		try {
			desi.setCapability("appActivity", "com.innoplexus.patientapp.MainActivity");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url,desi);
        
        Thread.sleep(4000);
        
        System.out.println("Done ALL");
        Thread.sleep(10000);
        WebElement logo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView"));
        boolean logoimage = logo.isDisplayed();
	    Assert.assertEquals(true, logoimage);
	
	}

}
