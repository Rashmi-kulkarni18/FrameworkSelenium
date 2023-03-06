package pratice;

import org.testng.annotations.Test;

public class TestNg3 {

		
		@Test
		public void create()
		{
			int[] arr= {1,2,3};
			
			System.out.println(arr[5]);
		}
		@Test(dependsOnMethods="create")
		public void moify()
		{
			System.out.println("modified");
		}
		@Test(dependsOnMethods="create")
		public void delete()
		{
		System.out.println("deleted");
		}



	}


