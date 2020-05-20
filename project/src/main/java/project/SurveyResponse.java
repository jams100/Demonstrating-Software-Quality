package project;

public class SurveyResponse {

    //int value for survey response so we can return null
    private int answer = 0;
    
    public SurveyResponse() {
    
    }
    
    public int getAnswer() {
    return answer;
    }
    
    public void setAnswer(int answer) {
    	//If answer is <1 or >5 then set ans to 0
		if(answer < 1 || answer > 5){
			this.answer=0;
		}
		//If answer is between 1 & 5 pass that number
		else{
			this.answer = answer;
		}
    }
    
    }    