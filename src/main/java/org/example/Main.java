package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");
        driver.findElement(By.id("firstname")).sendKeys("aaa");
        driver.findElement(By.id("lastname")).sendKeys("bbb");
        driver.findElement(By.id("email")).sendKeys("aaabbb@org.il");
        driver.findElement(By.id("next")).click();



        //driver.quit();
    }
}