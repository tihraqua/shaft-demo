package com.qacart.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class OpenBrowser {

    //validate the navigation to the URL
@Test
public void openChromeBrowser(){
   SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/");

    }
    //validate the title and the URL
@Test
public void getTitleAndURL(){
    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/");
    String url= driver.browser().getCurrentURL();
    String title= driver.browser().getCurrentWindowTitle();
    System.out.println("The URL:" + url);
    System.out.println("The Title:" + title);
}
    //validate button and it's text
@Test
    public void locators(){
    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/locators.html");
    By seleniumButton = By.id("selenium");
    By appiumButton = By.name("appium");
    By cypressButton = By.cssSelector("[data-testid=cypress]");
    String text =driver.element().getText(seleniumButton);
    System.out.println(text);
}
//Validate the login
    @Test
    public void login(){
    SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/actions.html");

    By firstNameInput = By.name("firstName");
    By lastnameInput = By.name("lastName");
    By levelDropMenu = By.id("level");
    By webRadio = By.id("web");
    By clickButton = By.id("actions-button");

    driver.element().type(firstNameInput, "Tihraqua");
    driver.element().type(lastnameInput, "Ahmed");
    driver.element().select(levelDropMenu,"Senior");
    driver.element().click(webRadio);
    driver.element().click(clickButton);
    }

    //Waits
    @Test
    public void Wait(){
    SHAFT.GUI.WebDriver driver= new SHAFT.GUI.WebDriver();
    driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
    By primary= By.className("primary");
    By secondary = By.className("secondary");

    driver.element().click(primary);
    driver.element().click(secondary);


    }

}
