package mavenprojectpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {

	@Test
	public void testclasstwomaven()
	{
		System.out.println("test class two maven");
	}
	@Test
	public void testtoFail() {
String s ="mitra";
System.out.println("Failing Test case");
Assert.assertEquals("mitra", "mitra", "failed assert condition");

	}
}
