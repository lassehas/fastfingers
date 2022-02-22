/**
 * 
 */
package addon;

/**
 * @author lassehas
 *
 */
public class Score {
	
	/*
	 * 	Addons
	 */
	
	private Config config;
	
	
	//	Variables
	private int correct;
	private int wrong;
	
	/*
	 * 	Constructor
	 */
	
	public Score() {
		this.correct = 0;
		this.wrong = 0;
		config = new Config();
	}
	
	/*
	 * 	Getters
	 */
	
	public int getCorrect() {
		return correct;
	}
	
	public int getWrong() {
		return wrong;
	}
	
	/*
	 * 	Setters
	 */
	
	public void addCorrect() {
		correct++;
	}
	
	public void addWrong() {
		wrong++;
	}
	
	/*
	 * 	Methods
	 */
	
	public double getProcent() {
		double procent = 0;
		double totalAnswers = getCorrect() + getWrong();
		double correctph = getCorrect();
		if(totalAnswers == 0) {
			//Nothing
		}else {
			procent = (correctph / totalAnswers);
			procent *= 100;
		}
		
		return procent; 
	}
	
}
