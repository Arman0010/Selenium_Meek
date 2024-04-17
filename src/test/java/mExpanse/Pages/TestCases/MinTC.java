package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Min_Impl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class MinTC extends BaseClass{

    @Test
    public void myMethod(){
        Min_Impl obj= new Min_Impl();

        for(int i=1; i<=20; i++){

            setUp();

            try {
                obj.min(driver,i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            tearDown();

        }
    }

}
