
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import java.time.Duration;
import java.util.Set;

public class New_Class {

    static WebDriver driver;
    //private static String Male;


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //navigate at web url
        driver.get("https://frappe.io/erpnext");
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Click the element using absolute XPath
        WebElement explorebutton= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]"));
        explorebutton.click();
        //Find Firstname input field

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Switch to the second tab if more than one exists

// Wait a few seconds for the new tab to open
        Thread.sleep(3000);

// Get all window handles
        Set<String> allTabs = driver.getWindowHandles();
        List<String> tabs = new ArrayList<>(allTabs);

// Switch to the second tab if more than one exists
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        }

        //driver.get("https://erpnext-demo.frappe.cloud/app/hr");
        // Click the hr button element using absolute XPath
        WebElement hrbutton= driver.findElement(By.xpath("//*[@id=\"page-Workspaces\"]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div/div[2]/div[7]"));
        hrbutton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //*[@id="editorjs"]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div
        WebElement activebutton= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[1]/div[1] "));
        activebutton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //*[@id="page-List/Employee/List"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/span[2]/a
       // WebElement activelast= driver.findElement(By.xpath("//*[@id=\"page-List/Employee/List\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/span[2]/a"));
        //activelast.click();
        WebElement activedasboard= driver.findElement(By.xpath("//*[@id=\"page-List/Employee/List\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/span[2]/a"));
        activedasboard.click();


        Thread.sleep(30000);
        driver.quit();
    }


}
