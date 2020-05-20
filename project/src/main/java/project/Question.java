package project;

public class Question {

    private String question;
    private SurveyResponse respon;

    // Question constructor
    public Question(String question) {
        this.question = question;
        this.respon = new SurveyResponse();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public SurveyResponse getResponse() {
        return respon;
    }

    public void setResponse(SurveyResponse response) {
        this.respon = response;
    }
}