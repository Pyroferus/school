package school_info;

import java.sql.Driver;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webelement 
{
	WebDriver driver;
	@Test(priority=1)
	public void staff_detail() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gurukultech.com/web/");
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[9]/li/a")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath(".//*[@id='staff_login']")).click();
	
		    
		    driver.findElement(By.name("email")).sendKeys("Javasolomon@gmail.com");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		int input;    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter any values :");
		    input=scan.nextInt();
		    
		    driver.findElement(By.xpath(".//*[@id='login_button']")).click();
		    
		  List<WebElement>  staff_left_menu=driver.findElements(By.className("paddingClass"));
			int st_size=staff_left_menu.size();
			System.out.println(st_size);
			
			
			for(int i=0; i<st_size; i++)
			{
				Boolean status=staff_left_menu.get(i).isEnabled();
				try
				{
				Assert.assertTrue(status);
			    String Data=staff_left_menu.get(i).getText();
			   System.out.println(Data+" Element is enabled ");			   
			     }
				catch(Throwable t)
				{
					
				}
				
			}
		    }
	
	@Test(priority=2)
	
	public void per_inf()
	
	{
		 int i=1;
		    
		    
			try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='staffProfile']/div/div/div["+i+"]/div/label"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int row=i-1;
		    System.out.println("Number of rows present in table : "+row);
		    
		    
		   for(int rr=1; rr<=row; rr++)
			   
		   {
			
							   
	  System.out.println(driver.findElement(By.xpath(".//*[@id='staffProfile']/div/div/div["+rr+"]/div/label")).getText());
		
			   }
			   System.out.println();
			   
		 }
	
	
	@Test(priority=3,description="School info")
	
	public void sch_in()
	{
		driver.findElement(By.xpath(".//*[@id='schoolProfile']")).click();
		
		 List<WebElement>  school_left_menu=driver.findElements(By.className("paddingClass"));
			int st_size=school_left_menu.size();
			System.out.println(st_size);
			
			
			for(int i=0; i<st_size; i++)
			{
				Boolean status=school_left_menu.get(i).isDisplayed();
				try
				{
				Assert.assertTrue(status);
			    String Data=school_left_menu.get(i).getText();
			   System.out.println(Data+" Element is displayed ");			   
			     }
				catch(Throwable t)
				{
					
				}
				
			}
          
          	}
	@Test(priority=4,description="To read School info")
	public void School_info()
	{
		 int i=1;
		    
		    
			try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='dispSchoolInfo']/div[1]/div/div["+i+"]/label"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int row=i-1;
		    System.out.println("Number of rows present in table : "+row);
		    
		    
		   for(int rr=1; rr<=row; rr++)
			   
		   {
			
							   
	  System.out.println(driver.findElement(By.xpath(".//*[@id='dispSchoolInfo']/div[1]/div/div["+rr+"]/label")).getText());
		
			   }
			   System.out.println();
			   
		 }
	
	
	@Test(priority=5,description="To read contacts")
	
	public void Sc_con()
	{
		
		driver.findElement(By.xpath(".//*[@id='dispContactInfo_1']/a")).click();
		
		
		int i=1;
		    
		    
			try
		    {
		    while(true)
		    {
		    driver.findElement(By.xpath(".//*[@id='dispContactInfo']/div/div/div["+i+"]/label"));
		    i++;
		    }
		    }
		     catch(Throwable e)
		    {
		    	
		    }
		    
		    int row=i-1;
		    System.out.println("Number of rows present in table : "+row);
		    
		    
		   for(int rr=1; rr<=row; rr++)
			   
		   {
			
							   
	  System.out.println(driver.findElement(By.xpath(".//*[@id='dispContactInfo']/div/div/div["+rr+"]/label")).getText());
		
			   }
			   System.out.println();
			   
		
		
	}
	
	@Test(priority=6,description="classes")
	
	public void Sc_cls() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath(".//*[@id='dispClassses_2']/a")).click();
		
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='academicYearListId']")));
		 List<WebElement> dropdown=sel.getOptions();
		int list_size=dropdown.size(),i=0;
		  
		System.out.println(list_size);
		
		while(i<list_size)
		{
		  System.out.println(dropdown.get(i).getText());
			sel.selectByIndex(i);
			Thread.sleep(3000);
			i++;
		}
		
	}

		
	
		
	}

