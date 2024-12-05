package qapitol_workshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CricbuzzrankTest extends Baseclass {
	
	@Test
	public void rankTest() {
	
	 
	  List<WebElement> teams = driver.findElements(By.xpath("//table//tr//td[@class='cb-srs-pnts-name']"));
	  List<WebElement> points = driver.findElements(By.xpath("//table//tr//td[@class='cb-srs-pnts-td text-bold']"));
	  for (int i = 0; i < points.size(); i++) {
	      String pointsText = points.get(i).getText();    
	      int points1 = Integer.parseInt(pointsText); 
	  
	  if (points1 >= 9) {
		  String teamName = teams.get(i).getText();     
		  System.out.println(teamName +":"+ points1);    
		  }
	  }
	  driver.quit();
}
	
	public void testmain() {
		System.out.println("Helloo Satya !!!! Checking new commits....");
		}
	
	
	public void testmain1() {
		System.out.println("Helloo Satya !!!! Checking new commits....");
		}
	
	public void testmain2() {
		System.out.println("Helloo Satya !!!! Checking new commits....");
		}
	
	public void testmain3() {
		System.out.println("Helloo Satya !!!! Checking new commits....");
		}
	
	
	public void testmain4() {
		System.out.println("Helloo Satya !!!! Checking new commits....");
		}
	
	public void testmain5() {
		System.out.println("Helloo Satya !!!! Checking new commits....");
		}public void testmain6() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		
		
		public void testmain7() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		
		public void testmain8() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		
		public void testmain9() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		
		public void testmain10() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		
		public void testmain11() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		
		public void testmain12() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		public void testmain13() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}
		public void testmain14() {
			System.out.println("Helloo Satya !!!! Checking new commits....");
			}

	}
