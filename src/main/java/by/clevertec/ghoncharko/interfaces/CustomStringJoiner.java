package by.clevertec.ghoncharko.interfaces;

public interface CustomStringJoiner {
    StringBuilder append(String string);

    StringBuilder append(StringBuilder string);

    void addDelimiter();

    void createResultingString();

    StringBuilder getResultingString();

}
