package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngPractice1 {
	
@Test //(enabled = false)
public static void trupti() 
	{
		System.out.println("Tatti");
	}

@Parameters({"URL", "firstname"})
@Test //(groups = "poop")
public static void rj(String url, String first)
	{
		//System.out.println("Susu");
		System.out.println(url);
		System.out.println(first);
	}

@Test 
public static void haathi()
	{
		System.out.println("Ulti");
	}

}
