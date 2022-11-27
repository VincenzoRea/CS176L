
public class Quiz implements Measurable{
	private int score;
	private String name;
	
	
	public Quiz(String StudentName, int QuizScore) {
		score = QuizScore;
		name = StudentName;
		
		
	}
	public double getMeasure()
	   {
	      return score;
	   }
}
