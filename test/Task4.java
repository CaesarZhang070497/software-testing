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
    public void ManualTest2() {
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
    
    
    
    @Test
    public void ManualTest7() {
        assertTrue(
                RegExpMatcher.matches(
                		"\r\n",
                        "$"
                ));
    }

    @Test
    public void ManualTest8() {
        assertTrue(
                RegExpMatcher.matches(
                		"\r",
                        "$"
                ));
    }

    @Test
    public void ManualTest9() {
        assertTrue(
                RegExpMatcher.matches(
                		"\r\n",
                        "$"
                ));
    }

    @Test
    public void ManualTest10() {
        assertFalse(
                RegExpMatcher.matches(
                		"\n\r",
                        "$"
                ));
    }
    



    
    @Test
    public void ManualTest11() {
        assertTrue(
                RegExpMatcher.matches(
                		"\r\n",
                        "$$"
                ));
    }





    @Test
    public void ManualTest12() {
        assertTrue(
                RegExpMatcher.matches(
                		"\n\r",
                        "$$"
                ));
    }



    @Test
    public void ManualTest13() {
        assertTrue(
                RegExpMatcher.matches(
                		"\n\r",
                        "~$~$"
                ));
    }
    
    
    @Test
    public void ManualTest15() {
        assertTrue(
                RegExpMatcher.matches(
                		"a\naaa\r\n",
                        "(a+$)+"
                ));
    }

    @Test
    public void ManualTest16() {
        assertTrue(
                RegExpMatcher.matches(
                		"aa\raaa\naaa\r\n",
                        "(a+$)+"
                ));
    }
    
    @Test
    public void ManualTest17() {
        assertFalse(
                RegExpMatcher.matches(
                		"a\rccc\n",
                        "a$"
                ));
    }

    @Test
    public void ManualTest18() {
        assertTrue(
                RegExpMatcher.matches(
                		"a\r\n",
                        "a$"
                ));
    }

    @Test
    public void ManualTest20() {
        assertTrue(
                RegExpMatcher.matches(
                        "6\r\n7\r4\r\n",
                        "(<1-9>+$)*"
                ));
    }



    @Test
    public void ManualTest22() {
        assertTrue(
                RegExpMatcher.matches(
                        "\r\n\n\r\n\r\n",
                        "$*"
                ));
    }



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
