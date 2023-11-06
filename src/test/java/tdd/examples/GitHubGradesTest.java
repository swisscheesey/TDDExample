package tdd.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitHubGradesTest {

    @Test
    public void addGrades(){
        GitHubGrades gradeList = new GitHubGrades();
        gradeList.addGrade("Fred", "100");
        assert gradeList.getGrades("Fred").contains("100");
    }

}