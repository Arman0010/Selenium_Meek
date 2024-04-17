package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class MinOR {
    public static class Locator{
        public static By scroll = By.xpath("(//H2[@class='section-heading'])[1]");
        public static By enq = By.xpath("//SPAN[@class='mat-button-wrapper'][text()=' Enquire now\n" +
                "']");

        public static By name = By.xpath("//INPUT[@id='mat-input-7']");
        public static By email = By.xpath("//INPUT[@id='mat-input-8']");
        public static By phone = By.xpath("//INPUT[@id='phone']");
        public static By post = By.xpath("//INPUT[@id='mat-input-9']");
        public static By drop1 = By.xpath("//SELECT[@id='mat-input-12']");
        public static By drop2 = By.xpath("//SELECT[@id='mat-input-15']");
        public static By drop3 = By.xpath("//SELECT[@id='mat-input-13']");
        public static By drop4 = By.xpath("//SELECT[@id='mat-input-10']");
        public static By drop5 = By.xpath("//SELECT[@id='mat-input-14']");
        public static By price = By.xpath("(//INPUT[@_ngcontent-serverapp-c186=''])[6]");
        public static By addMsg = By.xpath("//LABEL[@_ngcontent-serverapp-c186=''][text()='Add a message (optional)']");
        public static By msg = By.xpath("//TEXTAREA[@id='mat-input-11']");
        public static By submit = By.xpath("//BUTTON[@_ngcontent-serverapp-c186='']");

    }

    public static class UIElements{
//        public static String p4_name = "Sauce Labs Backpack";

    }
}
