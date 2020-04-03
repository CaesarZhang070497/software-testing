import org.junit.Test;

import st1920.automaton.RegExpMatcher;

import static org.junit.Assert.*;

public class Task3_2 {

    @Test
    public void ManualTest1() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "a|b"
                ));
    }

    @Test
    public void ManualTest2() {
        assertTrue(
                RegExpMatcher.matches(
                        "1",
                        "[1-2]"
                ));
    }

    @Test
    public void ManualTest3() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "~[b-z]"
                ));
    }

    @Test
    public void ManualTest4() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "[^b]"
                ));
    }

    @Test
    public void ManualTest5() {
        assertTrue(
                RegExpMatcher.matches(
                        "abc",
                        "@"
                ));
    }

    @Test
    public void ManualTest6() {
        assertTrue(
                RegExpMatcher.matches(
                        "5",
                        "<1-6>&<4-10>"
                ));
    }

    @Test
    public void ManualTest7() {
        assertFalse(
                RegExpMatcher.matches(
                        "",
                        "#"
                ));
    }

    @Test
    public void ManualTest8() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "[^A-Z]"
                ));
    }

    @Test
    public void ManualTest9() {
        assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "~a"
                ));
    }

    @Test
    public void ManualTest10() {
        assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "{a}"
                ));
    }

    @Test
    public void ManualTest11() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "[a]"
                ));
    }

    @Test
    public void ManualTest12() {
    	assertFalse(
                RegExpMatcher.matches(
                        "8",
                        "<2-4>"
                ));
    }

    @Test
    public void ManualTest13() {
        assertTrue(
                RegExpMatcher.matches(
                        "1",
                        "<1-2>"
                ));
    }

    @Test
    public void ManualTest14() {
        assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "[^~a]"
                ));
    }

    @Test
    public void ManualTest15() {
        assertTrue(
                RegExpMatcher.matches(
                        "b",
                        ".*b"
                ));
    }

    @Test
    public void ManualTest16() {
        assertTrue(
                RegExpMatcher.matches(
                        "c",
                        ".*&c"
                ));
    }


    // New

    @Test
    public void ManualTest18() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "@"
                ));
    }

    @Test
    public void ManualTest19() {
    	assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "\"string\""
                ));
    }

    @Test
    public void ManualTest20() {
    	assertFalse(
                RegExpMatcher.matches(
                        "\"string\"",
                        "\"string\""
                ));
    }

    @Test
    public void ManualTest21() {
        assertTrue(
                RegExpMatcher.matches(
                        "aaaaa",
                        "a{5}"
                ));
    }

    @Test
    public void ManualTest22() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaaaa",
                        "a{2}"
                ));
    }

    @Test
    public void ManualTest23() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaaa",
                        "#"
                ));
    }

    @Test
    public void ManualTest24() {
        assertTrue(
                RegExpMatcher.matches(
                        "aaaa",
                        "a+"
                ));
    }

    @Test
    public void ManualTest25() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "a+"
                ));
    }

    @Test
    public void ManualTest26() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "a+"
                ));
    }

    @Test
    public void ManualTest27() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "a?"
                ));
    }

    @Test
    public void ManualTest28() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aa",
                        "a?"
                ));
    }

    @Test
    public void ManualTest29() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "a?"
                ));
    }

    @Test
    public void ManualTest30() {
        assertTrue(
                RegExpMatcher.matches(
                        "aaaaaa",
                        "a{1,}"
                ));
    }

    @Test
    public void ManualTest31() {
        assertTrue(
                RegExpMatcher.matches(
                        "aaa",
                        "a{3,}"
                ));
    }

    @Test
    public void ManualTest32() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aa",
                        "a{5,}"
                ));
    }

    @Test
    public void ManualTest33() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "a{1,}"
                ));
    }

    @Test
    public void ManualTest34() {
    	assertFalse(
                RegExpMatcher.matches(
                        "bbbb",
                        "a{1,}"
                ));
    }

    @Test
    public void ManualTest35() {
        assertTrue(
                RegExpMatcher.matches(
                        "b",
                        "~a"
                ));
    }

    @Test
    public void ManualTest36() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaa",
                        "~aaa"
                ));
    }

    @Test
    public void ManualTest37() {
        assertTrue(
                RegExpMatcher.matches(
                        "aaa",
                        "~b"
                ));
    }

    @Test
    public void ManualTest38() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        ".&a"
                ));
    }

    @Test
    public void ManualTest39() {
        assertTrue(
                RegExpMatcher.matches(
                        "W",
                        "[a-zA-Z]"
                ));
    }

    @Test
    public void ManualTest40() {
    	assertFalse(
                RegExpMatcher.matches(
                        "W",
                        "[^a-zA-Z]"
                ));
    }

    @Test
    public void ManualTest41() {
        assertTrue(
                RegExpMatcher.matches(
                        "1",
                        "[^a-zA-Z]"
                ));
    }

    @Test
    public void ManualTest42() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "a|c"
                ));
    }

    @Test
    public void ManualTest43() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "a|a+"
                ));
    }

    @Test
    public void ManualTest44() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "a&c"
                ));
    }

    @Test
    public void ManualTest45() {
        assertTrue(
                RegExpMatcher.matches(
                        "b",
                        "b&b"
                ));
    }

    @Test
    public void ManualTest46() {
    	assertFalse(
                RegExpMatcher.matches(
                        "b",
                        "b{2,3}"
                ));
    }

    @Test
    public void ManualTest47() {
        assertTrue(
                RegExpMatcher.matches(
                        "aaa",
                        "a{2,5}"
                ));
    }

    @Test
    public void ManualTest48() {
        assertTrue(
                RegExpMatcher.matches(
                        "ab",
                        "a+b"
                ));
    }

    @Test
    public void ManualTest49() {
    	assertFalse(
                RegExpMatcher.matches(
                        "ab",
                        "ac"
                ));
    }

    @Test
    public void ManualTest50() {
    	assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "<a>"
                ));
    }

    @Test
    public void ManualTest51() {
    	assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "<1>"
                ));
    }

    @Test
    public void ManualTest52() {
    	assertFalse(
                RegExpMatcher.matches(
                        "1",
                        "<a-1>"
                ));
    }

    @Test
    public void ManualTest53() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaaa",
                        "a{n}"
                ));
    }

    @Test
    public void ManualTest54() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaaa",
                        "a{n,}"
                ));
    }

    @Test
    public void ManualTest55() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaaa",
                        "a{n,4}"
                ));
    }

    @Test
    public void ManualTest56() {
        assertTrue(
                RegExpMatcher.matches(
                        "a123",
                        "a[1-9]+"
                ));
    }

    @Test
    public void ManualTest57() {
    	assertFalse(
                RegExpMatcher.matches(
                        "1",
                        "[1-9]+[1-9]+[1-9]?"
                ));
    }

    @Test
    public void ManualTest58() {
        assertTrue(
                RegExpMatcher.matches(
                        "18888888",
                        "[1-9]+[1-9]+[1-9]?"
                ));
    }

    @Test
    public void ManualTest59() {
    	assertFalse(
                RegExpMatcher.matches(
                        "1",
                        "a\"string\""
                ));
    }

    @Test
    public void ManualTest60() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aaaaaa\"string\"",
                        "a+\"string\""
                ));
    }

    @Test
    public void ManualTest61() {
    	assertFalse(
                RegExpMatcher.matches(
                        "(",
                        "()"
                ));
    }

    @Test
    public void ManualTest62() {
    	assertFalse(
                RegExpMatcher.matches(
                        "()",
                        "("
                ));
    }

    @Test
    public void ManualTest63() {
    	assertFalse(
                RegExpMatcher.matches(
                        "\"string",
                        "\"string\""
                ));
    }

    @Test
    public void ManualTest64() {
    	assertFalse(
                RegExpMatcher.matches(
                        "8",
                        "<5,0"
                ));
    }

    @Test
    public void ManualTest65() {
        assertTrue(
                RegExpMatcher.matches(
                        "50",
                        "<80-2>"
                ));
    }

    @Test
    public void ManualTest66() {
    	assertFalse(
                RegExpMatcher.matches(
                        "50",
                        "<80->"
                ));
    }

    @Test
    public void ManualTest67() {
    	assertFalse(
                RegExpMatcher.matches(
                        "50",
                        "<80-"
                ));
    }

    @Test
    public void ManualTest68() {
    	assertFalse(
                RegExpMatcher.matches(
                        "50",
                        "<80-#>"
                ));
    }

    @Test
    public void ManualTest69() {
        assertTrue(
                RegExpMatcher.matches(
                        "!!!!",
                        "@{0,100}"
                ));
    }

    @Test
    public void ManualTest70() {
        assertTrue(
                RegExpMatcher.matches(
                        "a",
                        "(a)*"
                ));
    }

    @Test
    public void ManualTest71() {
    	assertFalse(
                RegExpMatcher.matches(
                        "a",
                        "(a"
                ));
    }

    @Test
    public void ManualTest72() {
    	assertFalse(
                RegExpMatcher.matches(
                        "abbbb",
                        "\""
                ));
    }

    @Test
    public void ManualTest73() {
    	assertFalse(
                RegExpMatcher.matches(
                        "",
                        "[]"
                ));
    }

    @Test
    public void ManualTest74() {
    	assertFalse(
                RegExpMatcher.matches(
                        "q",
                        "[z-a]"
                ));
    }

    @Test
    public void ManualTest75() {
        assertTrue(
                RegExpMatcher.matches(
                        "10",
                        "<10-10>"
                ));
    }

    @Test
    public void ManualTest76() {
        assertTrue(
                RegExpMatcher.matches(
                        "aa22aa22aa22",
                        "(aa22){1,5}"
                ));
    }

    @Test
    public void ManualTest77() {
    	assertFalse(
                RegExpMatcher.matches(
                        "aa22aa22aa22",
                        "(aa22) ?"
                ));
    }

    @Test
    public void ManualTest78() {
    	assertFalse(
                RegExpMatcher.matches(
                        "200",
                        "<-19,10>"
                ));
    }

}
