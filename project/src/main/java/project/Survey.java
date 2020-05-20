package project;

import java.util.ArrayList;

public class Survey {

    private String surveyName;
    // ArrayList collection to represent questions
    private ArrayList<Question> questions = new ArrayList<Question>();

    public Survey() {

    }

    public Survey(String surveyName, ArrayList<Question> questions) {
        this.surveyName = surveyName;
        this.questions = questions;
    }

    // Constructor taking in just a name
    public Survey(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getsurvName() {
        return surveyName;
    }

    public void setsurvName(String survname) {
        this.surveyName = survname;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    // Method for adding Q's
    public void add(Question q) {
        this.questions.add(q);
    }

}