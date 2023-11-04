package com.lbrce.cseb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("Sow", "Sow@123"));
	}
	@Test
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("rani", "rani@123"));
	}
	@Test
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("supraja", "Supraja@123"));
	}

}
