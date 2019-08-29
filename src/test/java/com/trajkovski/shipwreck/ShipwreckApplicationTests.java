package com.trajkovski.shipwreck;

import com.trajkovski.shipwreck.controller.HomeController;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ShipwreckApplicationTests {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testHomeController() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das Boot, reporting for dutty!");
    }

}

