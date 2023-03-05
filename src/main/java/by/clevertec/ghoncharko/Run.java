package by.clevertec.ghoncharko;

import by.clevertec.ghoncharko.beans.CustonJsonParser;
import by.clevertec.ghoncharko.testclasses.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) throws IllegalAccessException {
        Student student = createStudentObject();
        CustonJsonParser custonJsonParser = new CustonJsonParser(student);
        String jSongSimpleString = custonJsonParser.serialize();
        System.out.println(jSongSimpleString);

        custonJsonParser.setPrettyString(true);
        String jSongPrettyString = custonJsonParser.serialize();
        System.out.println(jSongPrettyString);
    }
    public static Student createStudentObject() {

        PhysData physData = new PhysData(18, 70.4, 175.2, Sex.MALE);

        List<String> specs = new ArrayList<>();
        specs.add("engineer");
        specs.add("constructor");
        specs.add("master-flomaster");

        LanguageKnowledge[] languageKnowledges = {
                new LanguageKnowledge("Russian", 8, KnowledgeRate.EXCELLENT),
                new LanguageKnowledge("Eanglish", 7, KnowledgeRate.GOOD),
                new LanguageKnowledge("Italian", 1, KnowledgeRate.BAD)
        };

        Map<String, Boolean> passedTests = new HashMap<>();
        passedTests.put("math", true);
        passedTests.put("physics", false);
        passedTests.put("sopromat", true);

        return new Student("Alex", 152, specs, languageKnowledges, passedTests, physData);
    }
}
