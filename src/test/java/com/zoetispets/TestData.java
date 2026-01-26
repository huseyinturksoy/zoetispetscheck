package com.zoetispets;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "zoetispetsV2Locals")
    public Object[][] livePageUrl() {
        return new Object[][]{

                {"https://www.zoetispets.com/en-gb/", "Zoetis Pets UK", "UK HOME PAGE"},
                {"https://www.zoetispets.com/en-au/", "Zoetis Pets AU", "AU HOME PAGE"},
                {"https://www.zoetispets.com/de-de/", "Zoetis Pets DE", "DE HOME PAGE"},
                {"https://www.zoetispets.com/it-it/", "Zoetis Pets IT", "IT HOME PAGE"},
                {"https://www.zoetispets.com/es-es/", "Zoetis Pets ES", "ES HOME PAGE"},
                {"https://www.zoetispets.com/pl-pl/", "Zoetis Pets PL", "PL HOME PAGE"},
                {"https://www.zoetispets.com/en-ca/", "Zoetis Pets CA", "CA-EN HOME PAGE"},
                {"https://www.zoetispets.com/fr-ca/", "Zoetis Pets CA", "CA-FR HOME PAGE"},
                {"https://www.zoetisetcompagnie.com/fr-fr/", "Zoetis Pets FR", "FR HOME PAGE"},
                {"https://www.zoetispets.com/pt-br/produtos/librela/", "Librela® para cães | Zoetis Pets", "BR HOME PAGE"},
                {"https://www.zoetispets.com/en-gb/dog-healthcare/arthritis-quiz/", "Dog Arthritis Assessment | Zoetis Pets", "UK DOG ARTHRTIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-au/dog-healthcare/arthritis-quiz/", "Dog Arthritis Assessment | Zoetis Pets", "AU DOG ARTHRTIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-ca/dog-healthcare/arthritis-quiz/", "Dog Arthritis Assessment | Zoetis Pets", "CA-EN DOG ARTHRTIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-gb/cat-healthcare/arthritis-quiz/", "Cat Arthritis Assessment | Zoetis Pets", "UK CAT ARTHRTIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-au/cat-healthcare/arthritis-quiz/", "Cat Arthritis Assessment | Zoetis Pets", "AU CAT ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-gb/dog-healthcare/skin-conditions-assessment/", "Dog Skin Conditions Assessment | Zoetis Pets", "UK SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-au/dog-healthcare/skin-conditions-assessment/", "Dog Skin Conditions Assessment | Zoetis Pets", "AU SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/en-ca/dog-healthcare/skin-conditions-assessment/", "Dog Skin Conditions Assessment | Zoetis Pets", "CA SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/fr-ca/chien-soins/arthrose-quiz/", "Questionnaire sur l’arthrose du chien | Zoetis Pets", "CA-FR ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetisetcompagnie.com/fr-fr/sante-du-chien/arthrose-quiz/", "Évaluation de l’arthrose chez le chien | Zoetis Pets", "FR ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/fr-ca/chien-soins/dermatologie-evaluation/", "Évaluation de la peau du chien | Zoetis Pets", "CA-FR SKIN ASSESSMENT PAGE"},
                {"https://www.zoetisetcompagnie.com/fr-fr/sante-du-chien/dermatologie-evaluation/", "Évaluation des problèmes de peau chez le chien | Zoetis Pets", "FR SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/de-de/hund-gesundheit/arthrose-quiz/", "Online-Test zu Arthrose beim Hund | Zoetis Pets", "DE ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/de-de/hund-gesundheit/juckreiz-test/", "Hautprobleme beim Hund | Zoetis Pets", "DE SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/es-es/perro-salud/artrosis-quiz/", "Evaluación de la artrosis en perros | Zoetis Pets", "ES ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/es-es/perro-salud/problemas-de-piel-evaluacion/", "Evaluación de problemas de la piel en perros | Zoetis Pets", "ES SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/it-it/salute-cane/dolore-articolare-quiz/", "Test del dolore articolare nel cane | Zoetis Pets", "IT ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/it-it/salute-cane/segni-di-problemi-cutanei-risultato/", "Test del prurito del cane | Zoetis Pets", "IT SKIN ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/pl-pl/ochrona-zdrowia-psa/artretyzm-quiz/", "Ankieta pod kątem osteoarthritis u psa | Zoetis Pets", "PL ARTHRITIS ASSESSMENT PAGE"},
                {"https://www.zoetispets.com/pl-pl/ochrona-zdrowia-psa/choroby-skory-u-psa-ocena/", "Ankieta dotycząca stanu skóry psa | Zoetis Pets", "PL SKIN ASSESSMENT PAGE"}



        };
    }




}
