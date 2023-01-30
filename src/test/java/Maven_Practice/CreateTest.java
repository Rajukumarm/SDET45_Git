package Maven_Practice;

import org.testng.annotations.Test;

public class CreateTest {
	@Test(groups = "regration")
	public void createTest() {
		System.out.println("Created regression successfully");
	}
	@Test(groups={"regression","smoke"})
	public void create() {
		System.out.println("Create");
		System.out.println("Mum");
		System.err.println("regration and smoke sucessfully");
	}
		@Test(groups={"regression","smoke"})
	
	public void update()
	{
		System.out.println("update");
		System.out.println("Kochi");
		System.out.println("no groups");
	}


}
