package rahul.assignment.regex;
import java.util.regex.Pattern;

public class CheckPattern {
	String str;
	CheckPattern(String str){
		this.str=str;
	}
	public void Check() {
		String regexPattern="[A-Z].*[.]";
		boolean flag=Pattern.matches(regexPattern, str);
		System.out.println("Is given pattern matches the regex: "+flag);
	}
	

}
