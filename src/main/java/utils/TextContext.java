package utils;


import java.io.IOException;


import managers.PageObjectManager;



public class TextContext {
	
	

	//public WebDriverManager webDriverManager;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public Genericutils generic_utils;
	
	public TextContext() throws IOException{
	//	webDriverManager = new WebDriverManager();
		testbase=new TestBase();
		pageObjectManager = new PageObjectManager(testbase.WebDriverManager());
		generic_utils = new Genericutils(testbase.WebDriverManager());

	}
	
	
}
