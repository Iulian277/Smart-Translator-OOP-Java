package main;

import actions.RemoveDefinitionForWord;
import json_deserialization.DeserializeDictionaries;
import main.testcases.*;

import java.io.IOException;

/** This is class is the entry point of the program */
public class Main {
    public static void main(String[] args) throws IOException {

        // Deserialize json into class models
        DeserializeDictionaries.deserialize();

        // TestAddWord
        // TestAddWord.testAddWord();

        // TestRemoveWord
        // TestRemoveWord.testRemoveWord();

        // TestAddDefinitionForWord
        // TestAddDefinitionForWord.testAddDefinitionForWord();

        // TestRemoveDefinitionForWord
        // TestRemoveDefinitionForWord.testRemoveDefinitionForWord();

        // TestTranslateWord
        // TestTranslateWord.testTranslateWord();

        // TestTranslateSentence
        // TestTranslateSentence.testTranslateSentence();

    }
}
