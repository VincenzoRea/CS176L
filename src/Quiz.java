
public class Quiz implements Measurable{
	private int score;
	
	public Quiz(int QuizScore) {
		score = QuizScore;
		
	}
	public double getMeasure()
	   {
	      return score;
	   }
}
