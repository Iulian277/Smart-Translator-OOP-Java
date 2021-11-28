package actions;

import utils.GetWordsFromSentence;

import java.util.ArrayList;

public final class TranslateSentence {
    private TranslateSentence() {}

    public static String translateSentence(String sentence, String fromLanguage, String toLanguage) {
        if(fromLanguage.isEmpty() || toLanguage.isEmpty()) {
            System.out.println("Non-empty fields required");
            return "";
        }

        // Split sentence in words, deleting the punctuation and symbols
        ArrayList<String> words = GetWordsFromSentence.getWordsFromSentence(sentence);
        StringBuilder translatedSentence = new StringBuilder();

        for(String word: words) {
            String translatedWord = TranslateWord.translateWord(word, fromLanguage, toLanguage);
            if(translatedWord == null) {
                translatedSentence.append("(").append(word).append(" not found) ");
            } else {
                translatedSentence.append(translatedWord).append(" ");
            }
        }

        // Return the sentence-translation
        return translatedSentence.toString();
    }

}
