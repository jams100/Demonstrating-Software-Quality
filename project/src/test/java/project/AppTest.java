package project;

import static org.junit.Assert.assertTrue;

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

}