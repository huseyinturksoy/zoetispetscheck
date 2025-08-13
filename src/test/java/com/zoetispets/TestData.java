package com.zoetispets;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "zoetispetsV2Locals")
    public Object[][] livePageUrl() {
        return new Object[][]{

                {"https://www.zoetispets.com/en-gb/", "Zoetis Pets UK"},
                {"https://www.zoetispets.com/en-au/", "Zoetis Pets AU"},
                {"https://www.zoetispets.com/de-de/", "Zoetis Pets DE"},
                {"https://www.zoetispets.com/it-it/", "Zoetis Pets IT"},
                {"https://www.zoetispets.com/es-es/", "Zoetis Pets ES"},
                {"https://www.zoetispets.com/pl-pl/", "Zoetis Pets PL"},
                {"https://www.zoetispets.com/en-ca/", "Zoetis Pets CA"},
                {"https://www.zoetispets.com/fr-ca/", "Zoetis Pets CA"},
                {"https://www.zoetispets.com/fr-fr/", "Zoetis Pets FR"}


        };
    }




}
