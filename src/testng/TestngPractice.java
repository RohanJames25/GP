package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngPractice {
	
@Test (dataProvider = "Rohan")
public static void smuta(String weight, String brains) 
	{
		System.out.println("Smuta Stupid Saaaaaaaaathhhhhhhhhhheeeeeeeeeeeeeeeeeeee");
		System.out.println(weight);
		System.out.println(brains);
	}

@Test //(groups = "poop")
public static void rawaSmuta()
	{
		System.out.println("Smuta ko rawa ka kela chaatna hai");
	}

@Test (dependsOnMethods = {"rawaSmuta"})
public static void tawaSmuta()
	{
		System.out.println("Smuta ko tawa ka baaarik kela khaana hai");
	}

@DataProvider
public static Object[][] Rohan()
{
	System.out.println("Rohan is the best");
	Object[][] data = new Object[2][2];
	data[0][0] = "smuta";
	data[0][1] = "trupti";
	data[1][0] = "sharvari";
	data[1][1] = "tawa";
	return data;
}

}