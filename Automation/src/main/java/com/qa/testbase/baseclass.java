package com.qa.testbase;

public class baseclass {
      public String url=" ";
      public String username=" ";
      public String password=" ";
      public static WebDriver driver;
      public String url=" ";
      
      @BeforeClass()
      public void setup()
      {
    	  WebDriverManager.Chromedriver.setup();
    			  }
      }
