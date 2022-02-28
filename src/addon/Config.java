/**
 * 
 */
package addon;

import java.io.File;
import java.time.LocalDateTime;

import model.Word;

/**
 * @author Lasse
 *
 */
public class Config {

	public final boolean testing = true;
	public final String author = "Lasse Haslund";
	public final String version = "1.3";
	public final LocalDateTime now = LocalDateTime.now();  
	
	//private WriteToFile writeFile = new WriteToFile();
	
	//	Prints text into console as string
	public void printText(String text) {
		if(testing) {
			//writeFile.write
			System.out.println(text);
		}
	}
	
	//	Prints text into console as integer
	public void printInt(int amount) {
		if(testing) {
			//writeFile.writeIntegerToFile(amount);
			System.out.print(amount);
		}
	}
	
	//	Prints word into console as word(string)
	public void printWord(Word w) {
		if(testing) {
			System.out.println(w.getWord());
		}
	}
	
	//	Prints String & file into console
	public void printFile(String text, File file) {
		if(testing) {
			System.out.println(text + file);
		}
	}
	
}
