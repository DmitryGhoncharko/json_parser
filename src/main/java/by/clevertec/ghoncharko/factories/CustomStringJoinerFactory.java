package by.clevertec.ghoncharko.factories;

import by.clevertec.ghoncharko.beans.PrettyStringJoiner;
import by.clevertec.ghoncharko.beans.SimpleStringJoiner;
import by.clevertec.ghoncharko.enums.StringJoinerSet;
import by.clevertec.ghoncharko.interfaces.CustomStringJoiner;


public class CustomStringJoinerFactory {
    public static CustomStringJoiner createInstance(StringJoinerSet set, boolean prettyString) {

        if (prettyString) {
            return new PrettyStringJoiner(set.getComma(), set.getLeftBrace(), set.getRightBrace());
        } else {
            return new SimpleStringJoiner(set.getComma(), set.getLeftBrace(), set.getRightBrace());
        }
    }
}
