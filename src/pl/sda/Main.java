package pl.sda;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO: wstęp, potrzebne funkcje
        /*
         * Napiszę grę w wisielca.
         * 1. Stwórz tablicę słów (10 elementów wystarczy)
         * 2. Wylosuj słowo
         * 3. Wyświetl pierwszy znak słowa oraz ostatni pozostałe pokaż jako "_"
         * 4. Pod słowem wyświetl tyle "<3" ile pozostało wisielcowi (na początku niech to będzie 5), pamiętaj, że ilość serduszek musisz gdzieś przechowywać
         * 5. Zapytaj gracza o literę.
         *   a. Jeśli została znaleziona wyświetl 3 i 4 z literą w odpowiednim miejscu/miejscach
         *   b. Jeśli nie została zmniejsz zmienną odpowiedzialną za ilość serduszek i wyświetl punkt 3 i 4
         * 6. Jeśli graczowi udało się odgadnąć słowo i ma jeszcze serduszka wypisz: "Gratulacje!"
         * 7. Jeśli graczowi skończyły się serduszka wypisz: "Przegrana :("
         *
         */
        String wordArray[] = {"lokomotywa", "test", "grupa", "londyn", "balkon", "perkusja", "odkurzacz"};

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(wordArray.length);

        String answer = wordArray[randomNumber];
        /*StringBuilder answerInProgressBuilder = new StringBuilder(answer.substring(0, 1));
        for (int i = 1; i < answer.length() - 1; i++) {
            answerInProgressBuilder.append("_");
            //answerInProgress += "_";
        }
        answerInProgressBuilder.append(answer.substring(answer.length() - 1));
        //answerInProgress += answer.substring(answer.length() - 1);


        //String answerInProgress = answerInProgressBuilder.toString();*/


        String answerInProgress = answer.substring(0, 1)
                + "_".repeat(answer.length() - 2)
                + answer.substring(answer.length() - 1);

        System.out.println(answer);
        System.out.println(answerInProgress);


        //System.out.println(slowo.charAt(0));
        //System.out.println(slowo.charAt(slowo.length() - 1));

      /*  String answer = "lokomotywa";
        String answerInProgress = "l________a";
        //uzytkownik wprwadza "o"
        //sprawdzam cz w answer jest jakies "o" np. za pomoca:
        System.out.println(answer.indexOf("o"));

        //w ten sposob mozemy podmienic literke na pozycji pierwszej
        String answerInProgressAfterFirstReplacement =
                answerInProgress.substring(0, 1) + "o" + answerInProgress.substring(2);
        System.out.println(answerInProgressAfterFirstReplacement);

        System.out.println(answer.indexOf("o", 2));
        answerInProgressAfterFirstReplacement =
                answerInProgressAfterFirstReplacement.substring(0, 3) + "o" + answerInProgressAfterFirstReplacement.substring(4);
        System.out.println(answerInProgressAfterFirstReplacement);*/

    }
}
