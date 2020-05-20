package project;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

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

    // Test to create a survey with a name and questions
    @Test
    public void createSurvey() {
        Question one = new Question("Food Liked");
        // ArrayList to store questions
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(one);

        Survey s = new Survey("My Questions", questions);
        assertTrue("Should be object of type survey", s instanceof Survey);
    }

    // Test to see if collection of questions exists within survey object
    @Test
    public void surveyQuestions() {
        Question one = new Question("Food Liked");
        // ArrayList to store questions
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(one);

        Survey survey = new Survey("My Questions", questions);
        assertTrue("Should be an object of type arralylist", survey.getQuestions() instanceof ArrayList);
    }

    // Test to check that questions are being added to the survey
    @Test
    public void addQuestion() {
        // Creation of question object
        Question one = new Question("Food Liked");
        Question two = new Question("Chips");

        Survey survey = new Survey("My Questions");
        survey.add(one);
        survey.add(two);

        assertEquals("Questions array should be of length 2 now", 2, survey.getQuestions().size());
    }

    // Test to check that survey response class is created
    @Test
    public void createSurveyResponse() {
        SurveyResponse survresp = new SurveyResponse();
        assertTrue("Should be an object of type survey Response", survresp instanceof SurveyResponse);
    }

    	//Test to see that an answer to a survey response is being added
	@Test
	public void responseAnswer() 
	{
		SurveyResponse sr = new SurveyResponse();
		//Setting the ans to survey response
		sr.setAnswer(1);
		assertEquals("should return a value showing attibute doesn't = 0" , 1, sr.getAnswer());
    }
    
    //Test to see if response can be obtained from question
	@Test
	public void questionResponse()
	{
		Question one = new Question("Food Liked");
		one.getResponse().setAnswer(2);

		assertEquals("Value should = 2", 2, one.getResponse().getAnswer());
    }
    
    //Testing to ensure answer value is between 1-5
	@Test
	public void responseValue()
	{
		SurveyResponse sr = new SurveyResponse();
		sr.setAnswer(3);
		assertEquals("Passing a value between 1-5 so that 0 is NOT being returned", 3, sr.getAnswer());

        sr.setAnswer(-3);
		assertEquals("Passing a value less than 1-5 so that 0 is returned", 0, sr.getAnswer());

		sr.setAnswer(9);
		assertEquals("Passing a value greater than 1-5 so that 0 is returned", 0, sr.getAnswer());
	}
}
