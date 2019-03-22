package org.fasttrackit.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.fasttrackit.AppConfig;
import org.fasttrackit.DriverManager;

public class Hooks {

    @Before
    public  void setup(){
        String browser = System.getProperty("browser", "chrome");
        DriverManager.initDriver(browser);

        //driver = DriverManager.initDriver(browser);
        //driver.get(AppConfig.getSiteUrl());

    }

    @After
    public  void tearDown() throws InterruptedException {
        Thread.sleep(500);
        DriverManager.getDriver().quit();
    }

}
