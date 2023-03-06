package pratice;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test(invocationCount=4)
	public void create()
	{
		System.out.println("created");
	}
	@Test
	public void moify()
	{
		System.out.println("modified");
	}
	@Test
	public void delete()
	{
	System.out.println("deleted");
	}



}
