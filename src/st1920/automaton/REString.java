package st1920.automaton;

public class REString {
	public String string;
	
	public REString(String str) {
		this.string = str;
	}

	public REString makeOne(REString s) {
		return new REString(s.string + "1");
	}

	public REString makeTwo(REString s) {
		return new REString(s.string + "2");
	}

	public REString makeOr(REString s1, REString s2) {
		return new REString(s1.string + "|" + s2.string);
	}
	
	public REString makeAnd(REString s1, REString s2) {
		return new REString(s1.string + "&" + s2.string);
	}
	
	public REString makeConcatenation(REString s1, REString s2) {
		return new REString(s1.string + s2.string);
	}
	
	public REString makeQuestionMark(REString s) {
		return new REString(s.string + "?");
	}
	
	public REString makeAsterisk(REString s) {
		return new REString(s.string + "*");
	}
	
	public REString makePlus(REString s) {
		return new REString(s.string + "+");
	}
	
	public REString makeBraces(REString s, int n) {
		return new REString(s.string + "{" + n + "}");
	}
	
	public REString makeBracesComma(REString s, int a) {
		return new REString(s.string + "{" + a + "," + "}");
	}
	
	public REString makeBracesTwoInts(REString s, int m, int n) {
		return new REString(s.string + "{" + m + "," + n + "}");
	}
	
	public REString makeTilde(REString s) {
		return new REString("~" + s.string);
	}
	
	public REString makeSquareBrackets(REString s) {
		return new REString("[" + s.string + "]");
	}

	public REString makeSquareBracketsTilde(REString s) {
		return new REString("[^" + s.string + "]");
	}

	public REString makeDot() {
		return new REString(".");
	}

	public REString makeHash() {
		return new REString("#");
	}

	public REString makeAt() {
		return new REString("@");
	}

	public REString makeString() {
		return new REString("\"string\"");
	}

	public REString makeRange(REString s, int n, int m) {
		return new REString(s.string + "<" + n + "-" + m + ">");
	}

}