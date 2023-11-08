package tdd.examples;

import java.util.Collection;
import java.util.*;

public class GitHubGrades {
    private Map<String, Collection<String>> gradeMap = new HashMap<>();

    public void addGrade(String fred, String number) {
        if(!gradeMap.containsKey(fred)){
            gradeMap.put(studentName, new ArrayList<>());
    }
        gradeMap.get(studentName).add(grade);
    }
    public Collection<String> getGrades(String fred) {
        return gradeMap.getOrDefault(studentName, new ArrayList<>());
    }
}
