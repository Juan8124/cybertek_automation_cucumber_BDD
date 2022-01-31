package com.cybertek.step_defs;

import com.cybertek.utils.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown(){
        Driver.getDriver().close();
    }
}
