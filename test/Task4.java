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



    
    
    @Test
    public void ManualTest23() {
        assertTrue(
                RegExpMatcher.matches(
                		"\n",
                        "."
                ));
    }

    @Test
    public void ManualTest26() {
        assertTrue(
                RegExpMatcher.matches(
                		"\r",
                        "."
                ));
    }

    @Test
    public void ManualTest230() {
        assertTrue(
                RegExpMatcher.matches(
                		"\r\n",
                        ".."
                ));
    }

    @Test
    public void ManualTest14() {
        assertFalse(
                RegExpMatcher.matches(
                		"\r\n",
                        "."
                ));
    }

    
    @Test
    public void ManualTest24() {
        assertTrue(
                RegExpMatcher.matches(
                        "\n\r\n\n\r\n\r",
                        "${4,6}"
                ));
    }

    @Test
    public void ManualTest25() {
        assertTrue(
                RegExpMatcher.matches(
                        "\n\r\n\n\r\n\r",
                        "${4,}"
                ));
    }

    @Test
    public void ManualTest27() {
        assertFalse(
                RegExpMatcher.matches(
                        "\n\r",
                        "[^$]"
                ));
    }

    @Test
    public void ManualTest28() {
        assertTrue(
                RegExpMatcher.matches(
                        "\n\r\n\r\r\r\n",
                        "${5,7}"
                ));
    }

    @Test
    public void ManualTest29() {
        assertTrue(
                RegExpMatcher.matches(
                        "\r\n",
                        "$&$"
                ));
    }

    @Test
    public void ManualTest30() {
        assertTrue(
                RegExpMatcher.matches(
                        "\r\n",
                        "$|$"
                ));
    }

    @Test
    public void ManualTest31() {
        assertTrue(
                RegExpMatcher.matches(
                        "58462\radgf\r\n\r",
                        "([1-9a-z]*$*)*"
                ));
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
