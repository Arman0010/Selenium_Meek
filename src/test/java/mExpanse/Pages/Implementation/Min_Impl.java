package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Min_Interface;
import mExpanse.Pages.ObjectRepository.MinOR;
import org.openqa.selenium.WebDriver;

public class Min_Impl implements Min_Interface {

    @Override
    public void min(WebDriver driver, int i) throws InterruptedException {

        Operations.scrollIntoElement(MinOR.Locator.scroll,driver);
        Thread.sleep(1000);
        Operations.click(MinOR.Locator.enq,driver);
        Thread.sleep(1000);
        Operations.randomName(MinOR.Locator.name,driver);
        Operations.sendText(MinOR.Locator.email,Operations.generateValidRandomEmail("test"),driver);
        Operations.randomNumber(MinOR.Locator.phone,driver);
        Operations.sendText(MinOR.Locator.post,"1229",driver);
        Operations.randomDropdownSelect(MinOR.Locator.drop1,driver);
        Operations.randomDropdownSelect(MinOR.Locator.drop2,driver);
        Operations.randomDropdownSelect(MinOR.Locator.drop3,driver);
        Operations.randomDropdownSelect(MinOR.Locator.drop4,driver);
        Operations.randomDropdownSelect(MinOR.Locator.drop5,driver);
        Operations.click(MinOR.Locator.price,driver);
        Operations.click(MinOR.Locator.addMsg,driver);
        Operations.scrollIntoElement(MinOR.Locator.submit,driver);
        Operations.click(MinOR.Locator.msg,driver);
        Operations.sendText(MinOR.Locator.msg,"Arman Automation " + i,driver);
        Thread.sleep(2000);

    }

}
