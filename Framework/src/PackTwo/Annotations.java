package PackTwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	// Execution start Alphabetically
	
	@BeforeTest
	public void cookies()
	{
		System.out.println("Delete the cookies before completing all test");
	}
	
	
	// This will not read as a TestCase. This is a PreRequest
	@BeforeMethod
	public void UsedidGeneration()
	{
		System.out.println("This block executes before each methods");
	}
	
	// This is a Post Request
	@AfterMethod
	public void ReportAdding()
	{
		System.out.println("This block executes after each methods");
	}
	
	
	@Test	
	public void AOpeningBrowser()
	{
	// This opens the browser
	System.out.println("Opening Browser");
	}
	
	
	@Test
	public void FlightBooking()
	{
		System.out.println("Flight Booking");
	}
	
	@AfterTest
	public void cookiesClose()
	{
		System.out.println("Delete the cookies after completing all test");
	}

}
