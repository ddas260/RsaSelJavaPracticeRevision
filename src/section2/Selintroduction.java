package section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selintroduction {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://rahulshettyacademy.com");
        System.out.println("From Google Chrome:");
        System.out.println(chrome.getTitle());
        System.out.println(chrome.getCurrentUrl());
        //chrome.close();
        chrome.quit();

        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://rahulshettyacademy.com");
        System.out.println("Mozilla Firefox:");
        System.out.println(firefox.getTitle());
        System.out.println(firefox.getCurrentUrl());
        //firefox.close();
        firefox.quit();

        WebDriver edge = new EdgeDriver();
        edge.get("https://rahulshettyacademy.com");
        System.out.println("Microsoft Edge:");
        System.out.println(edge.getTitle());
        System.out.println(edge.getCurrentUrl());
        //edge.close();
        edge.quit();
    }
}
