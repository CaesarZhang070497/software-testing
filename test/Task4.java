import org.junit.Test;

import st1920.automaton.RegExpMatcher;

import static org.junit.Assert.*;

public class Task4 {
	
    @Test
    public void ManualTest1() {
        assertTrue(
                RegExpMatcher.matches(
                        "\n",
                        "$"
                ));
    }
    
    @Test
    public void ManualTest12() {
        assertFalse(
                RegExpMatcher.matches(
                        "6",
                        "$"
                ));
    }
    
    @Test
    public void ManualTest3() {
        assertFalse(
                RegExpMatcher.matches(
                		"\n\n",
                        "$"
                ));
    }
    
    @Test
    public void ManualTest4() {
        assertFalse(
                RegExpMatcher.matches(
                		"a",
                        "$"
                ));
    }
    
    @Test
    public void ManualTest5() {
        assertTrue(
                RegExpMatcher.matches(
                        "",
                        "$*"
                ));
    }
    
    @Test
    public void ManualTest6() {
        assertFalse(
                RegExpMatcher.matches(
                        "23",
                        "$"
                ));
    }
    
    
}
