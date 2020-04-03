package st1920.automaton;

public class MatchString {

	public static boolean matches(String s, REString re) {
		return RegExpMatcher.matches(s, re.string);
	}
	
}
