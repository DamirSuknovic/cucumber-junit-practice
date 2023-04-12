package com.practice.step_definitions;

import com.practice.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void teardownScenario(){
        Driver.closeDriver();
    }

}
