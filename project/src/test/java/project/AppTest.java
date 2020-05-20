package project;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void createSurveyEmpty() {
        Survey s = new Survey();
        assertTrue("Should be an object of type survey", s instanceof Survey);
    }

    //Test to create a survey with a name and questions
    @Test
    public void createSurvey() {
        Question one = new Question("Food Liked");
        // ArrayList to store questions
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(one);

        Survey s = new Survey("My Questions", questions);
        assertTrue("Should be object of type survey", s instanceof Survey);
    }
}