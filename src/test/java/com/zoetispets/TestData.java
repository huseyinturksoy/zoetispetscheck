package com.zoetispets;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "zoetispetsV2Locals")
    public Object[][] livePageUrl() {
        return new Object[][]{

                {"https://www.zoetispets.com/en-gb/"},
                {"https://www.zoetispets.com/en-au/"},
                {"https://www.zoetispets.com/de-de/"},
                {"https://www.zoetispets.com/it-it/"},
                {"https://www.zoetispets.com/es-es/"},
                {"https://www.zoetispets.com/pl-pl/"},
                {"https://www.zoetispets.com/en-ca/"},
                {"https://www.zoetispets.com/fr-ca/"},
                {"https://www.zoetispets.com/fr-fr/"}


        };
    }




}
