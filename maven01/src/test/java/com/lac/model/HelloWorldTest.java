package com.lac.model;
import org.junit.*;
import org.junit.Assert.*; 
public class HelloWorldTest{
	@Test
	public void testHello(){
		Assert.assertEquals("HelloWorld!",new HelloWorld().sayHello());

	}
}