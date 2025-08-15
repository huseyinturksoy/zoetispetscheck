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
                {"https://www.zoetispets.com/fr-fr/", "Zoetis Pets FR"},
                {"https://www.zoetispets.com/pt-br/produtos/librela/", "Librela® para cães | Zoetis Pets"},
                {"https://www.zoetispets.com/en-gb/dog-healthcare/arthritis-quiz/", "Dog Arthritis Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-au/dog-healthcare/arthritis-quiz/", "Dog Arthritis Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-ca/dog-healthcare/arthritis-quiz/", "Dog Arthritis Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-gb/cat-healthcare/arthritis-quiz/", "Cat Arthritis Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-au/cat-healthcare/arthritis-quiz/", "Cat Arthritis Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-gb/dog-healthcare/skin-conditions-assessment/", "Dog Skin Conditions Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-au/dog-healthcare/skin-conditions-assessment/", "Dog Skin Conditions Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/en-ca/dog-healthcare/skin-conditions-assessment/", "Dog Skin Conditions Assessment | Zoetis Pets"},
                {"https://www.zoetispets.com/fr-ca/chien-soins/arthrose-quiz/", "Questionnaire sur l’arthrose du chien | Zoetis Pets"},
                {"https://www.zoetispets.com/fr-fr/sante-du-chien/arthrose-quiz/", "Évaluation de l’arthrose chez le chien | Zoetis Pets"},
                {"https://www.zoetispets.com/fr-ca/chien-soins/dermatologie-evaluation/", "Évaluation de la peau du chien | Zoetis Pets"},
                {"https://www.zoetispets.com/fr-fr/sante-du-chien/dermatologie-evaluation/", "Évaluation des problèmes de peau chez le chien | Zoetis Pets"},
                {"https://www.zoetispets.com/de-de/hund-gesundheit/arthrose-quiz/", "Online-Test zu Arthrose beim Hund | Zoetis Pets"},
                {"https://www.zoetispets.com/de-de/hund-gesundheit/juckreiz-test/", "Hautprobleme beim Hund | Zoetis Pets"},
                {"https://www.zoetispets.com/es-es/perro-salud/artrosis-quiz/", "Evaluación de la artrosis en perros | Zoetis Pets"},
                {"https://www.zoetispets.com/es-es/perro-salud/problemas-de-piel-evaluacion/", "Evaluación de problemas de la piel en perros | Zoetis Pets"},
                {"https://www.zoetispets.com/it-it/salute-cane/dolore-articolare-quiz/", "Test del dolore articolare nel cane | Zoetis Pets"},
                {"https://www.zoetispets.com/it-it/salute-cane/segni-di-problemi-cutanei-risultato/", "Test del prurito del cane | Zoetis Pets"},
                {"https://www.zoetispets.com/pl-pl/ochrona-zdrowia-psa/artretyzm-quiz/", "Ankieta pod kątem osteoarthritis u psa | Zoetis Pets"},
                {"https://www.zoetispets.com/pl-pl/ochrona-zdrowia-psa/choroby-skory-u-psa-ocena/", "Ankieta dotycząca stanu skóry psa | Zoetis Pets"},



        };
    }




}
