package tdd.examples;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GithubToEmailTrackerTest {

    GithubToEmailTracker githubToEmailTracker = new GithubToEmailTracker();


    @org.junit.jupiter.api.Test
    void getEmail() {
        githubToEmailTracker.addGithubId("githubId","relevant@email.com");
        String id = githubToEmailTracker.getEmail("relevant@email.com");
        assertEquals(id,"githubId");
    }
}